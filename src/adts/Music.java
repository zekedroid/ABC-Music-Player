package adts;

/**
 * Interface that represents any music item. MusicSymbol and MusicPart extend
 * this. Thus, a Music could be a MusicPiece, a Voice, a Chord, a Lyric, a
 * Pitch, or a Rest. a The objects are immutable. The equals, toString, and
 * hashCode methods work recursively and individually different from each class
 * extending Music. Read their documentation for full specs.
 * 
 **/

/*
 * Representation Music = MusicPiece(signature: Signature, voices: List<Voice>)
 * + Measure(notes: List<MusicSymbol>, lyrics: Lyric) + Voice(name: String,
 * measures: List<Measure>) + Chord(notes: List<Pitch>)+ + Lyric(syllables:
 * List<String>) + Pitch(value: string, octave: int, length: int) + Rest(length:
 * int)
 */

public interface Music {

    /**
     * Calculates the required number of ticks per beat, so that each note can
     * be represented as an integer number of ticks.
     * 
     * @return integer representing number of ticks per beat.
     */
    public int calculateTicksPerBeat();

    /**
     * Tests the equality of one music to to another, such that two expressions
     * with equal attributes (observationally indistinguishable) are considered
     * equal
     * 
     * @param _that
     *            music to compare to
     * @return whether or not the two musics are equal
     */
    @Override
    public boolean equals(Object _that);

    /**
     * Returns the string representation of the music
     * 
     * @returns the music as a string
     */
    @Override
    public String toString();

    /**
     * Calculates the hashcode for this music. HashCode for two equal musics
     * will be identical.
     * 
     * @return the hashcode for the music
     */
    @Override
    public int hashCode();

}
