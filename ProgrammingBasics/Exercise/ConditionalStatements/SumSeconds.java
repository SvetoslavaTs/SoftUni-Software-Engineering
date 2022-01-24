import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time1InSeconds = Integer.parseInt(scanner.next());
        int time2InSeconds = Integer.parseInt(scanner.next());
        int time3InSeconds = Integer.parseInt(scanner.next());

        int totalTimeInSeconds = time1InSeconds + time2InSeconds + time3InSeconds;
        int totalTimeOnlyMinutes = totalTimeInSeconds / 60;
        int totalTimeOnlySeconds = totalTimeInSeconds % 60;
        if (totalTimeOnlySeconds <= 9) {
            System.out.printf("%d:0%d", totalTimeOnlyMinutes, totalTimeOnlySeconds);
        } else {
            System.out.printf("%d:%d", totalTimeOnlyMinutes, totalTimeOnlySeconds);
        }
    }
}
