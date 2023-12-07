// Generated from CmzmLang.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WS=11, PalavraChave=12, Tipo=13, OpArit=14, Atribuicao=15, OpRel=16, 
		AbreChave=17, FechaChave=18, AbrePar=19, FechaPar=20, Comentario=21, OpBoolE=22, 
		OpBoolOu=23, Var=24, NInt=25, NReal=26, LString=27, ErrorChar=28, Delimitador=29;
	public static final int
		RULE_procedimento = 0, RULE_funcao = 1, RULE_parametros = 2, RULE_comando = 3, 
		RULE_expressao = 4, RULE_declaracaoVar = 5, RULE_condicional = 6, RULE_repeticao = 7, 
		RULE_expressaoLogica = 8, RULE_expressaoLogicaString = 9, RULE_expressaoLogicaInt = 10, 
		RULE_expressaoLogicaReal = 11, RULE_atribuicao = 12, RULE_atribuicaoString = 13, 
		RULE_atribuicaoInt = 14, RULE_atribuicaoReal = 15, RULE_mostraissu = 16, 
		RULE_expressaoAritInt = 17, RULE_expressaoAritReal = 18, RULE_expressaoAritString = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"procedimento", "funcao", "parametros", "comando", "expressao", "declaracaoVar", 
			"condicional", "repeticao", "expressaoLogica", "expressaoLogicaString", 
			"expressaoLogicaInt", "expressaoLogicaReal", "atribuicao", "atribuicaoString", 
			"atribuicaoInt", "atribuicaoReal", "mostraissu", "expressaoAritInt", 
			"expressaoAritReal", "expressaoAritString"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'trem'", "'vazio'", "'vorta'", "','", "';'", "'si'", "'sinaum'", 
			"'uai'", "'mostraissu'", "'+'", null, null, null, null, "'='", null, 
			"'{'", "'}'", "'('", "')'", null, "'&&'", "'||'", null, null, null, null, 
			null, "'::'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "WS", 
			"PalavraChave", "Tipo", "OpArit", "Atribuicao", "OpRel", "AbreChave", 
			"FechaChave", "AbrePar", "FechaPar", "Comentario", "OpBoolE", "OpBoolOu", 
			"Var", "NInt", "NReal", "LString", "ErrorChar", "Delimitador"
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
	public static class ProcedimentoContext extends ParserRuleContext {
		public TerminalNode AbrePar() { return getToken(CmzmLangParser.AbrePar, 0); }
		public TerminalNode FechaPar() { return getToken(CmzmLangParser.FechaPar, 0); }
		public TerminalNode AbreChave() { return getToken(CmzmLangParser.AbreChave, 0); }
		public TerminalNode FechaChave() { return getToken(CmzmLangParser.FechaChave, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProcedimentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterProcedimento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitProcedimento(this);
		}
	}

	public final ProcedimentoContext procedimento() throws RecognitionException {
		ProcedimentoContext _localctx = new ProcedimentoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_procedimento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			match(T__1);
			setState(42);
			match(AbrePar);
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tipo) {
				{
				setState(43);
				parametros();
				}
			}

			setState(46);
			match(FechaPar);
			setState(47);
			match(AbreChave);
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16786240L) != 0)) {
				{
				{
				setState(48);
				comando();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode Tipo() { return getToken(CmzmLangParser.Tipo, 0); }
		public TerminalNode Delimitador() { return getToken(CmzmLangParser.Delimitador, 0); }
		public TerminalNode Var() { return getToken(CmzmLangParser.Var, 0); }
		public TerminalNode AbrePar() { return getToken(CmzmLangParser.AbrePar, 0); }
		public TerminalNode FechaPar() { return getToken(CmzmLangParser.FechaPar, 0); }
		public TerminalNode AbreChave() { return getToken(CmzmLangParser.AbreChave, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FechaChave() { return getToken(CmzmLangParser.FechaChave, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			match(Tipo);
			setState(58);
			match(Delimitador);
			setState(59);
			match(Var);
			setState(60);
			match(AbrePar);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Tipo) {
				{
				setState(61);
				parametros();
				}
			}

			setState(64);
			match(FechaPar);
			setState(65);
			match(AbreChave);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16786240L) != 0)) {
				{
				{
				setState(66);
				comando();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(T__2);
			setState(73);
			expressao();
			setState(74);
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<TerminalNode> Tipo() { return getTokens(CmzmLangParser.Tipo); }
		public TerminalNode Tipo(int i) {
			return getToken(CmzmLangParser.Tipo, i);
		}
		public List<TerminalNode> Delimitador() { return getTokens(CmzmLangParser.Delimitador); }
		public TerminalNode Delimitador(int i) {
			return getToken(CmzmLangParser.Delimitador, i);
		}
		public List<TerminalNode> Var() { return getTokens(CmzmLangParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(CmzmLangParser.Var, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(Tipo);
			setState(77);
			match(Delimitador);
			setState(78);
			match(Var);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(79);
				match(T__3);
				setState(80);
				match(Tipo);
				setState(81);
				match(Delimitador);
				setState(82);
				match(Var);
				}
				}
				setState(87);
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
		enterRule(_localctx, 6, RULE_comando);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				expressao();
				setState(89);
				comando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
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
		public MostraissuContext mostraissu() {
			return getRuleContext(MostraissuContext.class,0);
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
		enterRule(_localctx, 8, RULE_expressao);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tipo:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				declaracaoVar();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				condicional();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				repeticao();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				atribuicao();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				mostraissu();
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
		public TerminalNode Delimitador() { return getToken(CmzmLangParser.Delimitador, 0); }
		public TerminalNode Var() { return getToken(CmzmLangParser.Var, 0); }
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_declaracaoVar);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(Tipo);
				setState(102);
				match(Delimitador);
				setState(103);
				match(Var);
				setState(104);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(Tipo);
				setState(106);
				match(Delimitador);
				setState(107);
				atribuicao();
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
		public List<TerminalNode> FechaChave() { return getTokens(CmzmLangParser.FechaChave); }
		public TerminalNode FechaChave(int i) {
			return getToken(CmzmLangParser.FechaChave, i);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
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
		enterRule(_localctx, 12, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__5);
			setState(111);
			match(AbrePar);
			setState(112);
			expressaoLogica();
			setState(113);
			match(FechaPar);
			setState(114);
			match(AbreChave);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				expressao();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16786240L) != 0) );
			setState(120);
			match(FechaChave);
			{
			setState(121);
			match(T__6);
			setState(122);
			match(AbreChave);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				expressao();
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16786240L) != 0) );
			setState(128);
			match(FechaChave);
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
		public TerminalNode FechaChave() { return getToken(CmzmLangParser.FechaChave, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
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
		enterRule(_localctx, 14, RULE_repeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(T__7);
			setState(131);
			match(AbrePar);
			setState(132);
			expressaoLogica();
			setState(133);
			match(FechaPar);
			setState(134);
			match(AbreChave);
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				expressao();
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16786240L) != 0) );
			setState(140);
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
		enterRule(_localctx, 16, RULE_expressaoLogica);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(Var);
				setState(143);
				match(OpRel);
				setState(144);
				match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				expressaoLogicaString();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				expressaoLogicaInt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
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
		enterRule(_localctx, 18, RULE_expressaoLogicaString);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(Var);
				setState(151);
				match(OpRel);
				setState(152);
				match(LString);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(LString);
				setState(154);
				match(OpRel);
				setState(155);
				match(Var);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(LString);
				setState(157);
				match(OpRel);
				setState(158);
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
		enterRule(_localctx, 20, RULE_expressaoLogicaInt);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(Var);
				setState(162);
				match(OpRel);
				setState(163);
				match(NInt);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(NInt);
				setState(165);
				match(OpRel);
				setState(166);
				match(Var);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(NInt);
				setState(168);
				match(OpRel);
				setState(169);
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
		enterRule(_localctx, 22, RULE_expressaoLogicaReal);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				match(Var);
				setState(173);
				match(OpRel);
				setState(174);
				match(NReal);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(NReal);
				setState(176);
				match(OpRel);
				setState(177);
				match(Var);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(NReal);
				setState(179);
				match(OpRel);
				setState(180);
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
		enterRule(_localctx, 24, RULE_atribuicao);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				atribuicaoString();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				atribuicaoInt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
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
		public ExpressaoAritStringContext expressaoAritString() {
			return getRuleContext(ExpressaoAritStringContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_atribuicaoString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(Var);
			setState(189);
			match(Atribuicao);
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(190);
				match(LString);
				}
				break;
			case 2:
				{
				setState(191);
				expressaoAritString(0);
				}
				break;
			}
			setState(194);
			match(T__4);
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
		enterRule(_localctx, 28, RULE_atribuicaoInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(Var);
			setState(197);
			match(Atribuicao);
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(198);
				match(NInt);
				}
				break;
			case 2:
				{
				setState(199);
				expressaoAritInt(0);
				}
				break;
			}
			setState(202);
			match(T__4);
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
		enterRule(_localctx, 30, RULE_atribuicaoReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(Var);
			setState(205);
			match(Atribuicao);
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(206);
				match(NReal);
				}
				break;
			case 2:
				{
				setState(207);
				expressaoAritReal(0);
				}
				break;
			}
			setState(210);
			match(T__4);
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
	public static class MostraissuContext extends ParserRuleContext {
		public TerminalNode AbrePar() { return getToken(CmzmLangParser.AbrePar, 0); }
		public TerminalNode FechaPar() { return getToken(CmzmLangParser.FechaPar, 0); }
		public List<TerminalNode> LString() { return getTokens(CmzmLangParser.LString); }
		public TerminalNode LString(int i) {
			return getToken(CmzmLangParser.LString, i);
		}
		public List<TerminalNode> Var() { return getTokens(CmzmLangParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(CmzmLangParser.Var, i);
		}
		public List<TerminalNode> WS() { return getTokens(CmzmLangParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CmzmLangParser.WS, i);
		}
		public List<TerminalNode> NInt() { return getTokens(CmzmLangParser.NInt); }
		public TerminalNode NInt(int i) {
			return getToken(CmzmLangParser.NInt, i);
		}
		public List<TerminalNode> NReal() { return getTokens(CmzmLangParser.NReal); }
		public TerminalNode NReal(int i) {
			return getToken(CmzmLangParser.NReal, i);
		}
		public MostraissuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostraissu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterMostraissu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitMostraissu(this);
		}
	}

	public final MostraissuContext mostraissu() throws RecognitionException {
		MostraissuContext _localctx = new MostraissuContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mostraissu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__8);
			setState(213);
			match(AbrePar);
			setState(215); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(214);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 251660288L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 251660288L) != 0) );
			setState(219);
			match(FechaPar);
			setState(220);
			match(T__4);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expressaoAritInt, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(223);
				match(NInt);
				setState(224);
				match(OpArit);
				setState(225);
				match(NInt);
				}
				break;
			case 2:
				{
				setState(226);
				match(Var);
				setState(227);
				match(OpArit);
				setState(228);
				match(NInt);
				}
				break;
			case 3:
				{
				setState(229);
				match(NInt);
				setState(230);
				match(OpArit);
				setState(231);
				match(Var);
				}
				break;
			case 4:
				{
				setState(232);
				match(Var);
				setState(233);
				match(OpArit);
				setState(234);
				match(Var);
				}
				break;
			case 5:
				{
				setState(235);
				match(Var);
				setState(236);
				match(OpArit);
				setState(237);
				expressaoAritInt(5);
				}
				break;
			case 6:
				{
				setState(238);
				match(NInt);
				setState(239);
				match(OpArit);
				setState(240);
				expressaoAritInt(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoAritIntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritInt);
						setState(243);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(244);
						match(OpArit);
						setState(245);
						expressaoAritInt(2);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoAritIntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritInt);
						setState(246);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(247);
						match(OpArit);
						setState(248);
						match(Var);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoAritIntContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritInt);
						setState(249);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(250);
						match(OpArit);
						setState(251);
						match(NInt);
						}
						break;
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expressaoAritReal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(258);
				match(NReal);
				setState(259);
				match(OpArit);
				setState(260);
				match(NReal);
				}
				break;
			case 2:
				{
				setState(261);
				match(Var);
				setState(262);
				match(OpArit);
				setState(263);
				match(NReal);
				}
				break;
			case 3:
				{
				setState(264);
				match(NReal);
				setState(265);
				match(OpArit);
				setState(266);
				match(Var);
				}
				break;
			case 4:
				{
				setState(267);
				match(Var);
				setState(268);
				match(OpArit);
				setState(269);
				match(Var);
				}
				break;
			case 5:
				{
				setState(270);
				match(Var);
				setState(271);
				match(OpArit);
				setState(272);
				expressaoAritReal(5);
				}
				break;
			case 6:
				{
				setState(273);
				match(NReal);
				setState(274);
				match(OpArit);
				setState(275);
				expressaoAritReal(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(287);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoAritRealContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritReal);
						setState(278);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(279);
						match(OpArit);
						setState(280);
						expressaoAritReal(2);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoAritRealContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritReal);
						setState(281);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(282);
						match(OpArit);
						setState(283);
						match(Var);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoAritRealContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritReal);
						setState(284);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(285);
						match(OpArit);
						setState(286);
						match(NReal);
						}
						break;
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class ExpressaoAritStringContext extends ParserRuleContext {
		public List<TerminalNode> LString() { return getTokens(CmzmLangParser.LString); }
		public TerminalNode LString(int i) {
			return getToken(CmzmLangParser.LString, i);
		}
		public List<TerminalNode> Var() { return getTokens(CmzmLangParser.Var); }
		public TerminalNode Var(int i) {
			return getToken(CmzmLangParser.Var, i);
		}
		public List<ExpressaoAritStringContext> expressaoAritString() {
			return getRuleContexts(ExpressaoAritStringContext.class);
		}
		public ExpressaoAritStringContext expressaoAritString(int i) {
			return getRuleContext(ExpressaoAritStringContext.class,i);
		}
		public ExpressaoAritStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).enterExpressaoAritString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmzmLangListener ) ((CmzmLangListener)listener).exitExpressaoAritString(this);
		}
	}

	public final ExpressaoAritStringContext expressaoAritString() throws RecognitionException {
		return expressaoAritString(0);
	}

	private ExpressaoAritStringContext expressaoAritString(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAritStringContext _localctx = new ExpressaoAritStringContext(_ctx, _parentState);
		ExpressaoAritStringContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expressaoAritString, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(293);
				match(LString);
				setState(294);
				match(T__9);
				setState(295);
				match(LString);
				}
				break;
			case 2:
				{
				setState(296);
				match(Var);
				setState(297);
				match(T__9);
				setState(298);
				match(LString);
				}
				break;
			case 3:
				{
				setState(299);
				match(LString);
				setState(300);
				match(T__9);
				setState(301);
				match(Var);
				}
				break;
			case 4:
				{
				setState(302);
				match(Var);
				setState(303);
				match(T__9);
				setState(304);
				match(Var);
				}
				break;
			case 5:
				{
				setState(305);
				match(Var);
				setState(306);
				match(T__9);
				setState(307);
				expressaoAritString(5);
				}
				break;
			case 6:
				{
				setState(308);
				match(LString);
				setState(309);
				match(T__9);
				setState(310);
				expressaoAritString(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(322);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressaoAritStringContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritString);
						setState(313);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(314);
						match(T__9);
						setState(315);
						expressaoAritString(2);
						}
						break;
					case 2:
						{
						_localctx = new ExpressaoAritStringContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritString);
						setState(316);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(317);
						match(T__9);
						setState(318);
						match(Var);
						}
						break;
					case 3:
						{
						_localctx = new ExpressaoAritStringContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritString);
						setState(319);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(320);
						match(T__9);
						setState(321);
						match(LString);
						}
						break;
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		case 17:
			return expressaoAritInt_sempred((ExpressaoAritIntContext)_localctx, predIndex);
		case 18:
			return expressaoAritReal_sempred((ExpressaoAritRealContext)_localctx, predIndex);
		case 19:
			return expressaoAritString_sempred((ExpressaoAritStringContext)_localctx, predIndex);
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
	private boolean expressaoAritString_sempred(ExpressaoAritStringContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u0148\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000-\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u00002\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001?\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001D\b\u0001"+
		"\n\u0001\f\u0001G\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002T\b\u0002\n\u0002\f\u0002W\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003]\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004d\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005m\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006u\b\u0006\u000b\u0006"+
		"\f\u0006v\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0004\u0006"+
		"}\b\u0006\u000b\u0006\f\u0006~\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u0089"+
		"\b\u0007\u000b\u0007\f\u0007\u008a\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0095\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a0\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00ab\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b6\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u00bb\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00c1\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00c9\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00d1\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00d8\b\u0010"+
		"\u000b\u0010\f\u0010\u00d9\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00f2\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00fd\b\u0011\n\u0011\f\u0011\u0100\t\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0115"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0120\b\u0012\n"+
		"\u0012\f\u0012\u0123\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0138\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0143\b\u0013\n\u0013\f\u0013"+
		"\u0146\t\u0013\u0001\u0013\u0000\u0003\"$&\u0014\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000"+
		"\u0001\u0002\u0000\u000b\u000b\u0018\u001b\u0168\u0000(\u0001\u0000\u0000"+
		"\u0000\u00028\u0001\u0000\u0000\u0000\u0004L\u0001\u0000\u0000\u0000\u0006"+
		"\\\u0001\u0000\u0000\u0000\bc\u0001\u0000\u0000\u0000\nl\u0001\u0000\u0000"+
		"\u0000\fn\u0001\u0000\u0000\u0000\u000e\u0082\u0001\u0000\u0000\u0000"+
		"\u0010\u0094\u0001\u0000\u0000\u0000\u0012\u009f\u0001\u0000\u0000\u0000"+
		"\u0014\u00aa\u0001\u0000\u0000\u0000\u0016\u00b5\u0001\u0000\u0000\u0000"+
		"\u0018\u00ba\u0001\u0000\u0000\u0000\u001a\u00bc\u0001\u0000\u0000\u0000"+
		"\u001c\u00c4\u0001\u0000\u0000\u0000\u001e\u00cc\u0001\u0000\u0000\u0000"+
		" \u00d4\u0001\u0000\u0000\u0000\"\u00f1\u0001\u0000\u0000\u0000$\u0114"+
		"\u0001\u0000\u0000\u0000&\u0137\u0001\u0000\u0000\u0000()\u0005\u0001"+
		"\u0000\u0000)*\u0005\u0002\u0000\u0000*,\u0005\u0013\u0000\u0000+-\u0003"+
		"\u0004\u0002\u0000,+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000"+
		"-.\u0001\u0000\u0000\u0000./\u0005\u0014\u0000\u0000/3\u0005\u0011\u0000"+
		"\u000002\u0003\u0006\u0003\u000010\u0001\u0000\u0000\u000025\u0001\u0000"+
		"\u0000\u000031\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000067\u0005\u0012\u0000\u0000"+
		"7\u0001\u0001\u0000\u0000\u000089\u0005\u0001\u0000\u00009:\u0005\r\u0000"+
		"\u0000:;\u0005\u001d\u0000\u0000;<\u0005\u0018\u0000\u0000<>\u0005\u0013"+
		"\u0000\u0000=?\u0003\u0004\u0002\u0000>=\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0005\u0014\u0000\u0000"+
		"AE\u0005\u0011\u0000\u0000BD\u0003\u0006\u0003\u0000CB\u0001\u0000\u0000"+
		"\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005"+
		"\u0003\u0000\u0000IJ\u0003\b\u0004\u0000JK\u0005\u0012\u0000\u0000K\u0003"+
		"\u0001\u0000\u0000\u0000LM\u0005\r\u0000\u0000MN\u0005\u001d\u0000\u0000"+
		"NU\u0005\u0018\u0000\u0000OP\u0005\u0004\u0000\u0000PQ\u0005\r\u0000\u0000"+
		"QR\u0005\u001d\u0000\u0000RT\u0005\u0018\u0000\u0000SO\u0001\u0000\u0000"+
		"\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000V\u0005\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000"+
		"XY\u0003\b\u0004\u0000YZ\u0003\u0006\u0003\u0000Z]\u0001\u0000\u0000\u0000"+
		"[]\u0003\b\u0004\u0000\\X\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]\u0007\u0001\u0000\u0000\u0000^d\u0003\n\u0005\u0000_d\u0003\f"+
		"\u0006\u0000`d\u0003\u000e\u0007\u0000ad\u0003\u0018\f\u0000bd\u0003 "+
		"\u0010\u0000c^\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000c`\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"d\t\u0001\u0000\u0000\u0000ef\u0005\r\u0000\u0000fg\u0005\u001d\u0000"+
		"\u0000gh\u0005\u0018\u0000\u0000hm\u0005\u0005\u0000\u0000ij\u0005\r\u0000"+
		"\u0000jk\u0005\u001d\u0000\u0000km\u0003\u0018\f\u0000le\u0001\u0000\u0000"+
		"\u0000li\u0001\u0000\u0000\u0000m\u000b\u0001\u0000\u0000\u0000no\u0005"+
		"\u0006\u0000\u0000op\u0005\u0013\u0000\u0000pq\u0003\u0010\b\u0000qr\u0005"+
		"\u0014\u0000\u0000rt\u0005\u0011\u0000\u0000su\u0003\b\u0004\u0000ts\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u0012\u0000"+
		"\u0000yz\u0005\u0007\u0000\u0000z|\u0005\u0011\u0000\u0000{}\u0003\b\u0004"+
		"\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u0012\u0000\u0000\u0081\r\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005\b\u0000\u0000\u0083\u0084\u0005\u0013\u0000\u0000\u0084"+
		"\u0085\u0003\u0010\b\u0000\u0085\u0086\u0005\u0014\u0000\u0000\u0086\u0088"+
		"\u0005\u0011\u0000\u0000\u0087\u0089\u0003\b\u0004\u0000\u0088\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0005\u0012\u0000\u0000\u008d\u000f\u0001"+
		"\u0000\u0000\u0000\u008e\u008f\u0005\u0018\u0000\u0000\u008f\u0090\u0005"+
		"\u0010\u0000\u0000\u0090\u0095\u0005\u0018\u0000\u0000\u0091\u0095\u0003"+
		"\u0012\t\u0000\u0092\u0095\u0003\u0014\n\u0000\u0093\u0095\u0003\u0016"+
		"\u000b\u0000\u0094\u008e\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0011\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0018"+
		"\u0000\u0000\u0097\u0098\u0005\u0010\u0000\u0000\u0098\u00a0\u0005\u001b"+
		"\u0000\u0000\u0099\u009a\u0005\u001b\u0000\u0000\u009a\u009b\u0005\u0010"+
		"\u0000\u0000\u009b\u00a0\u0005\u0018\u0000\u0000\u009c\u009d\u0005\u001b"+
		"\u0000\u0000\u009d\u009e\u0005\u0010\u0000\u0000\u009e\u00a0\u0005\u001b"+
		"\u0000\u0000\u009f\u0096\u0001\u0000\u0000\u0000\u009f\u0099\u0001\u0000"+
		"\u0000\u0000\u009f\u009c\u0001\u0000\u0000\u0000\u00a0\u0013\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0005\u0018\u0000\u0000\u00a2\u00a3\u0005\u0010"+
		"\u0000\u0000\u00a3\u00ab\u0005\u0019\u0000\u0000\u00a4\u00a5\u0005\u0019"+
		"\u0000\u0000\u00a5\u00a6\u0005\u0010\u0000\u0000\u00a6\u00ab\u0005\u0018"+
		"\u0000\u0000\u00a7\u00a8\u0005\u0019\u0000\u0000\u00a8\u00a9\u0005\u0010"+
		"\u0000\u0000\u00a9\u00ab\u0005\u0019\u0000\u0000\u00aa\u00a1\u0001\u0000"+
		"\u0000\u0000\u00aa\u00a4\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ab\u0015\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0018"+
		"\u0000\u0000\u00ad\u00ae\u0005\u0010\u0000\u0000\u00ae\u00b6\u0005\u001a"+
		"\u0000\u0000\u00af\u00b0\u0005\u001a\u0000\u0000\u00b0\u00b1\u0005\u0010"+
		"\u0000\u0000\u00b1\u00b6\u0005\u0018\u0000\u0000\u00b2\u00b3\u0005\u001a"+
		"\u0000\u0000\u00b3\u00b4\u0005\u0010\u0000\u0000\u00b4\u00b6\u0005\u001a"+
		"\u0000\u0000\u00b5\u00ac\u0001\u0000\u0000\u0000\u00b5\u00af\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b6\u0017\u0001\u0000"+
		"\u0000\u0000\u00b7\u00bb\u0003\u001a\r\u0000\u00b8\u00bb\u0003\u001c\u000e"+
		"\u0000\u00b9\u00bb\u0003\u001e\u000f\u0000\u00ba\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u0019\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0018\u0000"+
		"\u0000\u00bd\u00c0\u0005\u000f\u0000\u0000\u00be\u00c1\u0005\u001b\u0000"+
		"\u0000\u00bf\u00c1\u0003&\u0013\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0005\u0000\u0000\u00c3\u001b\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0005\u0018\u0000\u0000\u00c5\u00c8\u0005\u000f\u0000\u0000"+
		"\u00c6\u00c9\u0005\u0019\u0000\u0000\u00c7\u00c9\u0003\"\u0011\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0005\u0000\u0000\u00cb"+
		"\u001d\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005\u0018\u0000\u0000\u00cd"+
		"\u00d0\u0005\u000f\u0000\u0000\u00ce\u00d1\u0005\u001a\u0000\u0000\u00cf"+
		"\u00d1\u0003$\u0012\u0000\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0005\u0005\u0000\u0000\u00d3\u001f\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0005\t\u0000\u0000\u00d5\u00d7\u0005\u0013\u0000\u0000\u00d6\u00d8\u0007"+
		"\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001"+
		"\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001"+
		"\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0005"+
		"\u0014\u0000\u0000\u00dc\u00dd\u0005\u0005\u0000\u0000\u00dd!\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0006\u0011\uffff\uffff\u0000\u00df\u00e0\u0005"+
		"\u0019\u0000\u0000\u00e0\u00e1\u0005\u000e\u0000\u0000\u00e1\u00f2\u0005"+
		"\u0019\u0000\u0000\u00e2\u00e3\u0005\u0018\u0000\u0000\u00e3\u00e4\u0005"+
		"\u000e\u0000\u0000\u00e4\u00f2\u0005\u0019\u0000\u0000\u00e5\u00e6\u0005"+
		"\u0019\u0000\u0000\u00e6\u00e7\u0005\u000e\u0000\u0000\u00e7\u00f2\u0005"+
		"\u0018\u0000\u0000\u00e8\u00e9\u0005\u0018\u0000\u0000\u00e9\u00ea\u0005"+
		"\u000e\u0000\u0000\u00ea\u00f2\u0005\u0018\u0000\u0000\u00eb\u00ec\u0005"+
		"\u0018\u0000\u0000\u00ec\u00ed\u0005\u000e\u0000\u0000\u00ed\u00f2\u0003"+
		"\"\u0011\u0005\u00ee\u00ef\u0005\u0019\u0000\u0000\u00ef\u00f0\u0005\u000e"+
		"\u0000\u0000\u00f0\u00f2\u0003\"\u0011\u0004\u00f1\u00de\u0001\u0000\u0000"+
		"\u0000\u00f1\u00e2\u0001\u0000\u0000\u0000\u00f1\u00e5\u0001\u0000\u0000"+
		"\u0000\u00f1\u00e8\u0001\u0000\u0000\u0000\u00f1\u00eb\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ee\u0001\u0000\u0000\u0000\u00f2\u00fe\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\n\u0001\u0000\u0000\u00f4\u00f5\u0005\u000e\u0000\u0000"+
		"\u00f5\u00fd\u0003\"\u0011\u0002\u00f6\u00f7\n\u0003\u0000\u0000\u00f7"+
		"\u00f8\u0005\u000e\u0000\u0000\u00f8\u00fd\u0005\u0018\u0000\u0000\u00f9"+
		"\u00fa\n\u0002\u0000\u0000\u00fa\u00fb\u0005\u000e\u0000\u0000\u00fb\u00fd"+
		"\u0005\u0019\u0000\u0000\u00fc\u00f3\u0001\u0000\u0000\u0000\u00fc\u00f6"+
		"\u0001\u0000\u0000\u0000\u00fc\u00f9\u0001\u0000\u0000\u0000\u00fd\u0100"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0001\u0000\u0000\u0000\u00ff#\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0006\u0012\uffff\uffff\u0000\u0102\u0103"+
		"\u0005\u001a\u0000\u0000\u0103\u0104\u0005\u000e\u0000\u0000\u0104\u0115"+
		"\u0005\u001a\u0000\u0000\u0105\u0106\u0005\u0018\u0000\u0000\u0106\u0107"+
		"\u0005\u000e\u0000\u0000\u0107\u0115\u0005\u001a\u0000\u0000\u0108\u0109"+
		"\u0005\u001a\u0000\u0000\u0109\u010a\u0005\u000e\u0000\u0000\u010a\u0115"+
		"\u0005\u0018\u0000\u0000\u010b\u010c\u0005\u0018\u0000\u0000\u010c\u010d"+
		"\u0005\u000e\u0000\u0000\u010d\u0115\u0005\u0018\u0000\u0000\u010e\u010f"+
		"\u0005\u0018\u0000\u0000\u010f\u0110\u0005\u000e\u0000\u0000\u0110\u0115"+
		"\u0003$\u0012\u0005\u0111\u0112\u0005\u001a\u0000\u0000\u0112\u0113\u0005"+
		"\u000e\u0000\u0000\u0113\u0115\u0003$\u0012\u0004\u0114\u0101\u0001\u0000"+
		"\u0000\u0000\u0114\u0105\u0001\u0000\u0000\u0000\u0114\u0108\u0001\u0000"+
		"\u0000\u0000\u0114\u010b\u0001\u0000\u0000\u0000\u0114\u010e\u0001\u0000"+
		"\u0000\u0000\u0114\u0111\u0001\u0000\u0000\u0000\u0115\u0121\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\n\u0001\u0000\u0000\u0117\u0118\u0005\u000e\u0000"+
		"\u0000\u0118\u0120\u0003$\u0012\u0002\u0119\u011a\n\u0003\u0000\u0000"+
		"\u011a\u011b\u0005\u000e\u0000\u0000\u011b\u0120\u0005\u0018\u0000\u0000"+
		"\u011c\u011d\n\u0002\u0000\u0000\u011d\u011e\u0005\u000e\u0000\u0000\u011e"+
		"\u0120\u0005\u001a\u0000\u0000\u011f\u0116\u0001\u0000\u0000\u0000\u011f"+
		"\u0119\u0001\u0000\u0000\u0000\u011f\u011c\u0001\u0000\u0000\u0000\u0120"+
		"\u0123\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0001\u0000\u0000\u0000\u0122%\u0001\u0000\u0000\u0000\u0123\u0121"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0006\u0013\uffff\uffff\u0000\u0125"+
		"\u0126\u0005\u001b\u0000\u0000\u0126\u0127\u0005\n\u0000\u0000\u0127\u0138"+
		"\u0005\u001b\u0000\u0000\u0128\u0129\u0005\u0018\u0000\u0000\u0129\u012a"+
		"\u0005\n\u0000\u0000\u012a\u0138\u0005\u001b\u0000\u0000\u012b\u012c\u0005"+
		"\u001b\u0000\u0000\u012c\u012d\u0005\n\u0000\u0000\u012d\u0138\u0005\u0018"+
		"\u0000\u0000\u012e\u012f\u0005\u0018\u0000\u0000\u012f\u0130\u0005\n\u0000"+
		"\u0000\u0130\u0138\u0005\u0018\u0000\u0000\u0131\u0132\u0005\u0018\u0000"+
		"\u0000\u0132\u0133\u0005\n\u0000\u0000\u0133\u0138\u0003&\u0013\u0005"+
		"\u0134\u0135\u0005\u001b\u0000\u0000\u0135\u0136\u0005\n\u0000\u0000\u0136"+
		"\u0138\u0003&\u0013\u0004\u0137\u0124\u0001\u0000\u0000\u0000\u0137\u0128"+
		"\u0001\u0000\u0000\u0000\u0137\u012b\u0001\u0000\u0000\u0000\u0137\u012e"+
		"\u0001\u0000\u0000\u0000\u0137\u0131\u0001\u0000\u0000\u0000\u0137\u0134"+
		"\u0001\u0000\u0000\u0000\u0138\u0144\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\n\u0001\u0000\u0000\u013a\u013b\u0005\n\u0000\u0000\u013b\u0143\u0003"+
		"&\u0013\u0002\u013c\u013d\n\u0003\u0000\u0000\u013d\u013e\u0005\n\u0000"+
		"\u0000\u013e\u0143\u0005\u0018\u0000\u0000\u013f\u0140\n\u0002\u0000\u0000"+
		"\u0140\u0141\u0005\n\u0000\u0000\u0141\u0143\u0005\u001b\u0000\u0000\u0142"+
		"\u0139\u0001\u0000\u0000\u0000\u0142\u013c\u0001\u0000\u0000\u0000\u0142"+
		"\u013f\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000\u0144"+
		"\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145"+
		"\'\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u001d,"+
		"3>EU\\clv~\u008a\u0094\u009f\u00aa\u00b5\u00ba\u00c0\u00c8\u00d0\u00d9"+
		"\u00f1\u00fc\u00fe\u0114\u011f\u0121\u0137\u0142\u0144";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}