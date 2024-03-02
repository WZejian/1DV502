package taskthree;

import java.util.ArrayList;

/**
 * Show characters of each subclass of animal.
 */
public class App {
  /**
   * Create animals and show their characters.
   */
  public static void main(String[] args) {
    Bird pea = new Bird("Peafowl", 0.5, "Kaka-kaka", "tree");
    Mammal cattle = new Mammal("Swedish red and white cattle", 150, "Muuuu", "red and white");
    Reptile comodo = new Reptile("Commodo dragon", 200, "kshhhhhh kshhhh", "water");
    Mammal panda = new Mammal("Giant panda", 80, "aiai-aiai", "forest");

    ArrayList<Animal> list = new ArrayList<>();
    list.add(pea);
    list.add(cattle);
    list.add(comodo);
    list.add(panda);

    for (Animal ani : list) {
      if (ani instanceof Bird) {
        System.out.println("A " + ani.getName() + " weighs " + ani.getWeight() + " kg and tweets: " + ani.makeSound());
      } else if (ani instanceof Mammal) {
        System.out.println("A " + ani.getName() + " weighs " + ani.getWeight() + " kg and says: " + ani.makeSound());
      } else {
        System.out.println(
            "A " + comodo.getName() + " weighs " + comodo.getWeight() + " kg and hizzes: " + comodo.makeSound());
      }
    }
  }
}