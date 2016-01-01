package app;

import antlr.CMM_BXJBaseListener;
import antlr.CMM_BXJParser;
import app.SymbolTable.*;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;


/**
 * Created by BxJiang on 2015/12/14.
 */
public class MyListener extends CMM_BXJBaseListener{
    Scope currentScope;
    ParseTreeProperty<Symbol> values=new ParseTreeProperty<>();

    public void setValue(ParseTree node, Symbol value) { values.put(node, value); }
    public Symbol getValue(ParseTree node) { return values.get(node); }

    @Override public void exitDeclare_stat(CMM_BXJParser.Declare_statContext ctx) {
        Symbol.Type type=CheckSymbols.getType(ctx.type().start.getType());
        int n=ctx.getChildCount();
        int count = 0;
        Symbol symbol;
        for(int i=1;i<n;i+=2){
            if(ctx.getChild(i).getChildCount()==1) {
                String name = ctx.getChild(i).getText();
                symbol = new Symbol(name, type);
            }
            else{
                String s =ctx.array_id(count).array_tail().num_expr().getText();
                //TODO:get size
                int size = Integer.parseInt(s);
                String name = ctx.getChild(i).getChild(0).getText();
                symbol = new ArraySymbol(name,type,size);
            }
            currentScope.define(symbol);
        }
    }

    @Override public void exitAssign_stat(CMM_BXJParser.Assign_statContext ctx) {
        int index;
        if (ctx.getChild(0).getChildCount() ==1 ) {
            Symbol symbol = currentScope.resolve(ctx.id().ID().getText());
            if (symbol == null) {
                CheckSymbols.error(ctx.id().ID().getSymbol(), "no such variable: " + ctx.id().ID().getText());
                return;
            } else {
                if (symbol instanceof ArraySymbol) {
                    ArraySymbol as = (ArraySymbol) symbol;
                    if (as.getType() == Symbol.Type.INT) {
                        index = ctx.array_expr().num_array_expr().COMMA().size()+1;
                        if(as.getSize()<index){
                            CheckSymbols.error(ctx.id().ID().getSymbol(), ctx.id().ID().getText()+" assignment exceeds boundary");
                        }
                        else{
                            String[] values = new String[index];
                            if(ctx.array_expr().num_array_expr().getTokens(CMM_BXJParser.INT).size()==index){
                                for (int i = 0; i < index; i++) {
                                    values[i] = ctx.array_expr().num_array_expr().INT(i).getText();
                                }
                            }
                            else{
                                CheckSymbols.error(ctx.id().ID().getSymbol(), ctx.id().ID().getText()+" is assigned incompatible type");
                            }
                            as.setValues(values);
                        }
                    } else if (as.getType() == Symbol.Type.DOUBLE) {
                        index = ctx.array_expr().num_array_expr().COMMA().size()+1;
                        if(as.getSize()<index){
                            CheckSymbols.error(ctx.id().ID().getSymbol(), ctx.id().ID().getText()+" assignment exceeds boundary");
                        }
                        else{
                            String[] values = new String[index];
                            if(ctx.array_expr().num_array_expr().getTokens(CMM_BXJParser.DOUBLE).size()==index){
                                for (int j = 0; j < index; j++) {
                                    values[j] = ctx.array_expr().num_array_expr().DOUBLE(j).getText();
                                }
                            }
                            else{
                                CheckSymbols.error(ctx.id().ID().getSymbol(), ctx.id().ID().getText()+" is assigned incompatible type");
                            }
                            as.setValues(values);
                        }

                    } else if (as.getType() == Symbol.Type.CHAR) {
                        if(ctx.array_expr().char_array_expr().getChildCount() !=0){
                            index = ctx.array_expr().char_array_expr().COMMA().size()+1;
                            if(as.getSize()<index){
                                CheckSymbols.error(ctx.id().ID().getSymbol(), ctx.id().ID().getText()+" assignment exceeds boundary");
                            }
                            else{
                                String[] values = new String[index];
                                if(ctx.array_expr().char_array_expr().getTokens(CMM_BXJParser.CHAR).size()==index
                                        && ctx.array_expr().char_array_expr().getRuleIndex()==CMM_BXJParser.RULE_char_array_expr){
                                    for (int j = 0; j < index; j++) {
                                        values[j] = ctx.array_expr().char_array_expr().CHAR(j).getText();
                                    }
                                }
                                as.setValues(values);
                            }
                        }
                        else{
                            CheckSymbols.error(ctx.id().ID().getSymbol(), ctx.id().ID().getText()+" is assigned incompatible type");
                        }
                    } else {
                        index = ctx.array_expr().bool_array_expr().BOOL().size();
                        if(as.getSize()<index){
                            CheckSymbols.error(ctx.id().ID().getSymbol(), ctx.id().ID().getText()+" assignment exceeds boundary");
                        }
                        else{
                            String[] values = new String[index];
                            if(ctx.array_expr().bool_array_expr().getTokens(CMM_BXJParser.BOOL).size()==index){
                                for (int j = 0; j < index; j++) {
                                    values[j] = ctx.array_expr().bool_array_expr().BOOL(j).getText();
                                }
                            }
                            as.setValues(values);
                        }
                    }
                } else if (symbol instanceof Symbol) {
                    symbol.setValue(ctx.getChild(2).getChild(0).getText());
                }
            }
        }
        //array id assignment
        else{
            ArraySymbol arrId = (ArraySymbol)currentScope.resolve(ctx.array_id().ID().getText());
            if (arrId == null) {
                CheckSymbols.error(ctx.array_id().ID().getSymbol(), "no such variable: " + ctx.id().ID().getText());
                return;
            }
            else{
                index=Integer.parseInt(ctx.array_id().array_tail().num_expr().getText());
                if(arrId.getType()==getValue(ctx.expr()).getType()){
                    String value=getValue(ctx.expr()).getValue();
                    arrId.setElementValue(index, value);

                }
                else{
                    CheckSymbols.error(ctx.array_id().ID().getSymbol(), ctx.array_id().ID().getText()+" is assigned incompatible type");
                }
            }
        }
    }

    @Override
    public void exitDeclare_assign_stat(CMM_BXJParser.Declare_assign_statContext ctx) {
        //ID declare_assign_stmt
        Symbol.Type type=CheckSymbols.getType(ctx.type().start.getType());
        if(ctx.getChild(1).getChildCount()==1){
            for(int i=0;i<ctx.id().size();i++){
                String name=ctx.id(i).getText();
                if(type==getValue(ctx.expr(i)).getType()){
                    String value=getValue(ctx.expr(i)).getValue();
                    Symbol symbol=new Symbol(name,type,value);
                    currentScope.define(symbol);
                }
                else{
                    CheckSymbols.error(ctx.id(i).ID().getSymbol(), ctx.id(i).ID().getText()+" is assigned incompatible type");
                }
            }
        }
        //array_id declare assign stmt
        else{
            int index;      //num_expr in array_tail
            int assIndex;       //value number in array_expr;
            if(type==Symbol.Type.INT){
                for(int i=0;i<ctx.array_id().size();i++){
                    String name=ctx.array_id(i).ID().getText();
                    index=Integer.parseInt(ctx.array_id(i).array_tail().num_expr().getText());
                    assIndex=ctx.array_expr(i).num_array_expr().COMMA().size()+1;
                    if(index<assIndex){
                        CheckSymbols.error(ctx.array_id(i).ID().getSymbol(), ctx.array_id(i).ID().getText()+" assignment exceeds boundary");
                    }
                    else{
                        ArraySymbol as=new ArraySymbol(name,type,index);
                        if(ctx.array_expr(i).num_array_expr().INT().size()==assIndex){
                            String[] values=new String[assIndex];
                            for(int j=0;j<assIndex;j++){
                                values[j]=ctx.array_expr(i).num_array_expr().INT(j).getText();
                                as.setValues(values);
                            }
                            currentScope.define(as);
                        }
                        else{
                            CheckSymbols.error(ctx.array_id(i).ID().getSymbol(), ctx.array_id(i).ID().getText()+" is assigned incompatible type");
                        }
                    }

                }
            }
            else if(type==Symbol.Type.DOUBLE){
                for(int i=0;i<ctx.array_id().size();i++){
                    String name=ctx.array_id(i).ID().getText();
                    index=Integer.parseInt(ctx.array_id(i).array_tail().num_expr().getText());
                    assIndex=ctx.array_expr(i).num_array_expr().COMMA().size()+1;
                    if(index<assIndex){
                        CheckSymbols.error(ctx.array_id(i).ID().getSymbol(), ctx.array_id(i).ID().getText()+" assignment exceeds boundary");
                    }
                    else{
                        ArraySymbol as=new ArraySymbol(name,type,index);
                        if(ctx.array_expr(i).num_array_expr().DOUBLE().size()==assIndex){
                            String[] values=new String[assIndex];
                            for(int j=0;j<assIndex;j++){
                                values[j]=ctx.array_expr(i).num_array_expr().DOUBLE(j).getText();
                                as.setValues(values);
                            }
                            currentScope.define(as);
                        }
                        else{
                            CheckSymbols.error(ctx.array_id(i).ID().getSymbol(), ctx.array_id(i).ID().getText()+" is assigned incompatible type");
                        }
                    }

                }
            }
            else if(type==Symbol.Type.CHAR){
                for(int i=0;i<ctx.array_id().size();i++){
                    String name=ctx.array_id(i).ID().getText();
                    index=Integer.parseInt(ctx.array_id(i).array_tail().num_expr().getText());
                    assIndex=ctx.array_expr(i).char_array_expr().COMMA().size()+1;
                    if(index<assIndex){
                        CheckSymbols.error(ctx.array_id(i).ID().getSymbol(), ctx.array_id(i).ID().getText()+" assignment exceeds boundary");
                    }
                    else{
                        ArraySymbol as=new ArraySymbol(name,type,index);
                        if(ctx.array_expr(i).char_array_expr().CHAR().size()==assIndex){
                            String[] values=new String[assIndex];
                            for(int j=0;j<assIndex;j++){
                                values[j]=ctx.array_expr(i).char_array_expr().CHAR(j).getText();
                                as.setValues(values);
                            }
                            currentScope.define(as);
                        }
                    }

                }
            }
            else{
                for(int i=0;i<ctx.array_id().size();i++){
                    String name=ctx.array_id(i).ID().getText();
                    index=Integer.parseInt(ctx.array_id(i).array_tail().num_expr().getText());
                    assIndex=ctx.array_expr(i).bool_array_expr().COMMA().size()+1;
                    if(index<assIndex){
                        CheckSymbols.error(ctx.array_id(i).ID().getSymbol(), ctx.array_id(i).ID().getText()+" assignment exceeds boundary");
                    }
                    else{
                        ArraySymbol as=new ArraySymbol(name,type,index);
                        if(ctx.array_expr(i).bool_array_expr().BOOL().size()==assIndex){
                            String[] values=new String[assIndex];
                            for(int j=0;j<assIndex;j++){
                                values[j]=ctx.array_expr(i).bool_array_expr().BOOL(j).getText();
                                as.setValues(values);
                            }
                            currentScope.define(as);
                        }
                    }

                }
            }
        }
    }

    @Override public void enterInput(CMM_BXJParser.InputContext ctx) {
        currentScope = new GlobalScope(null);
    }

    @Override public void exitInput(CMM_BXJParser.InputContext ctx) {
        System.out.println(currentScope);
    }

    @Override public void enterStat_block(CMM_BXJParser.Stat_blockContext ctx) {
        currentScope = new LocalScope(currentScope);
    }

    @Override public void exitStat_block(CMM_BXJParser.Stat_blockContext ctx) {
        System.out.println(currentScope);
        currentScope = currentScope.getEnclosingScope();
    }

    /* do computation */

    @Override
    public void exitExpr(CMM_BXJParser.ExprContext ctx) {
        setValue(ctx,getValue(ctx.getChild(0)));
    }

    @Override
    public void exitNum_expr_op(CMM_BXJParser.Num_expr_opContext ctx) {
        Symbol.Type type;
        String value="";
        Symbol s0=getValue(ctx.num_expr(0));
        Symbol s1=getValue(ctx.num_expr(1));


        //Specify the type of the return value
        if(s0.getType()== Symbol.Type.DOUBLE||s1.getType()== Symbol.Type.DOUBLE) {
            type = Symbol.Type.DOUBLE;
            switch (ctx.op.getType()){
                case CMM_BXJParser.PLUS:
                    value=Double.parseDouble(s0.getValue())+Double.parseDouble(s1.getValue())+"";
                    break;
                case CMM_BXJParser.MM:
                    value=Double.parseDouble(s0.getValue()) + Double.parseDouble(s1.getValue())+"";
                    break;
                case CMM_BXJParser.MINUS:
                    value=Double.parseDouble(s0.getValue()) - Double.parseDouble(s1.getValue())+"";
                    break;
                case CMM_BXJParser.MULT:
                    value=Double.parseDouble(s0.getValue()) * Double.parseDouble(s1.getValue())+"";
                    break;
                case CMM_BXJParser.DIVI:
                    value=Double.parseDouble(s0.getValue()) / Double.parseDouble(s1.getValue())+"";
                    break;
                case CMM_BXJParser.MOD:
                    value=Double.parseDouble(s0.getValue()) % Double.parseDouble(s1.getValue())+"";
                    break;
                default:
                    break;
            }
        }
        else{
            type = Symbol.Type.INT;
            switch (ctx.op.getType()){
                case CMM_BXJParser.PLUS:
                    value=Integer.parseInt(s0.getValue()) + Integer.parseInt(s1.getValue())+"";
                    break;
                case CMM_BXJParser.MM:
                    value=Integer.parseInt(s0.getValue()) + Integer.parseInt(s1.getValue())+"";
                    break;
                case CMM_BXJParser.MINUS:
                    value=Integer.parseInt(s0.getValue()) - Integer.parseInt(s1.getValue())+"";
                    break;
                case CMM_BXJParser.MULT:
                    value=Integer.parseInt(s0.getValue()) * Integer.parseInt(s1.getValue())+"";
                    break;
                case CMM_BXJParser.DIVI:
                    value=Integer.parseInt(s0.getValue()) / Integer.parseInt(s1.getValue())+"";
                    break;
                case CMM_BXJParser.MOD:
                    value=Integer.parseInt(s0.getValue()) % Integer.parseInt(s1.getValue())+"";
                    break;
                default:
                    break;
            }
        }

        setValue(ctx,new Symbol(null,type,value));
    }

    @Override
    public void exitNum_expr_paren(CMM_BXJParser.Num_expr_parenContext ctx) {
        setValue(ctx,getValue(ctx.getChild(1)));
    }

    @Override
    public void exitNum_expr_minus(CMM_BXJParser.Num_expr_minusContext ctx) {
        Symbol.Type type=getValue(ctx.getChild(1)).getType();
        String value;
        Symbol child =getValue(ctx.getChild(1));
        if(child.getType()== Symbol.Type.DOUBLE)
            value = -Double.parseDouble(child.getValue())+"";
        else
            value = -Integer.parseInt(child.getValue())+"";
        setValue(ctx,new Symbol(null,type,value));
    }

    @Override
    public void exitId(CMM_BXJParser.IdContext ctx) {
        int pRuleIndex = ctx.getParent().getRuleIndex();
        if(pRuleIndex>=CMM_BXJParser.RULE_num_expr && pRuleIndex<=CMM_BXJParser.RULE_char_expr) {
            Symbol symbol = currentScope.resolve(ctx.ID().getText());
            if(symbol==null){
                CheckSymbols.error(ctx.ID().getSymbol(),"no such variable: " + ctx.ID().getText());
                return;
            }
            if (ctx.getParent().getRuleIndex() >= CMM_BXJParser.RULE_num_expr) {
                if (symbol.getType() != Symbol.Type.INT && symbol.getType() != Symbol.Type.DOUBLE) {
                    CheckSymbols.error(ctx.stop, "double or int required, " + symbol.getType().name().toLowerCase() + " found");
                    return;
                }
                setValue(ctx.getParent(), currentScope.resolve(ctx.ID().getText()));

            }
        }
    }



    @Override
    public void visitTerminal(TerminalNode node) {
        switch (node.getSymbol().getType()) {
            case CMM_BXJParser.INT:
                setValue(node.getParent(), new Symbol(null, Symbol.Type.INT, node.getText()));
                break;
            case CMM_BXJParser.DOUBLE:
                setValue(node.getParent(), new Symbol(null, Symbol.Type.DOUBLE, node.getText()));
                break;
        }
    }
}
