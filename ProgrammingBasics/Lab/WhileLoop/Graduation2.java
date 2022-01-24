import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 1;
        int counterFail = 0;
        double totalGradeSum = 0;

        while (counter <= 12) {
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade >= 4) {
                counter++;
                totalGradeSum += currentGrade;
            } else {
                counterFail++;
            }
            if (counterFail >= 2) {
                break;
            }
        }
        if (counterFail >= 2) {
            System.out.printf("%s has been excluded at %d grade", name, counter);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", name, totalGradeSum / 12);
        }

    }

}




