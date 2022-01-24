import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        //Scanner -> 1 променлива цяло число - почивни дни в годината
        // Данни - 365 дни в годината; работи-63мин игра на ден, почива-127мин игра на ден;
        // Изчислявам колко е нормата за годината ( поч.дни*127 + (365-поч.дни)*63)
        // If нормата > 30 000 мин { смятам нормата - 30 000 и деля два пъти с / и % за часове и минути }
        // и принтирам “Tom will run away” /n “{H} hours and {M} minutes more for play”
        // else -> смятам 30 000 - нормата и деля по два начина; принт:
        // “Tom sleeps well”, “{H} hours and {M} minutes less for play”
        Scanner scanner = new Scanner(System.in);
        int holidays = Integer.parseInt(scanner.nextLine());
        int standard = holidays * 127 + (365 - holidays) * 63;
        if (standard > 30000) {
            double over = standard - 30000;
            double overInHour = Math.floor(over / 60);
            double overInMinutes = over % 60;
            System.out.printf("Tom will run away %n%.0f hours and %.0f minutes more for play", overInHour, overInMinutes);

        } else {
            double over = 30000 - standard;
            double overInHour = Math.floor(over / 60);
            double overInMinutes = over % 60;
            System.out.printf("Tom sleeps well %n%.0f hours and %.0f minutes less for play", overInHour, overInMinutes);
        }

    }
}
