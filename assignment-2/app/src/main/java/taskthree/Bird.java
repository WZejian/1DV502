package taskthree;

/**
 * Subclass Bird.
 */
public class Bird extends Animal {
  private boolean isMigrant;
  private boolean canFly;
  private String nestType;

  /**
   * Constructor.
   */
  public Bird(String name, double weight, String sound, String nestType) {
    super(name, weight, sound);
    this.nestType = nestType;

  }

  /**
   * Get nest type.
   */
  public String getNestType() {
    return nestType;
  }

  /**
   * Set nest type.
   */
  public void setNestType(String nestType) {
    this.nestType = nestType;
  }

  /**
   * Is migrant or not.
   */
  public boolean isMigrant() {
    return isMigrant;
  }

  /**
   * Set the bird is migrant or not.
   */
  public void setIsMigrant(boolean isMigrant) {
    this.isMigrant = isMigrant;
  }

  /**
   * Is the bird can fly.
   */
  public boolean isCanFly() {
    return canFly;
  }

  /**
   * Set whether the bird can fly.
   */
  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }

  /**
   * Get bird sound.
   */
  public String makeSound() {
    return super.getSound();
  }
}
