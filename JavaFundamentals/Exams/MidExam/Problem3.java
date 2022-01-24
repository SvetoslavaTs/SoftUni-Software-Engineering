package midExam;

import java.util.*;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(":")).collect(Collectors.toList());
        String input = scanner.nextLine();
        List<String> deck = new ArrayList<>();

        while (!input.equals("Ready")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Add": {
                    String cardName = tokens[1];
                    if (list.contains(cardName)) {
                        deck.add(cardName);
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                }
                case "Insert": {
                    String cardName = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    if (list.contains(cardName) && (index >= 0 && index <= deck.size() - 1)) {
                        deck.add(index, cardName);
                    } else {
                        System.out.println("Error!");
                    }
                    break;
                }
                case "Remove": {
                    String cardName = tokens[1];
                    if (deck.contains(cardName)) {
                        deck.remove(String.valueOf(cardName));
                    } else {
                        System.out.println("Card not found.");
                    }
                    break;
                }
                case "Swap": {
                    String cardName1 = tokens[1];
                    String cardName2 = tokens[2];
                    int indexOF1 = deck.indexOf(cardName1);
                    int indexOf2 = deck.indexOf(cardName2);
                    String swapedCard = cardName1;
                    deck.set(indexOF1, cardName2);
                    deck.set(indexOf2, swapedCard);
                    break;
                }
                case "Shuffle": {
                    Collections.reverse(deck);
                    break;
                }
                default: {
                    break;
                }
            }


            input = scanner.nextLine();
        }
        System.out.println(String.join(" ", deck));
    }
}
