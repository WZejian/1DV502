package assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Represents a Registry with its members and their behaviours.
 */
public class Registry {
  private final String file;
  private final List<Member> allMembers = new ArrayList<>();
  private final Random random = new Random();

  /**
   * Creates a Registry object.
   */
  public Registry(String file) {
    this.file = file;
  }

  /**
   * Creates members and regarding boats according to the file.
   */
  public void loadFile() {
    System.out.println("loadFile:" + file);
    List<String> lines = readFile(file);

    for (int i = 0; i < lines.size();) {
      Member member = null;
      if (lines.get(i).startsWith("MEMBER")) {
        member = lineToMember(lines.get(i));
      }
      if (member == null) {
        System.out.println("ERROR");
      }
      i++;
      while (i < lines.size() && lines.get(i).startsWith("BOAT")) {
        Boat boat = lineToBoat(lines.get(i));
        if (boat != null) {
          assert member != null;
          member.addBoat(boat);
        }
        i++;
      }
      addMemeber(member);
    }
  }

  /**
   * Return a member created by its name, email, and id.
   */
  public Member lineToMember(String line) {
    String[] cc = line.split(":");
    if (!"MEMBER".equals(cc[0])) {
      System.out.println("lineToMember ERROR LINE:" + line);
      return null;
    }
    return new Member(cc[1], cc[2], cc[3]);
  }

  /**
   * return a boat created by its parameters.
   */
  public Boat lineToBoat(String line) {
    String[] cc = line.split(":");
    if (!"BOAT".equals(cc[0])) {
      System.out.println("lineToMember ERROR LINE:" + line);
      return null;
    }

    String name = cc[1];
    String type = cc[2];
    String length = null;
    String depth = null;
    String power = null;

    switch (type) {
      case "sailboat":
        length = cc[3];
        depth = cc[4];
        break;
      case "motorboat":
        length = cc[3];
        power = cc[4];
        break;
      case "canoe":
        length = cc[3];
        break;
      case "motorsailer":
        length = cc[3];
        depth = cc[4];
        power = cc[5];
        break;
      default:
        System.out.println("Not supported type.");
    }
    return createBoat(name, type, length, depth, power);
  }

  /**
   * Gets member by the ID.
   */
  private Member getMemberById(String id) {
    for (Member member : allMembers) {
      if (id.equals(member.getId())) {
        return member;
      }
    }
    return null;
  }

  /**
   * Generates a new unique random 6 character alpha numeric member id.
   */
  private String generateUniqueId() {
    while (true) {
      String id = "";
      int idLength = 6;
      for (int i = 0; i < idLength; i++) {
        // Character or Number
        String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num"; 
        if (charOrNum.equals("char")) {
          // Character of uppercase or lowercase
          int upperOrLower = random.nextInt(2) % 2 == 0 ? 65 : 97;                     
          id += (char) (upperOrLower + random.nextInt(26));
        } else if (charOrNum.equals("num")) {
          id += String.valueOf(random.nextInt(10));
        }
      }
      if (getMemberById(id) == null) {
        return id;
      } else {
        continue;
      }
    }
  }

  /**
   * If the email is unique or not.
   */
  private boolean uniqueEmail(String email) {
    if ("".equals(email)) {
      return true;
    }
    for (Member member : allMembers) {
      if (email.equals(member.getEmail())) {
        return false;
      }
    }
    return true;
  }

  /**
   * Register a new member to the registry with name and/or email.
   */
  public String registerMember(String name, String email) {
    if (!uniqueEmail(email)) {
      return null;
    }
    String id = generateUniqueId();
    Member member = new Member(name, email, id);
    allMembers.add(member);
    return id;
  }

  /**
   * Remove a member from the registry.
   */
  public boolean unregisterMember(String id) {
    Member member = getMemberById(id);
    if (member == null) {
      return false;
    }
    return allMembers.remove(member);
  }

  /**
   * Print all members' information from the registry.
   */
  public void printAllMembers() {
    for (Member member : allMembers) {
      System.out.println(member);
    }
  }

  /**
   * If the id is unique or not.
   */
  public boolean containMemberId(String id) {
    Member member = getMemberById(id);
    if (member == null) {
      return false;
    } else {
      return true;
    }
  }

  /**
   * Print a member's information by the id.
   */
  public boolean printMember(String id) {
    Member member = getMemberById(id);
    if (member == null) {
      System.out.println("No such member id: " + id);
      return false;
    }

    System.out.println(member);
    return true;
  }

  /**
   * Adds a member to the registry.
   */
  public void addMemeber(Member member) {
    allMembers.add(member);
  }

  /**
   * Creates a boat and add it to a member get by id.
   */
  public boolean addBoat(String id, String name, String typeStr, String length, String depth, String power) {
    Member member = getMemberById(id);
    if (member == null) {
      return false;
    }
    if (member.getBoat(name) != null) {
      System.out.println("The name has exsited." + "\n");
      return true;
    }
    Boat boat = createBoat(name, typeStr, length, depth, power);
    if (boat == null) {
      return false;
    }
    System.out.println("Added boat \"" + boat.getName() + "\" for "  + member.getName() + "\n");
    member.addBoat(boat);
    return true;
  }

  /**
   * Remove a boat from a member get by id with the boat's name. 
   */
  public boolean deleteBoat(String id, String name) {
    Member member = getMemberById(id);
    if (member == null) {
      return false;
    }
    return member.removeBoat(name);
  }

  /**
   * Creates a boat by its parameters.
   */
  private Boat createBoat(String name, String type, String length, String depth, String power) {
    Boat boat = null;
    if (type.equals("sailboat")) {
      boat = new Sailboat(name, type, length, depth);
    } else if (type.equals("motorboat")) {
      boat = new Motorboat(name, type, length, power);
    } else if (type.equals("canoe")) {
      boat = new Canoe(name, type, length);
    } else if (type.equals("motorsailer")) {
      boat = new Motorsailer(name, type, length, depth, power);
    } else {
      System.out.println("ERROR in type: " + type);
    }
    return boat;
  }

  /**
   * Return a boat.
   */
  public Boat getBoat(String id, String name) {
    Member member = getMemberById(id);
    if (member == null) {
      return null;
    }
    return member.getBoat(name);
  }

  /**
   * Return a list of strings containing all members' information.
   */
  public List<String> saveLine() {
    List<String> lines = new ArrayList<>();
    for (Member member : allMembers) {
      lines.add(member.toString());
    }
    return lines;
  }

  /**
   * Save all information to a specific file.
   */
  public void saveFile() throws IOException {
    writeFile(file, saveLine());
  }

  /**
   * Return a list of strings in a file.
   */
  public List<String> readFile(String name) {
    List<String> lines = new ArrayList<>();
    File f = new File(name);
    try {
      Scanner scanner = new Scanner(f, "UTF-8");
      while (scanner.hasNext()) {
        String s = scanner.nextLine();
        lines.add(s);
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return lines;
  }

  /**
   * Print a list of information to a file.
   */
  public void writeFile(String name, List<String> lines) throws IOException {
    File f = new File(name);
    try {
      PrintWriter printer = new PrintWriter(f, StandardCharsets.UTF_8);
      for (String line : lines) {
        printer.print(line);
      }
      printer.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
