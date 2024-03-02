package tasktwo;

import java.util.ArrayList;

/**
 * Planets with Moons.
 */
public class Planet {
  private String name;
  private int position;
  private int noOfMoons;
  private int aphelion;
  private int perihelion;
  private ArrayList<Moon> moons = new ArrayList<>();

  public Planet() {
  }

  /**
   * Constructor.
   */
  public Planet(String name) {
    this.name = name;
  }

  /**
   * Get name.
   */
  public String getName() {
    if (this.name.equals("")) {
      return "Unknown Planet";
    } else {
      return this.name;
    }
  }

  /**
   * Set name.
   */
  public void setName(String newName) {
    if (name.length() < 3) {
      this.name = null;
    } else {
      name = newName;
    }
  }

  /**
   * Get Position.
   */
  public int getPosition() {
    return position;
  }

  /**
   * Get Position.
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
   * Set number of moons.
   */
  public void setNoOfMoons(int newCount) {
    if (newCount < 0) {
      noOfMoons = 0;
    } else {
      noOfMoons = newCount;
    }
  }

  /**
   * Get Aphelion.
   */
  public int getAphelion() {
    return aphelion;
  }

  /**
   * Set Aphelion.
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

  /**
   * Add one monn.
   */
  public void addMoon(Moon newMoon) {
    moons.add(newMoon);
    noOfMoons++;
  }

  /**
   * Get an array with moons.
   */
  public Moon[] getMoon() {
    Moon[] array = new Moon[noOfMoons];
    for (int i = 0; i < noOfMoons; i++) {
      array[i] = this.moons.get(i);
    }
    return array;
  }
}