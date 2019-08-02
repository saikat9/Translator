// Generated from TDGrammar.g4 by ANTLR 4.7.1

package com.cognizant.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TDGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		K_SEL=1, K_SELECT=2, K_DISTINCT=3, K_ALL=4, K_TOP=5, K_PERCENT=6, K_AS=7, 
		K_FROM=8, K_MINUS=9, K_EXCEPT=10, SCOL=11, DOT=12, OPEN_PAR=13, CLOSE_PAR=14, 
		COMMA=15, ASSIGN=16, STAR=17, PLUS=18, MINUS=19, TILDE=20, PIPE2=21, DIV=22, 
		MOD=23, LT2=24, GT2=25, AMP=26, PIPE=27, LT=28, LT_EQ=29, GT=30, GT_EQ=31, 
		EQ=32, NOT_EQ1=33, NOT_EQ2=34, MULTILINE_COMMENT=35, SPACES=36, UNEXPECTED_CHAR=37, 
		NUMERIC_LITERAL=38, INTEGER=39, DECIMAL=40, STRING_LITERAL=41, SINGLE_LINE_COMMENT=42, 
		IDENTIFIER=43;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_select_stmt = 4, RULE_select_expr = 5, RULE_select_list = 6, RULE_select_list_expr = 7, 
		RULE_from_clause = 8, RULE_keyword = 9, RULE_expr = 10, RULE_expr_alias_name = 11, 
		RULE_literal_value = 12, RULE_top_expr = 13, RULE_table_name = 14, RULE_column_name = 15, 
		RULE_database_name = 16, RULE_table_alias_name = 17, RULE_function_name = 18;
	public static final String[] ruleNames = {
		"parse", "error", "sql_stmt_list", "sql_stmt", "select_stmt", "select_expr", 
		"select_list", "select_list_expr", "from_clause", "keyword", "expr", "expr_alias_name", 
		"literal_value", "top_expr", "table_name", "column_name", "database_name", 
		"table_alias_name", "function_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "';'", 
		"'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", "'||'", 
		"'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", "'>='", 
		"'=='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "K_SEL", "K_SELECT", "K_DISTINCT", "K_ALL", "K_TOP", "K_PERCENT", 
		"K_AS", "K_FROM", "K_MINUS", "K_EXCEPT", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", 
		"COMMA", "ASSIGN", "STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", 
		"LT2", "GT2", "AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", 
		"NOT_EQ2", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR", "NUMERIC_LITERAL", 
		"INTEGER", "DECIMAL", "STRING_LITERAL", "SINGLE_LINE_COMMENT", "IDENTIFIER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TDGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TDGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TDGrammarParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_SEL) | (1L << K_SELECT) | (1L << UNEXPECTED_CHAR))) != 0)) {
				{
				setState(40);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_SEL:
				case K_SELECT:
					{
					setState(38);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(39);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(TDGrammarParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(50);
					sql_stmt();
					setState(51);
					match(SCOL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_exprContext> select_expr() {
			return getRuleContexts(Select_exprContext.class);
		}
		public Select_exprContext select_expr(int i) {
			return getRuleContext(Select_exprContext.class,i);
		}
		public TerminalNode K_MINUS() { return getToken(TDGrammarParser.K_MINUS, 0); }
		public TerminalNode K_EXCEPT() { return getToken(TDGrammarParser.K_EXCEPT, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			select_expr();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_MINUS || _la==K_EXCEPT) {
				{
				setState(60);
				_la = _input.LA(1);
				if ( !(_la==K_MINUS || _la==K_EXCEPT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(61);
				select_expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_exprContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(TDGrammarParser.K_SELECT, 0); }
		public TerminalNode K_SEL() { return getToken(TDGrammarParser.K_SEL, 0); }
		public Top_exprContext top_expr() {
			return getRuleContext(Top_exprContext.class,0);
		}
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(TDGrammarParser.K_DISTINCT, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(TDGrammarParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(TDGrammarParser.K_ALL, i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(TDGrammarParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(TDGrammarParser.DOT, i);
		}
		public TerminalNode STAR() { return getToken(TDGrammarParser.STAR, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Select_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterSelect_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitSelect_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitSelect_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_exprContext select_expr() throws RecognitionException {
		Select_exprContext _localctx = new Select_exprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_select_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !(_la==K_SEL || _la==K_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DISTINCT:
			case K_ALL:
				{
				{
				setState(65);
				_la = _input.LA(1);
				if ( !(_la==K_DISTINCT || _la==K_ALL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					{
					setState(66);
					table_name();
					setState(67);
					match(DOT);
					setState(68);
					match(STAR);
					setState(69);
					match(DOT);
					setState(70);
					match(K_ALL);
					}
					}
					break;
				case 2:
					{
					{
					setState(72);
					column_name();
					setState(73);
					match(DOT);
					setState(74);
					match(K_ALL);
					}
					}
					break;
				case 3:
					{
					{
					setState(76);
					match(STAR);
					setState(77);
					match(DOT);
					setState(78);
					match(K_ALL);
					}
					}
					break;
				}
				}
				}
				break;
			case K_TOP:
				{
				setState(81);
				top_expr();
				}
				break;
			case K_FROM:
			case K_MINUS:
			case K_EXCEPT:
			case SCOL:
			case OPEN_PAR:
			case STAR:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case IDENTIFIER:
				break;
			default:
				break;
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << STAR) | (1L << NUMERIC_LITERAL) | (1L << STRING_LITERAL) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(84);
				select_list();
				}
			}

			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FROM) {
				{
				setState(87);
				from_clause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(TDGrammarParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TDGrammarParser.DOT, 0); }
		public List<Select_list_exprContext> select_list_expr() {
			return getRuleContexts(Select_list_exprContext.class);
		}
		public Select_list_exprContext select_list_expr(int i) {
			return getRuleContext(Select_list_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TDGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TDGrammarParser.COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitSelect_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_select_list);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				table_name();
				setState(92);
				match(DOT);
				setState(93);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				select_list_expr();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(96);
					match(COMMA);
					setState(97);
					select_list_expr();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_exprContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TDGrammarParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(TDGrammarParser.STAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_alias_nameContext expr_alias_name() {
			return getRuleContext(Expr_alias_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(TDGrammarParser.K_AS, 0); }
		public Select_list_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterSelect_list_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitSelect_list_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitSelect_list_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_exprContext select_list_expr() throws RecognitionException {
		Select_list_exprContext _localctx = new Select_list_exprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_select_list_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				{
				setState(105);
				expr();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER) {
					{
					setState(107);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(106);
						match(K_AS);
						}
					}

					setState(109);
					expr_alias_name();
					}
				}

				}
				}
				break;
			case 2:
				{
				setState(112);
				table_name();
				setState(113);
				match(DOT);
				setState(114);
				match(STAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode K_FROM() { return getToken(TDGrammarParser.K_FROM, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Table_alias_nameContext table_alias_name() {
			return getRuleContext(Table_alias_nameContext.class,0);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitFrom_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(K_FROM);
			setState(119);
			table_name();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(120);
				table_alias_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(TDGrammarParser.K_SELECT, 0); }
		public TerminalNode K_SEL() { return getToken(TDGrammarParser.K_SEL, 0); }
		public TerminalNode K_DISTINCT() { return getToken(TDGrammarParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(TDGrammarParser.K_ALL, 0); }
		public TerminalNode K_TOP() { return getToken(TDGrammarParser.K_TOP, 0); }
		public TerminalNode K_PERCENT() { return getToken(TDGrammarParser.K_PERCENT, 0); }
		public TerminalNode K_AS() { return getToken(TDGrammarParser.K_AS, 0); }
		public TerminalNode K_FROM() { return getToken(TDGrammarParser.K_FROM, 0); }
		public TerminalNode K_MINUS() { return getToken(TDGrammarParser.K_MINUS, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_SEL) | (1L << K_SELECT) | (1L << K_DISTINCT) | (1L << K_ALL) | (1L << K_TOP) | (1L << K_PERCENT) | (1L << K_AS) | (1L << K_FROM) | (1L << K_MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		int _la;
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				literal_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						setState(126);
						database_name();
						setState(127);
						match(DOT);
						}
						break;
					}
					setState(131);
					table_name();
					setState(132);
					match(DOT);
					}
					break;
				}
				setState(136);
				column_name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				function_name();
				setState(138);
				match(OPEN_PAR);
				setState(148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case IDENTIFIER:
					{
					setState(139);
					expr();
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(140);
						match(COMMA);
						setState(141);
						expr();
						}
						}
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(147);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(150);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(OPEN_PAR);
				setState(153);
				expr();
				setState(154);
				match(CLOSE_PAR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_alias_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TDGrammarParser.IDENTIFIER, 0); }
		public Expr_alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_alias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterExpr_alias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitExpr_alias_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitExpr_alias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_alias_nameContext expr_alias_name() throws RecognitionException {
		Expr_alias_nameContext _localctx = new Expr_alias_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(TDGrammarParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(TDGrammarParser.STRING_LITERAL, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==NUMERIC_LITERAL || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Top_exprContext extends ParserRuleContext {
		public TerminalNode K_TOP() { return getToken(TDGrammarParser.K_TOP, 0); }
		public TerminalNode INTEGER() { return getToken(TDGrammarParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(TDGrammarParser.DECIMAL, 0); }
		public TerminalNode K_PERCENT() { return getToken(TDGrammarParser.K_PERCENT, 0); }
		public Top_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterTop_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitTop_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitTop_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_exprContext top_expr() throws RecognitionException {
		Top_exprContext _localctx = new Top_exprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_top_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(K_TOP);
			setState(163);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==DECIMAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_PERCENT) {
				{
				setState(164);
				match(K_PERCENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TDGrammarParser.IDENTIFIER, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TDGrammarParser.DOT, 0); }
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(167);
				database_name();
				setState(168);
				match(DOT);
				}
				break;
			}
			setState(172);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TDGrammarParser.IDENTIFIER, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(TDGrammarParser.DOT, 0); }
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(174);
				table_name();
				setState(175);
				match(DOT);
				}
				break;
			}
			setState(179);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TDGrammarParser.IDENTIFIER, 0); }
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_alias_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TDGrammarParser.IDENTIFIER, 0); }
		public Table_alias_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterTable_alias_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitTable_alias_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitTable_alias_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_alias_nameContext table_alias_name() throws RecognitionException {
		Table_alias_nameContext _localctx = new Table_alias_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_table_alias_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(TDGrammarParser.IDENTIFIER, 0); }
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TDGrammarListener ) ((TDGrammarListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TDGrammarVisitor ) return ((TDGrammarVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00be\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\6\48\n\4\r\4\16\49\3\5\3\5\3\6\3\6\3\6\5\6A\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7R\n\7\3\7\5\7"+
		"U\n\7\3\7\5\7X\n\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\be\n"+
		"\b\f\b\16\bh\13\b\5\bj\n\b\3\t\3\t\5\tn\n\t\3\t\5\tq\n\t\3\t\3\t\3\t\3"+
		"\t\5\tw\n\t\3\n\3\n\3\n\5\n|\n\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u0084\n"+
		"\f\3\f\3\f\3\f\5\f\u0089\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0091\n\f\f\f"+
		"\16\f\u0094\13\f\3\f\5\f\u0097\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009f\n"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\5\17\u00a8\n\17\3\20\3\20\3\20\5\20"+
		"\u00ad\n\20\3\20\3\20\3\21\3\21\3\21\5\21\u00b4\n\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&\2\b\3\2\13\f\3\2\3\4\3\2\5\6\3\2\3\13\4\2((++\3\2)*\2\u00c7\2"+
		",\3\2\2\2\4\61\3\2\2\2\6\67\3\2\2\2\b;\3\2\2\2\n=\3\2\2\2\fB\3\2\2\2\16"+
		"i\3\2\2\2\20v\3\2\2\2\22x\3\2\2\2\24}\3\2\2\2\26\u009e\3\2\2\2\30\u00a0"+
		"\3\2\2\2\32\u00a2\3\2\2\2\34\u00a4\3\2\2\2\36\u00ac\3\2\2\2 \u00b3\3\2"+
		"\2\2\"\u00b7\3\2\2\2$\u00b9\3\2\2\2&\u00bb\3\2\2\2(+\5\6\4\2)+\5\4\3\2"+
		"*(\3\2\2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2"+
		"/\60\7\2\2\3\60\3\3\2\2\2\61\62\7\'\2\2\62\63\b\3\1\2\63\5\3\2\2\2\64"+
		"\65\5\b\5\2\65\66\7\r\2\2\668\3\2\2\2\67\64\3\2\2\289\3\2\2\29\67\3\2"+
		"\2\29:\3\2\2\2:\7\3\2\2\2;<\5\n\6\2<\t\3\2\2\2=@\5\f\7\2>?\t\2\2\2?A\5"+
		"\f\7\2@>\3\2\2\2@A\3\2\2\2A\13\3\2\2\2BT\t\3\2\2CQ\t\4\2\2DE\5\36\20\2"+
		"EF\7\16\2\2FG\7\23\2\2GH\7\16\2\2HI\7\6\2\2IR\3\2\2\2JK\5 \21\2KL\7\16"+
		"\2\2LM\7\6\2\2MR\3\2\2\2NO\7\23\2\2OP\7\16\2\2PR\7\6\2\2QD\3\2\2\2QJ\3"+
		"\2\2\2QN\3\2\2\2QR\3\2\2\2RU\3\2\2\2SU\5\34\17\2TC\3\2\2\2TS\3\2\2\2T"+
		"U\3\2\2\2UW\3\2\2\2VX\5\16\b\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2Y[\5\22\n"+
		"\2ZY\3\2\2\2Z[\3\2\2\2[\r\3\2\2\2\\j\7\23\2\2]^\5\36\20\2^_\7\16\2\2_"+
		"`\7\23\2\2`j\3\2\2\2af\5\20\t\2bc\7\21\2\2ce\5\20\t\2db\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hf\3\2\2\2i\\\3\2\2\2i]\3\2\2\2ia\3"+
		"\2\2\2j\17\3\2\2\2kp\5\26\f\2ln\7\t\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2"+
		"oq\5\30\r\2pm\3\2\2\2pq\3\2\2\2qw\3\2\2\2rs\5\36\20\2st\7\16\2\2tu\7\23"+
		"\2\2uw\3\2\2\2vk\3\2\2\2vr\3\2\2\2w\21\3\2\2\2xy\7\n\2\2y{\5\36\20\2z"+
		"|\5$\23\2{z\3\2\2\2{|\3\2\2\2|\23\3\2\2\2}~\t\5\2\2~\25\3\2\2\2\177\u009f"+
		"\5\32\16\2\u0080\u0081\5\"\22\2\u0081\u0082\7\16\2\2\u0082\u0084\3\2\2"+
		"\2\u0083\u0080\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\5\36\20\2\u0086\u0087\7\16\2\2\u0087\u0089\3\2\2\2\u0088\u0083\3\2\2"+
		"\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u009f\5 \21\2\u008b\u008c"+
		"\5&\24\2\u008c\u0096\7\17\2\2\u008d\u0092\5\26\f\2\u008e\u008f\7\21\2"+
		"\2\u008f\u0091\5\26\f\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0095\u0097\7\23\2\2\u0096\u008d\3\2\2\2\u0096\u0095\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\20\2\2\u0099\u009f\3"+
		"\2\2\2\u009a\u009b\7\17\2\2\u009b\u009c\5\26\f\2\u009c\u009d\7\20\2\2"+
		"\u009d\u009f\3\2\2\2\u009e\177\3\2\2\2\u009e\u0088\3\2\2\2\u009e\u008b"+
		"\3\2\2\2\u009e\u009a\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a1\7-\2\2\u00a1"+
		"\31\3\2\2\2\u00a2\u00a3\t\6\2\2\u00a3\33\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5"+
		"\u00a7\t\7\2\2\u00a6\u00a8\7\b\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\5\"\22\2\u00aa\u00ab\7\16\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00af\7-\2\2\u00af\37\3\2\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2"+
		"\7\16\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7-\2\2\u00b6!\3\2\2\2\u00b7\u00b8\7-"+
		"\2\2\u00b8#\3\2\2\2\u00b9\u00ba\7-\2\2\u00ba%\3\2\2\2\u00bb\u00bc\7-\2"+
		"\2\u00bc\'\3\2\2\2\30*,9@QTWZfimpv{\u0083\u0088\u0092\u0096\u009e\u00a7"+
		"\u00ac\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}