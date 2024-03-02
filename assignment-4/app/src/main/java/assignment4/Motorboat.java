package assignment4;

/**
 * Represents a boat type Motorboat inherited from Boat.
 */
public class Motorboat extends Boat {
  private String length;
  private String power;

  /**
   * Creates a Motorboat object.
   */
  public Motorboat(String name, String type, String length, String power) {
    super(name, type);
    this.length = length;
    this.power = power;
  }

  @Override
  public String toString() {
    return "BOAT:" + name + ":" + type + ":" + length + ":" + power;
  }

  @Override
  public String infos() {
    return "\nname:" + name + "\ntype:" + type + "\nlength:" + length + " foot\npower:" + power + " horsepower\n";
  }
}
