import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int groupTo200 = 0;
        int groupTo400 = 0;
        int groupTo600 = 0;
        int groupTo800 = 0;
        int groupFrom800 = 0;


        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum < 200) {
                groupTo200 += 1;
            } else if (currentNum >= 200 && currentNum <= 399) {
                groupTo400 += 1;
            } else if (currentNum >= 400 && currentNum <= 599) {
                groupTo600 += 1;
            } else if (currentNum >= 600 && currentNum <= 799) {
                groupTo800 += 1;
            } else if (currentNum >= 800) {
                groupFrom800 += 1;
            }
        }

        System.out.printf("%.2f%%%n", 1.0 * groupTo200 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * groupTo400 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * groupTo600 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * groupTo800 / n * 100);
        System.out.printf("%.2f%%%n", 1.0 * groupFrom800 / n * 100);


    }
}
