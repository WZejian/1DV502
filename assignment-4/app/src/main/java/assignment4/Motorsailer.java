package assignment4;

/**
 * Represents a boat type Motorsailer inherited from Boat.
 */
public class Motorsailer extends Boat {
  private String length;
  private String power;
  private String depth;

  /**
   * Creates a Motorsailer object.
   */
  public Motorsailer(String name, String type, String length, String depth, String power) {
    super(name, type);
    this.length = length;
    this.depth = depth;
    this.power = power;
  }

  @Override
  public String toString() {
    return "BOAT:" + name + ":" + type + ":" + length + ":" + depth + ":" + power;
  }

  @Override
  public String infos() {
    return "\nname:" + name + "\ntype:" + type + "\nlength:" + length
           + " foot\npower:" + power + " horsepower\ndepth:" + depth + " foot\n";
  }
}
