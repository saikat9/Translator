// Generated from TDGrammar.g4 by ANTLR 4.7.1

package com.cognizant.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TDGrammarLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"K_SEL", "K_SELECT", "K_DISTINCT", "K_ALL", "K_TOP", "K_PERCENT", "K_AS", 
		"K_FROM", "K_MINUS", "K_EXCEPT", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", 
		"COMMA", "ASSIGN", "STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", 
		"LT2", "GT2", "AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", 
		"NOT_EQ2", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR", "NUMERIC_LITERAL", 
		"INTEGER", "DECIMAL", "STRING_LITERAL", "SINGLE_LINE_COMMENT", "IDENTIFIER", 
		"DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
		"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
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


	public TDGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TDGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0198\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3"+
		"$\7$\u0105\n$\f$\16$\u0108\13$\3$\3$\3$\5$\u010d\n$\3$\3$\3%\3%\3%\3%"+
		"\3&\3&\3\'\3\'\5\'\u0119\n\'\3(\6(\u011c\n(\r(\16(\u011d\3)\3)\3)\7)\u0123"+
		"\n)\f)\16)\u0126\13)\3*\3*\3*\3*\7*\u012c\n*\f*\16*\u012f\13*\3*\3*\3"+
		"+\3+\3+\3+\7+\u0137\n+\f+\16+\u013a\13+\3+\3+\3,\3,\3,\3,\7,\u0142\n,"+
		"\f,\16,\u0145\13,\3,\3,\3,\3,\3,\7,\u014c\n,\f,\16,\u014f\13,\3,\3,\3"+
		",\7,\u0154\n,\f,\16,\u0157\13,\3,\3,\3,\7,\u015c\n,\f,\16,\u015f\13,\5"+
		",\u0161\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3"+
		"=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3\u0106"+
		"\2H\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y\2[\2]\2_\2a\2c\2e\2g\2i\2k\2m\2o\2"+
		"q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b"+
		"\2\u008d\2\3\2%\5\2\13\r\17\17\"\"\3\2\62;\3\2))\4\2\f\f\17\17\3\2$$\3"+
		"\2bb\3\2__\5\2C\\aac|\6\2\62;C\\aac|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4"+
		"\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOo"+
		"o\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2"+
		"XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u018d\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3\u008f"+
		"\3\2\2\2\5\u0093\3\2\2\2\7\u009a\3\2\2\2\t\u00a3\3\2\2\2\13\u00a7\3\2"+
		"\2\2\r\u00ab\3\2\2\2\17\u00b3\3\2\2\2\21\u00b6\3\2\2\2\23\u00bb\3\2\2"+
		"\2\25\u00c1\3\2\2\2\27\u00c8\3\2\2\2\31\u00ca\3\2\2\2\33\u00cc\3\2\2\2"+
		"\35\u00ce\3\2\2\2\37\u00d0\3\2\2\2!\u00d2\3\2\2\2#\u00d4\3\2\2\2%\u00d6"+
		"\3\2\2\2\'\u00d8\3\2\2\2)\u00da\3\2\2\2+\u00dc\3\2\2\2-\u00df\3\2\2\2"+
		"/\u00e1\3\2\2\2\61\u00e3\3\2\2\2\63\u00e6\3\2\2\2\65\u00e9\3\2\2\2\67"+
		"\u00eb\3\2\2\29\u00ed\3\2\2\2;\u00ef\3\2\2\2=\u00f2\3\2\2\2?\u00f4\3\2"+
		"\2\2A\u00f7\3\2\2\2C\u00fa\3\2\2\2E\u00fd\3\2\2\2G\u0100\3\2\2\2I\u0110"+
		"\3\2\2\2K\u0114\3\2\2\2M\u0118\3\2\2\2O\u011b\3\2\2\2Q\u011f\3\2\2\2S"+
		"\u0127\3\2\2\2U\u0132\3\2\2\2W\u0160\3\2\2\2Y\u0162\3\2\2\2[\u0164\3\2"+
		"\2\2]\u0166\3\2\2\2_\u0168\3\2\2\2a\u016a\3\2\2\2c\u016c\3\2\2\2e\u016e"+
		"\3\2\2\2g\u0170\3\2\2\2i\u0172\3\2\2\2k\u0174\3\2\2\2m\u0176\3\2\2\2o"+
		"\u0178\3\2\2\2q\u017a\3\2\2\2s\u017c\3\2\2\2u\u017e\3\2\2\2w\u0180\3\2"+
		"\2\2y\u0182\3\2\2\2{\u0184\3\2\2\2}\u0186\3\2\2\2\177\u0188\3\2\2\2\u0081"+
		"\u018a\3\2\2\2\u0083\u018c\3\2\2\2\u0085\u018e\3\2\2\2\u0087\u0190\3\2"+
		"\2\2\u0089\u0192\3\2\2\2\u008b\u0194\3\2\2\2\u008d\u0196\3\2\2\2\u008f"+
		"\u0090\5\177@\2\u0090\u0091\5c\62\2\u0091\u0092\5q9\2\u0092\4\3\2\2\2"+
		"\u0093\u0094\5\177@\2\u0094\u0095\5c\62\2\u0095\u0096\5q9\2\u0096\u0097"+
		"\5c\62\2\u0097\u0098\5_\60\2\u0098\u0099\5\u0081A\2\u0099\6\3\2\2\2\u009a"+
		"\u009b\5a\61\2\u009b\u009c\5k\66\2\u009c\u009d\5\177@\2\u009d\u009e\5"+
		"\u0081A\2\u009e\u009f\5k\66\2\u009f\u00a0\5u;\2\u00a0\u00a1\5_\60\2\u00a1"+
		"\u00a2\5\u0081A\2\u00a2\b\3\2\2\2\u00a3\u00a4\5[.\2\u00a4\u00a5\5q9\2"+
		"\u00a5\u00a6\5q9\2\u00a6\n\3\2\2\2\u00a7\u00a8\5\u0081A\2\u00a8\u00a9"+
		"\5w<\2\u00a9\u00aa\5y=\2\u00aa\f\3\2\2\2\u00ab\u00ac\5y=\2\u00ac\u00ad"+
		"\5c\62\2\u00ad\u00ae\5}?\2\u00ae\u00af\5_\60\2\u00af\u00b0\5c\62\2\u00b0"+
		"\u00b1\5u;\2\u00b1\u00b2\5\u0081A\2\u00b2\16\3\2\2\2\u00b3\u00b4\5[.\2"+
		"\u00b4\u00b5\5\177@\2\u00b5\20\3\2\2\2\u00b6\u00b7\5e\63\2\u00b7\u00b8"+
		"\5}?\2\u00b8\u00b9\5w<\2\u00b9\u00ba\5s:\2\u00ba\22\3\2\2\2\u00bb\u00bc"+
		"\5s:\2\u00bc\u00bd\5k\66\2\u00bd\u00be\5u;\2\u00be\u00bf\5\u0083B\2\u00bf"+
		"\u00c0\5\177@\2\u00c0\24\3\2\2\2\u00c1\u00c2\5c\62\2\u00c2\u00c3\5\u0089"+
		"E\2\u00c3\u00c4\5_\60\2\u00c4\u00c5\5c\62\2\u00c5\u00c6\5y=\2\u00c6\u00c7"+
		"\5\u0081A\2\u00c7\26\3\2\2\2\u00c8\u00c9\7=\2\2\u00c9\30\3\2\2\2\u00ca"+
		"\u00cb\7\60\2\2\u00cb\32\3\2\2\2\u00cc\u00cd\7*\2\2\u00cd\34\3\2\2\2\u00ce"+
		"\u00cf\7+\2\2\u00cf\36\3\2\2\2\u00d0\u00d1\7.\2\2\u00d1 \3\2\2\2\u00d2"+
		"\u00d3\7?\2\2\u00d3\"\3\2\2\2\u00d4\u00d5\7,\2\2\u00d5$\3\2\2\2\u00d6"+
		"\u00d7\7-\2\2\u00d7&\3\2\2\2\u00d8\u00d9\7/\2\2\u00d9(\3\2\2\2\u00da\u00db"+
		"\7\u0080\2\2\u00db*\3\2\2\2\u00dc\u00dd\7~\2\2\u00dd\u00de\7~\2\2\u00de"+
		",\3\2\2\2\u00df\u00e0\7\61\2\2\u00e0.\3\2\2\2\u00e1\u00e2\7\'\2\2\u00e2"+
		"\60\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4\u00e5\7>\2\2\u00e5\62\3\2\2\2\u00e6"+
		"\u00e7\7@\2\2\u00e7\u00e8\7@\2\2\u00e8\64\3\2\2\2\u00e9\u00ea\7(\2\2\u00ea"+
		"\66\3\2\2\2\u00eb\u00ec\7~\2\2\u00ec8\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee"+
		":\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0\u00f1\7?\2\2\u00f1<\3\2\2\2\u00f2\u00f3"+
		"\7@\2\2\u00f3>\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5\u00f6\7?\2\2\u00f6@\3"+
		"\2\2\2\u00f7\u00f8\7?\2\2\u00f8\u00f9\7?\2\2\u00f9B\3\2\2\2\u00fa\u00fb"+
		"\7#\2\2\u00fb\u00fc\7?\2\2\u00fcD\3\2\2\2\u00fd\u00fe\7>\2\2\u00fe\u00ff"+
		"\7@\2\2\u00ffF\3\2\2\2\u0100\u0101\7\61\2\2\u0101\u0102\7,\2\2\u0102\u0106"+
		"\3\2\2\2\u0103\u0105\13\2\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2"+
		"\u0106\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u010c\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0109\u010a\7,\2\2\u010a\u010d\7\61\2\2\u010b\u010d\7\2\2\3\u010c"+
		"\u0109\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b$"+
		"\2\2\u010fH\3\2\2\2\u0110\u0111\t\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113"+
		"\b%\2\2\u0113J\3\2\2\2\u0114\u0115\13\2\2\2\u0115L\3\2\2\2\u0116\u0119"+
		"\5O(\2\u0117\u0119\5Q)\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119"+
		"N\3\2\2\2\u011a\u011c\t\3\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2"+
		"\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011eP\3\2\2\2\u011f\u0120\t"+
		"\3\2\2\u0120\u0124\7\60\2\2\u0121\u0123\t\3\2\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125R\3\2\2\2"+
		"\u0126\u0124\3\2\2\2\u0127\u012d\7)\2\2\u0128\u012c\n\4\2\2\u0129\u012a"+
		"\7)\2\2\u012a\u012c\7)\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2"+
		"\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7)\2\2\u0131T\3\2\2\2\u0132\u0133"+
		"\7/\2\2\u0133\u0134\7/\2\2\u0134\u0138\3\2\2\2\u0135\u0137\n\5\2\2\u0136"+
		"\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\b+\2\2\u013c"+
		"V\3\2\2\2\u013d\u0143\7$\2\2\u013e\u0142\n\6\2\2\u013f\u0140\7$\2\2\u0140"+
		"\u0142\7$\2\2\u0141\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0161\7$\2\2\u0147\u014d\7b\2\2\u0148\u014c\n\7\2"+
		"\2\u0149\u014a\7b\2\2\u014a\u014c\7b\2\2\u014b\u0148\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0161\7b\2\2\u0151\u0155\7]\2"+
		"\2\u0152\u0154\n\b\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158"+
		"\u0161\7_\2\2\u0159\u015d\t\t\2\2\u015a\u015c\t\n\2\2\u015b\u015a\3\2"+
		"\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0161\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u013d\3\2\2\2\u0160\u0147\3\2"+
		"\2\2\u0160\u0151\3\2\2\2\u0160\u0159\3\2\2\2\u0161X\3\2\2\2\u0162\u0163"+
		"\t\3\2\2\u0163Z\3\2\2\2\u0164\u0165\t\13\2\2\u0165\\\3\2\2\2\u0166\u0167"+
		"\t\f\2\2\u0167^\3\2\2\2\u0168\u0169\t\r\2\2\u0169`\3\2\2\2\u016a\u016b"+
		"\t\16\2\2\u016bb\3\2\2\2\u016c\u016d\t\17\2\2\u016dd\3\2\2\2\u016e\u016f"+
		"\t\20\2\2\u016ff\3\2\2\2\u0170\u0171\t\21\2\2\u0171h\3\2\2\2\u0172\u0173"+
		"\t\22\2\2\u0173j\3\2\2\2\u0174\u0175\t\23\2\2\u0175l\3\2\2\2\u0176\u0177"+
		"\t\24\2\2\u0177n\3\2\2\2\u0178\u0179\t\25\2\2\u0179p\3\2\2\2\u017a\u017b"+
		"\t\26\2\2\u017br\3\2\2\2\u017c\u017d\t\27\2\2\u017dt\3\2\2\2\u017e\u017f"+
		"\t\30\2\2\u017fv\3\2\2\2\u0180\u0181\t\31\2\2\u0181x\3\2\2\2\u0182\u0183"+
		"\t\32\2\2\u0183z\3\2\2\2\u0184\u0185\t\33\2\2\u0185|\3\2\2\2\u0186\u0187"+
		"\t\34\2\2\u0187~\3\2\2\2\u0188\u0189\t\35\2\2\u0189\u0080\3\2\2\2\u018a"+
		"\u018b\t\36\2\2\u018b\u0082\3\2\2\2\u018c\u018d\t\37\2\2\u018d\u0084\3"+
		"\2\2\2\u018e\u018f\t \2\2\u018f\u0086\3\2\2\2\u0190\u0191\t!\2\2\u0191"+
		"\u0088\3\2\2\2\u0192\u0193\t\"\2\2\u0193\u008a\3\2\2\2\u0194\u0195\t#"+
		"\2\2\u0195\u008c\3\2\2\2\u0196\u0197\t$\2\2\u0197\u008e\3\2\2\2\22\2\u0106"+
		"\u010c\u0118\u011d\u0124\u012b\u012d\u0138\u0141\u0143\u014b\u014d\u0155"+
		"\u015d\u0160\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}