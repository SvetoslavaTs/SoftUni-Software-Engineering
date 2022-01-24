package ExercisesTextProcessing;

import java.util.Scanner;

public class extractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\\\");
        String nameAndExt = input[input.length - 1];
        String[] nameAndExtAsArray = nameAndExt.split("[.]");
        System.out.println("File name: " + nameAndExtAsArray[0]);
        System.out.println("File extension: " + nameAndExtAsArray[1]);
    }
}
