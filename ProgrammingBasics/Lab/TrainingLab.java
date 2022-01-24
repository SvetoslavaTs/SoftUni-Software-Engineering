import java.util.Scanner;

public class TrainingLab {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lengthInMetres = Double.parseDouble(scanner.nextLine());
        double widthInMetres = Double.parseDouble(scanner.nextLine());
        double lengthInCentimetres = lengthInMetres * 100.0;
        double widthInCentimetres = widthInMetres * 100.0;
        double deskInARow = Math.floor((widthInCentimetres - 100.0) / 70.0);
        double rowsInHall = Math.floor(lengthInCentimetres / 120.0);
        double numberOfWorkPlaces = rowsInHall * deskInARow - 3.0;
        if (widthInMetres >= 3.0D && widthInMetres <= lengthInMetres && lengthInMetres <= 100.0) {
            System.out.println(numberOfWorkPlaces);
        }

    }
}
