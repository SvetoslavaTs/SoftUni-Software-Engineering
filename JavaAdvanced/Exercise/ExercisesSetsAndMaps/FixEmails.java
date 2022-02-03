package ExercisesSetsAndMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String regex = "(?i)\\.[uk|com|us]+$";
        Pattern pattern = Pattern.compile(regex);
        Map<String, String> emailList = new LinkedHashMap<>();

        while (!line.equals("stop")) {
            String email = scanner.nextLine();
            Matcher matcher = pattern.matcher(email);
            if (!matcher.find()) {
                emailList.putIfAbsent(line, "");
                emailList.put(line, email);
            }
            line = scanner.nextLine();

        }
        emailList.forEach((k, v) -> System.out.println(String.format("%s -> %s", k, v)));

    }
}
