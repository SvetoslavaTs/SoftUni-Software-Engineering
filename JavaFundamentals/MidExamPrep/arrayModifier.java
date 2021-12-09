package midExamPrep;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "swap": {
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    swapTwoElementOfTheArray(arr, index1, index2);
                    break;
                }
                case "multiply": {
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    arr[index1] = arr[index1] * arr[index2];
                    break;
                }
                case "decrease": {
                    //decreasesAllElementsInTheArrayWithOne(arr);
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = arr[i] - 1;
                    }
                    break;
                }
                default: {
                    break;
                }
            }


            input = scanner.nextLine();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
    }


    private static void swapTwoElementOfTheArray(int[] arr, int index1, int index2) {
        int elementAtFirstIndex = arr[index1];
        int elementAtSecondIndex = arr[index2];
        arr[index1] = elementAtSecondIndex;
        arr[index2] = elementAtFirstIndex;
    }
}
