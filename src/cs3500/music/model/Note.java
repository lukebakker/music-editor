package cs3500.music.model;


/**
 * CHANGES:
 * added fields for in instrument and volume.
 * added constructor with new instrument and volume fields. (for the midi view)
 */

/**
 * the class representing a note.
 */
public class Note {
  private Pitch pitch;
  private int octave;
  private int beats;
  private int startTime;
  private int instrument;
  private int volume;

  /**
   * Constructor for a note.
   *
   * @param pitch  the pitch of the note.
   * @param octave the octave of the note.
   */
  public Note(Pitch pitch, int octave, int beats, int startTime) {
    this.pitch = pitch;
    if (octave < 0) {
      throw new IllegalArgumentException("invalid octave");
    } else {
      this.octave = octave;
    }
    this.beats = beats;
    this.startTime = startTime;
  }

  /**
   * constructor with instrument and volume.
   *
   * @param instrument the instrument for the midi.
   * @param volume     the volume for the midi.
   * @param pitch      the pitch of the note.
   * @param octave     the octave of the note.
   * @param beats      the beats that the note lasts.
   * @param startTime  the start time of the note in the piece
   */
  public Note(int instrument, int volume, Pitch pitch, int octave, int beats, int startTime) {
    this.pitch = pitch;
    this.instrument = instrument;
    this.volume = volume;
    if (octave < 0) {
      throw new IllegalArgumentException("invalid octave");
    } else {
      this.octave = octave;
    }
    this.beats = beats;
    this.startTime = startTime;
  }

  /**
   * gets the pitch.
   *
   * @return returns the pitch.
   */
  public Pitch getPitch() {
    return this.pitch;
  }

  /**
   * gets the octave.
   *
   * @return the octave.
   */
  public int getOctave() {
    return this.octave;
  }

  /**
   * gets the number of beats that this note lasts.
   *
   * @return the number of beats of this note.
   */
  public int getBeats() {
    return this.beats;
  }

  /**
   * gets the start time of this note.
   *
   * @return the start time.
   */
  public int getStartTime() {
    return this.startTime;
  }

  /**
   * returns true if the notes are equal to each other.
   *
   * @param n the note that we are checking against this one.
   * @return true if they are equal. Otherwise false.
   */
  boolean equalsNote(Note n) {
    return (this.pitch.ordinal() == n.getPitch().ordinal()
            && this.beats == n.getBeats()
            && this.getOctave() == n.getOctave()
            && this.getStartTime() == n.getStartTime());
  }

  /**
   * gets the volume of the note.
   *
   * @return the volume of the note as an int.
   */
  public int getVolume() {
    return this.volume;
  }

  /**
   * gets the instrument of this note.
   *
   * @return the instrument of this note.
   */

  public int getInstrument() {
    return this.instrument;
  }


}
