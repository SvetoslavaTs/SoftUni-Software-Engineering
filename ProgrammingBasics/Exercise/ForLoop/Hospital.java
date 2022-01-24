import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctors = 7;

        for (int i = 1; i <= days; i++) {
            int countPatients = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0) {
                if (treatedPatients < untreatedPatients) {
                    doctors += 1;
                }
            }
            if (countPatients <= doctors) {
                treatedPatients += countPatients;
            } else {
                treatedPatients += doctors;
                untreatedPatients += (countPatients - doctors);
            }
        }
        System.out.println("Treated patients: " + treatedPatients + ".");
        System.out.println("Untreated patients: " + untreatedPatients + ".");

    }

}

