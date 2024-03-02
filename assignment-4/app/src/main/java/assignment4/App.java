package assignment4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Application run.
 */
public class App {
  /**
   * Main method.
   */
  public static void main(String[] args) throws IOException {
    String file = "registry.data";
    Registry registry = new Registry(file);
    registry.loadFile();

    Scanner scanner = new Scanner(System.in, "UTF-8");
    while (true) {
      System.out.println("================= Support command ================= ");
      System.out.println("print -> Print all members's information");
      System.out.println("print memberId-> Print member's information with this ID(\"print xxxxxx(id)\")");
      System.out.println("add member -> Add a new member for the club");
      System.out.println("remove member -> Remove an existing member");
      System.out.println("quit -> quit app");

      System.out.println("----------------- Input command ------------------ ");
      System.out.print("> ");
      String command = scanner.nextLine();

      //Do something after command input.
      if (command.equals("quit")) {
        System.out.println("Welcome again~");
        break;
      } else if (command.equals("print")) {
        registry.printAllMembers();
      } else if (command.startsWith("print")) {
        String[] ss = command.split(" ");
        String id = ss[1];
        boolean ret = registry.printMember(ss[1]);

        while (ret) {
          System.out.println("    add boat -> Add a club member");
          System.out.println("    remove boat -> Remove a boat from this member");
          System.out.println("    select boat -> select a boat from this member");
          System.out.println("    quit -> Quit current menu");

          command = scanner.nextLine();
          if (command.equals("quit")) {
            break;
          } else if (command.startsWith("add boat")) {
            System.out.print("Input boat name: ");
            String name = scanner.nextLine();
            System.out.print("Input boat type(sailboat, motorboat, motorsailer, canoe): ");
            String type;
            String length;
            String power = null;
            String depth = null; 
            while (true) {
              type = scanner.nextLine();
              if (type.equals("sailboat")) {
                System.out.print("Input length: ");
                length = scanner.nextLine();
                System.out.print("Input depth: ");
                depth = scanner.nextLine();
                break;
              } else if (type.equals("motorboat")) {
                System.out.print("Input length: ");
                length = scanner.nextLine();
                System.out.print("Input power: ");
                power = scanner.nextLine();
                break;
              } else if (type.equals("motorsailer")) {
                System.out.print("Input length: ");
                length = scanner.nextLine();
                System.out.print("Input depth: ");
                depth = scanner.nextLine();
                System.out.print("Input power: ");
                power = scanner.nextLine();
                break;
              } else if (type.equals("canoe")) {
                System.out.print("Input length: ");
                length = scanner.nextLine();
                break;
              } else {
                System.out.print("The type is not supported, only sailboat, motorboat, motorsailer, canoe > ");
              }
            }
            registry.addBoat(id, name, type, length, depth, power);
          } else if (command.equals("remove boat")) {
            System.out.print("Input boat name: ");
            String name = scanner.nextLine();
            if (!registry.deleteBoat(id, name)) {
              System.out.println("No such boat named: " + name + "\n");
            } else {
              System.out.println("The boat \"" + name + "\" has been removed\n");
            }
          } else if (command.equals("select boat")) {
            System.out.print("Input boat name: ");
            String name = scanner.nextLine();
            Boat boat = registry.getBoat(id, name);
            if (boat == null) {
              System.out.println("No such this boat named:" + name);
            } else {
              System.out.println(boat.infos());
            }
          }
          registry.printMember(ss[1]);
        }

      } else if (command.startsWith("add member")) {
        System.out.print("Input member name: ");
        String name = scanner.nextLine();
        System.out.print("Input an email: ");
        String email = scanner.nextLine();
        String id = registry.registerMember(name, email);
        if (id == null) {
          System.out.println("Email exists, please replace it with another one");
        } else {
          System.out.println("New member id: " + id + " with member: " + name);
        }
      } else if (command.startsWith("remove member")) {
        System.out.print("Input member id:");
        String id = scanner.nextLine();
        if (registry.unregisterMember(id)) {
          System.out.println("Removed this member: " + id);
        } else {
          System.out.println("No such member");
        }
      } else {
        System.out.println("Not supported command");
      }
    }
    scanner.close();
    registry.saveFile();
  }

  /**
   * Test getGreeting.
   */
  public String getGreeting() {
    return "Hello, world";
  }
}
