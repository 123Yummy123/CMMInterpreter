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

    /* build a symbol table */
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
        if(ctx.getChild(0).getChildCount()==1){     //assign to a id
            Symbol symbol = currentScope.resolve(ctx.id().getText());
            if(symbol==null) {
                CheckSymbols.error(ctx.id().ID().getSymbol(), "no such variable: " + ctx.id().getText());
                return;
            }
            symbol.setValue(getValue(ctx.getChild(2)).getValue());
        }
        else{           //assign to a array_id
            ArraySymbol as = (ArraySymbol)currentScope.resolve(ctx.array_id().ID().getText());
            if(as==null){
                CheckSymbols.error(ctx.array_id().ID().getSymbol(), "no such variable: " + ctx.array_id().ID().getText());
                return;
            }
            int index=Integer.parseInt(ctx.array_id().array_tail().num_expr().getText());
            as.setElementValue(index,ctx.getChild(2).getText());
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
