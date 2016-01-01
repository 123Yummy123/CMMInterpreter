package antlr;// Generated from D:/Source_File/For_InteliJ/CMMGrammar_/G4\CMM_BXJ.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMM_BXJLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_INT=1, T_DOUBLE=2, T_CHAR=3, T_BOOL=4, IF=5, ELSE=6, ELSEIF=7, WHILE=8, 
		BREAK=9, CONTINUE=10, READ=11, WRITE=12, BOOL=13, ID=14, MULT=15, DIVI=16, 
		MOD=17, PLUS=18, MINUS=19, COMPARE_OP=20, BOOL_OP=21, CHAR=22, DOUBLE=23, 
		INT=24, LEFT_CURLY=25, RIGHT_CURLY=26, LEFT_PAREN=27, RIGHT_PAREN=28, 
		LEFT_BRACKET=29, RIGHT_BRACKET=30, EQUAL=31, LOGIC_NOT=32, COMMA=33, SEMICOLON=34, 
		PP=35, MM=36, QUOTE=37, ESCAPED_QUOTE=38, MULTI_COMMENT=39, SINGL_COMMENT=40, 
		WS=41, NO_ENTER=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T_INT", "T_DOUBLE", "T_CHAR", "T_BOOL", "IF", "ELSE", "ELSEIF", "WHILE", 
		"BREAK", "CONTINUE", "READ", "WRITE", "BOOL", "ID", "MULT", "DIVI", "MOD", 
		"PLUS", "MINUS", "COMPARE_OP", "BOOL_OP", "CHAR", "DOUBLE", "INT", "LEFT_CURLY", 
		"RIGHT_CURLY", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"EQUAL", "LOGIC_NOT", "COMMA", "SEMICOLON", "PP", "MM", "QUOTE", "ESCAPED_QUOTE", 
		"LETTER", "DECIMAL", "HEXADECIMAL", "MULTI_COMMENT", "SINGL_COMMENT", 
		"WS", "NO_ENTER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'double'", "'char'", "'bool'", "'if'", "'else'", null, 
		"'while'", "'break'", "'continue'", "'read'", "'write'", null, null, "'*'", 
		"'/'", "'%'", "'+'", "'-'", null, null, null, null, null, "'{'", "'}'", 
		"'('", "')'", "'['", "']'", "'='", "'!'", "','", "';'", "'++'", "'--'", 
		"'\"'", "'\\\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "T_INT", "T_DOUBLE", "T_CHAR", "T_BOOL", "IF", "ELSE", "ELSEIF", 
		"WHILE", "BREAK", "CONTINUE", "READ", "WRITE", "BOOL", "ID", "MULT", "DIVI", 
		"MOD", "PLUS", "MINUS", "COMPARE_OP", "BOOL_OP", "CHAR", "DOUBLE", "INT", 
		"LEFT_CURLY", "RIGHT_CURLY", "LEFT_PAREN", "RIGHT_PAREN", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "EQUAL", "LOGIC_NOT", "COMMA", "SEMICOLON", "PP", "MM", 
		"QUOTE", "ESCAPED_QUOTE", "MULTI_COMMENT", "SINGL_COMMENT", "WS", "NO_ENTER"
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


	public CMM_BXJLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CMM_BXJ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2,\u014f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a7\n\16\3\17\3"+
		"\17\3\17\7\17\u00ac\n\17\f\17\16\17\u00af\13\17\3\17\3\17\3\17\3\17\7"+
		"\17\u00b5\n\17\f\17\16\17\u00b8\13\17\3\17\3\17\5\17\u00bc\n\17\5\17\u00be"+
		"\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d3\n\25\3\26\3\26\3\26\3\26\5\26"+
		"\u00d9\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u00e2\n\30\f\30\16"+
		"\30\u00e5\13\30\3\31\3\31\5\31\u00e9\n\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3"+
		"%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\7)\u010f\n)\f)\16)\u0112\13)\5)"+
		"\u0114\n)\3*\3*\3*\3*\6*\u011a\n*\r*\16*\u011b\3*\3*\3*\3*\6*\u0122\n"+
		"*\r*\16*\u0123\5*\u0126\n*\3+\3+\3+\3+\7+\u012c\n+\f+\16+\u012f\13+\3"+
		"+\3+\3+\3+\3+\3,\3,\3,\3,\7,\u013a\n,\f,\16,\u013d\13,\3,\5,\u0140\n,"+
		"\3,\5,\u0143\n,\3,\3,\3-\6-\u0148\n-\r-\16-\u0149\3-\3-\3.\3.\3\u012d"+
		"\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O\2Q\2S\2U)W*Y+[,\3\2\f\3\2\62;\4\2>>@@\4\2\f"+
		"\f\17\17\4\2C\\c|\3\2\63;\4\2\62;ch\4\2\62;CH\3\2\17\17\3\3\f\f\5\2\13"+
		"\f\17\17\"\"\u0163\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5a\3\2\2\2\7h\3\2\2\2\tm\3\2\2\2"+
		"\13r\3\2\2\2\ru\3\2\2\2\17z\3\2\2\2\21}\3\2\2\2\23\u0083\3\2\2\2\25\u0089"+
		"\3\2\2\2\27\u0092\3\2\2\2\31\u0097\3\2\2\2\33\u00a6\3\2\2\2\35\u00bd\3"+
		"\2\2\2\37\u00bf\3\2\2\2!\u00c1\3\2\2\2#\u00c3\3\2\2\2%\u00c5\3\2\2\2\'"+
		"\u00c7\3\2\2\2)\u00d2\3\2\2\2+\u00d8\3\2\2\2-\u00da\3\2\2\2/\u00de\3\2"+
		"\2\2\61\u00e8\3\2\2\2\63\u00ea\3\2\2\2\65\u00ec\3\2\2\2\67\u00ee\3\2\2"+
		"\29\u00f0\3\2\2\2;\u00f2\3\2\2\2=\u00f4\3\2\2\2?\u00f6\3\2\2\2A\u00f8"+
		"\3\2\2\2C\u00fa\3\2\2\2E\u00fc\3\2\2\2G\u00fe\3\2\2\2I\u0101\3\2\2\2K"+
		"\u0104\3\2\2\2M\u0106\3\2\2\2O\u0109\3\2\2\2Q\u0113\3\2\2\2S\u0125\3\2"+
		"\2\2U\u0127\3\2\2\2W\u0135\3\2\2\2Y\u0147\3\2\2\2[\u014d\3\2\2\2]^\7k"+
		"\2\2^_\7p\2\2_`\7v\2\2`\4\3\2\2\2ab\7f\2\2bc\7q\2\2cd\7w\2\2de\7d\2\2"+
		"ef\7n\2\2fg\7g\2\2g\6\3\2\2\2hi\7e\2\2ij\7j\2\2jk\7c\2\2kl\7t\2\2l\b\3"+
		"\2\2\2mn\7d\2\2no\7q\2\2op\7q\2\2pq\7n\2\2q\n\3\2\2\2rs\7k\2\2st\7h\2"+
		"\2t\f\3\2\2\2uv\7g\2\2vw\7n\2\2wx\7u\2\2xy\7g\2\2y\16\3\2\2\2z{\5\r\7"+
		"\2{|\5\13\6\2|\20\3\2\2\2}~\7y\2\2~\177\7j\2\2\177\u0080\7k\2\2\u0080"+
		"\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082\22\3\2\2\2\u0083\u0084\7d\2\2\u0084"+
		"\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087\7c\2\2\u0087\u0088\7m\2\2"+
		"\u0088\24\3\2\2\2\u0089\u008a\7e\2\2\u008a\u008b\7q\2\2\u008b\u008c\7"+
		"p\2\2\u008c\u008d\7v\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090"+
		"\7w\2\2\u0090\u0091\7g\2\2\u0091\26\3\2\2\2\u0092\u0093\7t\2\2\u0093\u0094"+
		"\7g\2\2\u0094\u0095\7c\2\2\u0095\u0096\7f\2\2\u0096\30\3\2\2\2\u0097\u0098"+
		"\7y\2\2\u0098\u0099\7t\2\2\u0099\u009a\7k\2\2\u009a\u009b\7v\2\2\u009b"+
		"\u009c\7g\2\2\u009c\32\3\2\2\2\u009d\u009e\7v\2\2\u009e\u009f\7t\2\2\u009f"+
		"\u00a0\7w\2\2\u00a0\u00a7\7g\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7c\2\2"+
		"\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a7\7g\2\2\u00a6\u009d"+
		"\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a7\34\3\2\2\2\u00a8\u00ad\5O(\2\u00a9"+
		"\u00ac\5O(\2\u00aa\u00ac\t\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2"+
		"\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00be"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b6\5O(\2\u00b1\u00b5\7a\2\2\u00b2"+
		"\u00b5\5O(\2\u00b3\u00b5\t\2\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2"+
		"\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\5O(\2\u00ba"+
		"\u00bc\t\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00a8\3\2\2\2\u00bd\u00b0\3\2\2\2\u00be\36\3\2\2\2\u00bf\u00c0"+
		"\7,\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2\"\3\2\2\2\u00c3\u00c4"+
		"\7\'\2\2\u00c4$\3\2\2\2\u00c5\u00c6\7-\2\2\u00c6&\3\2\2\2\u00c7\u00c8"+
		"\7/\2\2\u00c8(\3\2\2\2\u00c9\u00d3\t\3\2\2\u00ca\u00cb\7>\2\2\u00cb\u00d3"+
		"\7?\2\2\u00cc\u00cd\7@\2\2\u00cd\u00d3\7?\2\2\u00ce\u00cf\7#\2\2\u00cf"+
		"\u00d3\7?\2\2\u00d0\u00d1\7?\2\2\u00d1\u00d3\7?\2\2\u00d2\u00c9\3\2\2"+
		"\2\u00d2\u00ca\3\2\2\2\u00d2\u00cc\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d3*\3\2\2\2\u00d4\u00d5\7(\2\2\u00d5\u00d9\7(\2\2\u00d6\u00d7"+
		"\7~\2\2\u00d7\u00d9\7~\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9"+
		",\3\2\2\2\u00da\u00db\7)\2\2\u00db\u00dc\n\4\2\2\u00dc\u00dd\7)\2\2\u00dd"+
		".\3\2\2\2\u00de\u00df\5Q)\2\u00df\u00e3\7\60\2\2\u00e0\u00e2\t\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\60\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\5Q)\2\u00e7\u00e9"+
		"\5S*\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9\62\3\2\2\2\u00ea"+
		"\u00eb\7}\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7\177\2\2\u00ed\66\3\2\2\2"+
		"\u00ee\u00ef\7*\2\2\u00ef8\3\2\2\2\u00f0\u00f1\7+\2\2\u00f1:\3\2\2\2\u00f2"+
		"\u00f3\7]\2\2\u00f3<\3\2\2\2\u00f4\u00f5\7_\2\2\u00f5>\3\2\2\2\u00f6\u00f7"+
		"\7?\2\2\u00f7@\3\2\2\2\u00f8\u00f9\7#\2\2\u00f9B\3\2\2\2\u00fa\u00fb\7"+
		".\2\2\u00fbD\3\2\2\2\u00fc\u00fd\7=\2\2\u00fdF\3\2\2\2\u00fe\u00ff\7-"+
		"\2\2\u00ff\u0100\7-\2\2\u0100H\3\2\2\2\u0101\u0102\7/\2\2\u0102\u0103"+
		"\7/\2\2\u0103J\3\2\2\2\u0104\u0105\7$\2\2\u0105L\3\2\2\2\u0106\u0107\7"+
		"^\2\2\u0107\u0108\7$\2\2\u0108N\3\2\2\2\u0109\u010a\t\5\2\2\u010aP\3\2"+
		"\2\2\u010b\u0114\7\62\2\2\u010c\u0110\t\6\2\2\u010d\u010f\t\2\2\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u010b\3\2\2\2\u0113"+
		"\u010c\3\2\2\2\u0114R\3\2\2\2\u0115\u0116\7\62\2\2\u0116\u0117\7z\2\2"+
		"\u0117\u0119\3\2\2\2\u0118\u011a\t\7\2\2\u0119\u0118\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0126\3\2\2\2\u011d"+
		"\u011e\7\62\2\2\u011e\u011f\7Z\2\2\u011f\u0121\3\2\2\2\u0120\u0122\t\b"+
		"\2\2\u0121\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0115\3\2\2\2\u0125\u011d\3\2"+
		"\2\2\u0126T\3\2\2\2\u0127\u0128\7\61\2\2\u0128\u0129\7,\2\2\u0129\u012d"+
		"\3\2\2\2\u012a\u012c\13\2\2\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\3\2\2\2\u012f\u012d"+
		"\3\2\2\2\u0130\u0131\7,\2\2\u0131\u0132\7\61\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\b+\2\2\u0134V\3\2\2\2\u0135\u0136\7\61\2\2\u0136\u0137\7\61\2\2"+
		"\u0137\u013b\3\2\2\2\u0138\u013a\n\4\2\2\u0139\u0138\3\2\2\2\u013a\u013d"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u0140\t\t\2\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0142\3\2\2\2\u0141\u0143\t\n\2\2\u0142\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\b,\2\2\u0145X\3\2\2\2\u0146\u0148\t\13\2\2"+
		"\u0147\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b-\2\2\u014cZ\3\2\2\2\u014d\u014e"+
		"\n\4\2\2\u014e\\\3\2\2\2\32\2\u00a6\u00ab\u00ad\u00b4\u00b6\u00bb\u00bd"+
		"\u00d2\u00d8\u00e3\u00e8\u0110\u0113\u0119\u011b\u0121\u0123\u0125\u012d"+
		"\u013b\u013f\u0142\u0149\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}