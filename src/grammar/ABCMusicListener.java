// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ABCMusicListener extends ParseTreeListener {
	void enterField_tempo(ABCMusicParser.Field_tempoContext ctx);
	void exitField_tempo(ABCMusicParser.Field_tempoContext ctx);

	void enterMeasure(ABCMusicParser.MeasureContext ctx);
	void exitMeasure(ABCMusicParser.MeasureContext ctx);

	void enterAbc_music(ABCMusicParser.Abc_musicContext ctx);
	void exitAbc_music(ABCMusicParser.Abc_musicContext ctx);

	void enterDuplet(ABCMusicParser.DupletContext ctx);
	void exitDuplet(ABCMusicParser.DupletContext ctx);

	void enterOther_fields(ABCMusicParser.Other_fieldsContext ctx);
	void exitOther_fields(ABCMusicParser.Other_fieldsContext ctx);

	void enterQuadruplet(ABCMusicParser.QuadrupletContext ctx);
	void exitQuadruplet(ABCMusicParser.QuadrupletContext ctx);

	void enterAbc_header(ABCMusicParser.Abc_headerContext ctx);
	void exitAbc_header(ABCMusicParser.Abc_headerContext ctx);

	void enterNote_element(ABCMusicParser.Note_elementContext ctx);
	void exitNote_element(ABCMusicParser.Note_elementContext ctx);

	void enterLine(ABCMusicParser.LineContext ctx);
	void exitLine(ABCMusicParser.LineContext ctx);

	void enterField_composer(ABCMusicParser.Field_composerContext ctx);
	void exitField_composer(ABCMusicParser.Field_composerContext ctx);

	void enterChord(ABCMusicParser.ChordContext ctx);
	void exitChord(ABCMusicParser.ChordContext ctx);

	void enterAbc_tune(ABCMusicParser.Abc_tuneContext ctx);
	void exitAbc_tune(ABCMusicParser.Abc_tuneContext ctx);

	void enterField_key(ABCMusicParser.Field_keyContext ctx);
	void exitField_key(ABCMusicParser.Field_keyContext ctx);

	void enterLyric(ABCMusicParser.LyricContext ctx);
	void exitLyric(ABCMusicParser.LyricContext ctx);

	void enterField_default_length(ABCMusicParser.Field_default_lengthContext ctx);
	void exitField_default_length(ABCMusicParser.Field_default_lengthContext ctx);

	void enterField_meter(ABCMusicParser.Field_meterContext ctx);
	void exitField_meter(ABCMusicParser.Field_meterContext ctx);

	void enterField_number(ABCMusicParser.Field_numberContext ctx);
	void exitField_number(ABCMusicParser.Field_numberContext ctx);

	void enterTriplet(ABCMusicParser.TripletContext ctx);
	void exitTriplet(ABCMusicParser.TripletContext ctx);

	void enterRest(ABCMusicParser.RestContext ctx);
	void exitRest(ABCMusicParser.RestContext ctx);

	void enterField_title(ABCMusicParser.Field_titleContext ctx);
	void exitField_title(ABCMusicParser.Field_titleContext ctx);

	void enterNote(ABCMusicParser.NoteContext ctx);
	void exitNote(ABCMusicParser.NoteContext ctx);

	void enterField_voice(ABCMusicParser.Field_voiceContext ctx);
	void exitField_voice(ABCMusicParser.Field_voiceContext ctx);
}