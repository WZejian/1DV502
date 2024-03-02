package taskone;

/**
 * A single planet.
 */
public class App {
  
  /**
   * Create planets and show their characters.
   */
  public static void main(String[] args) {
    Planet earth = new Planet("Earth", 3, 1, 152097701, 147098074);
    Planet mars = new Planet("Mars", 4, 2, 249209300, 206669000);

    System.out.println(earth.getName());
    System.out.println("  Postion:  " + earth.getPosition());
    System.out.println("  Moons:  " + earth.getNoOfMoons());
    System.out.println("  Aphelion:  " + earth.getAphelion());
    System.out.println("  Perihelion:  " + earth.getPerihelion());

    System.out.println(mars.getName());
    System.out.println("  Postion:  " + mars.getPosition());
    System.out.println("  Moons:  " + mars.getNoOfMoons());
    System.out.println("  Aphelion:  " + mars.getAphelion());
    System.out.println("  Perihelion:  " + mars.getPerihelion());
  }
}
