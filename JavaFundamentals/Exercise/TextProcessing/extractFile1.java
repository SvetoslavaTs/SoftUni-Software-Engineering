package ExercisesTextProcessing;

import java.util.Scanner;

public class extractFile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String nameAndExt = input.substring(input.lastIndexOf("\\") + 1);
        String name = nameAndExt.substring(0, nameAndExt.indexOf("."));
        String extension = nameAndExt.substring(nameAndExt.indexOf(".") + 1);

        System.out.println("File name: " + name);
        System.out.println("File extension: " + extension);


    }
}
