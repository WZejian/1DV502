package taskfour;

/**
 * Subclass Mammal.
 */
public class Mammal extends Animal {
  private String fulcolor;
  private boolean hasWinterFur;

  /**
   * Constructor.
   */
  public Mammal(String name, String latinName, String fulcolor) {
    super(name, latinName);
    this.fulcolor = fulcolor;
  }

  /**
   * Get full color.
   */
  public String getFulcolor() {
    return fulcolor;
  }

  /**
   * Set full color.
   */
  public void setFulcolor(String fulcolor) {
    this.fulcolor = fulcolor;
  }

  /**
   * Is the mammal has winter fur or not.
   */
  public boolean isHasWinterFur() {
    return hasWinterFur;
  }

  /**
   * Set the mammal has winter fur or not.
   */
  public void setHasWinterFur(boolean hasWinterFur) {
    this.hasWinterFur = hasWinterFur;
  }
}
