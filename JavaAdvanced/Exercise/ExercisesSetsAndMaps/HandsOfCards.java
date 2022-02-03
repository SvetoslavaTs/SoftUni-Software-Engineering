package ExercisesSetsAndMaps;

import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> hands = new LinkedHashMap<>();
        String line = scanner.nextLine();

        while (!line.equals("JOKER")) {
            String[] input = line.split(":\\s+");
            String name = input[0];
            String[] cards = input[1].split(", ");

            hands.putIfAbsent(name, new LinkedHashSet<>());
            hands.get(name).addAll(Arrays.asList(cards));
            //добавянето може да стане и с foreach:
//            for (String card : cards) {
//                hands.get(name).add(card);
//            }

            line = scanner.nextLine();
        }

        hands.forEach((key, value) -> {
            int sum = calculateTheHand(value);
            System.out.printf("%s: %d%n", key, sum);
        });

    }

    private static int calculateTheHand(Set<String> deck) {
        int sum = 0;
        while (!deck.isEmpty()) {
            String currentCard = deck.iterator().next();
            deck.remove(currentCard);
            int power = 0;
            if (currentCard.length() == 3) {
                power = 10;
            } else if (Character.isDigit(currentCard.charAt(0))) {
                power = Integer.parseInt(String.valueOf(currentCard.charAt(0)));
            } else {
                switch (currentCard.charAt(0)) {
                    case 'J':
                        power = 11;
                        break;
                    case 'Q':
                        power = 12;
                        break;
                    case 'K':
                        power = 13;
                        break;
                    case 'A':
                        power = 14;
                        break;
                }
            }
            int type = 0;
            char typeCard;
            if (currentCard.length() == 3) {
                typeCard = currentCard.charAt(2);
            } else {
                typeCard = currentCard.charAt(1);
            }
            switch (typeCard) {
                case 'S':
                    type = 4;
                    break;
                case 'H':
                    type = 3;
                    break;
                case 'D':
                    type = 2;
                    break;
                case 'C':
                    type = 1;
                    break;
            }
            sum += power * type;
        }

        return sum;
    }
}
