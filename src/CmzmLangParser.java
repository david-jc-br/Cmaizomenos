// Generated from ./CmzmLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CmzmLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, PalavraChave=5, Tipo=6, OpArit=7, Atribuicao=8, 
		OpRel=9, AbreChave=10, FechaChave=11, AbrePar=12, FechaPar=13, AbreComentario=14, 
		FechaComentario=15, OpBoolE=16, OpBoolOu=17, WS=18, Var=19, NInt=20, NReal=21, 
		LString=22, ErrorChar=23;
	public static final int
		RULE_comando = 0, RULE_expressao = 1, RULE_declaracaoVar = 2, RULE_condicional = 3, 
		RULE_repeticao = 4, RULE_expressaoLogica = 5, RULE_expressaoLogicaString = 6, 
		RULE_expressaoLogicaInt = 7, RULE_expressaoLogicaReal = 8, RULE_atribuicao = 9, 
		RULE_atribuicaoString = 10, RULE_atribuicaoInt = 11, RULE_atribuicaoReal = 12, 
		RULE_expressaoAritInt = 13, RULE_expressaoAritReal = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"comando", "expressao", "declaracaoVar", "condicional", "repeticao", 
			"expressaoLogica", "expressaoLogicaString", "expressaoLogicaInt", "expressaoLogicaReal", 
			"atribuicao", "atribuicaoString", "atribuicaoInt", "atribuicaoReal", 
			"expressaoAritInt", "expressaoAritReal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'si'", "'sinaum'", "'uai'", null, null, null, "'='", null, 
			"'{'", "'}'", "'('", "')'", "'/*'", "'*/'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "PalavraChave", "Tipo", "OpArit", "Atribuicao", 
			"OpRel", "AbreChave", "FechaChave", "AbrePar", "FechaPar", "AbreComentario", 
			"FechaComentario", "OpBoolE", "OpBoolOu", "WS", "Var", "NInt", "NReal", 
			"LString", "ErrorChar"
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
	public String getGrammarFileName() { return "CmzmLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmzmLangParser(TokenStream input) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comando);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				expressao();
				setState(31);
				comando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expressao);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tipo:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				declaracaoVar();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				condicional();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				repeticao();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
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
		public TerminalNode Tipo() { return getToken(CmzmLangParser.Tipo, 0); }
		public TerminalNode Var() { return getToken(CmzmLangParser.Var, 0); }
		public DeclaracaoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterDeclaracaoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitDeclaracaoVar(this);
		}
	}

	public final DeclaracaoVarContext declaracaoVar() throws RecognitionException {
		DeclaracaoVarContext _localctx = new DeclaracaoVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracaoVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(Tipo);
			setState(43);
			match(Var);
			setState(44);
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
		public TerminalNode AbrePar() { return getToken(CmzmLangParser.AbrePar, 0); }
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(CmzmLangParser.FechaPar, 0); }
		public List<TerminalNode> AbreChave() { return getTokens(CmzmLangParser.AbreChave); }
		public TerminalNode AbreChave(int i) {
			return getToken(CmzmLangParser.AbreChave, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> FechaChave() { return getTokens(CmzmLangParser.FechaChave); }
		public TerminalNode FechaChave(int i) {
			return getToken(CmzmLangParser.FechaChave, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__1);
			setState(47);
			match(AbrePar);
			setState(48);
			expressaoLogica();
			setState(49);
			match(FechaPar);
			setState(50);
			match(AbreChave);
			setState(51);
			expressao();
			setState(52);
			match(FechaChave);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(53);
				match(T__2);
				setState(54);
				match(AbreChave);
				setState(55);
				expressao();
				setState(56);
				match(FechaChave);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode AbrePar() { return getToken(CmzmLangParser.AbrePar, 0); }
		public ExpressaoLogicaContext expressaoLogica() {
			return getRuleContext(ExpressaoLogicaContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(CmzmLangParser.FechaPar, 0); }
		public TerminalNode AbreChave() { return getToken(CmzmLangParser.AbreChave, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FechaChave() { return getToken(CmzmLangParser.FechaChave, 0); }
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__3);
			setState(61);
			match(AbrePar);
			setState(62);
			expressaoLogica();
			setState(63);
			match(FechaPar);
			setState(64);
			match(AbreChave);
			setState(65);
			expressao();
			setState(66);
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
		public List<TerminalNode> Var() { return getTokens(CmzmLangParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(CmzmLangParser.Var, i);
		}
		public TerminalNode OpRel() { return getToken(CmzmLangParser.OpRel, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterExpressaoLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitExpressaoLogica(this);
		}
	}

	public final ExpressaoLogicaContext expressaoLogica() throws RecognitionException {
		ExpressaoLogicaContext _localctx = new ExpressaoLogicaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressaoLogica);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(Var);
				setState(69);
				match(OpRel);
				setState(70);
				match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				expressaoLogicaString();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				expressaoLogicaInt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
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
		public TerminalNode Var() { return getToken(CmzmLangParser.Var, 0); }
		public TerminalNode OpRel() { return getToken(CmzmLangParser.OpRel, 0); }
		public List<TerminalNode> LString() { return getTokens(CmzmLangParser.LString); }
		public TerminalNode LString(int i) {
			return getToken(CmzmLangParser.LString, i);
		}
		public ExpressaoLogicaStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogicaString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterExpressaoLogicaString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitExpressaoLogicaString(this);
		}
	}

	public final ExpressaoLogicaStringContext expressaoLogicaString() throws RecognitionException {
		ExpressaoLogicaStringContext _localctx = new ExpressaoLogicaStringContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressaoLogicaString);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(Var);
				setState(77);
				match(OpRel);
				setState(78);
				match(LString);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				match(LString);
				setState(80);
				match(OpRel);
				setState(81);
				match(Var);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(LString);
				setState(83);
				match(OpRel);
				setState(84);
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
		public TerminalNode Var() { return getToken(CmzmLangParser.Var, 0); }
		public TerminalNode OpRel() { return getToken(CmzmLangParser.OpRel, 0); }
		public List<TerminalNode> NInt() { return getTokens(CmzmLangParser.NInt); }
		public TerminalNode NInt(int i) {
			return getToken(CmzmLangParser.NInt, i);
		}
		public ExpressaoLogicaIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogicaInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterExpressaoLogicaInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitExpressaoLogicaInt(this);
		}
	}

	public final ExpressaoLogicaIntContext expressaoLogicaInt() throws RecognitionException {
		ExpressaoLogicaIntContext _localctx = new ExpressaoLogicaIntContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressaoLogicaInt);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(Var);
				setState(88);
				match(OpRel);
				setState(89);
				match(NInt);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(NInt);
				setState(91);
				match(OpRel);
				setState(92);
				match(Var);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				match(NInt);
				setState(94);
				match(OpRel);
				setState(95);
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
		public TerminalNode Var() { return getToken(CmzmLangParser.Var, 0); }
		public TerminalNode OpRel() { return getToken(CmzmLangParser.OpRel, 0); }
		public List<TerminalNode> NReal() { return getTokens(CmzmLangParser.NReal); }
		public TerminalNode NReal(int i) {
			return getToken(CmzmLangParser.NReal, i);
		}
		public ExpressaoLogicaRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoLogicaReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterExpressaoLogicaReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitExpressaoLogicaReal(this);
		}
	}

	public final ExpressaoLogicaRealContext expressaoLogicaReal() throws RecognitionException {
		ExpressaoLogicaRealContext _localctx = new ExpressaoLogicaRealContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressaoLogicaReal);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(Var);
				setState(99);
				match(OpRel);
				setState(100);
				match(NReal);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(NReal);
				setState(102);
				match(OpRel);
				setState(103);
				match(Var);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(NReal);
				setState(105);
				match(OpRel);
				setState(106);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atribuicao);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				atribuicaoString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				atribuicaoInt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
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
		public TerminalNode Var() { return getToken(CmzmLangParser.Var, 0); }
		public TerminalNode Atribuicao() { return getToken(CmzmLangParser.Atribuicao, 0); }
		public TerminalNode LString() { return getToken(CmzmLangParser.LString, 0); }
		public AtribuicaoStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterAtribuicaoString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitAtribuicaoString(this);
		}
	}

	public final AtribuicaoStringContext atribuicaoString() throws RecognitionException {
		AtribuicaoStringContext _localctx = new AtribuicaoStringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicaoString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(Var);
			setState(115);
			match(Atribuicao);
			setState(116);
			match(LString);
			setState(117);
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
		public TerminalNode Var() { return getToken(CmzmLangParser.Var, 0); }
		public TerminalNode Atribuicao() { return getToken(CmzmLangParser.Atribuicao, 0); }
		public TerminalNode NInt() { return getToken(CmzmLangParser.NInt, 0); }
		public ExpressaoAritIntContext expressaoAritInt() {
			return getRuleContext(ExpressaoAritIntContext.class,0);
		}
		public AtribuicaoIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterAtribuicaoInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitAtribuicaoInt(this);
		}
	}

	public final AtribuicaoIntContext atribuicaoInt() throws RecognitionException {
		AtribuicaoIntContext _localctx = new AtribuicaoIntContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_atribuicaoInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(Var);
			setState(120);
			match(Atribuicao);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(121);
				match(NInt);
				}
				break;
			case 2:
				{
				setState(122);
				expressaoAritInt(0);
				}
				break;
			}
			setState(125);
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
	public static class AtribuicaoRealContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(CmzmLangParser.Var, 0); }
		public TerminalNode Atribuicao() { return getToken(CmzmLangParser.Atribuicao, 0); }
		public TerminalNode NReal() { return getToken(CmzmLangParser.NReal, 0); }
		public ExpressaoAritRealContext expressaoAritReal() {
			return getRuleContext(ExpressaoAritRealContext.class,0);
		}
		public AtribuicaoRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterAtribuicaoReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitAtribuicaoReal(this);
		}
	}

	public final AtribuicaoRealContext atribuicaoReal() throws RecognitionException {
		AtribuicaoRealContext _localctx = new AtribuicaoRealContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atribuicaoReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(Var);
			setState(128);
			match(Atribuicao);
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(129);
				match(NReal);
				}
				break;
			case 2:
				{
				setState(130);
				expressaoAritReal(0);
				}
				break;
			}
			setState(133);
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
	public static class ExpressaoAritIntContext extends ParserRuleContext {
		public List<TerminalNode> NInt() { return getTokens(CmzmLangParser.NInt); }
		public TerminalNode NInt(int i) {
			return getToken(CmzmLangParser.NInt, i);
		}
		public TerminalNode OpArit() { return getToken(CmzmLangParser.OpArit, 0); }
		public List<TerminalNode> Var() { return getTokens(CmzmLangParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(CmzmLangParser.Var, i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterExpressaoAritInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitExpressaoAritInt(this);
		}
	}

	public final ExpressaoAritIntContext expressaoAritInt() throws RecognitionException {
		return expressaoAritInt(0);
	}

	private ExpressaoAritIntContext expressaoAritInt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAritIntContext _localctx = new ExpressaoAritIntContext(_ctx, _parentState);
		ExpressaoAritIntContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expressaoAritInt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(136);
				match(NInt);
				setState(137);
				match(OpArit);
				setState(138);
				match(NInt);
				}
				break;
			case 2:
				{
				setState(139);
				match(Var);
				setState(140);
				match(OpArit);
				setState(141);
				match(NInt);
				}
				break;
			case 3:
				{
				setState(142);
				match(NInt);
				setState(143);
				match(OpArit);
				setState(144);
				match(Var);
				}
				break;
			case 4:
				{
				setState(145);
				match(Var);
				setState(146);
				match(OpArit);
				setState(147);
				match(Var);
				}
				break;
			case 5:
				{
				setState(148);
				match(Var);
				setState(149);
				match(OpArit);
				setState(150);
				expressaoAritInt(5);
				}
				break;
			case 6:
				{
				setState(151);
				match(NInt);
				setState(152);
				match(OpArit);
				setState(153);
				expressaoAritInt(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoAritIntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritInt);
						setState(156);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(157);
						match(OpArit);
						setState(158);
						expressaoAritInt(2);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoAritIntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritInt);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160);
						match(OpArit);
						setState(161);
						match(Var);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoAritIntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritInt);
						setState(162);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(163);
						match(OpArit);
						setState(164);
						match(NInt);
						}
						break;
					}
					} 
				}
				setState(169);
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
		public List<TerminalNode> NReal() { return getTokens(CmzmLangParser.NReal); }
		public TerminalNode NReal(int i) {
			return getToken(CmzmLangParser.NReal, i);
		}
		public TerminalNode OpArit() { return getToken(CmzmLangParser.OpArit, 0); }
		public List<TerminalNode> Var() { return getTokens(CmzmLangParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(CmzmLangParser.Var, i);
		}
		public List<ExpressaoAritRealContext> expressaoAritReal() {
			return getRuleContexts(ExpressaoAritRealContext.class);
		}
		public ExpressaoAritRealContext expressaoAritReal(int i) {
			return getRuleContext(ExpressaoAritRealContext.class,i);
		}
		public ExpressaoAritRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterExpressaoAritReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitExpressaoAritReal(this);
		}
	}

	public final ExpressaoAritRealContext expressaoAritReal() throws RecognitionException {
		return expressaoAritReal(0);
	}

	private ExpressaoAritRealContext expressaoAritReal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAritRealContext _localctx = new ExpressaoAritRealContext(_ctx, _parentState);
		ExpressaoAritRealContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expressaoAritReal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(171);
				match(NReal);
				setState(172);
				match(OpArit);
				setState(173);
				match(NReal);
				}
				break;
			case 2:
				{
				setState(174);
				match(Var);
				setState(175);
				match(OpArit);
				setState(176);
				match(NReal);
				}
				break;
			case 3:
				{
				setState(177);
				match(NReal);
				setState(178);
				match(OpArit);
				setState(179);
				match(Var);
				}
				break;
			case 4:
				{
				setState(180);
				match(Var);
				setState(181);
				match(OpArit);
				setState(182);
				match(Var);
				}
				break;
			case 5:
				{
				setState(183);
				match(Var);
				setState(184);
				match(OpArit);
				setState(185);
				expressaoAritReal(5);
				}
				break;
			case 6:
				{
				setState(186);
				match(NReal);
				setState(187);
				match(OpArit);
				setState(188);
				expressaoAritReal(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(200);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoAritRealContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritReal);
						setState(191);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(192);
						match(OpArit);
						setState(193);
						expressaoAritReal(2);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoAritRealContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritReal);
						setState(194);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(195);
						match(OpArit);
						setState(196);
						match(Var);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoAritRealContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritReal);
						setState(197);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(198);
						match(OpArit);
						setState(199);
						match(NReal);
						}
						break;
					}
					} 
				}
				setState(204);
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
		case 13:
			return expressaoAritInt_sempred((ExpressaoAritIntContext)_localctx, predIndex);
		case 14:
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
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0017\u00ce\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0003\u0000#\b\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003;\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005K\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006V\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007a\b"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\bl\b\b\u0001\t\u0001\t\u0001\t\u0003\tq\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b|\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u0084\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u009b\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00a6\b\r\n\r\f\r\u00a9\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00be\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00c9\b\u000e\n\u000e\f\u000e"+
		"\u00cc\t\u000e\u0001\u000e\u0000\u0002\u001a\u001c\u000f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0000"+
		"\u00e0\u0000\"\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000"+
		"\u0004*\u0001\u0000\u0000\u0000\u0006.\u0001\u0000\u0000\u0000\b<\u0001"+
		"\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000"+
		"\u000e`\u0001\u0000\u0000\u0000\u0010k\u0001\u0000\u0000\u0000\u0012p"+
		"\u0001\u0000\u0000\u0000\u0014r\u0001\u0000\u0000\u0000\u0016w\u0001\u0000"+
		"\u0000\u0000\u0018\u007f\u0001\u0000\u0000\u0000\u001a\u009a\u0001\u0000"+
		"\u0000\u0000\u001c\u00bd\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0002"+
		"\u0001\u0000\u001f \u0003\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000"+
		"!#\u0003\u0002\u0001\u0000\"\u001e\u0001\u0000\u0000\u0000\"!\u0001\u0000"+
		"\u0000\u0000#\u0001\u0001\u0000\u0000\u0000$)\u0003\u0004\u0002\u0000"+
		"%)\u0003\u0006\u0003\u0000&)\u0003\b\u0004\u0000\')\u0003\u0012\t\u0000"+
		"($\u0001\u0000\u0000\u0000(%\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000(\'\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*+\u0005"+
		"\u0006\u0000\u0000+,\u0005\u0013\u0000\u0000,-\u0005\u0001\u0000\u0000"+
		"-\u0005\u0001\u0000\u0000\u0000./\u0005\u0002\u0000\u0000/0\u0005\f\u0000"+
		"\u000001\u0003\n\u0005\u000012\u0005\r\u0000\u000023\u0005\n\u0000\u0000"+
		"34\u0003\u0002\u0001\u00004:\u0005\u000b\u0000\u000056\u0005\u0003\u0000"+
		"\u000067\u0005\n\u0000\u000078\u0003\u0002\u0001\u000089\u0005\u000b\u0000"+
		"\u00009;\u0001\u0000\u0000\u0000:5\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<=\u0005\u0004\u0000\u0000"+
		"=>\u0005\f\u0000\u0000>?\u0003\n\u0005\u0000?@\u0005\r\u0000\u0000@A\u0005"+
		"\n\u0000\u0000AB\u0003\u0002\u0001\u0000BC\u0005\u000b\u0000\u0000C\t"+
		"\u0001\u0000\u0000\u0000DE\u0005\u0013\u0000\u0000EF\u0005\t\u0000\u0000"+
		"FK\u0005\u0013\u0000\u0000GK\u0003\f\u0006\u0000HK\u0003\u000e\u0007\u0000"+
		"IK\u0003\u0010\b\u0000JD\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000K\u000b\u0001\u0000"+
		"\u0000\u0000LM\u0005\u0013\u0000\u0000MN\u0005\t\u0000\u0000NV\u0005\u0016"+
		"\u0000\u0000OP\u0005\u0016\u0000\u0000PQ\u0005\t\u0000\u0000QV\u0005\u0013"+
		"\u0000\u0000RS\u0005\u0016\u0000\u0000ST\u0005\t\u0000\u0000TV\u0005\u0016"+
		"\u0000\u0000UL\u0001\u0000\u0000\u0000UO\u0001\u0000\u0000\u0000UR\u0001"+
		"\u0000\u0000\u0000V\r\u0001\u0000\u0000\u0000WX\u0005\u0013\u0000\u0000"+
		"XY\u0005\t\u0000\u0000Ya\u0005\u0014\u0000\u0000Z[\u0005\u0014\u0000\u0000"+
		"[\\\u0005\t\u0000\u0000\\a\u0005\u0013\u0000\u0000]^\u0005\u0014\u0000"+
		"\u0000^_\u0005\t\u0000\u0000_a\u0005\u0014\u0000\u0000`W\u0001\u0000\u0000"+
		"\u0000`Z\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000a\u000f\u0001"+
		"\u0000\u0000\u0000bc\u0005\u0013\u0000\u0000cd\u0005\t\u0000\u0000dl\u0005"+
		"\u0015\u0000\u0000ef\u0005\u0015\u0000\u0000fg\u0005\t\u0000\u0000gl\u0005"+
		"\u0013\u0000\u0000hi\u0005\u0015\u0000\u0000ij\u0005\t\u0000\u0000jl\u0005"+
		"\u0015\u0000\u0000kb\u0001\u0000\u0000\u0000ke\u0001\u0000\u0000\u0000"+
		"kh\u0001\u0000\u0000\u0000l\u0011\u0001\u0000\u0000\u0000mq\u0003\u0014"+
		"\n\u0000nq\u0003\u0016\u000b\u0000oq\u0003\u0018\f\u0000pm\u0001\u0000"+
		"\u0000\u0000pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u0013"+
		"\u0001\u0000\u0000\u0000rs\u0005\u0013\u0000\u0000st\u0005\b\u0000\u0000"+
		"tu\u0005\u0016\u0000\u0000uv\u0005\u0001\u0000\u0000v\u0015\u0001\u0000"+
		"\u0000\u0000wx\u0005\u0013\u0000\u0000x{\u0005\b\u0000\u0000y|\u0005\u0014"+
		"\u0000\u0000z|\u0003\u001a\r\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000"+
		"\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0005\u0001\u0000\u0000~\u0017"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0013\u0000\u0000\u0080\u0083"+
		"\u0005\b\u0000\u0000\u0081\u0084\u0005\u0015\u0000\u0000\u0082\u0084\u0003"+
		"\u001c\u000e\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"\u0001\u0000\u0000\u0086\u0019\u0001\u0000\u0000\u0000\u0087\u0088\u0006"+
		"\r\uffff\uffff\u0000\u0088\u0089\u0005\u0014\u0000\u0000\u0089\u008a\u0005"+
		"\u0007\u0000\u0000\u008a\u009b\u0005\u0014\u0000\u0000\u008b\u008c\u0005"+
		"\u0013\u0000\u0000\u008c\u008d\u0005\u0007\u0000\u0000\u008d\u009b\u0005"+
		"\u0014\u0000\u0000\u008e\u008f\u0005\u0014\u0000\u0000\u008f\u0090\u0005"+
		"\u0007\u0000\u0000\u0090\u009b\u0005\u0013\u0000\u0000\u0091\u0092\u0005"+
		"\u0013\u0000\u0000\u0092\u0093\u0005\u0007\u0000\u0000\u0093\u009b\u0005"+
		"\u0013\u0000\u0000\u0094\u0095\u0005\u0013\u0000\u0000\u0095\u0096\u0005"+
		"\u0007\u0000\u0000\u0096\u009b\u0003\u001a\r\u0005\u0097\u0098\u0005\u0014"+
		"\u0000\u0000\u0098\u0099\u0005\u0007\u0000\u0000\u0099\u009b\u0003\u001a"+
		"\r\u0004\u009a\u0087\u0001\u0000\u0000\u0000\u009a\u008b\u0001\u0000\u0000"+
		"\u0000\u009a\u008e\u0001\u0000\u0000\u0000\u009a\u0091\u0001\u0000\u0000"+
		"\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009a\u0097\u0001\u0000\u0000"+
		"\u0000\u009b\u00a7\u0001\u0000\u0000\u0000\u009c\u009d\n\u0001\u0000\u0000"+
		"\u009d\u009e\u0005\u0007\u0000\u0000\u009e\u00a6\u0003\u001a\r\u0002\u009f"+
		"\u00a0\n\u0003\u0000\u0000\u00a0\u00a1\u0005\u0007\u0000\u0000\u00a1\u00a6"+
		"\u0005\u0013\u0000\u0000\u00a2\u00a3\n\u0002\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0007\u0000\u0000\u00a4\u00a6\u0005\u0014\u0000\u0000\u00a5\u009c\u0001"+
		"\u0000\u0000\u0000\u00a5\u009f\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u001b\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ab\u0006"+
		"\u000e\uffff\uffff\u0000\u00ab\u00ac\u0005\u0015\u0000\u0000\u00ac\u00ad"+
		"\u0005\u0007\u0000\u0000\u00ad\u00be\u0005\u0015\u0000\u0000\u00ae\u00af"+
		"\u0005\u0013\u0000\u0000\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0\u00be"+
		"\u0005\u0015\u0000\u0000\u00b1\u00b2\u0005\u0015\u0000\u0000\u00b2\u00b3"+
		"\u0005\u0007\u0000\u0000\u00b3\u00be\u0005\u0013\u0000\u0000\u00b4\u00b5"+
		"\u0005\u0013\u0000\u0000\u00b5\u00b6\u0005\u0007\u0000\u0000\u00b6\u00be"+
		"\u0005\u0013\u0000\u0000\u00b7\u00b8\u0005\u0013\u0000\u0000\u00b8\u00b9"+
		"\u0005\u0007\u0000\u0000\u00b9\u00be\u0003\u001c\u000e\u0005\u00ba\u00bb"+
		"\u0005\u0015\u0000\u0000\u00bb\u00bc\u0005\u0007\u0000\u0000\u00bc\u00be"+
		"\u0003\u001c\u000e\u0004\u00bd\u00aa\u0001\u0000\u0000\u0000\u00bd\u00ae"+
		"\u0001\u0000\u0000\u0000\u00bd\u00b1\u0001\u0000\u0000\u0000\u00bd\u00b4"+
		"\u0001\u0000\u0000\u0000\u00bd\u00b7\u0001\u0000\u0000\u0000\u00bd\u00ba"+
		"\u0001\u0000\u0000\u0000\u00be\u00ca\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\n\u0001\u0000\u0000\u00c0\u00c1\u0005\u0007\u0000\u0000\u00c1\u00c9\u0003"+
		"\u001c\u000e\u0002\u00c2\u00c3\n\u0003\u0000\u0000\u00c3\u00c4\u0005\u0007"+
		"\u0000\u0000\u00c4\u00c9\u0005\u0013\u0000\u0000\u00c5\u00c6\n\u0002\u0000"+
		"\u0000\u00c6\u00c7\u0005\u0007\u0000\u0000\u00c7\u00c9\u0005\u0015\u0000"+
		"\u0000\u00c8\u00bf\u0001\u0000\u0000\u0000\u00c8\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cb\u001d\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000"+
		"\u0000\u0010\"(:JU`kp{\u0083\u009a\u00a5\u00a7\u00bd\u00c8\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}