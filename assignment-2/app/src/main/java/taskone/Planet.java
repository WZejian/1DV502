package taskone;

/**
 * A single planet.
 */
public class Planet {
  private String name;
  private int position;
  private int noOfMoons;
  private int aphelion;
  private int perihelion;

  public Planet() {
  }
  
  /**
   * Constructor of class Planet.
   * 
   */
  public Planet(String newName, int newPos, int newCount, int newAphelion, int newPerihelion) {
    name = newName;
    position = newPos;
    noOfMoons = newCount;
    aphelion = newAphelion;
    perihelion = newPerihelion;
  }

  /**
   * Get name of the planet.
   */
  public String getName() {
    if (this.name.equals("")) {
      return "Unknown Planet";
    } else {
      return this.name;
    }
  }
  
  /**
   * Set name for Planet.
   */
  public void setName(String newName) {
    if (name.length() < 3) {
      this.name = null;
    } else {
      name = newName;
    }
  }

  /**
   * Get positon for Planet.
   */
  public int getPosition() {
    return position;
  }

  /**
   * Set positon for Planet.
   */
  public void setPosition(int newPos) {
    if (newPos < 0) {
      this.position = 0;
    } else {
      position = newPos;
    }
  }
  
  /**
   * Get number of moons.
   */
  public int getNoOfMoons() {
    return noOfMoons;
  }

  /**
   * Set number of moons for the Planet.
   */
  public void setNoOfMoons(int newCount) {
    if (newCount < 0) {
      noOfMoons = 0;
    } else {
      noOfMoons = newCount;
    }
  }

  /**
   * Get aphelion.
   */
  public int getAphelion() {
    return aphelion;
  }

  /**
   * Set aphelion.
   */
  public void setAphelion(int newAphelion) {
    if (newAphelion < 0) {
      aphelion = 0;
    } else {
      aphelion = newAphelion;
    }
  }

  /**
   * Get Perihelion.
   */
  public int getPerihelion() {
    return perihelion;
  }

  /**
   * Set Perihelion.
   */
  public void setPerihelion(int newPerihelion) {
    if (newPerihelion < 0) {
      perihelion = 0;
    } else {
      perihelion = newPerihelion;
    }
  }
}