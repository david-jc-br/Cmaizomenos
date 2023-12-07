// Generated from CmzmLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CmzmLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WS=11, PalavraChave=12, Tipo=13, OpArit=14, Atribuicao=15, OpRel=16, 
		AbreChave=17, FechaChave=18, AbrePar=19, FechaPar=20, Comentario=21, OpBoolE=22, 
		OpBoolOu=23, Var=24, NInt=25, NReal=26, LString=27, ErrorChar=28, Delimitador=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "DIGITO", "LETRA", "ALFANUM", "WS", "PalavraChave", "Tipo", "OpArit", 
			"Atribuicao", "OpRel", "AbreChave", "FechaChave", "AbrePar", "FechaPar", 
			"Comentario", "OpBoolE", "OpBoolOu", "Var", "NInt", "NReal", "LString", 
			"ErrorChar", "Delimitador"
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


	public CmzmLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CmzmLang.g4"; }

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
		"\u0004\u0000\u001d\u010f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0004\ry\b"+
		"\r\u000b\r\f\rz\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a9\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00bc\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00cb\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00d9\b\u0017\n\u0017\f\u0017"+
		"\u00dc\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u00eb\b\u001a\n\u001a\f\u001a\u00ee"+
		"\t\u001a\u0001\u001b\u0004\u001b\u00f1\b\u001b\u000b\u001b\f\u001b\u00f2"+
		"\u0001\u001c\u0004\u001c\u00f6\b\u001c\u000b\u001c\f\u001c\u00f7\u0001"+
		"\u001c\u0001\u001c\u0004\u001c\u00fc\b\u001c\u000b\u001c\f\u001c\u00fd"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0104\b\u001d"+
		"\n\u001d\f\u001d\u0107\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u00da\u0000 \u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u0000\u0017\u0000\u0019\u0000\u001b\u000b\u001d"+
		"\f\u001f\r!\u000e#\u000f%\u0010\'\u0011)\u0012+\u0013-\u0014/\u00151\u0016"+
		"3\u00175\u00187\u00199\u001a;\u001b=\u001c?\u001d\u0001\u0000\u0007\u0001"+
		"\u000009\u0002\u0000AZaz\u0003\u000009AZaz\u0003\u0000\t\n\r\r  \u0003"+
		"\u0000*+--//\u0002\u0000<<>>\u0004\u0000 !#&@@~~\u0123\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0001"+
		"A\u0001\u0000\u0000\u0000\u0003F\u0001\u0000\u0000\u0000\u0005L\u0001"+
		"\u0000\u0000\u0000\u0007R\u0001\u0000\u0000\u0000\tT\u0001\u0000\u0000"+
		"\u0000\u000bV\u0001\u0000\u0000\u0000\rY\u0001\u0000\u0000\u0000\u000f"+
		"`\u0001\u0000\u0000\u0000\u0011d\u0001\u0000\u0000\u0000\u0013o\u0001"+
		"\u0000\u0000\u0000\u0015q\u0001\u0000\u0000\u0000\u0017s\u0001\u0000\u0000"+
		"\u0000\u0019u\u0001\u0000\u0000\u0000\u001bx\u0001\u0000\u0000\u0000\u001d"+
		"\u00a8\u0001\u0000\u0000\u0000\u001f\u00bb\u0001\u0000\u0000\u0000!\u00bd"+
		"\u0001\u0000\u0000\u0000#\u00bf\u0001\u0000\u0000\u0000%\u00ca\u0001\u0000"+
		"\u0000\u0000\'\u00cc\u0001\u0000\u0000\u0000)\u00ce\u0001\u0000\u0000"+
		"\u0000+\u00d0\u0001\u0000\u0000\u0000-\u00d2\u0001\u0000\u0000\u0000/"+
		"\u00d4\u0001\u0000\u0000\u00001\u00e2\u0001\u0000\u0000\u00003\u00e5\u0001"+
		"\u0000\u0000\u00005\u00e8\u0001\u0000\u0000\u00007\u00f0\u0001\u0000\u0000"+
		"\u00009\u00f5\u0001\u0000\u0000\u0000;\u00ff\u0001\u0000\u0000\u0000="+
		"\u010a\u0001\u0000\u0000\u0000?\u010c\u0001\u0000\u0000\u0000AB\u0005"+
		"t\u0000\u0000BC\u0005r\u0000\u0000CD\u0005e\u0000\u0000DE\u0005m\u0000"+
		"\u0000E\u0002\u0001\u0000\u0000\u0000FG\u0005v\u0000\u0000GH\u0005a\u0000"+
		"\u0000HI\u0005z\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005o\u0000\u0000"+
		"K\u0004\u0001\u0000\u0000\u0000LM\u0005v\u0000\u0000MN\u0005o\u0000\u0000"+
		"NO\u0005r\u0000\u0000OP\u0005t\u0000\u0000PQ\u0005a\u0000\u0000Q\u0006"+
		"\u0001\u0000\u0000\u0000RS\u0005,\u0000\u0000S\b\u0001\u0000\u0000\u0000"+
		"TU\u0005;\u0000\u0000U\n\u0001\u0000\u0000\u0000VW\u0005s\u0000\u0000"+
		"WX\u0005i\u0000\u0000X\f\u0001\u0000\u0000\u0000YZ\u0005s\u0000\u0000"+
		"Z[\u0005i\u0000\u0000[\\\u0005n\u0000\u0000\\]\u0005a\u0000\u0000]^\u0005"+
		"u\u0000\u0000^_\u0005m\u0000\u0000_\u000e\u0001\u0000\u0000\u0000`a\u0005"+
		"u\u0000\u0000ab\u0005a\u0000\u0000bc\u0005i\u0000\u0000c\u0010\u0001\u0000"+
		"\u0000\u0000de\u0005m\u0000\u0000ef\u0005o\u0000\u0000fg\u0005s\u0000"+
		"\u0000gh\u0005t\u0000\u0000hi\u0005r\u0000\u0000ij\u0005a\u0000\u0000"+
		"jk\u0005i\u0000\u0000kl\u0005s\u0000\u0000lm\u0005s\u0000\u0000mn\u0005"+
		"u\u0000\u0000n\u0012\u0001\u0000\u0000\u0000op\u0005+\u0000\u0000p\u0014"+
		"\u0001\u0000\u0000\u0000qr\u0007\u0000\u0000\u0000r\u0016\u0001\u0000"+
		"\u0000\u0000st\u0007\u0001\u0000\u0000t\u0018\u0001\u0000\u0000\u0000"+
		"uv\u0007\u0002\u0000\u0000v\u001a\u0001\u0000\u0000\u0000wy\u0007\u0003"+
		"\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|}\u0006\r\u0000\u0000}\u001c\u0001\u0000\u0000\u0000~\u007f\u0005s\u0000"+
		"\u0000\u007f\u00a9\u0005i\u0000\u0000\u0080\u0081\u0005s\u0000\u0000\u0081"+
		"\u0082\u0005i\u0000\u0000\u0082\u0083\u0005n\u0000\u0000\u0083\u0084\u0005"+
		"a\u0000\u0000\u0084\u0085\u0005u\u0000\u0000\u0085\u00a9\u0005m\u0000"+
		"\u0000\u0086\u0087\u0005u\u0000\u0000\u0087\u0088\u0005a\u0000\u0000\u0088"+
		"\u00a9\u0005i\u0000\u0000\u0089\u008a\u0005t\u0000\u0000\u008a\u008b\u0005"+
		"r\u0000\u0000\u008b\u008c\u0005e\u0000\u0000\u008c\u00a9\u0005m\u0000"+
		"\u0000\u008d\u008e\u0005v\u0000\u0000\u008e\u008f\u0005a\u0000\u0000\u008f"+
		"\u0090\u0005z\u0000\u0000\u0090\u0091\u0005i\u0000\u0000\u0091\u00a9\u0005"+
		"o\u0000\u0000\u0092\u0093\u0005v\u0000\u0000\u0093\u0094\u0005o\u0000"+
		"\u0000\u0094\u0095\u0005r\u0000\u0000\u0095\u0096\u0005t\u0000\u0000\u0096"+
		"\u00a9\u0005a\u0000\u0000\u0097\u0098\u0005m\u0000\u0000\u0098\u0099\u0005"+
		"o\u0000\u0000\u0099\u009a\u0005s\u0000\u0000\u009a\u009b\u0005t\u0000"+
		"\u0000\u009b\u009c\u0005r\u0000\u0000\u009c\u009d\u0005a\u0000\u0000\u009d"+
		"\u009e\u0005i\u0000\u0000\u009e\u009f\u0005s\u0000\u0000\u009f\u00a0\u0005"+
		"s\u0000\u0000\u00a0\u00a9\u0005u\u0000\u0000\u00a1\u00a2\u0005l\u0000"+
		"\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a3\u00a4\u0005i\u0000\u0000\u00a4"+
		"\u00a5\u0005s\u0000\u0000\u00a5\u00a6\u0005s\u0000\u0000\u00a6\u00a9\u0005"+
		"u\u0000\u0000\u00a7\u00a9\u0005;\u0000\u0000\u00a8~\u0001\u0000\u0000"+
		"\u0000\u00a8\u0080\u0001\u0000\u0000\u0000\u00a8\u0086\u0001\u0000\u0000"+
		"\u0000\u00a8\u0089\u0001\u0000\u0000\u0000\u00a8\u008d\u0001\u0000\u0000"+
		"\u0000\u00a8\u0092\u0001\u0000\u0000\u0000\u00a8\u0097\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a1\u0001\u0000\u0000\u0000\u00a8\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u001e\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005I\u0000\u0000"+
		"\u00ab\u00ac\u0005n\u0000\u0000\u00ac\u00bc\u0005t\u0000\u0000\u00ad\u00ae"+
		"\u0005R\u0000\u0000\u00ae\u00af\u0005e\u0000\u0000\u00af\u00b0\u0005a"+
		"\u0000\u0000\u00b0\u00bc\u0005l\u0000\u0000\u00b1\u00b2\u0005B\u0000\u0000"+
		"\u00b2\u00b3\u0005o\u0000\u0000\u00b3\u00b4\u0005o\u0000\u0000\u00b4\u00bc"+
		"\u0005l\u0000\u0000\u00b5\u00b6\u0005S\u0000\u0000\u00b6\u00b7\u0005t"+
		"\u0000\u0000\u00b7\u00b8\u0005r\u0000\u0000\u00b8\u00b9\u0005i\u0000\u0000"+
		"\u00b9\u00ba\u0005n\u0000\u0000\u00ba\u00bc\u0005g\u0000\u0000\u00bb\u00aa"+
		"\u0001\u0000\u0000\u0000\u00bb\u00ad\u0001\u0000\u0000\u0000\u00bb\u00b1"+
		"\u0001\u0000\u0000\u0000\u00bb\u00b5\u0001\u0000\u0000\u0000\u00bc \u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0007\u0004\u0000\u0000\u00be\"\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005=\u0000\u0000\u00c0$\u0001\u0000\u0000\u0000"+
		"\u00c1\u00cb\u0007\u0005\u0000\u0000\u00c2\u00c3\u0005>\u0000\u0000\u00c3"+
		"\u00cb\u0005=\u0000\u0000\u00c4\u00c5\u0005<\u0000\u0000\u00c5\u00cb\u0005"+
		"=\u0000\u0000\u00c6\u00c7\u0005=\u0000\u0000\u00c7\u00cb\u0005=\u0000"+
		"\u0000\u00c8\u00c9\u0005!\u0000\u0000\u00c9\u00cb\u0005=\u0000\u0000\u00ca"+
		"\u00c1\u0001\u0000\u0000\u0000\u00ca\u00c2\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c4\u0001\u0000\u0000\u0000\u00ca\u00c6\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c8\u0001\u0000\u0000\u0000\u00cb&\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0005{\u0000\u0000\u00cd(\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005}"+
		"\u0000\u0000\u00cf*\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005(\u0000\u0000"+
		"\u00d1,\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005)\u0000\u0000\u00d3."+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005/\u0000\u0000\u00d5\u00d6\u0005"+
		"*\u0000\u0000\u00d6\u00da\u0001\u0000\u0000\u0000\u00d7\u00d9\t\u0000"+
		"\u0000\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000"+
		"\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0005*\u0000\u0000\u00de\u00df\u0005/\u0000\u0000"+
		"\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0006\u0017\u0000\u0000"+
		"\u00e10\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005&\u0000\u0000\u00e3\u00e4"+
		"\u0005&\u0000\u0000\u00e42\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005|"+
		"\u0000\u0000\u00e6\u00e7\u0005|\u0000\u0000\u00e74\u0001\u0000\u0000\u0000"+
		"\u00e8\u00ec\u0003\u0017\u000b\u0000\u00e9\u00eb\u0003\u0019\f\u0000\u00ea"+
		"\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed"+
		"6\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef\u00f1"+
		"\u0003\u0015\n\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f38\u0001\u0000\u0000\u0000\u00f4\u00f6\u0003\u0015"+
		"\n\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fb\u0005.\u0000\u0000"+
		"\u00fa\u00fc\u0003\u0015\n\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fe:\u0001\u0000\u0000\u0000\u00ff\u0105"+
		"\u0005\"\u0000\u0000\u0100\u0104\u0003\u0017\u000b\u0000\u0101\u0104\u0003"+
		"\u0015\n\u0000\u0102\u0104\u0007\u0006\u0000\u0000\u0103\u0100\u0001\u0000"+
		"\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0108\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u0005\"\u0000"+
		"\u0000\u0109<\u0001\u0000\u0000\u0000\u010a\u010b\t\u0000\u0000\u0000"+
		"\u010b>\u0001\u0000\u0000\u0000\u010c\u010d\u0005:\u0000\u0000\u010d\u010e"+
		"\u0005:\u0000\u0000\u010e@\u0001\u0000\u0000\u0000\f\u0000z\u00a8\u00bb"+
		"\u00ca\u00da\u00ec\u00f2\u00f7\u00fd\u0103\u0105\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}