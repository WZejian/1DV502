package taskfour;

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
  public Bird(String name, String latinName, String nestType) {
    super(name, latinName);
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
   * Is the bird migrant or not.
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
   * Can the bird fly.
   */
  public boolean isCanFly() {
    return canFly;
  }

  /**
   * Set the bird can fly or not.
   */
  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }
}