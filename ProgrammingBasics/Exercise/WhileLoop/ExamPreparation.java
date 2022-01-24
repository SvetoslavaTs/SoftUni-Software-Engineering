import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noGrade = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        double sumGrade = 0;
        int counter = 0;
        int counterNo = 0;
        String lastName = "";

        while (!name.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            sumGrade += grade;
            lastName = name;
            if (grade > 4) {
                counter++;
            } else {
                counter++;
                counterNo++;
            }
            if (counterNo >= noGrade) {
                System.out.printf("You need a break, %d poor grades.", counterNo);
                break;
            }
            name = scanner.nextLine();
        }
        if (name.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", sumGrade / counter);
            System.out.printf("Number of problems: %d%n", counter);
            System.out.printf("Last problem: %s", lastName);
        }
    }
}
