package antlr;// Generated from D:/Source_File/For_InteliJ/CMMGrammar_/G4\CMM_BXJ.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMM_BXJParser extends Parser {
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
	public static final int
		RULE_input = 0, RULE_stat_block = 1, RULE_stat = 2, RULE_declare_stat = 3, 
		RULE_assign_stat = 4, RULE_declare_assign_stat = 5, RULE_read_stat = 6, 
		RULE_write_stat = 7, RULE_if_stat = 8, RULE_while_stat = 9, RULE_break_stat = 10, 
		RULE_cont_stat = 11, RULE_other_stat = 12, RULE_expr = 13, RULE_array_expr = 14, 
		RULE_num_array_expr = 15, RULE_char_array_expr = 16, RULE_bool_array_expr = 17, 
		RULE_num_expr = 18, RULE_bool_expr = 19, RULE_char_expr = 20, RULE_type = 21, 
		RULE_array_id = 22, RULE_array_tail = 23, RULE_id = 24;
	public static final String[] ruleNames = {
		"input", "stat_block", "stat", "declare_stat", "assign_stat", "declare_assign_stat", 
		"read_stat", "write_stat", "if_stat", "while_stat", "break_stat", "cont_stat", 
		"other_stat", "expr", "array_expr", "num_array_expr", "char_array_expr", 
		"bool_array_expr", "num_expr", "bool_expr", "char_expr", "type", "array_id", 
		"array_tail", "id"
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

	@Override
	public String getGrammarFileName() { return "CMM_BXJ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMM_BXJParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_DOUBLE) | (1L << T_CHAR) | (1L << T_BOOL) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
				{
				{
				setState(50);
				stat();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(CMM_BXJParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(CMM_BXJParser.RIGHT_CURLY, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitStat_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitStat_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat_block);
		int _la;
		try {
			setState(65);
			switch (_input.LA(1)) {
			case LEFT_CURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(LEFT_CURLY);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_DOUBLE) | (1L << T_CHAR) | (1L << T_BOOL) | (1L << IF) | (1L << WHILE) | (1L << BREAK) | (1L << CONTINUE) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
					{
					{
					setState(57);
					stat();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(63);
				match(RIGHT_CURLY);
				}
				break;
			case T_INT:
			case T_DOUBLE:
			case T_CHAR:
			case T_BOOL:
			case IF:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case READ:
			case WRITE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatContext extends ParserRuleContext {
		public Assign_statContext assign_stat() {
			return getRuleContext(Assign_statContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CMM_BXJParser.SEMICOLON, 0); }
		public Read_statContext read_stat() {
			return getRuleContext(Read_statContext.class,0);
		}
		public Write_statContext write_stat() {
			return getRuleContext(Write_statContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public Declare_statContext declare_stat() {
			return getRuleContext(Declare_statContext.class,0);
		}
		public Declare_assign_statContext declare_assign_stat() {
			return getRuleContext(Declare_assign_statContext.class,0);
		}
		public Break_statContext break_stat() {
			return getRuleContext(Break_statContext.class,0);
		}
		public Cont_statContext cont_stat() {
			return getRuleContext(Cont_statContext.class,0);
		}
		public Other_statContext other_stat() {
			return getRuleContext(Other_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				assign_stat();
				setState(68);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				read_stat();
				setState(71);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				write_stat();
				setState(74);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				if_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				while_stat();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(78);
				declare_stat();
				setState(79);
				match(SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				declare_assign_stat();
				setState(82);
				match(SEMICOLON);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				break_stat();
				setState(85);
				match(SEMICOLON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(87);
				cont_stat();
				setState(88);
				match(SEMICOLON);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(90);
				other_stat();
				setState(91);
				match(SEMICOLON);
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

	public static class Declare_statContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<Array_idContext> array_id() {
			return getRuleContexts(Array_idContext.class);
		}
		public Array_idContext array_id(int i) {
			return getRuleContext(Array_idContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CMM_BXJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMM_BXJParser.COMMA, i);
		}
		public Declare_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterDeclare_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitDeclare_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitDeclare_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_statContext declare_stat() throws RecognitionException {
		Declare_statContext _localctx = new Declare_statContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declare_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			type();
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(96);
				id();
				}
				break;
			case 2:
				{
				setState(97);
				array_id();
				}
				break;
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(100);
				match(COMMA);
				setState(103);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(101);
					id();
					}
					break;
				case 2:
					{
					setState(102);
					array_id();
					}
					break;
				}
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Assign_statContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(CMM_BXJParser.EQUAL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_exprContext array_expr() {
			return getRuleContext(Array_exprContext.class,0);
		}
		public Assign_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterAssign_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitAssign_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitAssign_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_statContext assign_stat() throws RecognitionException {
		Assign_statContext _localctx = new Assign_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(110);
				id();
				}
				break;
			case 2:
				{
				setState(111);
				array_id();
				}
				break;
			}
			setState(114);
			match(EQUAL);
			setState(117);
			switch (_input.LA(1)) {
			case BOOL:
			case ID:
			case MINUS:
			case CHAR:
			case DOUBLE:
			case INT:
			case LEFT_PAREN:
			case LOGIC_NOT:
				{
				setState(115);
				expr();
				}
				break;
			case LEFT_CURLY:
			case QUOTE:
				{
				setState(116);
				array_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Declare_assign_statContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(CMM_BXJParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(CMM_BXJParser.EQUAL, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CMM_BXJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMM_BXJParser.COMMA, i);
		}
		public List<Array_idContext> array_id() {
			return getRuleContexts(Array_idContext.class);
		}
		public Array_idContext array_id(int i) {
			return getRuleContext(Array_idContext.class,i);
		}
		public List<Array_exprContext> array_expr() {
			return getRuleContexts(Array_exprContext.class);
		}
		public Array_exprContext array_expr(int i) {
			return getRuleContext(Array_exprContext.class,i);
		}
		public Declare_assign_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_assign_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterDeclare_assign_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitDeclare_assign_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitDeclare_assign_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_assign_statContext declare_assign_stat() throws RecognitionException {
		Declare_assign_statContext _localctx = new Declare_assign_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declare_assign_stat);
		int _la;
		try {
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				type();
				setState(120);
				id();
				setState(123);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(121);
					match(EQUAL);
					setState(122);
					expr();
					}
				}

				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(125);
					match(COMMA);
					setState(126);
					id();
					setState(129);
					_la = _input.LA(1);
					if (_la==EQUAL) {
						{
						setState(127);
						match(EQUAL);
						setState(128);
						expr();
						}
					}

					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				type();
				setState(137);
				array_id();
				setState(140);
				_la = _input.LA(1);
				if (_la==EQUAL) {
					{
					setState(138);
					match(EQUAL);
					setState(139);
					array_expr();
					}
				}

				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(142);
					match(COMMA);
					setState(143);
					array_id();
					setState(146);
					_la = _input.LA(1);
					if (_la==EQUAL) {
						{
						setState(144);
						match(EQUAL);
						setState(145);
						array_expr();
						}
					}

					}
					}
					setState(152);
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

	public static class Read_statContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CMM_BXJParser.READ, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(CMM_BXJParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(CMM_BXJParser.RIGHT_PAREN, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public Read_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterRead_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitRead_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitRead_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_statContext read_stat() throws RecognitionException {
		Read_statContext _localctx = new Read_statContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_read_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(READ);
			setState(156);
			match(LEFT_PAREN);
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(157);
				id();
				}
				break;
			case 2:
				{
				setState(158);
				array_id();
				}
				break;
			}
			setState(161);
			match(RIGHT_PAREN);
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

	public static class Write_statContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(CMM_BXJParser.WRITE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(CMM_BXJParser.LEFT_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(CMM_BXJParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CMM_BXJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMM_BXJParser.COMMA, i);
		}
		public Write_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterWrite_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitWrite_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitWrite_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_statContext write_stat() throws RecognitionException {
		Write_statContext _localctx = new Write_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_write_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(WRITE);
			setState(164);
			match(LEFT_PAREN);
			setState(165);
			expr();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(166);
				match(COMMA);
				setState(167);
				expr();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(RIGHT_PAREN);
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

	public static class If_statContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CMM_BXJParser.IF, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(CMM_BXJParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(CMM_BXJParser.LEFT_PAREN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(CMM_BXJParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(CMM_BXJParser.RIGHT_PAREN, i);
		}
		public List<Stat_blockContext> stat_block() {
			return getRuleContexts(Stat_blockContext.class);
		}
		public Stat_blockContext stat_block(int i) {
			return getRuleContext(Stat_blockContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(CMM_BXJParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(CMM_BXJParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(CMM_BXJParser.ELSE, 0); }
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitIf_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_stat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(IF);
			setState(176);
			match(LEFT_PAREN);
			setState(177);
			bool_expr(0);
			setState(178);
			match(RIGHT_PAREN);
			setState(179);
			stat_block();
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(180);
					match(ELSEIF);
					setState(181);
					match(LEFT_PAREN);
					setState(182);
					bool_expr(0);
					setState(183);
					match(RIGHT_PAREN);
					setState(184);
					stat_block();
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(191);
				match(ELSE);
				setState(192);
				stat_block();
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

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CMM_BXJParser.WHILE, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(CMM_BXJParser.LEFT_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(CMM_BXJParser.RIGHT_PAREN, 0); }
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitWhile_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(WHILE);
			setState(196);
			match(LEFT_PAREN);
			setState(197);
			expr();
			setState(198);
			match(RIGHT_PAREN);
			setState(199);
			stat_block();
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

	public static class Break_statContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(CMM_BXJParser.BREAK, 0); }
		public Break_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterBreak_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitBreak_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitBreak_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_statContext break_stat() throws RecognitionException {
		Break_statContext _localctx = new Break_statContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_break_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(BREAK);
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

	public static class Cont_statContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(CMM_BXJParser.CONTINUE, 0); }
		public Cont_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cont_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterCont_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitCont_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitCont_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cont_statContext cont_stat() throws RecognitionException {
		Cont_statContext _localctx = new Cont_statContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cont_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(CONTINUE);
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

	public static class Other_statContext extends ParserRuleContext {
		public TerminalNode PP() { return getToken(CMM_BXJParser.PP, 0); }
		public TerminalNode MM() { return getToken(CMM_BXJParser.MM, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public Other_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterOther_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitOther_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitOther_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Other_statContext other_stat() throws RecognitionException {
		Other_statContext _localctx = new Other_statContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_other_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(205);
				id();
				}
				break;
			case 2:
				{
				setState(206);
				array_id();
				}
				break;
			}
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==PP || _la==MM) ) {
			_errHandler.recoverInline(this);
			} else {
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
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Char_exprContext char_expr() {
			return getRuleContext(Char_exprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				num_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				bool_expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				char_expr();
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

	public static class Array_exprContext extends ParserRuleContext {
		public Num_array_exprContext num_array_expr() {
			return getRuleContext(Num_array_exprContext.class,0);
		}
		public Char_array_exprContext char_array_expr() {
			return getRuleContext(Char_array_exprContext.class,0);
		}
		public Bool_array_exprContext bool_array_expr() {
			return getRuleContext(Bool_array_exprContext.class,0);
		}
		public Array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterArray_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitArray_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitArray_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_exprContext array_expr() throws RecognitionException {
		Array_exprContext _localctx = new Array_exprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_array_expr);
		try {
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				num_array_expr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				char_array_expr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				bool_array_expr();
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

	public static class Num_array_exprContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(CMM_BXJParser.LEFT_CURLY, 0); }
		public TerminalNode RIGHT_CURLY() { return getToken(CMM_BXJParser.RIGHT_CURLY, 0); }
		public List<TerminalNode> INT() { return getTokens(CMM_BXJParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(CMM_BXJParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(CMM_BXJParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(CMM_BXJParser.DOUBLE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CMM_BXJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMM_BXJParser.COMMA, i);
		}
		public Num_array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_array_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterNum_array_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitNum_array_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitNum_array_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_array_exprContext num_array_expr() throws RecognitionException {
		Num_array_exprContext _localctx = new Num_array_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_num_array_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(LEFT_CURLY);
			setState(222);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE || _la==INT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(223);
				match(COMMA);
				setState(224);
				_la = _input.LA(1);
				if ( !(_la==DOUBLE || _la==INT) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				}
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			match(RIGHT_CURLY);
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

	public static class Char_array_exprContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(CMM_BXJParser.LEFT_CURLY, 0); }
		public List<TerminalNode> CHAR() { return getTokens(CMM_BXJParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(CMM_BXJParser.CHAR, i);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(CMM_BXJParser.RIGHT_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CMM_BXJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMM_BXJParser.COMMA, i);
		}
		public List<TerminalNode> QUOTE() { return getTokens(CMM_BXJParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(CMM_BXJParser.QUOTE, i);
		}
		public List<TerminalNode> ESCAPED_QUOTE() { return getTokens(CMM_BXJParser.ESCAPED_QUOTE); }
		public TerminalNode ESCAPED_QUOTE(int i) {
			return getToken(CMM_BXJParser.ESCAPED_QUOTE, i);
		}
		public List<TerminalNode> NO_ENTER() { return getTokens(CMM_BXJParser.NO_ENTER); }
		public TerminalNode NO_ENTER(int i) {
			return getToken(CMM_BXJParser.NO_ENTER, i);
		}
		public Char_array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_array_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterChar_array_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitChar_array_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitChar_array_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_array_exprContext char_array_expr() throws RecognitionException {
		Char_array_exprContext _localctx = new Char_array_exprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_char_array_expr);
		int _la;
		try {
			int _alt;
			setState(250);
			switch (_input.LA(1)) {
			case LEFT_CURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(LEFT_CURLY);
				setState(233);
				match(CHAR);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(234);
					match(COMMA);
					setState(235);
					match(CHAR);
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(RIGHT_CURLY);
				}
				break;
			case QUOTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				match(QUOTE);
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(243);
						_la = _input.LA(1);
						if ( !(_la==ESCAPED_QUOTE || _la==NO_ENTER) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						} 
					}
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				setState(249);
				match(QUOTE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Bool_array_exprContext extends ParserRuleContext {
		public TerminalNode LEFT_CURLY() { return getToken(CMM_BXJParser.LEFT_CURLY, 0); }
		public List<TerminalNode> BOOL() { return getTokens(CMM_BXJParser.BOOL); }
		public TerminalNode BOOL(int i) {
			return getToken(CMM_BXJParser.BOOL, i);
		}
		public TerminalNode RIGHT_CURLY() { return getToken(CMM_BXJParser.RIGHT_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CMM_BXJParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CMM_BXJParser.COMMA, i);
		}
		public Bool_array_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_array_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterBool_array_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitBool_array_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitBool_array_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_array_exprContext bool_array_expr() throws RecognitionException {
		Bool_array_exprContext _localctx = new Bool_array_exprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bool_array_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(LEFT_CURLY);
			setState(253);
			match(BOOL);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(254);
				match(COMMA);
				setState(255);
				match(BOOL);
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			match(RIGHT_CURLY);
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

	public static class Num_exprContext extends ParserRuleContext {
		public Num_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_expr; }
	 
		public Num_exprContext() { }
		public void copyFrom(Num_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Num_expr_opContext extends Num_exprContext {
		public Token op;
		public List<Num_exprContext> num_expr() {
			return getRuleContexts(Num_exprContext.class);
		}
		public Num_exprContext num_expr(int i) {
			return getRuleContext(Num_exprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(CMM_BXJParser.MULT, 0); }
		public TerminalNode DIVI() { return getToken(CMM_BXJParser.DIVI, 0); }
		public TerminalNode MOD() { return getToken(CMM_BXJParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(CMM_BXJParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CMM_BXJParser.MINUS, 0); }
		public TerminalNode MM() { return getToken(CMM_BXJParser.MM, 0); }
		public Num_expr_opContext(Num_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterNum_expr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitNum_expr_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitNum_expr_op(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Num_expr_parenContext extends Num_exprContext {
		public TerminalNode LEFT_PAREN() { return getToken(CMM_BXJParser.LEFT_PAREN, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(CMM_BXJParser.RIGHT_PAREN, 0); }
		public Num_expr_parenContext(Num_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterNum_expr_paren(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitNum_expr_paren(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitNum_expr_paren(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Num_expr_otherContext extends Num_exprContext {
		public TerminalNode INT() { return getToken(CMM_BXJParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CMM_BXJParser.DOUBLE, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Num_expr_otherContext(Num_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterNum_expr_other(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitNum_expr_other(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitNum_expr_other(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Num_expr_minusContext extends Num_exprContext {
		public TerminalNode MINUS() { return getToken(CMM_BXJParser.MINUS, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public Num_expr_minusContext(Num_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterNum_expr_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitNum_expr_minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitNum_expr_minus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_exprContext num_expr() throws RecognitionException {
		return num_expr(0);
	}

	private Num_exprContext num_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Num_exprContext _localctx = new Num_exprContext(_ctx, _parentState);
		Num_exprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_num_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new Num_expr_minusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(264);
				match(MINUS);
				setState(265);
				num_expr(7);
				}
				break;
			case 2:
				{
				_localctx = new Num_expr_parenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266);
				match(LEFT_PAREN);
				setState(267);
				num_expr(0);
				setState(268);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new Num_expr_otherContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270);
				match(INT);
				}
				break;
			case 4:
				{
				_localctx = new Num_expr_otherContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271);
				match(DOUBLE);
				}
				break;
			case 5:
				{
				_localctx = new Num_expr_otherContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				array_id();
				}
				break;
			case 6:
				{
				_localctx = new Num_expr_otherContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(273);
				id();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(282);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new Num_expr_opContext(new Num_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_num_expr);
						setState(276);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(277);
						((Num_expr_opContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIVI) | (1L << MOD))) != 0)) ) {
							((Num_expr_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(278);
						num_expr(7);
						}
						break;
					case 2:
						{
						_localctx = new Num_expr_opContext(new Num_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_num_expr);
						setState(279);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(280);
						((Num_expr_opContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MM))) != 0)) ) {
							((Num_expr_opContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(281);
						num_expr(6);
						}
						break;
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode LOGIC_NOT() { return getToken(CMM_BXJParser.LOGIC_NOT, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(CMM_BXJParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(CMM_BXJParser.RIGHT_PAREN, 0); }
		public List<Num_exprContext> num_expr() {
			return getRuleContexts(Num_exprContext.class);
		}
		public Num_exprContext num_expr(int i) {
			return getRuleContext(Num_exprContext.class,i);
		}
		public TerminalNode COMPARE_OP() { return getToken(CMM_BXJParser.COMPARE_OP, 0); }
		public TerminalNode BOOL() { return getToken(CMM_BXJParser.BOOL, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode BOOL_OP() { return getToken(CMM_BXJParser.BOOL_OP, 0); }
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(288);
				match(LOGIC_NOT);
				setState(289);
				bool_expr(6);
				}
				break;
			case 2:
				{
				setState(290);
				match(LEFT_PAREN);
				setState(291);
				bool_expr(0);
				setState(292);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				setState(294);
				num_expr(0);
				setState(295);
				match(COMPARE_OP);
				setState(296);
				num_expr(0);
				}
				break;
			case 4:
				{
				setState(298);
				match(BOOL);
				}
				break;
			case 5:
				{
				setState(299);
				array_id();
				}
				break;
			case 6:
				{
				setState(300);
				id();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(303);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(304);
					match(BOOL_OP);
					setState(305);
					bool_expr(6);
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Char_exprContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(CMM_BXJParser.CHAR, 0); }
		public Array_idContext array_id() {
			return getRuleContext(Array_idContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Char_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterChar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitChar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitChar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_exprContext char_expr() throws RecognitionException {
		Char_exprContext _localctx = new Char_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_char_expr);
		try {
			setState(314);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(CHAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				array_id();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				id();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode T_INT() { return getToken(CMM_BXJParser.T_INT, 0); }
		public TerminalNode T_DOUBLE() { return getToken(CMM_BXJParser.T_DOUBLE, 0); }
		public TerminalNode T_CHAR() { return getToken(CMM_BXJParser.T_CHAR, 0); }
		public TerminalNode T_BOOL() { return getToken(CMM_BXJParser.T_BOOL, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_DOUBLE) | (1L << T_CHAR) | (1L << T_BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Array_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMM_BXJParser.ID, 0); }
		public Array_tailContext array_tail() {
			return getRuleContext(Array_tailContext.class,0);
		}
		public Array_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterArray_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitArray_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitArray_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_idContext array_id() throws RecognitionException {
		Array_idContext _localctx = new Array_idContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_array_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(ID);
			setState(319);
			array_tail();
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

	public static class Array_tailContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(CMM_BXJParser.LEFT_BRACKET, 0); }
		public Num_exprContext num_expr() {
			return getRuleContext(Num_exprContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(CMM_BXJParser.RIGHT_BRACKET, 0); }
		public Array_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterArray_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitArray_tail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitArray_tail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_tailContext array_tail() throws RecognitionException {
		Array_tailContext _localctx = new Array_tailContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_array_tail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(LEFT_BRACKET);
			setState(322);
			num_expr(0);
			setState(323);
			match(RIGHT_BRACKET);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMM_BXJParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CMM_BXJListener ) ((CMM_BXJListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMM_BXJVisitor ) return ((CMM_BXJVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return num_expr_sempred((Num_exprContext)_localctx, predIndex);
		case 19:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean num_expr_sempred(Num_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3,\u014a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\7\3=\n\3\f\3\16\3@\13"+
		"\3\3\3\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3"+
		"\5\3\5\5\5e\n\5\3\5\3\5\3\5\5\5j\n\5\7\5l\n\5\f\5\16\5o\13\5\3\6\3\6\5"+
		"\6s\n\6\3\6\3\6\3\6\5\6x\n\6\3\7\3\7\3\7\3\7\5\7~\n\7\3\7\3\7\3\7\3\7"+
		"\5\7\u0084\n\7\7\7\u0086\n\7\f\7\16\7\u0089\13\7\3\7\3\7\3\7\3\7\5\7\u008f"+
		"\n\7\3\7\3\7\3\7\3\7\5\7\u0095\n\7\7\7\u0097\n\7\f\7\16\7\u009a\13\7\5"+
		"\7\u009c\n\7\3\b\3\b\3\b\3\b\5\b\u00a2\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u00ab\n\t\f\t\16\t\u00ae\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u00bd\n\n\f\n\16\n\u00c0\13\n\3\n\3\n\5\n\u00c4\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u00d2"+
		"\n\16\3\16\3\16\3\17\3\17\3\17\5\17\u00d9\n\17\3\20\3\20\3\20\5\20\u00de"+
		"\n\20\3\21\3\21\3\21\3\21\7\21\u00e4\n\21\f\21\16\21\u00e7\13\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\7\22\u00ef\n\22\f\22\16\22\u00f2\13\22\3\22"+
		"\3\22\3\22\7\22\u00f7\n\22\f\22\16\22\u00fa\13\22\3\22\5\22\u00fd\n\22"+
		"\3\23\3\23\3\23\3\23\7\23\u0103\n\23\f\23\16\23\u0106\13\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0115\n\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u011d\n\24\f\24\16\24\u0120\13\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0130\n\25\3\25\3\25\3\25\7\25\u0135\n\25\f\25\16\25\u0138\13\25"+
		"\3\26\3\26\3\26\5\26\u013d\n\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\u00f8\4&(\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\2\b\3\2%&\3\2\31\32\4\2((,,\3\2\21\23\4\2\24\25&&\3"+
		"\2\3\6\u0165\2\67\3\2\2\2\4C\3\2\2\2\6_\3\2\2\2\ba\3\2\2\2\nr\3\2\2\2"+
		"\f\u009b\3\2\2\2\16\u009d\3\2\2\2\20\u00a5\3\2\2\2\22\u00b1\3\2\2\2\24"+
		"\u00c5\3\2\2\2\26\u00cb\3\2\2\2\30\u00cd\3\2\2\2\32\u00d1\3\2\2\2\34\u00d8"+
		"\3\2\2\2\36\u00dd\3\2\2\2 \u00df\3\2\2\2\"\u00fc\3\2\2\2$\u00fe\3\2\2"+
		"\2&\u0114\3\2\2\2(\u012f\3\2\2\2*\u013c\3\2\2\2,\u013e\3\2\2\2.\u0140"+
		"\3\2\2\2\60\u0143\3\2\2\2\62\u0147\3\2\2\2\64\66\5\6\4\2\65\64\3\2\2\2"+
		"\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3\3\2\2\29\67\3\2\2\2:>\7\33\2"+
		"\2;=\5\6\4\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2"+
		"\2AD\7\34\2\2BD\5\6\4\2C:\3\2\2\2CB\3\2\2\2D\5\3\2\2\2EF\5\n\6\2FG\7$"+
		"\2\2G`\3\2\2\2HI\5\16\b\2IJ\7$\2\2J`\3\2\2\2KL\5\20\t\2LM\7$\2\2M`\3\2"+
		"\2\2N`\5\22\n\2O`\5\24\13\2PQ\5\b\5\2QR\7$\2\2R`\3\2\2\2ST\5\f\7\2TU\7"+
		"$\2\2U`\3\2\2\2VW\5\26\f\2WX\7$\2\2X`\3\2\2\2YZ\5\30\r\2Z[\7$\2\2[`\3"+
		"\2\2\2\\]\5\32\16\2]^\7$\2\2^`\3\2\2\2_E\3\2\2\2_H\3\2\2\2_K\3\2\2\2_"+
		"N\3\2\2\2_O\3\2\2\2_P\3\2\2\2_S\3\2\2\2_V\3\2\2\2_Y\3\2\2\2_\\\3\2\2\2"+
		"`\7\3\2\2\2ad\5,\27\2be\5\62\32\2ce\5.\30\2db\3\2\2\2dc\3\2\2\2em\3\2"+
		"\2\2fi\7#\2\2gj\5\62\32\2hj\5.\30\2ig\3\2\2\2ih\3\2\2\2jl\3\2\2\2kf\3"+
		"\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\t\3\2\2\2om\3\2\2\2ps\5\62\32\2"+
		"qs\5.\30\2rp\3\2\2\2rq\3\2\2\2st\3\2\2\2tw\7!\2\2ux\5\34\17\2vx\5\36\20"+
		"\2wu\3\2\2\2wv\3\2\2\2x\13\3\2\2\2yz\5,\27\2z}\5\62\32\2{|\7!\2\2|~\5"+
		"\34\17\2}{\3\2\2\2}~\3\2\2\2~\u0087\3\2\2\2\177\u0080\7#\2\2\u0080\u0083"+
		"\5\62\32\2\u0081\u0082\7!\2\2\u0082\u0084\5\34\17\2\u0083\u0081\3\2\2"+
		"\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\177\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u009c\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\5,\27\2\u008b\u008e\5.\30\2\u008c\u008d\7!"+
		"\2\2\u008d\u008f\5\36\20\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0098\3\2\2\2\u0090\u0091\7#\2\2\u0091\u0094\5.\30\2\u0092\u0093\7!\2"+
		"\2\u0093\u0095\5\36\20\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0090\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009b"+
		"y\3\2\2\2\u009b\u008a\3\2\2\2\u009c\r\3\2\2\2\u009d\u009e\7\r\2\2\u009e"+
		"\u00a1\7\35\2\2\u009f\u00a2\5\62\32\2\u00a0\u00a2\5.\30\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\36\2\2"+
		"\u00a4\17\3\2\2\2\u00a5\u00a6\7\16\2\2\u00a6\u00a7\7\35\2\2\u00a7\u00ac"+
		"\5\34\17\2\u00a8\u00a9\7#\2\2\u00a9\u00ab\5\34\17\2\u00aa\u00a8\3\2\2"+
		"\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af"+
		"\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\36\2\2\u00b0\21\3\2\2\2\u00b1"+
		"\u00b2\7\7\2\2\u00b2\u00b3\7\35\2\2\u00b3\u00b4\5(\25\2\u00b4\u00b5\7"+
		"\36\2\2\u00b5\u00be\5\4\3\2\u00b6\u00b7\7\t\2\2\u00b7\u00b8\7\35\2\2\u00b8"+
		"\u00b9\5(\25\2\u00b9\u00ba\7\36\2\2\u00ba\u00bb\5\4\3\2\u00bb\u00bd\3"+
		"\2\2\2\u00bc\u00b6\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c3\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\b"+
		"\2\2\u00c2\u00c4\5\4\3\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\23\3\2\2\2\u00c5\u00c6\7\n\2\2\u00c6\u00c7\7\35\2\2\u00c7\u00c8\5\34"+
		"\17\2\u00c8\u00c9\7\36\2\2\u00c9\u00ca\5\4\3\2\u00ca\25\3\2\2\2\u00cb"+
		"\u00cc\7\13\2\2\u00cc\27\3\2\2\2\u00cd\u00ce\7\f\2\2\u00ce\31\3\2\2\2"+
		"\u00cf\u00d2\5\62\32\2\u00d0\u00d2\5.\30\2\u00d1\u00cf\3\2\2\2\u00d1\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\t\2\2\2\u00d4\33\3\2\2\2\u00d5"+
		"\u00d9\5&\24\2\u00d6\u00d9\5(\25\2\u00d7\u00d9\5*\26\2\u00d8\u00d5\3\2"+
		"\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\35\3\2\2\2\u00da\u00de"+
		"\5 \21\2\u00db\u00de\5\"\22\2\u00dc\u00de\5$\23\2\u00dd\u00da\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\37\3\2\2\2\u00df\u00e0"+
		"\7\33\2\2\u00e0\u00e5\t\3\2\2\u00e1\u00e2\7#\2\2\u00e2\u00e4\t\3\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7\34\2\2\u00e9"+
		"!\3\2\2\2\u00ea\u00eb\7\33\2\2\u00eb\u00f0\7\30\2\2\u00ec\u00ed\7#\2\2"+
		"\u00ed\u00ef\7\30\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00fd\7\34\2\2\u00f4\u00f8\7\'\2\2\u00f5\u00f7\t\4\2\2\u00f6\u00f5\3"+
		"\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\7\'\2\2\u00fc\u00ea\3\2"+
		"\2\2\u00fc\u00f4\3\2\2\2\u00fd#\3\2\2\2\u00fe\u00ff\7\33\2\2\u00ff\u0104"+
		"\7\17\2\2\u0100\u0101\7#\2\2\u0101\u0103\7\17\2\2\u0102\u0100\3\2\2\2"+
		"\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0108\7\34\2\2\u0108%\3\2\2\2\u0109"+
		"\u010a\b\24\1\2\u010a\u010b\7\25\2\2\u010b\u0115\5&\24\t\u010c\u010d\7"+
		"\35\2\2\u010d\u010e\5&\24\2\u010e\u010f\7\36\2\2\u010f\u0115\3\2\2\2\u0110"+
		"\u0115\7\32\2\2\u0111\u0115\7\31\2\2\u0112\u0115\5.\30\2\u0113\u0115\5"+
		"\62\32\2\u0114\u0109\3\2\2\2\u0114\u010c\3\2\2\2\u0114\u0110\3\2\2\2\u0114"+
		"\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u011e\3\2"+
		"\2\2\u0116\u0117\f\b\2\2\u0117\u0118\t\5\2\2\u0118\u011d\5&\24\t\u0119"+
		"\u011a\f\7\2\2\u011a\u011b\t\6\2\2\u011b\u011d\5&\24\b\u011c\u0116\3\2"+
		"\2\2\u011c\u0119\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\'\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\b\25\1"+
		"\2\u0122\u0123\7\"\2\2\u0123\u0130\5(\25\b\u0124\u0125\7\35\2\2\u0125"+
		"\u0126\5(\25\2\u0126\u0127\7\36\2\2\u0127\u0130\3\2\2\2\u0128\u0129\5"+
		"&\24\2\u0129\u012a\7\26\2\2\u012a\u012b\5&\24\2\u012b\u0130\3\2\2\2\u012c"+
		"\u0130\7\17\2\2\u012d\u0130\5.\30\2\u012e\u0130\5\62\32\2\u012f\u0121"+
		"\3\2\2\2\u012f\u0124\3\2\2\2\u012f\u0128\3\2\2\2\u012f\u012c\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0136\3\2\2\2\u0131\u0132\f\7"+
		"\2\2\u0132\u0133\7\27\2\2\u0133\u0135\5(\25\b\u0134\u0131\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137)\3\2\2\2"+
		"\u0138\u0136\3\2\2\2\u0139\u013d\7\30\2\2\u013a\u013d\5.\30\2\u013b\u013d"+
		"\5\62\32\2\u013c\u0139\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2"+
		"\u013d+\3\2\2\2\u013e\u013f\t\7\2\2\u013f-\3\2\2\2\u0140\u0141\7\20\2"+
		"\2\u0141\u0142\5\60\31\2\u0142/\3\2\2\2\u0143\u0144\7\37\2\2\u0144\u0145"+
		"\5&\24\2\u0145\u0146\7 \2\2\u0146\61\3\2\2\2\u0147\u0148\7\20\2\2\u0148"+
		"\63\3\2\2\2$\67>C_dimrw}\u0083\u0087\u008e\u0094\u0098\u009b\u00a1\u00ac"+
		"\u00be\u00c3\u00d1\u00d8\u00dd\u00e5\u00f0\u00f8\u00fc\u0104\u0114\u011c"+
		"\u011e\u012f\u0136\u013c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}