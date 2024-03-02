package assignment4;

/**
 * Represents a boat type Sailboat inherited from Boat.
 */
public class Sailboat extends Boat {
  private String length;
  private String depth;

  /**
   * Creates a Sailboat object.
   */
  public Sailboat(String name, String type, String length, String depth) {
    super(name, type);
    this.length = length;
    this.depth = depth;
  }

  /**
   * Gets depth of the boat.
   */
  public String getDepth() {
    return depth;
  }

  @Override
  public String toString() {
    return "BOAT:" + name + ":" + type + ":" + length + ":" + depth;
  }

  @Override
  public String infos() {
    return "\nname:" + name + "\ntype:" + type + "\nlength:" + length + " foot\ndepth:" + depth + " foot\n";
  }
}
