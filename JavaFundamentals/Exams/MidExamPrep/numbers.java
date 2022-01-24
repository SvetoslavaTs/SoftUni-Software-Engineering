package midExamPrep;

import java.util.*;
import java.util.stream.Collectors;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        double sumOfAllElementsInTheList = 0;
        for (Integer integer : input) {
            sumOfAllElementsInTheList += integer;
        }
        double averageNumber = sumOfAllElementsInTheList / input.size();
        List<Integer> numsGreaterThanAverageNumber = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) > averageNumber) {
                numsGreaterThanAverageNumber.add(input.get(i));
            }
        }
        numsGreaterThanAverageNumber.sort((a, b) -> b.compareTo(a));
        if (numsGreaterThanAverageNumber.size() > 0) {
            for (int i = 0; i < numsGreaterThanAverageNumber.size(); i++) {
                if (i >= 5) {
                    break;
                } else {
                    System.out.print(numsGreaterThanAverageNumber.get(i) + " ");
                }
            }
        } else {
            System.out.println("No");
        }


    }
}
