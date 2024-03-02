package taskthree;

/**
 * The Abstract class Animal with several attributes.
 */
public abstract class Animal {
  private String name;
  private String latinName;
  private double weight;
  protected String sound;

  /**
   * Constructor.
   */
  public Animal(String name, double weight, String sound) {
    this.name = name;
    this.weight = weight;
    this.sound = sound;
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
   * Get latin name.
   */
  public String getLatinName() {
    return latinName;
  }

  /**
   * Set latin name.
   */
  public void setLatinName(String latinName) {
    this.latinName = latinName;
  }

  /**
   * Get weight.
   */
  public double getWeight() {
    return weight;
  }

  /**
   * Set weight.
   */
  public void setWeight(double weight) {
    this.weight = weight;
  }

  /**
   * Get sound.
   */
  public String getSound() {
    return sound;
  }

  /**
   * Abstract method for makeSound.
   */
  public abstract String makeSound();
}
