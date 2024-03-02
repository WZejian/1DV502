package assignment4;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a member for the boat club.
 */
public class Member {
  private String name;
  private String email;
  private String id;
  private List<Boat> boats = new ArrayList<>();

  /**
   * Creates a Member object.
   */
  public Member(String name, String email, String id) {
    this.name = name;
    this.email = email;
    this.id = id;
  }

  /**
   * Gets the name of the member.
   */
  public String getName() {
    return this.name;
  }

  /**
   * Gets the email of the member.
   */
  public String getEmail() {
    return email;
  }

  /**
   * Gets the Id of the member.
   */
  public String getId() {
    return id;
  }

  /**
   * Add a boat to the member.
   */
  public void addBoat(Boat boat) {
    boats.add(boat);
  }

  /**
   * Gets boats from the member.
   */
  protected Boat getBoat(String name) {
    for (Boat boat : boats) {
      if (boat.name.equals(name)) {
        return boat;
      }
    }
    return null;
  }

  /**
   * Remove a boat from the member.
   */
  public boolean removeBoat(String name) {
    Boat boat = getBoat(name);
    if (boat == null) {
      return false;
    }
    boats.remove(boat);
    return true;
  }

  @Override
  public String toString() {
    StringBuilder ret = new StringBuilder("MEMBER:" + name + ":" + email + ":" + id + "\n");
    for (Boat boat : boats) {
      ret.append(boat.toString()).append("\n");
    }
    return ret.toString();
  }
}
