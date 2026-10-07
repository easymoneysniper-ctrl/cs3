import java.util.Scanner;

public class PirateTreasureHunt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gold = 0;
        int health = 100;
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
        System.out.println("Health: " + health);
        System.out.println();

        System.out.println("You see three paths ahead.");
        System.out.println("1. Follow the jungle trail");
        System.out.println("2. Walk along the beach");
        System.out.println("3. Squeeze through a narrow crack in the rocks (secret?)");
        System.out.print("Enter your choice (1, 2, or 3): ");
        choice = input.nextInt();
        System.out.println();

        if (choice == 1) {
            location = "jungle";
            System.out.println("You push through thick vines and hear strange noises.");
            System.out.println("You find an old wooden chest half-buried in the mud!");
            gold = gold + 50;
            System.out.println("Inside you find 50 gold coins!");
            System.out.println();

            System.out.println("Deeper in the jungle you hear a roar.");
            System.out.println("1. Hide behind a tree");
            System.out.println("2. Run toward the sound");
            System.out.print("Enter your choice (1 or 2): ");
            choice = input.nextInt();
            System.out.println();

            if (choice == 1) {
                System.out.println("A wild boar charges past. You stay safe.");
                System.out.println("Behind the tree you spot a glowing map fragment.");
                System.out.println("It points to a cave near the cliffs.");
                System.out.println();

                System.out.println("You reach the cave entrance.");
                System.out.println("1. Enter the cave carefully");
                System.out.println("2. Turn back toward the shore");
                System.out.print("Enter your choice (1 or 2): ");
                choice = input.nextInt();
                System.out.println();

                if (choice == 1) {
                    gold = gold + 200;
                    System.out.println("Inside the cave you find the legendary pirate treasure!");
                    System.out.println("You collect 200 more gold coins.");
                    System.out.println("Total gold: " + gold + " | Health: " + health);
                    System.out.println("Congratulations, " + name + "! You found the treasure!");
                } else if (choice == 2) {
                    System.out.println("You head back to the shore with your " + gold + " gold coins.");
                    System.out.println("A rescue ship arrives. You escape safely,");
                    System.out.println("but the great treasure remains hidden.");
                    System.out.println("THE END");
                } else {
                    System.out.println("Invalid choice. You stumble and fall into a pit.");
                    health = 0;
                    System.out.println("Game over, " + name + ". Health: " + health);
                }
            } else if (choice == 2) {
                System.out.println("You run toward the roar and meet an angry pirate ghost!");
                System.out.println("It scares you off the island. You lose your gold.");
                gold = 0;
                health = health - 40;
                System.out.println("Game over, " + name + ". Gold: " + gold + " | Health: " + health);
            } else {
                System.out.println("Invalid choice. You get lost in the jungle.");
                System.out.println("Game over, " + name + ".");
            }
        } else if (choice == 2) {
            location = "beach";
            System.out.println("You walk along the sandy beach. The sun is hot.");
            health = health - 10;
            System.out.println("The heat drains you a little. Health: " + health);
            System.out.println("You find a message in a bottle!");
            System.out.println("It says: \"Dig under the tall palm tree.\"");
            System.out.println();

            System.out.println("You see a tall palm tree nearby.");
            System.out.println("1. Dig under the palm tree");
            System.out.println("2. Keep walking down the beach");
            System.out.print("Enter your choice (1 or 2): ");
            choice = input.nextInt();
            System.out.println();

            if (choice == 1) {
                gold = gold + 150;
                System.out.println("You dig and uncover a treasure chest!");
                System.out.println("You found 150 gold coins!");
                System.out.println("Total gold: " + gold + " | Health: " + health);
                System.out.println("Congratulations, " + name + "! You found the treasure!");
            } else if (choice == 2) {
                System.out.println("You keep walking and find nothing but seashells.");
                System.out.println("Night falls. You are still stranded on " + location + ".");
                System.out.println("A storm washes away any chance of treasure.");
                System.out.println("THE END - No treasure found.");
            } else {
                System.out.println("Invalid choice. A wave sweeps you out to sea.");
                health = 0;
                System.out.println("Game over, " + name + ". Health: " + health);
            }
        } else if (choice == 3) {
            location = "secret cave";
            System.out.println("You squeeze through the narrow crack...");
            System.out.println("You discover a SECRET CAVE glowing with blue light!");
            System.out.println("A skeleton sits on a throne of gold.");
            System.out.println();

            System.out.println("The skeleton whispers: \"Answer wisely, or perish.\"");
            System.out.println("1. Take the glowing gem from its hand");
            System.out.println("2. Bow respectfully and wait");
            System.out.println("3. Grab as much gold as you can and run");
            System.out.print("Enter your choice (1, 2, or 3): ");
            choice = input.nextInt();
            System.out.println();

            if (choice == 1) {
                gold = gold + 500;
                health = health + 20;
                System.out.println("The gem pulses with power! The skeleton nods.");
                System.out.println("You found the SECRET pirate treasure: 500 gold!");
                System.out.println("The gem also heals you. Health: " + health);
                System.out.println("Total gold: " + gold);
                System.out.println("Amazing, " + name + "! You found the secret treasure!");
            } else if (choice == 2) {
                gold = gold + 300;
                System.out.println("The skeleton smiles (somehow) and gifts you 300 gold.");
                System.out.println("\"Honesty is rare,\" it says, then fades away.");
                System.out.println("Total gold: " + gold + " | Health: " + health);
                System.out.println("Well done, " + name + "! Alternate treasure ending!");
            } else if (choice == 3) {
                health = health - 60;
                gold = gold + 100;
                System.out.println("You grab gold and run, but a curse hits you!");
                System.out.println("You escape with 100 gold, but you are badly hurt.");
                System.out.println("Gold: " + gold + " | Health: " + health);
                if (health <= 0) {
                    System.out.println("You collapse outside the cave. Game over, " + name + ".");
                } else {
                    System.out.println("You limp to the shore. A ship rescues you.");
                    System.out.println("THE END - Cursed, but alive.");
                }
            } else {
                System.out.println("Invalid choice. The cave collapses!");
                health = 0;
                System.out.println("Game over, " + name + ". Health: " + health);
            }
        } else {
            System.out.println("Invalid choice. You stand still too long.");
            System.out.println("The tide comes in and you must swim for safety.");
            System.out.println("Game over, " + name + ".");
        }

        input.close();
    }
}
