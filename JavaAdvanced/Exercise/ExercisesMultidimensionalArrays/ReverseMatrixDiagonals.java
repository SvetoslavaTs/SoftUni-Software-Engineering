package ExercisesMultidimensionalArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scanner = new Scanner(System.in);

        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        String[] data = reader.readLine().split("\\s+");

        int[][] matrix = new int[Integer.parseInt(data[0])][Integer.parseInt(data[1])];
        //TODO fulfill the matrix
        for (int i = 0; i < matrix.length; i++) {
            int[] current = Arrays.stream(reader.readLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            matrix[i] = current;
        }
        int wait = 0;
        int group = 0;
        int counter = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            int[] current = matrix[i];

            for (int j = current.length - 1; j >= group; j--) {
                int value = matrix[i][j];

                if (wait == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(value);
                    map.put(counter, list);
                    counter++;
                } else {
                    List<Integer> list = map.get(counter);
                    list.add(value);
                    map.put(counter, list);
                    counter++;
                }

            }

            for (int j = matrix.length - 1 - 1 - group; j >= 0; j--) {
                int[] curr = matrix[j];

                if (group >= curr.length) {

                    continue;

                }

                int value = curr[group];

                if (wait == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(value);
                    map.put(counter, list);
                    counter++;
                } else {
                    List<Integer> list = map.get(counter);
                    list.add(value);
                    map.put(counter, list);
                    counter++;
                }


            }
            group++;
            counter = group;
            wait++;
        }

        map.entrySet().stream().forEach(entry -> {
            List<Integer> list = map.get(entry.getKey());

            for (int n : list) {
                System.out.print(n + " ");
            }
            System.out.println();

        });


    }
}


