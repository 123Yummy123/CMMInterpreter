package antlr;// Generated from D:/Source_File/For_InteliJ/CMMGrammar_/G4\CMM_BXJ.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CMM_BXJParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CMM_BXJVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(CMM_BXJParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(CMM_BXJParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(CMM_BXJParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#declare_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stat(CMM_BXJParser.Declare_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#assign_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stat(CMM_BXJParser.Assign_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#declare_assign_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_assign_stat(CMM_BXJParser.Declare_assign_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#read_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_stat(CMM_BXJParser.Read_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#write_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_stat(CMM_BXJParser.Write_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(CMM_BXJParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(CMM_BXJParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#break_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stat(CMM_BXJParser.Break_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#cont_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCont_stat(CMM_BXJParser.Cont_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#other_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_stat(CMM_BXJParser.Other_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CMM_BXJParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expr(CMM_BXJParser.Array_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#num_array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_array_expr(CMM_BXJParser.Num_array_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#char_array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_array_expr(CMM_BXJParser.Char_array_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#bool_array_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_array_expr(CMM_BXJParser.Bool_array_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num_expr_op}
	 * labeled alternative in {@link CMM_BXJParser#num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expr_op(CMM_BXJParser.Num_expr_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num_expr_paren}
	 * labeled alternative in {@link CMM_BXJParser#num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expr_paren(CMM_BXJParser.Num_expr_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num_expr_other}
	 * labeled alternative in {@link CMM_BXJParser#num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expr_other(CMM_BXJParser.Num_expr_otherContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num_expr_minus}
	 * labeled alternative in {@link CMM_BXJParser#num_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_expr_minus(CMM_BXJParser.Num_expr_minusContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(CMM_BXJParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#char_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_expr(CMM_BXJParser.Char_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CMM_BXJParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#array_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_id(CMM_BXJParser.Array_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#array_tail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_tail(CMM_BXJParser.Array_tailContext ctx);
	/**
	 * Visit a parse tree produced by {@link CMM_BXJParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CMM_BXJParser.IdContext ctx);
}