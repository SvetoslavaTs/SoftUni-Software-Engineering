import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivingHour = Integer.parseInt(scanner.nextLine());
        int arrivingMinutes = Integer.parseInt(scanner.nextLine());

        int examInMinutes = examHour * 60 + examMinutes;
        int arrivingInMinutes = arrivingHour * 60 + arrivingMinutes;
        int time = Math.abs(examInMinutes - arrivingInMinutes);


        if (examInMinutes == arrivingInMinutes) {
            System.out.println("On time");
        } else if ((examInMinutes > arrivingInMinutes) && (time <= 30)) {
            System.out.println("On time");
        } else if ((examInMinutes > arrivingInMinutes) && (time > 30)) {
            System.out.println("Early");
        } else if (examInMinutes < arrivingInMinutes) {
            System.out.println("Late");
        }

        if ((examInMinutes > arrivingInMinutes) && (time <= 59)) {
            System.out.printf("%d minutes before the start", time);
        } else if ((examInMinutes > arrivingInMinutes) && (time >= 60)) {
            int hour = time / 60;
            int minutes = time % 60;
            if (minutes <= 9) {
                System.out.printf("%d:0%d hours before the start", hour, minutes);
            } else {
                System.out.printf("%d:%d hours before the start", hour, minutes);
            }
        } else if ((examInMinutes < arrivingInMinutes) && (time <= 59)) {
            System.out.printf("%d minutes after the start", time);
        } else if ((examInMinutes < arrivingInMinutes) && (time >= 60)) {
            int hour = time / 60;
            int minutes = time % 60;
            if (minutes <= 9) {
                System.out.printf("%d:0%d hours after the start", hour, minutes);
            } else {
                System.out.printf("%d:%d hours after the start", hour, minutes);
            }

        }

    }
}
