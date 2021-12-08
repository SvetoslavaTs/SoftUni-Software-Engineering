package ExerciseObjectAndClasses;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class advertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Message message = new Message();

        for (int i = 0; i < n; i++) {
            System.out.println(message.randomMassage());
        }

    }

    static class Message {
        private String[] phrase = {"Excellent product.", "Such a great product.",
                "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};
        private String[] events = {"Now I feel good.", "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.", "I feel great!"};
        private String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        private String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random generator = new Random();

        public String randomMassage() {
            return String.format("%s %s %s - %s", phrase[generator.nextInt(phrase.length)],
                    events[generator.nextInt(events.length)], authors[generator.nextInt(authors.length)],
                    cities[generator.nextInt(cities.length)]);
        }
    }
}
