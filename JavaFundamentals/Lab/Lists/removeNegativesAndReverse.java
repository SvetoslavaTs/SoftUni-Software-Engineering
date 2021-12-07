package ListLab;

import java.util.*;
import java.util.stream.Collectors;

public class removeNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) < 0) {
                input.remove(i--);
            }
        }
        if (input.isEmpty()) {
            System.out.println("empty");
        } else {
            Collections.reverse(input);
            for (Integer number : input) {
                System.out.print(number + " ");
            }


        }
    }
}
