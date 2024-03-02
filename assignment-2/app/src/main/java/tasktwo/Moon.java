package tasktwo;

/**
 * A Moon class with attributes name and size.
 */
public class Moon {
  private String name;
  private int kmSize;

  public Moon() {
  }

  /**
   * Constructor for Moon.
   */
  public Moon(String name, int kmSize) {
    this.name = name;
    this.kmSize = kmSize;
  }

  /**
   * Get name.
   */
  public String getName() {
    return name;
  }

  /**
   * Set name.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get size.
   */
  public int getKmSize() {
    return kmSize;
  }

  /**
   * Set size.
   */
  public void setKmSize(int kmSize) {
    this.kmSize = kmSize;
  }
}