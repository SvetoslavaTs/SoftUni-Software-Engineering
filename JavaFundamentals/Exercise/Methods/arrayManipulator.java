package ExerciseMethods;

import java.util.Arrays;
import java.util.Scanner;

public class arrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= arr.length || index < 0) {
                        System.out.println("Invalid index");
                        break;
                    } else {
                        arr = exchangeArrayByIndex(arr, index);
                    }
                    break;
                case "max": {
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        findMaxEvenNum(arr);
                    } else if (evenOrOdd.equals("odd")) {
                        findMaxOddNum(arr);
                    }
                }
                break;
                case "min": {
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        findMinEvenNum(arr);
                    } else if (evenOrOdd.equals("odd")) {
                        findMinOddNum(arr);
                    }
                }
                break;
                case "first": {
                    int count = Integer.parseInt(tokens[1]);
                    String evenOrOdd = tokens[2];
                    if (count < 0 || count > arr.length) {
                        System.out.println("Invalid count");
                        break;
                    }
                    if (evenOrOdd.equals("even")) {
                        findFirstEvenNums(arr, count);
                    } else if (evenOrOdd.equals("odd")) {
                        findFirstOddNums(arr, count);
                    }
                }
                break;
                case "last": {
                    int count = Integer.parseInt(tokens[1]);
                    String evenOrOdd = tokens[2];
                    if (count < 0 || count > arr.length) {
                        System.out.println("Invalid count");
                        break;
                    }
                    if (evenOrOdd.equals("even")) {
                        findLastCountEvenNums(arr, count);
                    } else if (evenOrOdd.equals("odd")) {
                        findLastCountOddNums(arr, count);
                    }
                }
                break;
            }

            input = scanner.nextLine();
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void findLastCountOddNums(int[] arr, int count) {
        int[] temp = new int[0];
        int countOddNums = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                countOddNums++;
                temp = expandAndAddNum(arr[i], temp);
                if (temp.length == count) {
                    break;
                }
            }
        }
        if (countOddNums == 0) {
            System.out.println("[]");
        } else {
            reverseArray(temp);
        }
    }

    private static void findLastCountEvenNums(int[] arr, int count) {
        int[] temp = new int[0];
        int countEvenNums = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                countEvenNums++;
                temp = expandAndAddNum(arr[i], temp);
                if (temp.length == count) {
                    break;
                }
            }
        }
        if (countEvenNums == 0) {
            System.out.println("[]");
        } else {
            reverseArray(temp);
        }
    }

    private static void reverseArray(int[] temp) {
        int[] reversed = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            reversed[i] = temp[temp.length - 1 - i];
        }
        System.out.println(Arrays.toString(reversed));
    }

    private static void findFirstOddNums(int[] arr, int count) {
        int[] temp = new int[0];
        int countOddNums = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                countOddNums++;
                temp = expandAndAddNum(arr[i], temp);
                if (temp.length == count) {
                    break;
                }
            }
        }
        if (countOddNums == 0) {
            System.out.println("[]");
        } else {
            System.out.println(Arrays.toString(temp));
        }
    }

    private static void findFirstEvenNums(int[] arr, int count) {
        int[] temp = new int[0];
        int countEvenNums = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEvenNums++;
                temp = expandAndAddNum(arr[i], temp);
                if (temp.length == count) {
                    break;
                }
            }
        }
        if (countEvenNums == 0) {
            System.out.println("[]");
        } else {
            System.out.println(Arrays.toString(temp));
        }
    }

    private static int[] expandAndAddNum(int num, int[] arr) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = num;
        return newArray;
    }

    private static void findMinOddNum(int[] arr) {
        int index = -1;
        int minEvenNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (arr[i] <= minEvenNum) {
                    minEvenNum = arr[i];
                    index = i;
                }
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void findMinEvenNum(int[] arr) {
        int index = -1;
        int minEvenNum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] <= minEvenNum) {
                    minEvenNum = arr[i];
                    index = i;
                }
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void findMaxOddNum(int[] arr) {
        int index = -1;
        int maxEvenNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (arr[i] >= maxEvenNum) {
                    maxEvenNum = arr[i];
                    index = i;
                }
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static void findMaxEvenNum(int[] arr) {
        int index = -1;
        int maxEvenNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] >= maxEvenNum) {
                    maxEvenNum = arr[i];
                    index = i;
                }
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    private static int[] exchangeArrayByIndex(int[] arr, int index) {
        int[] exchangeArr = new int[arr.length];
        int countIndex = 0;
        for (int i = index + 1; i < arr.length; i++) {
            exchangeArr[countIndex] = arr[i];
            countIndex++;
        }
        for (int i = 0; i <= index; i++) {
            exchangeArr[countIndex] = arr[i];
            countIndex++;
        }
        return exchangeArr;
    }
}
