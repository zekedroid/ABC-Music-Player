// Generated from Lyrics.g4 by ANTLR 4.0

package lyrics;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LyricsListener extends ParseTreeListener {
	void enterLyric(LyricsParser.LyricContext ctx);
	void exitLyric(LyricsParser.LyricContext ctx);

	void enterMeasure(LyricsParser.MeasureContext ctx);
	void exitMeasure(LyricsParser.MeasureContext ctx);

	void enterSyllable(LyricsParser.SyllableContext ctx);
	void exitSyllable(LyricsParser.SyllableContext ctx);
}