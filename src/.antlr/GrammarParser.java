// Generated from e:/Projects/Compiladores/Cmaizomenos/src/Grammar.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, PalavraChave=5, Tipo=6, OpArit=7, Atribuicao=8, 
		OpRel=9, AbreChave=10, FechaChave=11, AbrePar=12, FechaPar=13, AbreComentario=14, 
		FechaComentario=15, OpBoolE=16, OpBoolOu=17, WS=18, Var=19, NInt=20, NReal=21, 
		LString=22, ErrorChar=23, LAMBDA=24;
	public static final int
		RULE_comando = 0, RULE_expressao = 1, RULE_declaracaoVar = 2, RULE_condicional = 3, 
		RULE_condicionalSinaum = 4, RULE_repeticao = 5, RULE_expressaoLogica = 6, 
		RULE_expressaoLogicaString = 7, RULE_expressaoLogicaInt = 8, RULE_expressaoLogicaReal = 9, 
		RULE_atribuicao = 10, RULE_atribuicaoString = 11, RULE_atribuicaoInt = 12, 
		RULE_atribuicaoReal = 13, RULE_expressaoAritInt = 14, RULE_expressaoAritReal = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"comando", "expressao", "declaracaoVar", "condicional", "condicionalSinaum", 
			"repeticao", "expressaoLogica", "expressaoLogicaString", "expressaoLogicaInt", 
			"expressaoLogicaReal", "atribuicao", "atribuicaoString", "atribuicaoInt", 
			"atribuicaoReal", "expressaoAritInt", "expressaoAritReal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'de'", "'queijo'", "'uai'", null, null, null, "'='", null, 
			"'{'", "'}'", "'('", "')'", "'/*'", "'*/'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "PalavraChave", "Tipo", "OpArit", "Atribuicao", 
			"OpRel", "AbreChave", "FechaChave", "AbrePar", "FechaPar", "AbreComentario", 
			"FechaComentario", "OpBoolE", "OpBoolOu", "WS", "Var", "NInt", "NReal", 
			"LString", "ErrorChar", "LAMBDA"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comando);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				expressao();
				setState(33);
				comando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public DeclaracaoVarContext declaracaoVar() {
			return getRuleContext(DeclaracaoVarContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expressao);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tipo:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				declaracaoVar();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				condicional();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				repeticao();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				atribuicao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVarContext extends ParserRuleContext {
		public TerminalNode Tipo() { return getToken(GrammarParser.Tipo, 0); }
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public DeclaracaoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVar; }
	}

	public final DeclaracaoVarContext declaracaoVar() throws RecognitionException {
		DeclaracaoVarContext _localctx = new DeclaracaoVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(Tipo);
			setState(45);
			match(Var);
			setState(46);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode AbrePar() { return getToken(GrammarParser.AbrePar, 0); }
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(GrammarParser.FechaPar, 0); }
		public TerminalNode AbreChave() { return getToken(GrammarParser.AbreChave, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FechaChave() { return getToken(GrammarParser.FechaChave, 0); }
		public CondicionalSinaumContext condicionalSinaum() {
			return getRuleContext(CondicionalSinaumContext.class,0);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
			setState(49);
			match(AbrePar);
			setState(50);
			expressaoLogica();
			setState(51);
			match(FechaPar);
			setState(52);
			match(AbreChave);
			setState(53);
			expressao();
			setState(54);
			match(FechaChave);
			setState(55);
			condicionalSinaum();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalSinaumContext extends ParserRuleContext {
		public TerminalNode AbreChave() { return getToken(GrammarParser.AbreChave, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FechaChave() { return getToken(GrammarParser.FechaChave, 0); }
		public TerminalNode LAMBDA() { return getToken(GrammarParser.LAMBDA, 0); }
		public CondicionalSinaumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionalSinaum; }
	}

	public final CondicionalSinaumContext condicionalSinaum() throws RecognitionException {
		CondicionalSinaumContext _localctx = new CondicionalSinaumContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicionalSinaum);
		try {
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(T__2);
				setState(58);
				match(AbreChave);
				setState(59);
				expressao();
				setState(60);
				match(FechaChave);
				}
				break;
			case LAMBDA:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(LAMBDA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode AbrePar() { return getToken(GrammarParser.AbrePar, 0); }
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(GrammarParser.FechaPar, 0); }
		public TerminalNode AbreChave() { return getToken(GrammarParser.AbreChave, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FechaChave() { return getToken(GrammarParser.FechaChave, 0); }
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__3);
			setState(66);
			match(AbrePar);
			setState(67);
			expressaoLogica();
			setState(68);
			match(FechaPar);
			setState(69);
			match(AbreChave);
			setState(70);
			expressao();
			setState(71);
			match(FechaChave);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoLogicaContext extends ParserRuleContext {
		public List<TerminalNode> Var() { return getTokens(GrammarParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(GrammarParser.Var, i);
		}
		public TerminalNode OpRel() { return getToken(GrammarParser.OpRel, 0); }
		public ExpressaoLogicaStringContext expressaoLogicaString() {
			return getRuleContext(ExpressaoLogicaStringContext.class,0);
		}
		public ExpressaoLogicaIntContext expressaoLogicaInt() {
			return getRuleContext(ExpressaoLogicaIntContext.class,0);
		}
		public ExpressaoLogicaRealContext expressaoLogicaReal() {
			return getRuleContext(ExpressaoLogicaRealContext.class,0);
		}
		public ExpressaoLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogica; }
	}

	public final ExpressaoLogicaContext expressaoLogica() throws RecognitionException {
		ExpressaoLogicaContext _localctx = new ExpressaoLogicaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressaoLogica);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(Var);
				setState(74);
				match(OpRel);
				setState(75);
				match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				expressaoLogicaString();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				expressaoLogicaInt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				expressaoLogicaReal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoLogicaStringContext extends ParserRuleContext {
		public List<TerminalNode> Var() { return getTokens(GrammarParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(GrammarParser.Var, i);
		}
		public TerminalNode OpRel() { return getToken(GrammarParser.OpRel, 0); }
		public List<TerminalNode> LString() { return getTokens(GrammarParser.LString); }
		public TerminalNode LString(int i) {
			return getToken(GrammarParser.LString, i);
		}
		public ExpressaoLogicaStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogicaString; }
	}

	public final ExpressaoLogicaStringContext expressaoLogicaString() throws RecognitionException {
		ExpressaoLogicaStringContext _localctx = new ExpressaoLogicaStringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressaoLogicaString);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(Var);
				setState(82);
				match(OpRel);
				setState(83);
				match(LString);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(LString);
				setState(85);
				match(OpRel);
				setState(86);
				match(Var);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(Var);
				setState(88);
				match(OpRel);
				setState(89);
				match(Var);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(LString);
				setState(91);
				match(OpRel);
				setState(92);
				match(LString);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoLogicaIntContext extends ParserRuleContext {
		public List<TerminalNode> Var() { return getTokens(GrammarParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(GrammarParser.Var, i);
		}
		public TerminalNode OpRel() { return getToken(GrammarParser.OpRel, 0); }
		public List<TerminalNode> NInt() { return getTokens(GrammarParser.NInt); }
		public TerminalNode NInt(int i) {
			return getToken(GrammarParser.NInt, i);
		}
		public ExpressaoLogicaIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogicaInt; }
	}

	public final ExpressaoLogicaIntContext expressaoLogicaInt() throws RecognitionException {
		ExpressaoLogicaIntContext _localctx = new ExpressaoLogicaIntContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressaoLogicaInt);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(Var);
				setState(96);
				match(OpRel);
				setState(97);
				match(NInt);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(NInt);
				setState(99);
				match(OpRel);
				setState(100);
				match(Var);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(Var);
				setState(102);
				match(OpRel);
				setState(103);
				match(Var);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(NInt);
				setState(105);
				match(OpRel);
				setState(106);
				match(NInt);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoLogicaRealContext extends ParserRuleContext {
		public List<TerminalNode> Var() { return getTokens(GrammarParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(GrammarParser.Var, i);
		}
		public TerminalNode OpRel() { return getToken(GrammarParser.OpRel, 0); }
		public List<TerminalNode> NReal() { return getTokens(GrammarParser.NReal); }
		public TerminalNode NReal(int i) {
			return getToken(GrammarParser.NReal, i);
		}
		public ExpressaoLogicaRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogicaReal; }
	}

	public final ExpressaoLogicaRealContext expressaoLogicaReal() throws RecognitionException {
		ExpressaoLogicaRealContext _localctx = new ExpressaoLogicaRealContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expressaoLogicaReal);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(Var);
				setState(110);
				match(OpRel);
				setState(111);
				match(NReal);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(NReal);
				setState(113);
				match(OpRel);
				setState(114);
				match(Var);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(Var);
				setState(116);
				match(OpRel);
				setState(117);
				match(Var);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(NReal);
				setState(119);
				match(OpRel);
				setState(120);
				match(NReal);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public AtribuicaoStringContext atribuicaoString() {
			return getRuleContext(AtribuicaoStringContext.class,0);
		}
		public AtribuicaoIntContext atribuicaoInt() {
			return getRuleContext(AtribuicaoIntContext.class,0);
		}
		public AtribuicaoRealContext atribuicaoReal() {
			return getRuleContext(AtribuicaoRealContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicao);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				atribuicaoString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				atribuicaoInt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				atribuicaoReal();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoStringContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public TerminalNode Atribuicao() { return getToken(GrammarParser.Atribuicao, 0); }
		public TerminalNode LString() { return getToken(GrammarParser.LString, 0); }
		public AtribuicaoStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoString; }
	}

	public final AtribuicaoStringContext atribuicaoString() throws RecognitionException {
		AtribuicaoStringContext _localctx = new AtribuicaoStringContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atribuicaoString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(Var);
			setState(129);
			match(Atribuicao);
			setState(130);
			match(LString);
			setState(131);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoIntContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public TerminalNode Atribuicao() { return getToken(GrammarParser.Atribuicao, 0); }
		public TerminalNode NInt() { return getToken(GrammarParser.NInt, 0); }
		public ExpressaoAritIntContext expressaoAritInt() {
			return getRuleContext(ExpressaoAritIntContext.class,0);
		}
		public AtribuicaoIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoInt; }
	}

	public final AtribuicaoIntContext atribuicaoInt() throws RecognitionException {
		AtribuicaoIntContext _localctx = new AtribuicaoIntContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atribuicaoInt);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(Var);
				setState(134);
				match(Atribuicao);
				setState(135);
				match(NInt);
				setState(136);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(Var);
				setState(138);
				match(Atribuicao);
				setState(139);
				expressaoAritInt(0);
				setState(140);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoRealContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GrammarParser.Var, 0); }
		public TerminalNode Atribuicao() { return getToken(GrammarParser.Atribuicao, 0); }
		public TerminalNode NReal() { return getToken(GrammarParser.NReal, 0); }
		public ExpressaoAritRealContext expressaoAritReal() {
			return getRuleContext(ExpressaoAritRealContext.class,0);
		}
		public AtribuicaoRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoReal; }
	}

	public final AtribuicaoRealContext atribuicaoReal() throws RecognitionException {
		AtribuicaoRealContext _localctx = new AtribuicaoRealContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atribuicaoReal);
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(Var);
				setState(145);
				match(Atribuicao);
				setState(146);
				match(NReal);
				setState(147);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(Var);
				setState(149);
				match(Atribuicao);
				setState(150);
				expressaoAritReal(0);
				setState(151);
				match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoAritIntContext extends ParserRuleContext {
		public List<TerminalNode> NInt() { return getTokens(GrammarParser.NInt); }
		public TerminalNode NInt(int i) {
			return getToken(GrammarParser.NInt, i);
		}
		public TerminalNode OpArit() { return getToken(GrammarParser.OpArit, 0); }
		public List<TerminalNode> Var() { return getTokens(GrammarParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(GrammarParser.Var, i);
		}
		public List<ExpressaoAritIntContext> expressaoAritInt() {
			return getRuleContexts(ExpressaoAritIntContext.class);
		}
		public ExpressaoAritIntContext expressaoAritInt(int i) {
			return getRuleContext(ExpressaoAritIntContext.class,i);
		}
		public ExpressaoAritIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritInt; }
	}

	public final ExpressaoAritIntContext expressaoAritInt() throws RecognitionException {
		return expressaoAritInt(0);
	}

	private ExpressaoAritIntContext expressaoAritInt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAritIntContext _localctx = new ExpressaoAritIntContext(_ctx, _parentState);
		ExpressaoAritIntContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expressaoAritInt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(156);
				match(NInt);
				setState(157);
				match(OpArit);
				setState(158);
				match(NInt);
				}
				break;
			case 2:
				{
				setState(159);
				match(Var);
				setState(160);
				match(OpArit);
				setState(161);
				match(NInt);
				}
				break;
			case 3:
				{
				setState(162);
				match(NInt);
				setState(163);
				match(OpArit);
				setState(164);
				match(Var);
				}
				break;
			case 4:
				{
				setState(165);
				match(Var);
				setState(166);
				match(OpArit);
				setState(167);
				match(Var);
				}
				break;
			case 5:
				{
				setState(168);
				match(Var);
				setState(169);
				match(OpArit);
				setState(170);
				expressaoAritInt(5);
				}
				break;
			case 6:
				{
				setState(171);
				match(NInt);
				setState(172);
				match(OpArit);
				setState(173);
				expressaoAritInt(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(185);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoAritIntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritInt);
						setState(176);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(177);
						match(OpArit);
						setState(178);
						expressaoAritInt(2);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoAritIntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritInt);
						setState(179);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(180);
						match(OpArit);
						setState(181);
						match(Var);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoAritIntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritInt);
						setState(182);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(183);
						match(OpArit);
						setState(184);
						match(NInt);
						}
						break;
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoAritRealContext extends ParserRuleContext {
		public List<TerminalNode> NReal() { return getTokens(GrammarParser.NReal); }
		public TerminalNode NReal(int i) {
			return getToken(GrammarParser.NReal, i);
		}
		public TerminalNode OpArit() { return getToken(GrammarParser.OpArit, 0); }
		public List<TerminalNode> Var() { return getTokens(GrammarParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(GrammarParser.Var, i);
		}
		public ExpressaoAritRealContext expressaoAritReal() {
			return getRuleContext(ExpressaoAritRealContext.class,0);
		}
		public ExpressaoAritRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritReal; }
	}

	public final ExpressaoAritRealContext expressaoAritReal() throws RecognitionException {
		return expressaoAritReal(0);
	}

	private ExpressaoAritRealContext expressaoAritReal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAritRealContext _localctx = new ExpressaoAritRealContext(_ctx, _parentState);
		ExpressaoAritRealContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expressaoAritReal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(191);
				match(NReal);
				setState(192);
				match(OpArit);
				setState(193);
				match(NReal);
				}
				break;
			case 2:
				{
				setState(194);
				match(Var);
				setState(195);
				match(OpArit);
				setState(196);
				match(NReal);
				}
				break;
			case 3:
				{
				setState(197);
				match(NReal);
				setState(198);
				match(OpArit);
				setState(199);
				match(Var);
				}
				break;
			case 4:
				{
				setState(200);
				match(Var);
				setState(201);
				match(OpArit);
				setState(202);
				match(Var);
				}
				break;
			case 5:
				{
				setState(203);
				match(Var);
				setState(204);
				match(OpArit);
				setState(205);
				expressaoAritReal(4);
				}
				break;
			case 6:
				{
				setState(206);
				match(NReal);
				setState(207);
				match(OpArit);
				setState(208);
				expressaoAritReal(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoAritRealContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritReal);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212);
						match(OpArit);
						setState(213);
						match(Var);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoAritRealContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritReal);
						setState(214);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(215);
						match(OpArit);
						setState(216);
						match(NReal);
						}
						break;
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expressaoAritInt_sempred((ExpressaoAritIntContext)_localctx, predIndex);
		case 15:
			return expressaoAritReal_sempred((ExpressaoAritRealContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressaoAritInt_sempred(ExpressaoAritIntContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressaoAritReal_sempred(ExpressaoAritRealContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u00df\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000%\b"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004@\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006P\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007^\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\bl\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tz\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u007f\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u008f\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u009a\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00af"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ba\b\u000e\n"+
		"\u000e\f\u000e\u00bd\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d2\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00da\b\u000f\n\u000f\f\u000f\u00dd\t\u000f\u0001\u000f\u0000\u0002"+
		"\u001c\u001e\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e\u0000\u0000\u00f2\u0000$\u0001\u0000\u0000"+
		"\u0000\u0002*\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u0006"+
		"0\u0001\u0000\u0000\u0000\b?\u0001\u0000\u0000\u0000\nA\u0001\u0000\u0000"+
		"\u0000\fO\u0001\u0000\u0000\u0000\u000e]\u0001\u0000\u0000\u0000\u0010"+
		"k\u0001\u0000\u0000\u0000\u0012y\u0001\u0000\u0000\u0000\u0014~\u0001"+
		"\u0000\u0000\u0000\u0016\u0080\u0001\u0000\u0000\u0000\u0018\u008e\u0001"+
		"\u0000\u0000\u0000\u001a\u0099\u0001\u0000\u0000\u0000\u001c\u00ae\u0001"+
		"\u0000\u0000\u0000\u001e\u00d1\u0001\u0000\u0000\u0000 !\u0003\u0002\u0001"+
		"\u0000!\"\u0003\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#%\u0003\u0002"+
		"\u0001\u0000$ \u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000%\u0001"+
		"\u0001\u0000\u0000\u0000&+\u0003\u0004\u0002\u0000\'+\u0003\u0006\u0003"+
		"\u0000(+\u0003\n\u0005\u0000)+\u0003\u0014\n\u0000*&\u0001\u0000\u0000"+
		"\u0000*\'\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*)\u0001\u0000"+
		"\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,-\u0005\u0006\u0000\u0000"+
		"-.\u0005\u0013\u0000\u0000./\u0005\u0001\u0000\u0000/\u0005\u0001\u0000"+
		"\u0000\u000001\u0005\u0002\u0000\u000012\u0005\f\u0000\u000023\u0003\f"+
		"\u0006\u000034\u0005\r\u0000\u000045\u0005\n\u0000\u000056\u0003\u0002"+
		"\u0001\u000067\u0005\u000b\u0000\u000078\u0003\b\u0004\u00008\u0007\u0001"+
		"\u0000\u0000\u00009:\u0005\u0003\u0000\u0000:;\u0005\n\u0000\u0000;<\u0003"+
		"\u0002\u0001\u0000<=\u0005\u000b\u0000\u0000=@\u0001\u0000\u0000\u0000"+
		">@\u0005\u0018\u0000\u0000?9\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000"+
		"\u0000@\t\u0001\u0000\u0000\u0000AB\u0005\u0004\u0000\u0000BC\u0005\f"+
		"\u0000\u0000CD\u0003\f\u0006\u0000DE\u0005\r\u0000\u0000EF\u0005\n\u0000"+
		"\u0000FG\u0003\u0002\u0001\u0000GH\u0005\u000b\u0000\u0000H\u000b\u0001"+
		"\u0000\u0000\u0000IJ\u0005\u0013\u0000\u0000JK\u0005\t\u0000\u0000KP\u0005"+
		"\u0013\u0000\u0000LP\u0003\u000e\u0007\u0000MP\u0003\u0010\b\u0000NP\u0003"+
		"\u0012\t\u0000OI\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000P\r\u0001\u0000\u0000\u0000"+
		"QR\u0005\u0013\u0000\u0000RS\u0005\t\u0000\u0000S^\u0005\u0016\u0000\u0000"+
		"TU\u0005\u0016\u0000\u0000UV\u0005\t\u0000\u0000V^\u0005\u0013\u0000\u0000"+
		"WX\u0005\u0013\u0000\u0000XY\u0005\t\u0000\u0000Y^\u0005\u0013\u0000\u0000"+
		"Z[\u0005\u0016\u0000\u0000[\\\u0005\t\u0000\u0000\\^\u0005\u0016\u0000"+
		"\u0000]Q\u0001\u0000\u0000\u0000]T\u0001\u0000\u0000\u0000]W\u0001\u0000"+
		"\u0000\u0000]Z\u0001\u0000\u0000\u0000^\u000f\u0001\u0000\u0000\u0000"+
		"_`\u0005\u0013\u0000\u0000`a\u0005\t\u0000\u0000al\u0005\u0014\u0000\u0000"+
		"bc\u0005\u0014\u0000\u0000cd\u0005\t\u0000\u0000dl\u0005\u0013\u0000\u0000"+
		"ef\u0005\u0013\u0000\u0000fg\u0005\t\u0000\u0000gl\u0005\u0013\u0000\u0000"+
		"hi\u0005\u0014\u0000\u0000ij\u0005\t\u0000\u0000jl\u0005\u0014\u0000\u0000"+
		"k_\u0001\u0000\u0000\u0000kb\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000"+
		"\u0000kh\u0001\u0000\u0000\u0000l\u0011\u0001\u0000\u0000\u0000mn\u0005"+
		"\u0013\u0000\u0000no\u0005\t\u0000\u0000oz\u0005\u0015\u0000\u0000pq\u0005"+
		"\u0015\u0000\u0000qr\u0005\t\u0000\u0000rz\u0005\u0013\u0000\u0000st\u0005"+
		"\u0013\u0000\u0000tu\u0005\t\u0000\u0000uz\u0005\u0013\u0000\u0000vw\u0005"+
		"\u0015\u0000\u0000wx\u0005\t\u0000\u0000xz\u0005\u0015\u0000\u0000ym\u0001"+
		"\u0000\u0000\u0000yp\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000"+
		"yv\u0001\u0000\u0000\u0000z\u0013\u0001\u0000\u0000\u0000{\u007f\u0003"+
		"\u0016\u000b\u0000|\u007f\u0003\u0018\f\u0000}\u007f\u0003\u001a\r\u0000"+
		"~{\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000"+
		"\u0000\u007f\u0015\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0013\u0000"+
		"\u0000\u0081\u0082\u0005\b\u0000\u0000\u0082\u0083\u0005\u0016\u0000\u0000"+
		"\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u0017\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005\u0013\u0000\u0000\u0086\u0087\u0005\b\u0000\u0000\u0087"+
		"\u0088\u0005\u0014\u0000\u0000\u0088\u008f\u0005\u0001\u0000\u0000\u0089"+
		"\u008a\u0005\u0013\u0000\u0000\u008a\u008b\u0005\b\u0000\u0000\u008b\u008c"+
		"\u0003\u001c\u000e\u0000\u008c\u008d\u0005\u0001\u0000\u0000\u008d\u008f"+
		"\u0001\u0000\u0000\u0000\u008e\u0085\u0001\u0000\u0000\u0000\u008e\u0089"+
		"\u0001\u0000\u0000\u0000\u008f\u0019\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\u0013\u0000\u0000\u0091\u0092\u0005\b\u0000\u0000\u0092\u0093\u0005"+
		"\u0015\u0000\u0000\u0093\u009a\u0005\u0001\u0000\u0000\u0094\u0095\u0005"+
		"\u0013\u0000\u0000\u0095\u0096\u0005\b\u0000\u0000\u0096\u0097\u0003\u001e"+
		"\u000f\u0000\u0097\u0098\u0005\u0001\u0000\u0000\u0098\u009a\u0001\u0000"+
		"\u0000\u0000\u0099\u0090\u0001\u0000\u0000\u0000\u0099\u0094\u0001\u0000"+
		"\u0000\u0000\u009a\u001b\u0001\u0000\u0000\u0000\u009b\u009c\u0006\u000e"+
		"\uffff\uffff\u0000\u009c\u009d\u0005\u0014\u0000\u0000\u009d\u009e\u0005"+
		"\u0007\u0000\u0000\u009e\u00af\u0005\u0014\u0000\u0000\u009f\u00a0\u0005"+
		"\u0013\u0000\u0000\u00a0\u00a1\u0005\u0007\u0000\u0000\u00a1\u00af\u0005"+
		"\u0014\u0000\u0000\u00a2\u00a3\u0005\u0014\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0007\u0000\u0000\u00a4\u00af\u0005\u0013\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0013\u0000\u0000\u00a6\u00a7\u0005\u0007\u0000\u0000\u00a7\u00af\u0005"+
		"\u0013\u0000\u0000\u00a8\u00a9\u0005\u0013\u0000\u0000\u00a9\u00aa\u0005"+
		"\u0007\u0000\u0000\u00aa\u00af\u0003\u001c\u000e\u0005\u00ab\u00ac\u0005"+
		"\u0014\u0000\u0000\u00ac\u00ad\u0005\u0007\u0000\u0000\u00ad\u00af\u0003"+
		"\u001c\u000e\u0004\u00ae\u009b\u0001\u0000\u0000\u0000\u00ae\u009f\u0001"+
		"\u0000\u0000\u0000\u00ae\u00a2\u0001\u0000\u0000\u0000\u00ae\u00a5\u0001"+
		"\u0000\u0000\u0000\u00ae\u00a8\u0001\u0000\u0000\u0000\u00ae\u00ab\u0001"+
		"\u0000\u0000\u0000\u00af\u00bb\u0001\u0000\u0000\u0000\u00b0\u00b1\n\u0001"+
		"\u0000\u0000\u00b1\u00b2\u0005\u0007\u0000\u0000\u00b2\u00ba\u0003\u001c"+
		"\u000e\u0002\u00b3\u00b4\n\u0003\u0000\u0000\u00b4\u00b5\u0005\u0007\u0000"+
		"\u0000\u00b5\u00ba\u0005\u0013\u0000\u0000\u00b6\u00b7\n\u0002\u0000\u0000"+
		"\u00b7\u00b8\u0005\u0007\u0000\u0000\u00b8\u00ba\u0005\u0014\u0000\u0000"+
		"\u00b9\u00b0\u0001\u0000\u0000\u0000\u00b9\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b6\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u001d\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0006\u000f\uffff\uffff\u0000\u00bf\u00c0\u0005\u0015\u0000"+
		"\u0000\u00c0\u00c1\u0005\u0007\u0000\u0000\u00c1\u00d2\u0005\u0015\u0000"+
		"\u0000\u00c2\u00c3\u0005\u0013\u0000\u0000\u00c3\u00c4\u0005\u0007\u0000"+
		"\u0000\u00c4\u00d2\u0005\u0015\u0000\u0000\u00c5\u00c6\u0005\u0015\u0000"+
		"\u0000\u00c6\u00c7\u0005\u0007\u0000\u0000\u00c7\u00d2\u0005\u0013\u0000"+
		"\u0000\u00c8\u00c9\u0005\u0013\u0000\u0000\u00c9\u00ca\u0005\u0007\u0000"+
		"\u0000\u00ca\u00d2\u0005\u0013\u0000\u0000\u00cb\u00cc\u0005\u0013\u0000"+
		"\u0000\u00cc\u00cd\u0005\u0007\u0000\u0000\u00cd\u00d2\u0003\u001e\u000f"+
		"\u0004\u00ce\u00cf\u0005\u0015\u0000\u0000\u00cf\u00d0\u0005\u0007\u0000"+
		"\u0000\u00d0\u00d2\u0003\u001e\u000f\u0003\u00d1\u00be\u0001\u0000\u0000"+
		"\u0000\u00d1\u00c2\u0001\u0000\u0000\u0000\u00d1\u00c5\u0001\u0000\u0000"+
		"\u0000\u00d1\u00c8\u0001\u0000\u0000\u0000\u00d1\u00cb\u0001\u0000\u0000"+
		"\u0000\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d2\u00db\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\n\u0002\u0000\u0000\u00d4\u00d5\u0005\u0007\u0000\u0000"+
		"\u00d5\u00da\u0005\u0013\u0000\u0000\u00d6\u00d7\n\u0001\u0000\u0000\u00d7"+
		"\u00d8\u0005\u0007\u0000\u0000\u00d8\u00da\u0005\u0015\u0000\u0000\u00d9"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d9\u00d6\u0001\u0000\u0000\u0000\u00da"+
		"\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u001f\u0001\u0000\u0000\u0000\u00dd"+
		"\u00db\u0001\u0000\u0000\u0000\u0010$*?O]ky~\u008e\u0099\u00ae\u00b9\u00bb"+
		"\u00d1\u00d9\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}