import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersInPairs = Integer.parseInt(scanner.nextLine());
        int previousSum = 0;
        int currentSum = 0;
        int diff = 0;
        int biggestDiff = 0;

        for (int i = 1; i <= numbersInPairs; i++) {
            int numb1 = Integer.parseInt(scanner.nextLine());
            int numb2 = Integer.parseInt(scanner.nextLine());

            if (i == 1) {
                previousSum = numb1 + numb2;
            } else {
                currentSum = numb1 + numb2;
                diff = Math.abs(previousSum - currentSum);
                if (diff > biggestDiff) {
                    biggestDiff = diff;
                }
                previousSum = currentSum;
            }
        }
        if (biggestDiff == 0) {
            System.out.printf("Yes, value=%d", previousSum);
        } else {
            System.out.printf("No, maxdiff=%d", biggestDiff);
        }


    }
}
