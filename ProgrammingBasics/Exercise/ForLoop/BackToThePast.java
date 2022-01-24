import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double heritage = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        int age = 17;


        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                heritage = heritage - 12000;
            }
            if (i % 2 != 0) {
                age += 2;
                heritage -= (12000 + 50 * age);
            }
        }
        if (heritage >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", heritage);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(heritage));
        }
    }
}
