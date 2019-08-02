// Generated from TDGrammar.g4 by ANTLR 4.7.1

package com.cognizant.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TDGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TDGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(TDGrammarParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(TDGrammarParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(TDGrammarParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(TDGrammarParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(TDGrammarParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#select_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_expr(TDGrammarParser.Select_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(TDGrammarParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#select_list_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_expr(TDGrammarParser.Select_list_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(TDGrammarParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(TDGrammarParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(TDGrammarParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#expr_alias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_alias_name(TDGrammarParser.Expr_alias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(TDGrammarParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#top_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_expr(TDGrammarParser.Top_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(TDGrammarParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(TDGrammarParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(TDGrammarParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#table_alias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias_name(TDGrammarParser.Table_alias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TDGrammarParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(TDGrammarParser.Function_nameContext ctx);
}