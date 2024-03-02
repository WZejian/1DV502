package taskfour;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Order in the animal kindom.
 */
public class App {
  /**
   * Create animals to show their characters.
   */
  public static void main(String[] args) {
    Bird b1 = new Bird("Parrot", "Psittaciformes", "in the tree");
    Bird b2 = new Bird("Pegeon", "Columba", "in the tree");
    Mammal m1 = new Mammal("Monkey", "Gorilla", "grey and black");
    Mammal m2 = new Mammal("Cat", "Felinae", "white, yellow and black");
    Reptile r1 = new Reptile("Snake", "Serpentiformes", "in the land");
    Reptile r2 = new Reptile("Crocodile", "Crocodilus niloticus", "in fresh water");

    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.add(b1);
    animals.add(b2);
    animals.add(m1);
    animals.add(m2);
    animals.add(r1);
    animals.add(r2);
    Collections.sort(animals);

    for (Animal ani : animals) {
      if (ani instanceof Bird) {
        Bird abird = (Bird) ani;
        System.out.println(ani.getLatinName() + " puts its egg in/on a whole " + abird.getNestType());
      } else if (ani instanceof Mammal) {
        Mammal amammal = (Mammal) ani;
        System.out.println(ani.getLatinName() + " has a fur that is " + amammal.getFulcolor());
      } else {
        Reptile areptile = (Reptile) ani;
        System.out.println(ani.getLatinName() + " lives " + areptile.getHabitat());
      }
    }
  }
}