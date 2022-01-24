package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "(.+)>(?<digits>[0-9]{3})\\|(?<lower>[a-z]{3})\\|(?<upper>[A-Z]{3})\\|(?<exept>[^<>]{3})<\\1";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String encrypted = matcher.group("digits") + matcher.group("lower")
                        + matcher.group("upper") + matcher.group("exept");
                System.out.println("Password: " + encrypted);
            } else {
                System.out.println("Try another password!");
            }

        }


    }
}
