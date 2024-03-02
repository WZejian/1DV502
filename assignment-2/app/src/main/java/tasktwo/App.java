package tasktwo;

/**
 * Planets with Moons.
 */
public class App {

  /**
   * Create planets and moons and show their characters.
   */
  public static void main(String[] args) {
    Planet earth = new Planet("Earth");
    Planet mars = new Planet("Mars");

    Moon pho = new Moon("Phobos", 22);
    Moon dem = new Moon("Deimos", 12);
    Moon themoon = new Moon("TheMoon", 3474);

    mars.addMoon(pho);
    mars.addMoon(dem);
    earth.addMoon(themoon);

    System.out.println("The planet is called " + mars.getName() + " and has the following moons: ");
    Moon[] marsMoon = mars.getMoon();
    for (int i = 0; i < mars.getNoOfMoons(); i++) {
      System.out.println("Moon " + (i + 1));
      System.out.println("Name: " + marsMoon[i].getName() + "\tSize: " + marsMoon[i].getKmSize() + " km");
    }

    System.out.println();

    System.out.println("The planet is called " + earth.getName() + " and has the following moons: ");
    Moon[] earthMoon = earth.getMoon();
    for (int i = 0; i < earth.getNoOfMoons(); i++) {
      System.out.println("Moon " + (i + 1));
      System.out.println("Name: " + earthMoon[i].getName() + "\tSize: " + earthMoon[i].getKmSize() + " km");
    }
  }
}
