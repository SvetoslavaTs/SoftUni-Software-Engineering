package LabGenerics.ListUtilities;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(8);
        integers.add(42);

        Integer max = ListUtils.getMax(integers);
        Integer min = ListUtils.getMin(integers);
        System.out.println(max);
        System.out.println(min);

        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");

        String max1 = ListUtils.getMax(strings);
        String min1 = ListUtils.getMin(strings);
        System.out.println(max1);
        System.out.println(min1);
    }
}
