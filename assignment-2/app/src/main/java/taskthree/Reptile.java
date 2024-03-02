package taskthree;

/**
 * Subclass Reptile.
 */
public class Reptile extends Animal {
  private String habitat;
  private boolean isPoisonous;

  /**
   * Constructor.
   */
  public Reptile(String name, double weight, String sound, String habitat) {
    super(name, weight, sound);
    this.habitat = habitat;
  }

  /**
   * Get Habitat.
   */
  public String getHabitat() {
    return habitat;
  }

  /**
   * Set habitat.
   */
  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  /**
   * Is poisonous or not.
   */
  public boolean isPoisonous() {
    return isPoisonous;
  }

  /**
   * Set the mammal is poisonous or not.
   */
  public void setPoisonous(boolean isPoisonous) {
    this.isPoisonous = isPoisonous;
  }

  /**
   * Get sound.
   */
  public String makeSound() {
    return super.getSound();
  }
}