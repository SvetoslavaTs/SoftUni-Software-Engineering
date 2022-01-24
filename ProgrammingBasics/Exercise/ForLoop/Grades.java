import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfStudentsGrade3 = 0;
        int numberOfStudentsGrade4 = 0;
        int numberOfStudentsGrade5 = 0;
        int numberOfStudentsGrade6 = 0;

        double totalGrade = 0;

        for (int i = 1; i <= numberOfStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 3) {
                numberOfStudentsGrade3 += 1;
                totalGrade += grade;
            } else if (grade >= 3 && grade < 4) {
                numberOfStudentsGrade4 += 1;
                totalGrade += grade;
            } else if (grade >= 4 && grade < 5) {
                numberOfStudentsGrade5 += 1;
                totalGrade += grade;
            } else {
                numberOfStudentsGrade6 += 1;
                totalGrade += grade;
            }
        }
        System.out.printf("Top students: %.2f%%%n", 1.0 * numberOfStudentsGrade6 / numberOfStudents * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", 1.0 * numberOfStudentsGrade5 / numberOfStudents * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", 1.0 * numberOfStudentsGrade4 / numberOfStudents * 100);
        System.out.printf("Fail: %.2f%%%n", 1.0 * numberOfStudentsGrade3 / numberOfStudents * 100);
        System.out.printf("Average: %.2f", 1.0 * totalGrade / numberOfStudents);

    }

}

