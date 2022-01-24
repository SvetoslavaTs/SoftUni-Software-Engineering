import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hallLengthInSqMetres = Double.parseDouble(scanner.nextLine());
        double hallWidthInSqMetres = Double.parseDouble(scanner.nextLine());
        double wardrobeSideInSqMetres = Double.parseDouble(scanner.nextLine());

        double hallAreaInCentimeters = (hallLengthInSqMetres * 100) * (hallWidthInSqMetres * 100);
        double wardrobeAreaInCentimeters = (wardrobeSideInSqMetres * 100) * (wardrobeSideInSqMetres * 100);
        double benchAreaInSqCentimeters = hallAreaInCentimeters / 10;
        double freeHallSpaceInSqCentimetres = (hallAreaInCentimeters - wardrobeAreaInCentimeters - benchAreaInSqCentimeters);
        double numberOfDancers = Math.floor(freeHallSpaceInSqCentimetres / 7040);
        System.out.printf("%.0f", numberOfDancers);
    }
}
