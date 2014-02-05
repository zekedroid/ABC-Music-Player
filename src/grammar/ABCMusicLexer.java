// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, NEWLINE=2, INDEX=3, TITLE=4, COMPOSER=5, LENGTH=6, METER=7, 
		TEMPO=8, VOICE=9, KEY=10, LYRIC=11, COMMENT=12, NOTE=13, REST=14, DUPLET=15, 
		TRIPLET=16, QUAD=17, PIPE=18, LBRAC=19, RBRAC=20, LREPEAT=21, RREPEAT=22, 
		ONE_REPEAT=23, TWO_REPEAT=24, END_NOTES=25;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"WHITESPACE", "NEWLINE", "INDEX", "TITLE", "COMPOSER", "LENGTH", "METER", 
		"TEMPO", "VOICE", "KEY", "LYRIC", "COMMENT", "NOTE", "REST", "DUPLET", 
		"TRIPLET", "QUAD", "PIPE", "'['", "']'", "LREPEAT", "RREPEAT", "'[1'", 
		"'[2'", "END_NOTES"
	};
	public static final String[] ruleNames = {
		"WHITESPACE", "NEWLINE", "INDEX", "TITLE", "COMPOSER", "LENGTH", "METER", 
		"TEMPO", "VOICE", "KEY", "LYRIC", "COMMENT", "NOTE", "REST", "DUPLET", 
		"TRIPLET", "QUAD", "PIPE", "LBRAC", "RBRAC", "LREPEAT", "RREPEAT", "ONE_REPEAT", 
		"TWO_REPEAT", "END_NOTES"
	};


	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        removeErrorListeners();
	        addErrorListener(new ExceptionThrowingErrorListener());
	    }

	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public ABCMusicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\33\u01c0\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\3\2\6\2\67\n\2\r\2\16\28\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\7\4C\n\4\f\4\16\4F\13\4\3\4\6\4I\n\4\r\4\16\4J"+
		"\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\4\6\4T\n\4\r\4\16\4U\3\5\3\5\3\5\3\5\7"+
		"\5\\\n\5\f\5\16\5_\13\5\3\5\6\5b\n\5\r\5\16\5c\3\5\7\5g\n\5\f\5\16\5j"+
		"\13\5\3\5\6\5m\n\5\r\5\16\5n\3\6\3\6\3\6\3\6\7\6u\n\6\f\6\16\6x\13\6\3"+
		"\6\6\6{\n\6\r\6\16\6|\3\6\7\6\u0080\n\6\f\6\16\6\u0083\13\6\3\6\6\6\u0086"+
		"\n\6\r\6\16\6\u0087\3\7\3\7\3\7\3\7\7\7\u008e\n\7\f\7\16\7\u0091\13\7"+
		"\3\7\6\7\u0094\n\7\r\7\16\7\u0095\3\7\3\7\6\7\u009a\n\7\r\7\16\7\u009b"+
		"\3\7\7\7\u009f\n\7\f\7\16\7\u00a2\13\7\3\7\6\7\u00a5\n\7\r\7\16\7\u00a6"+
		"\3\b\3\b\3\b\3\b\7\b\u00ad\n\b\f\b\16\b\u00b0\13\b\3\b\3\b\3\b\3\b\6\b"+
		"\u00b6\n\b\r\b\16\b\u00b7\3\b\3\b\6\b\u00bc\n\b\r\b\16\b\u00bd\5\b\u00c0"+
		"\n\b\3\b\7\b\u00c3\n\b\f\b\16\b\u00c6\13\b\3\b\6\b\u00c9\n\b\r\b\16\b"+
		"\u00ca\3\t\3\t\3\t\3\t\7\t\u00d1\n\t\f\t\16\t\u00d4\13\t\3\t\6\t\u00d7"+
		"\n\t\r\t\16\t\u00d8\3\t\3\t\6\t\u00dd\n\t\r\t\16\t\u00de\3\t\7\t\u00e2"+
		"\n\t\f\t\16\t\u00e5\13\t\3\t\5\t\u00e8\n\t\3\t\7\t\u00eb\n\t\f\t\16\t"+
		"\u00ee\13\t\3\t\6\t\u00f1\n\t\r\t\16\t\u00f2\3\t\7\t\u00f6\n\t\f\t\16"+
		"\t\u00f9\13\t\3\t\6\t\u00fc\n\t\r\t\16\t\u00fd\3\n\3\n\3\n\3\n\7\n\u0104"+
		"\n\n\f\n\16\n\u0107\13\n\3\n\6\n\u010a\n\n\r\n\16\n\u010b\3\n\7\n\u010f"+
		"\n\n\f\n\16\n\u0112\13\n\3\n\6\n\u0115\n\n\r\n\16\n\u0116\3\13\3\13\3"+
		"\13\3\13\7\13\u011d\n\13\f\13\16\13\u0120\13\13\3\13\3\13\5\13\u0124\n"+
		"\13\3\13\5\13\u0127\n\13\3\13\7\13\u012a\n\13\f\13\16\13\u012d\13\13\3"+
		"\13\6\13\u0130\n\13\r\13\16\13\u0131\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u013b"+
		"\n\f\r\f\16\f\u013c\3\f\7\f\u0140\n\f\f\f\16\f\u0143\13\f\3\f\6\f\u0146"+
		"\n\f\r\f\16\f\u0147\3\r\3\r\7\r\u014c\n\r\f\r\16\r\u014f\13\r\3\r\6\r"+
		"\u0152\n\r\r\r\16\r\u0153\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u015d"+
		"\n\16\3\16\3\16\7\16\u0161\n\16\f\16\16\16\u0164\13\16\3\16\7\16\u0167"+
		"\n\16\f\16\16\16\u016a\13\16\3\16\3\16\6\16\u016e\n\16\r\16\16\16\u016f"+
		"\3\16\6\16\u0173\n\16\r\16\16\16\u0174\3\16\5\16\u0178\n\16\3\16\5\16"+
		"\u017b\n\16\3\17\3\17\7\17\u017f\n\17\f\17\16\17\u0182\13\17\3\17\3\17"+
		"\6\17\u0186\n\17\r\17\16\17\u0187\3\17\6\17\u018b\n\17\r\17\16\17\u018c"+
		"\3\17\5\17\u0190\n\17\3\17\5\17\u0193\n\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u01a1\n\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u01ac\n\26\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u01b3\n\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u01bf"+
		"\n\32\2\33\3\3\2\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1"+
		"\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25"+
		"\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\3\2\'\4\13\13\"\"\4\f\f\17"+
		"\17\3\62;\4\f\f\17\17\13\"#%%(+..\60\60\62;AAC\\c|\4\f\f\17\17\b\"\")"+
		")\60\60\62;C\\c|\4\f\f\17\17\3\62;\3\62;\4\f\f\17\17\3\62;\3\62;\4\f\f"+
		"\17\17\3\62;\3\62;\3\62;\4\f\f\17\17\5\62;C\\c|\4\f\f\17\17\4CIci\5%%"+
		"))dd\4\f\f\17\17\b\"\"),./aa~~\u0080\u0080\b##\60\60\62;AAC\\c|\4\f\f"+
		"\17\17\f\"#),.<??AAC]_ac|~~\u0080\u0080\4\f\f\17\17\4CIci\4))..\3\63;"+
		"\3\63;\3\63;\4\\\\||\3\63;\3\63;\3\63;\u0209\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\3\66\3\2\2\2\5<\3\2\2\2\7>\3\2\2\2\tW\3\2\2\2\13p\3\2\2\2\r\u0089\3"+
		"\2\2\2\17\u00a8\3\2\2\2\21\u00cc\3\2\2\2\23\u00ff\3\2\2\2\25\u0118\3\2"+
		"\2\2\27\u0133\3\2\2\2\31\u0149\3\2\2\2\33\u015c\3\2\2\2\35\u017c\3\2\2"+
		"\2\37\u0194\3\2\2\2!\u0197\3\2\2\2#\u019a\3\2\2\2%\u01a0\3\2\2\2\'\u01a2"+
		"\3\2\2\2)\u01a4\3\2\2\2+\u01ab\3\2\2\2-\u01b2\3\2\2\2/\u01b4\3\2\2\2\61"+
		"\u01b7\3\2\2\2\63\u01be\3\2\2\2\65\67\t\2\2\2\66\65\3\2\2\2\678\3\2\2"+
		"\28\66\3\2\2\289\3\2\2\29:\3\2\2\2:;\b\2\2\2;\4\3\2\2\2<=\t\3\2\2=\6\3"+
		"\2\2\2>?\7Z\2\2?@\7<\2\2@D\3\2\2\2AC\7\"\2\2BA\3\2\2\2CF\3\2\2\2DB\3\2"+
		"\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2GI\t\4\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2"+
		"\2\2JK\3\2\2\2KO\3\2\2\2LN\7\"\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2"+
		"\2\2PS\3\2\2\2QO\3\2\2\2RT\t\5\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2V\b\3\2\2\2WX\7V\2\2XY\7<\2\2Y]\3\2\2\2Z\\\7\"\2\2[Z\3\2\2\2\\_\3"+
		"\2\2\2][\3\2\2\2]^\3\2\2\2^a\3\2\2\2_]\3\2\2\2`b\t\6\2\2a`\3\2\2\2bc\3"+
		"\2\2\2ca\3\2\2\2cd\3\2\2\2dh\3\2\2\2eg\7\"\2\2fe\3\2\2\2gj\3\2\2\2hf\3"+
		"\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2km\t\7\2\2lk\3\2\2\2mn\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2o\n\3\2\2\2pq\7E\2\2qr\7<\2\2rv\3\2\2\2su\7\"\2\2ts\3"+
		"\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2y{\t\b\2\2zy\3"+
		"\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0081\3\2\2\2~\u0080\7\"\2\2\177"+
		"~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\t\t\2\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\f\3\2\2\2\u0089\u008a\7N\2\2\u008a\u008b\7<\2\2\u008b\u008f\3\2\2\2\u008c"+
		"\u008e\7\"\2\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092"+
		"\u0094\t\n\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7\61\2\2\u0098"+
		"\u009a\t\13\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a0\3\2\2\2\u009d\u009f\7\"\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\t\f\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\16\3\2\2\2\u00a8\u00a9\7O\2\2\u00a9\u00aa\7<\2\2\u00aa\u00ae"+
		"\3\2\2\2\u00ab\u00ad\7\"\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00bf\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00c0\7E\2\2\u00b2\u00b3\7E\2\2\u00b3\u00c0\7~\2\2\u00b4\u00b6"+
		"\t\r\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\7\61\2\2\u00ba\u00bc\t"+
		"\16\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b1\3\2\2\2\u00bf\u00b2\3\2"+
		"\2\2\u00bf\u00b5\3\2\2\2\u00c0\u00c4\3\2\2\2\u00c1\u00c3\7\"\2\2\u00c2"+
		"\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\t\17\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\20\3\2\2\2\u00cc\u00cd\7S\2\2\u00cd\u00ce\7<\2\2\u00ce\u00d2"+
		"\3\2\2\2\u00cf\u00d1\7\"\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00e7\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d7\t\20\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\7\61"+
		"\2\2\u00db\u00dd\t\21\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e3\3\2\2\2\u00e0\u00e2\7\""+
		"\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\7?"+
		"\2\2\u00e7\u00d6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ec\3\2\2\2\u00e9"+
		"\u00eb\7\"\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f1\t\22\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3"+
		"\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f6\7\"\2\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\t\23\2\2\u00fb"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\22\3\2\2\2\u00ff\u0100\7X\2\2\u0100\u0101\7<\2\2\u0101\u0105"+
		"\3\2\2\2\u0102\u0104\7\"\2\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0108\u010a\t\24\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0110\3\2\2\2\u010d\u010f\7\""+
		"\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0115\t\25"+
		"\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\24\3\2\2\2\u0118\u0119\7M\2\2\u0119\u011a\7<\2\2"+
		"\u011a\u011e\3\2\2\2\u011b\u011d\7\"\2\2\u011c\u011b\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0123\t\26\2\2\u0122\u0124\t\27\2\2\u0123\u0122\3"+
		"\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0127\7o\2\2\u0126"+
		"\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u012b\3\2\2\2\u0128\u012a\7\""+
		"\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130\t\30"+
		"\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\26\3\2\2\2\u0133\u0134\7y\2\2\u0134\u0135\7<\2\2"+
		"\u0135\u013a\3\2\2\2\u0136\u013b\t\31\2\2\u0137\u0138\7^\2\2\u0138\u013b"+
		"\7/\2\2\u0139\u013b\t\32\2\2\u013a\u0136\3\2\2\2\u013a\u0137\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u0141\3\2\2\2\u013e\u0140\7\"\2\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0144\u0146\t\33\2\2\u0145\u0144\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\30\3\2\2"+
		"\2\u0149\u014d\7\'\2\2\u014a\u014c\t\34\2\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u0150\u0152\t\35\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\32\3\2\2"+
		"\2\u0155\u015d\7`\2\2\u0156\u0157\7`\2\2\u0157\u015d\7`\2\2\u0158\u015d"+
		"\7a\2\2\u0159\u015a\7a\2\2\u015a\u015d\7a\2\2\u015b\u015d\7?\2\2\u015c"+
		"\u0155\3\2\2\2\u015c\u0156\3\2\2\2\u015c\u0158\3\2\2\2\u015c\u0159\3\2"+
		"\2\2\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0162\t\36\2\2\u015f\u0161\t\37\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3"+
		"\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u017a\3\2\2\2\u0164"+
		"\u0162\3\2\2\2\u0165\u0167\t \2\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2"+
		"\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016b\u016d\7\61\2\2\u016c\u016e\t!\2\2\u016d\u016c\3\2"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u017b\3\2\2\2\u0171\u0173\t\"\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2"+
		"\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176"+
		"\u0178\7\61\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017b\3"+
		"\2\2\2\u0179\u017b\7\61\2\2\u017a\u0168\3\2\2\2\u017a\u0172\3\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\34\3\2\2\2\u017c\u0192\t#\2\2"+
		"\u017d\u017f\t$\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183"+
		"\u0185\7\61\2\2\u0184\u0186\t%\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0193\3\2\2\2\u0189"+
		"\u018b\t&\2\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018a\3\2"+
		"\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u0190\7\61\2\2\u018f"+
		"\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u0193\7\61"+
		"\2\2\u0192\u0180\3\2\2\2\u0192\u018a\3\2\2\2\u0192\u0191\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\36\3\2\2\2\u0194\u0195\7*\2\2\u0195\u0196\7\64\2"+
		"\2\u0196 \3\2\2\2\u0197\u0198\7*\2\2\u0198\u0199\7\65\2\2\u0199\"\3\2"+
		"\2\2\u019a\u019b\7*\2\2\u019b\u019c\7\66\2\2\u019c$\3\2\2\2\u019d\u01a1"+
		"\7~\2\2\u019e\u019f\7]\2\2\u019f\u01a1\7~\2\2\u01a0\u019d\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a1&\3\2\2\2\u01a2\u01a3\7]\2\2\u01a3(\3\2\2\2\u01a4"+
		"\u01a5\7_\2\2\u01a5*\3\2\2\2\u01a6\u01a7\7~\2\2\u01a7\u01ac\7<\2\2\u01a8"+
		"\u01a9\7~\2\2\u01a9\u01aa\7~\2\2\u01aa\u01ac\7<\2\2\u01ab\u01a6\3\2\2"+
		"\2\u01ab\u01a8\3\2\2\2\u01ac,\3\2\2\2\u01ad\u01ae\7<\2\2\u01ae\u01b3\7"+
		"~\2\2\u01af\u01b0\7<\2\2\u01b0\u01b1\7~\2\2\u01b1\u01b3\7~\2\2\u01b2\u01ad"+
		"\3\2\2\2\u01b2\u01af\3\2\2\2\u01b3.\3\2\2\2\u01b4\u01b5\7]\2\2\u01b5\u01b6"+
		"\7\63\2\2\u01b6\60\3\2\2\2\u01b7\u01b8\7]\2\2\u01b8\u01b9\7\64\2\2\u01b9"+
		"\62\3\2\2\2\u01ba\u01bb\7~\2\2\u01bb\u01bf\7_\2\2\u01bc\u01bd\7~\2\2\u01bd"+
		"\u01bf\7~\2\2\u01be\u01ba\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\64\3\2\2\2"+
		"D\28DJOU]chnv|\u0081\u0087\u008f\u0095\u009b\u00a0\u00a6\u00ae\u00b7\u00bd"+
		"\u00bf\u00c4\u00ca\u00d2\u00d8\u00de\u00e3\u00e7\u00ec\u00f2\u00f7\u00fd"+
		"\u0105\u010b\u0110\u0116\u011e\u0123\u0126\u012b\u0131\u013a\u013c\u0141"+
		"\u0147\u014b\u014d\u0153\u015c\u0162\u0168\u016f\u0174\u0177\u017a\u0180"+
		"\u0187\u018c\u018f\u0192\u01a0\u01ab\u01b2\u01be";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}