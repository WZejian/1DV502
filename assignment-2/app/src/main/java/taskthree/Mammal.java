package taskthree;

/**
 * Subclass Mammal.
 */
public class Mammal extends Animal {
  private String fulcolor;
  private boolean hasWinterFur;

  /**
   * Constructor.
   */
  public Mammal(String name, double weight, String sound, String fulcolor) {
    super(name, weight, sound);
    this.fulcolor = fulcolor;
  }

  /**
   * Get color.
   */
  public String getFulcolor() {
    return fulcolor;
  }

  /**
   * Set fulcolor.
   */
  public void setFulcolor(String fulcolor) {
    this.fulcolor = fulcolor;
  }

  /**
   * Is the mammal has winter fur.
   */
  public boolean isHasWinterFur() {
    return hasWinterFur;
  }

  /**
   * Set whether the animal has winterfur.
   */
  public void setHasWinterFur(boolean hasWinterFur) {
    this.hasWinterFur = hasWinterFur;
  }

  /**
   * Get sound.
   */
  public String makeSound() {
    return super.getSound();
  }
}