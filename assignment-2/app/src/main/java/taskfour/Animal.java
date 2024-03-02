package taskfour;

/**
 * Implement the interface(compareto).
 */
public abstract class Animal implements Comparable<Animal> {
  private String name;
  private String latinName;
  private double weight;

  /**
   * Constructor.
   */
  public Animal(String name, String latinName) {
    this.name = name;
    this.latinName = latinName;
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
   * Compare by latin name.
   */
  public int compareTo(Animal another) {
    return this.getLatinName().compareTo(another.getLatinName());
  }
}
