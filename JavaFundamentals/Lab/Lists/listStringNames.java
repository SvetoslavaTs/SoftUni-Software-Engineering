package ListLab;

import java.util.*;

public class listStringNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>(Arrays.asList("Svetoslava", "George", "Rumiana", "Hristina"));
        Collections.sort(names);
        Collections.reverse(names);

        System.out.println(String.join(", ", names));


    }
}
