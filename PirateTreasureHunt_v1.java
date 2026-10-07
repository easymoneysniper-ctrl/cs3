import java.util.Scanner;

public class PirateTreasureHunt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gold = 0;
        String name;
        String location;
        int choice;

        System.out.println("=================================");
        System.out.println("     PIRATE TREASURE HUNT");
        System.out.println("=================================");
        System.out.println();
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.println("Welcome, " + name + ".");
        System.out.println();
        System.out.println("You were shipwrecked and washed ashore");
        System.out.println("on a mysterious island called Skull Island.");
        System.out.println("Somewhere on this island lies buried pirate treasure!");
        System.out.println();
        System.out.println("You see two paths ahead.");
        System.out.println("1. Follow the jungle trail");
        System.out.println("2. Walk along the beach");
        System.out.print("Enter your choice (1 or 2): ");
        choice = input.nextInt();
        System.out.println();

        if (choice == 1) {
            location = "jungle";
            System.out.println("You push through thick vines in the " + location + ".");
            System.out.println("You find an old wooden chest! (+50 gold)");
            gold = gold + 50;
            System.out.println();
            System.out.println("You hear a roar nearby.");
            System.out.println("1. Hide behind a tree");
            System.out.println("2. Run toward the sound");
            System.out.print("Enter your choice (1 or 2): ");
            choice = input.nextInt();
            System.out.println();
            if (choice == 1) {
                System.out.println("A boar charges past. You find a map to a cave!");
                System.out.println();
                System.out.println("You reach the cave entrance.");
                System.out.println("1. Enter the cave carefully");
                System.out.println("2. Turn back toward the shore");
                System.out.print("Enter your choice (1 or 2): ");
                choice = input.nextInt();
                System.out.println();
                if (choice == 1) {
                    gold = gold + 200;
                    System.out.println("You find the legendary pirate treasure! (+200 gold)");
                    System.out.println("Total gold: " + gold);
                    System.out.println("Congratulations, " + name + "! You found the treasure!");
                } else if (choice == 2) {
                    System.out.println("You escape with " + gold + " gold on a rescue ship.");
                    System.out.println("The great treasure remains hidden. THE END");
                } else {
                    System.out.println("Invalid choice. You fall into a pit. Game over, " + name + ".");
                }
            } else if (choice == 2) {
                gold = 0;
                System.out.println("An angry pirate ghost scares you away! Gold lost.");
                System.out.println("Game over, " + name + ". Total gold: " + gold);
            } else {
                System.out.println("Invalid choice. You get lost. Game over, " + name + ".");
            }
        } else if (choice == 2) {
            location = "beach";
            System.out.println("You walk the " + location + " and find a message in a bottle.");
            System.out.println("It says: \"Dig under the tall palm tree.\"");
            System.out.println();
            System.out.println("1. Dig under the palm tree");
            System.out.println("2. Keep walking down the beach");
            System.out.print("Enter your choice (1 or 2): ");
            choice = input.nextInt();
            System.out.println();
            if (choice == 1) {
                gold = gold + 150;
                System.out.println("You dig up a treasure chest! (+150 gold)");
                System.out.println("Total gold: " + gold);
                System.out.println("Congratulations, " + name + "! You found the treasure!");
            } else if (choice == 2) {
                System.out.println("You find only seashells. A storm ends the hunt.");
                System.out.println("THE END - No treasure found. Gold: " + gold);
            } else {
                System.out.println("Invalid choice. A wave sweeps you away. Game over, " + name + ".");
            }
        } else {
            System.out.println("Invalid choice. The tide forces you to flee.");
            System.out.println("Game over, " + name + ".");
        }
        input.close();
    }
}
