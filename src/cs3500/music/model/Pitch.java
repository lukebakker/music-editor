package cs3500.music.model;

/**
 * an enumeration for pitch.
 */
public enum Pitch {
  C, CSHARP, D, DSHARP, E, F, FSHARP, G, GSHARP, A, ASHARP, B;

  /**
   * makes enum a string.
   *
   * @return the enum as a string.
   */
  public String toString() {
    String s = "";
    switch (this) {
      case C:
        s = "C";
        break;
      case CSHARP:
        s = "C#";
        break;
      case D:
        s = "D";
        break;
      case DSHARP:
        s = "D#";
        break;
      case E:
        s = "E";
        break;
      case F:
        s = "F";
        break;
      case FSHARP:
        s = "F#";
        break;
      case G:
        s = "G";
        break;
      case GSHARP:
        s = "G#";
        break;
      case A:
        s = "A";
        break;
      case ASHARP:
        s = "A#";
        break;
      case B:
        s = "B";
        break;
      default:
        break;
    }
    return s;
  }


}
