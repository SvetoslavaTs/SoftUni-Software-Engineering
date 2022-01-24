import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        // Скенер+3 променливи double - доход в лв.+среден успех+ мин.раб.заплаата
        // if -else -> ако са изпълнени условия за соц стипендия, смятам колко е тя, ако не ->рвана на 0
        // if-else -> ако са изпълнени усл. за стипендия отличен успех, смятам колко е тя, ако не -> равна на 0
        // if-else-if -> ако няма право на стипендия (и двете стипендии =0); ако има право на соц.стипендия (!=0)
        // и е > стипендия за отличен; ако има право на стипендия за отл (!=0) и тя е > социална стипендия.

        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double grades = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());
        double socialScholarship = 0;
        double exellentScholarship = 0;
        if (income < minSalary & grades > 4.5) {
            socialScholarship = Math.floor(minSalary * 0.35);
        } else {
            socialScholarship = 0;
        }
        if (grades >= 5.5) {
            exellentScholarship = Math.floor(grades * 25);
        } else {
            exellentScholarship = 0;
        }
        if (socialScholarship == 0 & exellentScholarship == 0) {
            System.out.println("You cannot get a scholarship!");
        } else if (socialScholarship > exellentScholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else if (exellentScholarship > socialScholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", exellentScholarship);
        }

    }
}
