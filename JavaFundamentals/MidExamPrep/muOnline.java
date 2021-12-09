package midExamPrep;

import java.util.Scanner;

public class muOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHealth = 100;
        int initialBitcoins = 0;
        String[] input = scanner.nextLine().split("\\|");
        int counterOfRooms = 0;
        while (!(counterOfRooms == input.length)) {
            String[] tokens = input[counterOfRooms].split(" ");
            String command = tokens[0];
            switch (command) {
                case "potion":
                    int health = Integer.parseInt(tokens[1]);
                    int healedFor = 0;
                    if (initialHealth + health <= 100) {
                        healedFor = health;
                        initialHealth += health;
                    } else {
                        healedFor = 100 - initialHealth;
                        initialHealth = 100;
                    }
                    System.out.printf("You healed for %d hp.%n", healedFor);
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                    counterOfRooms++;
                    break;
                case "chest":
                    int bitCoins = Integer.parseInt(tokens[1]);
                    initialBitcoins += bitCoins;
                    System.out.printf("You found %d bitcoins.%n", bitCoins);
                    counterOfRooms++;
                    break;
                default:
                    int attack = Integer.parseInt(tokens[1]);
                    initialHealth -= attack;
                    if (initialHealth <= 0) {
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d", counterOfRooms + 1);
                        return;
                    } else {
                        System.out.printf("You slayed %s.%n", command);
                    }
                    counterOfRooms++;
                    break;
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", initialBitcoins);
        System.out.printf("Health: %d", initialHealth);


    }
}
