import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 1;
        double totalGradeSum = 0;

        while (counter <= 12) {
            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade >= 4) {
                totalGradeSum += currentGrade;
                counter++;
            }
        }

        System.out.printf("%s graduated. Average grade: %.2f", name, totalGradeSum / 12);
    }

}




