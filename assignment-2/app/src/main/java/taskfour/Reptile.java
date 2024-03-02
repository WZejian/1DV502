package taskfour;

/**
 * Subclass Reptile.
 */
public class Reptile extends Animal {
  private String habitat;
  private boolean isPoisonous;

  /**
   * Construtor.
   */
  public Reptile(String name, String latinName, String habitat) {
    super(name, latinName);
    this.habitat = habitat;
  }

  /**
   * Get habitat.
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
   * Is the reptile poisonous or not.
   */
  public boolean isPoisonous() {
    return isPoisonous;
  }

  /**
   * Set the reptile poisonous or not.
   */
  public void setPoisonous(boolean isPoisonous) {
    this.isPoisonous = isPoisonous;
  }
}
