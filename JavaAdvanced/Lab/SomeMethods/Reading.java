package Methods;

import java.util.*;
import java.util.stream.Collectors;

public class Reading {
    Scanner scanner = new Scanner(System.in);

    List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
            .map(Integer::parseInt).collect(Collectors.toList());

    int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

    Set<Integer> divisibleNums = Arrays.stream(scanner.nextLine()
            .split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet());

    Set<Integer> nums = Arrays.stream(scanner.nextLine()
            .split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toCollection(HashSet::new));
}
