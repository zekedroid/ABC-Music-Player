package tests;

import static org.junit.Assert.assertEquals;
import interfaces.MusicSymbol;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lyrics.LyricsLexer;
import lyrics.LyricsParser;
import main.LyricsListener;
import main.Main;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

import adts.Lyric;
import adts.Measure;
import adts.MusicPiece;
import adts.Pitch;
import adts.Signature;
import adts.Voice;
import utils.Fraction;

/**
 * Testing strategy: The first part of this test suite will test for compilation
 * errors. All valid inputs should pass the tests without any exception
 * throwing. The second part will be a more rigorous test suite to test for
 * accuracy.
 * 
 * The input 
 * 
 * As the documentation for the antlr parser describes, there are 'lyric's
 * composed of 'measure's and any amount of trailing WHITESPACE. Measures can
 * have 'syllable's and a WHITESPACE, or be empty, noted by PIPES with no
 * 'syllable's in between. Syllables follow a strict set of rules:
 * 
 * @category can ONLY start with a WORD or a STARS so syllables will always be
 *           one of these two types
 * @category single syllable and single STARS can be considered a full syllable
 * @category no combination of WORD and STARS are allowed in the same syllable
 * @category WHITESPACE* is allowed at the end of every syllable
 * @category starting with a WORD it must be followed by: a HYPHEN and a WORD or
 *           EXTENDERS, a WHITESPACE and HYPHEN and a WORD or EXTENDERS, a
 *           UNION_OPER and a WORD, or EXTENDERS
 */
@SuppressWarnings("unused")
public class LyricsParserTest {

	/**
	 * Compilation tests: general, non-antlr-rule specific tests
	 */

	@Test
	public void noSymbolsTest() {
		String input = "A2 mazing grace";
		verifyWalk(input);
	}

	@Test
	public void simpleABCTest() {
		String input = "Q R S *   T U V  W~(dou-ble u) | X Y Z";
	}

	@Test
	public void endTrailingSpaceTest() {
		// inputs can start with pipes, words, stars, or hyphens and end with
		// any amount of trailing whitespaces.
		String input1 = "abc       ";
		String input2 = "*       ";
		String input3 = "|       ";
		verifyWalk(input1);
		verifyWalk(input2);
		verifyWalk(input3);

		// also test for multiple beginnings and trailing space
		String input11 = "abc abc       ";
		String input12 = "**  * abc       ";
		String input13 = "abc |      ";
		String input14 = "|| a      ";
		verifyWalk(input11);
		verifyWalk(input12);
		verifyWalk(input13);
		verifyWalk(input14);
	}

	@Test
	public void noSymbols2Test() {
		String input = "Aaah b2.! ? (223) dire ,,, find:it or., then; l O";
		verifyWalk(input);
	}

	/**
	 * Antlr-rules-specific tests. Each java doc begins with the grouping name
	 * followed by each of its rules, "category". They build on each other
	 * starting with the most general "lyric".
	 */

	/**
	 * lyric
	 * 
	 * @category no empty lyric
	 * @category can have multiple measures and any amount of trailing
	 *           whitespace at the end.
	 */
	@Test
	public void lyricAnyNumMeasuresTest() {
		// only one measure, no bars
		String input1 = "word other word            ";
		verifyWalk(input1);

		// only one measure, no bars
		String input2 = "word | other |word";
		verifyWalk(input2);
	}

	/**
	 * measure
	 * 
	 * @category can be an entire lyric if no PIPEs are found
	 * @category can be empty or multiple syllables with WHITESPACE* at the end
	 */
	@Test
	public void measureEmptyTest() {
		String input = "|||||";
		verifyWalk(input);
	}

	@Test
	public void measureNonEmptyWhitespaceTest() {
		String input = "| |         | |    |";
		verifyWalk(input);
	}

	@Test
	public void measureNonEmptyTest() {
		String input = "| syllable | othersyllable|syllable||    ";
		verifyWalk(input);
	}

	/**
	 * syllable
	 * 
	 * @category can ONLY start with a WORD or a STARS
	 * @category single syllable and single STARS can be considered a full
	 *           cluster
	 * @category no combination of WORD and STARS are allowed in the same
	 *           syllable
	 * @category one WHITESPACE is allowed at the end of every syllable
	 * @category starting with a WORD it must be followed by: a HYPHEN and/or
	 *           EXTENDERS, a WHITESPACE and HYPHEN and/or EXTENDERS, a
	 *           DOUBHYPHEN, a UNION_OPER, or EXTENDERS
	 */

	@Test
	public void syllableMultipleTest() {
		// a WORD is a terminating token therefore it will be used to fill all
		// recursive calls for these tests
		String generalWord = "abc";

		// syllable HYPHEN syllable_cluster
		String inputHyphen = generalWord + "-" + generalWord;
		// syllable WHITESPACE HYPHEN syllable_cluster
		String inputWhiteHyphen = generalWord + " -" + generalWord;
		// syllable UNION_OPER syllable_cluster
		String inputTilda = generalWord + "~" + generalWord;
		String inputSlashHyphen = "Mary\\-Jane";
		// syllable EXTENDER extender_cluster
		String inputExtender = generalWord + "___ ";

		verifyWalk(inputHyphen);
		verifyWalk(inputWhiteHyphen);
		verifyWalk(inputTilda);
		verifyWalk(inputSlashHyphen);
		verifyWalk(inputExtender);
	}

	/**
	 * Complex test involving EVERY valid combination
	 */
	@Test
	public void allTest() {
		String input = "It's done.| Your e-ner-gy is de-crea-sing |"
				+ "with e-very blow___. | " + "I~'m sa-tis-fied now.| "
				+ "* In fact,-* you're not -even| " + "a cha~llen~ge to me| "
				+ "* * *** anymore. | "
				+ "It woul -dn't be-fair for-me-to-continue| "
				+ "fighting. * * *| " + "You-have-cha~lleng\\-ed and-lost| "
				+ "to-- a-fighter who is| "
				+ "sup-erior to-you,-- and-to-make| "
				+ "it-worse:-- he-was * just-a-mon-key, right?| "
				+ "It would~be mea~ning~less to| " + "fight you now;| "
				+ "you're-too scared and-a-shamed.| "
				+ "Live with the shock.| " + "* * * * *| " + "Keep it| "
				+ "bottled up| " + "inside of you.| " + "Good-bye, Frieza| "
				+ ", * | " + "may you live-the| " + "rest of-your-life| "
				+ "in peace...... -Goku";
		verifyWalk(input);
	}

	@Test
	public void allSymbolsTest() {
		String input = "hyphen-1-word-22 hyphen-test-a-a-a-a-a-a| * ** *** all stars alone | "
				+ "wordUnionWord~will pass~...| Mary\\-Jane a\\-compound name\\-escapedHyphen |"
				+ " wordDoubleHyphen--word three--syllables a--b--v--dd| wordWhitespace -hyphen also -threeSyllables|"
				+ " wordHyphenExtenders-___ dashIsSilent-_ extenders extend the space-_______ |"
				+ " and-- so--there";
		verifyWalk(input);
	}

	/**
	 * Listener tests: walker tests.
	 * 
	 * Strategy: using the parser compiler test allSymbolsTest(), we will split
	 * each measure and test for listener correctness by symbol type
	 */

	@Test
	public void simpleHypenTest() {
		// Tests word HYPHEN word listener
		String input = "hyphen-1-word-22 hyphen-test-a-a-a-a-a-a|";
		ArrayList<ArrayList<String>> expectedArray = new ArrayList<ArrayList<String>>();
		expectedArray.add(new ArrayList<String>());
		ArrayList<String> expected = expectedArray.get(0);
		expected.add("hyphen-");
		expected.add("1-");
		expected.add("word-");
		expected.add("22");
		expected.add("hyphen-");
		expected.add("test-");
		expected.add("a-");
		expected.add("a-");
		expected.add("a-");
		expected.add("a-");
		expected.add("a-");
		expected.add("a");

		assertEquals(expectedArray, verifyWalk(input));
	}

	@Test
	public void simpleStarTest() {
		// Tests STARS listener. All stars return empty strings
		String input = "    * ** *** all stars    alone|";
		ArrayList<ArrayList<String>> expectedArray = new ArrayList<ArrayList<String>>();
		expectedArray.add(new ArrayList<String>());
		ArrayList<String> expected = expectedArray.get(0);
		expected.add("");
		expected.add("");
		expected.add("");
		expected.add("all");
		expected.add("stars");
		expected.add("alone");

		assertEquals(expectedArray, verifyWalk(input));
	}

	@Test
	public void simpleUnionTest() {
		// Tests STARS listener. All stars return empty strings
		String input = "wordUnionWord~will    pass~...";
		ArrayList<ArrayList<String>> expectedArray = new ArrayList<ArrayList<String>>();
		expectedArray.add(new ArrayList<String>());
		ArrayList<String> expected = expectedArray.get(0);
		expected.add("wordUnionWord will");
		expected.add("pass ...");

		assertEquals(expectedArray, verifyWalk(input));
	}

	@Test
	public void simpleEscapedHyphenTest() {
		// Tests STARS listener. All stars return empty strings
		String input = "Mary\\-Jane a\\-compound name\\-escapedHyphen ";
		ArrayList<ArrayList<String>> expectedArray = new ArrayList<ArrayList<String>>();
		expectedArray.add(new ArrayList<String>());
		ArrayList<String> expected = expectedArray.get(0);
		expected.add("Mary-Jane");
		expected.add("a-compound");
		expected.add("name-escapedHyphen");

		assertEquals(expectedArray, verifyWalk(input));
	}
	

	@Test
	public void complexEscapedHyphenAndTildaTest() {
		// Tests STARS listener. All stars return empty strings
		String input = "Mary\\-Jane~is a\\-compound name\\-escapedHyphen ";
		ArrayList<ArrayList<String>> expectedArray = new ArrayList<ArrayList<String>>();
		expectedArray.add(new ArrayList<String>());
		ArrayList<String> expected = expectedArray.get(0);
		expected.add("Mary-Jane is");
		expected.add("a-compound");
		expected.add("name-escapedHyphen");

		assertEquals(expectedArray, verifyWalk(input));
	}

	@Test
	public void simpleDoubleHyphenTest() {
		// Tests DOUBLE HYPHENS which could end in a word or with a space.
		// Regardless, they should return the word before them with a single
		// dash, and an empty string after

		String input = "wordDoubleHyphen--word three--syllables  endInDOUBHYPHEN--     a--b--v--dd";
		ArrayList<ArrayList<String>> expectedArray = new ArrayList<ArrayList<String>>();
		expectedArray.add(new ArrayList<String>());
		ArrayList<String> expected = expectedArray.get(0);
		expected.add("wordDoubleHyphen-");
		expected.add("");
		expected.add("word");
		expected.add("three-");
		expected.add("");
		expected.add("syllables");
		expected.add("endInDOUBHYPHEN-");
		expected.add("");
		expected.add("a-");
		expected.add("");
		expected.add("b-");
		expected.add("");
		expected.add("v-");
		expected.add("");
		expected.add("dd");

		assertEquals(expectedArray, verifyWalk(input));
	}
	
	@Test
	public void simpleWhitespaceHyphenTest() {
		// Tests WHITESPACE HYPHEN which acts as a double hyphen except the preceding word has no dash

		String input = "wordWhitespace -hyphen also -threeSyllables";
		ArrayList<ArrayList<String>> expectedArray = new ArrayList<ArrayList<String>>();
		expectedArray.add(new ArrayList<String>());
		ArrayList<String> expected = expectedArray.get(0);
		expected.add("wordWhitespace");
		expected.add("");
		expected.add("hyphen");
		expected.add("also");
		expected.add("");
		expected.add("threeSyllables");

		assertEquals(expectedArray, verifyWalk(input));
	}
	
	@Test
	public void simpleHyphenExtenderTest() {
		// Tests 

		String input = "wordHyphenExtenders-___ dashIsSilent-_ extenders extend the space-_______ ";
		ArrayList<ArrayList<String>> expectedArray = new ArrayList<ArrayList<String>>();
		expectedArray.add(new ArrayList<String>());
		ArrayList<String> expected = expectedArray.get(0);
		expected.add("wordHyphenExtenders");
		expected.add("");
		expected.add("");
		expected.add("");
		expected.add("dashIsSilent");
		expected.add("");
		expected.add("extenders");
		expected.add("extend");
		expected.add("the");
		expected.add("space");
		expected.add("");
		expected.add("");
		expected.add("");
		expected.add("");
		expected.add("");
		expected.add("");
		expected.add("");

		assertEquals(expectedArray, verifyWalk(input));
	}

	/**
	 * Helper method to bring up the tree (if in debug mode) and to make sure
	 * the tree is walkable
	 * 
	 * @param input
	 *            to be fed to the lexer/parser
	 */
	private ArrayList<ArrayList<String>> verifyWalk(String input) {
		// Create a stream of tokens using the lexer.
		CharStream stream = new ANTLRInputStream(input);
		LyricsLexer lexer = new LyricsLexer(stream);
		lexer.reportErrorsAsExceptions();
		TokenStream tokens = new CommonTokenStream(lexer);

		// Feed the tokens into the parser.
		LyricsParser parser = new LyricsParser(tokens);
		parser.reportErrorsAsExceptions();

		// Generate the parse tree using the starter rule.
		ParseTree tree;
		tree = parser.lyric(); // "lyric" is the starter rule.
//		((RuleContext) tree).inspect(parser);

		// Walk the tree with the listener.

		ParseTreeWalker walker = new ParseTreeWalker();
		LyricsListener listener = new LyricsListener();
		walker.walk(listener, tree);
		return listener.getLyric();
	}

}