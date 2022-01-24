import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = scanner.nextLine();
        int counterTotal = 0;
        int counterStudent = 0;
        int counterStandard = 0;
        int counterKid = 0;
        int counterMovie = 0;
        boolean flag = false;


        while (!movie.equals("Finish")) {
            int freePlaces = Integer.parseInt(scanner.nextLine());
            String typeOfTickets = scanner.nextLine();
            while (!typeOfTickets.equals("End")) {
                counterTotal++;
                if (typeOfTickets.equals("student")) {
                    counterStudent++;
                    counterMovie++;
                } else if (typeOfTickets.equals("standard")) {
                    counterStandard++;
                    counterMovie++;
                } else if (typeOfTickets.equals("kid")) {
                    counterKid++;
                    counterMovie++;
                }
                if (counterMovie >= freePlaces) {
                    flag = true;
                    break;
                }
                typeOfTickets = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, 1.0 * counterMovie / freePlaces * 100);
            counterMovie = 0;
            movie = scanner.nextLine();
        }
        System.out.println("Total tickets: " + counterTotal);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * counterStudent / counterTotal * 100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * counterStandard / counterTotal * 100);
        System.out.printf("%.2f%% kids tickets.", 1.0 * counterKid / counterTotal * 100);


    }

}

