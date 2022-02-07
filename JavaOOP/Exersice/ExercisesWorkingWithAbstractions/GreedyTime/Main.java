
package ExercisesWorkingWithAbstractions.GreedyTime;

import com.sun.source.tree.BreakTree;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] treasures = scanner.nextLine().split("\\s+");

        var bag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();

        for (int i = 0; i < treasures.length; i += 2) {
            String name = treasures[i];
            long amount = Long.parseLong(treasures[i + 1]);
            String typeOfTreasure = checkIfTreasureShouldBeGather(name);

            if (typeOfTreasure.equals("")) {
                continue;
            }

            boolean isBagFull = checkIfBagTotalAmountOverallBagCapacity(bagCapacity, bag, amount);
            if (isBagFull) {
                continue;
            }

            switch (typeOfTreasure) {
                case "Gem":
                    if (!bag.containsKey(typeOfTreasure)) {
                        if (bag.containsKey("Gold")) {
                            if (amount > getSumOfSpecificTreasure("Gold", bag)) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (getSumOfSpecificTreasure(typeOfTreasure, bag) + amount > getSumOfSpecificTreasure("Gold", bag)) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(typeOfTreasure)) {
                        if (bag.containsKey("Gem")) {
                            if (amount > getSumOfSpecificTreasure("Gold", bag)) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (getSumOfSpecificTreasure(typeOfTreasure, bag) + amount > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(typeOfTreasure)) {
                bag.put((typeOfTreasure), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(typeOfTreasure).containsKey(name)) {
                bag.get(typeOfTreasure).put(name, 0L);
            }


            bag.get(typeOfTreasure).put(name, bag.get(typeOfTreasure).get(name) + amount);
        }

        for (
                var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }

    }

    private static boolean checkIfBagTotalAmountOverallBagCapacity
            (long bagCapacity, LinkedHashMap<String, LinkedHashMap<String, Long>> bag, long amount) {
        boolean isBagFull = false;
        long bagTotalAmount = bag.values().stream().map(stringLongLinkedHashMap -> stringLongLinkedHashMap.values())
                .flatMap(longs -> longs.stream()).mapToLong(e -> e).sum() + amount;

        if (bagCapacity < bagTotalAmount) {
            isBagFull = true;
        }
        return isBagFull;
    }

    private static String checkIfTreasureShouldBeGather(String name) {
        String typeOfTreasure = "";
        if (name.length() == 3) {
            typeOfTreasure = "Cash";
        } else if (name.toLowerCase().endsWith("gem")) {
            typeOfTreasure = "Gem";
        } else if (name.toLowerCase().equals("gold")) {
            typeOfTreasure = "Gold";
        }
        return typeOfTreasure;
    }

    public static long getSumOfSpecificTreasure(String typeOfTreasure, LinkedHashMap<String, LinkedHashMap<String, Long>> bag) {
        long sum = 0;
        sum = bag.get(typeOfTreasure).values().stream().mapToLong(e -> e).sum();
        return sum;
    }

}