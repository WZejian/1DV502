package assignment4;

/**
 * Represents a boat type canoe inherited from Boat.
 */
public class Canoe extends Boat {
  private String length;
  
  /**
   * Creates a Canoe object with its name, type and length.
   */
  public Canoe(String name, String type, String length) {
    super(name, type);
    this.length = length;
  }

  @Override
  public String toString() {
    return "BOAT:" + name + ":" + type + ":" + length;
  } 

  @Override
  public String infos() {
    return "\nname:" + name + "\ntype:" + type + "\nlength:" + length + " foot\n";
  }
}
