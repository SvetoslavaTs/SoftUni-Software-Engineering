package AssociativeArraysLambdaAndStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split(" "))
                .map(s -> Integer.parseInt(s))
                .sorted((a, b) -> b.compareTo(a))
                //сортирането може да се направи и така:
                //.sorted(Comparator.reverseOrder()); - този метод
                // прави естествено подреждане, т.е. интовете ще ги подреди от малко към голямо
                //и след това ще обърне реда (reverse)
                .limit(3)
                .forEach(i -> System.out.print(i + " "));
    }

}
