import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        // Скенер - 3 променливи (рекорд в секунди(дабъл)+разстоянието,к'то трябва да преплува в метри(дабъл)+
        // време в секунди за 1 метър преплуван от Иван(дабъл);
        // Забавяне=(разстояние,к'то трябва да плува/15 м ) * 12.5 секунди ->закръхляне надолу до най-близкото цяло число
        // Резултат = (разстоянието * скороста му за 1 м) - забавянето
        // Резултата спрямо световния рекорд -> if-else с 2 souf;

        Scanner scanner = new Scanner(System.in);
        double worldRecordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timeInSecPerMeterIvan = Double.parseDouble(scanner.nextLine());
        double delay = Math.floor(distanceInMetres / 15) * 12.5;
        double resultIvan = distanceInMetres * timeInSecPerMeterIvan + delay;
        if (resultIvan < worldRecordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", resultIvan);
        } else {
            resultIvan = Math.abs(worldRecordInSeconds - resultIvan);
            System.out.printf("No, he failed! He was %.2f seconds slower.", resultIvan);
        }

    }
}
