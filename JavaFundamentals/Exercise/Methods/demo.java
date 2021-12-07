package ExerciseMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 2, 2, 2));
        list.remove((Object) 2);
        System.out.println(list);

    }
}
