import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        String gender = scanner.nextLine();
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double total = 0;
        String sport = "";

        switch (gender) {
            case "girls":
                if ("Winter".equals(season)) {
                    total = (numberOfStudents * nights * 9.60);
                    sport = "Gymnastics";
                } else if ("Spring".equals(season)) {
                    total = (numberOfStudents * nights * 7.20);
                    sport = "Athletics";
                } else if ("Summer".equals(season)) {
                    total = (numberOfStudents * nights * 15);
                    sport = "Volleyball";
                }
                break;
            case "boys":
                if ("Winter".equals(season)) {
                    total = (numberOfStudents * nights * 9.60);
                    sport = "Judo";
                } else if ("Spring".equals(season)) {
                    total = (numberOfStudents * nights * 7.20);
                    sport = "Tennis";
                } else if ("Summer".equals(season)) {
                    total = (numberOfStudents * nights * 15);
                    sport = "Football";
                }
                break;
            case "mixed":
                if ("Winter".equals(season)) {
                    total = (numberOfStudents * nights * 10);
                    sport = "Ski";
                } else if ("Spring".equals(season)) {
                    total = (numberOfStudents * nights * 9.50);
                    sport = "Cycling";
                } else if ("Summer".equals(season)) {
                    total = (numberOfStudents * nights * 20);
                    sport = "Swimming";
                }
                break;
        }

        if (numberOfStudents >= 10 && numberOfStudents < 20) {
            total *= 0.95;
        } else if (numberOfStudents >= 20 && numberOfStudents < 50) {
            total *= 0.85;
        } else if (numberOfStudents >= 50) {
            total *= 0.5;
        }

        System.out.printf("%s %.2f lv.", sport, total);

    }


}

