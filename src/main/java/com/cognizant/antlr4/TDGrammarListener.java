// Generated from TDGrammar.g4 by ANTLR 4.7.1

package com.cognizant.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TDGrammarParser}.
 */
public interface TDGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(TDGrammarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(TDGrammarParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(TDGrammarParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(TDGrammarParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(TDGrammarParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(TDGrammarParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(TDGrammarParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(TDGrammarParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(TDGrammarParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(TDGrammarParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expr(TDGrammarParser.Select_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expr(TDGrammarParser.Select_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(TDGrammarParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(TDGrammarParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#select_list_expr}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_expr(TDGrammarParser.Select_list_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#select_list_expr}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_expr(TDGrammarParser.Select_list_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(TDGrammarParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(TDGrammarParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(TDGrammarParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(TDGrammarParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TDGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TDGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#expr_alias_name}.
	 * @param ctx the parse tree
	 */
	void enterExpr_alias_name(TDGrammarParser.Expr_alias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#expr_alias_name}.
	 * @param ctx the parse tree
	 */
	void exitExpr_alias_name(TDGrammarParser.Expr_alias_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(TDGrammarParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(TDGrammarParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#top_expr}.
	 * @param ctx the parse tree
	 */
	void enterTop_expr(TDGrammarParser.Top_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#top_expr}.
	 * @param ctx the parse tree
	 */
	void exitTop_expr(TDGrammarParser.Top_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(TDGrammarParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(TDGrammarParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(TDGrammarParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(TDGrammarParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(TDGrammarParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(TDGrammarParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#table_alias_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias_name(TDGrammarParser.Table_alias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#table_alias_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias_name(TDGrammarParser.Table_alias_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TDGrammarParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(TDGrammarParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TDGrammarParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(TDGrammarParser.Function_nameContext ctx);
}