package assignment4;

/**
 * Represents a boat.
 */
public class Boat {
  protected String name;
  protected String type;
  private String[] supportsType = new String[] { "sailboat", "motorboat", "canoe", "motorsailer" };

  /**
   * Create a new boat object with name and type.
   */
  public Boat(String name, String type) {
    boolean vaild = false;
    for (String str : supportsType) {
      if (str.equals(type)) {
        vaild = true;
        break;
      }
    }
    if (vaild) {
      this.name = name;
      this.type = type;
    } else {
      throw new IllegalArgumentException("type is ERROR:" + type);
    }
  }

  /**
   * Gets a name of the boat.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Return detailed information of the boat.
   */
  public String infos() {
    return "";
  }
}
