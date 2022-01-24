import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        //1.scanner ->входни данни (бюджет, брой статисти, цена на облекло за 1 статист)
        //2.пресмятане декора на филма
        //3.пресмятане на облеклото с if-else за отстъпка 10% над 150 статиста (брой статисти * цена на облекло) *0.9, и ако не е вярно-> (брой статисти *цена на облекло)
        //4.пресмятане пари за декор и дрехи (декор+дрехи)
        //5. if-else ако (декор+дрехи)>бюджет = "Not enough money!""Wingard needs {парите недостигащи за филма} leva more."
        // ако (декор+дрехи) <= бюджет -> "Action!" "Wingard starts filming with {останалите пари} leva left."
        //6. резултат закръглен до 2 знака след десет.зап.

        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceClothsPerOnePerson = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;
        double priceCloths = 0;
        if (people > 150) {
            priceCloths = (people * priceClothsPerOnePerson) * 0.9;
        } else {
            priceCloths = people * priceClothsPerOnePerson;
        }
        double totalPrice = decorPrice + priceCloths;
        if (totalPrice > budget) {
            totalPrice = totalPrice - budget;
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", totalPrice);
        } else {
            totalPrice = budget - totalPrice;
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", totalPrice);
        }

    }
}


