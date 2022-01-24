import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfJudges = Integer.parseInt(scanner.nextLine());
        String namePresentation = scanner.nextLine();
        double sumMark = 0;
        double avgMark = 0;
        int counterPresentation = 0;


        while (!namePresentation.equals("Finish")) {
            for (int i = 1; i <= numOfJudges; i++) {
                double mark = Double.parseDouble(scanner.nextLine());
                sumMark += mark;
                counterPresentation++;
            }
            System.out.printf("%s - %.2f.%n", namePresentation, sumMark / numOfJudges);
            avgMark += sumMark;
            sumMark = 0;
            namePresentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", avgMark / counterPresentation);
    }
}
