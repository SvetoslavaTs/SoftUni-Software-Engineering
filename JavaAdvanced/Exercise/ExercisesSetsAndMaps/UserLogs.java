package ExercisesSetsAndMaps;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, Map<String, Integer>> userLog = new TreeMap<>();

        while (!line.equals("end")) {
            String[] tokens = line.split("\\s+");
            String[] IPTokens = tokens[0].split("=");
            String IP = IPTokens[1];
            String[] userTokens = tokens[2].split("=");
            String user = userTokens[1];

            userLog.putIfAbsent(user, new LinkedHashMap<>());
            userLog.get(user).putIfAbsent(IP, 0);
            userLog.get(user).put(IP, userLog.get(user).get(IP) + 1);

            line = scanner.nextLine();
        }
        for (Map.Entry<String, Map<String, Integer>> entry : userLog.entrySet()) {
            System.out.println(entry.getKey() + ":");
            StringBuilder sb = new StringBuilder();
            Map<String, Integer> innerMap = entry.getValue();
            for (Map.Entry<String, Integer> stringIntegerEntry : innerMap.entrySet()) {
                String iPInfo = String.format("%s => %d", stringIntegerEntry.getKey(), stringIntegerEntry.getValue());
                sb.append(iPInfo);
                sb.append(", ");

            }
            String res = sb.substring(0, sb.length() - 2);
            System.out.println(res + ".");
        }

    }
}
