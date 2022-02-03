package ExercisesStackAndQueues;

import java.lang.reflect.Array;
import java.sql.Time;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> robots = Arrays.stream(scanner.nextLine().split(";")).collect(Collectors.toList());
        String[] names = new String[robots.size()];
        int[] processTime = new int[robots.size()];

        for (int i = 0; i < robots.size(); i++) {
            String[] tokens = robots.get(i).split("-");
            String name = tokens[0];
            names[i] = name;
            int time = Integer.parseInt(tokens[1]);
            processTime[i] = time;

        }

        String startingTime = scanner.nextLine();

        String[] timeData = startingTime.split(":");
        int hours = Integer.parseInt(timeData[0]);
        int minutes = Integer.parseInt(timeData[1]);
        int seconds = Integer.parseInt(timeData[2]);
        int startTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        ArrayDeque<String> productsQueue = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            productsQueue.offer(input);
            input = scanner.nextLine();
        }


        int[] robotsWorkedLeft = new int[robots.size()];

        while (!productsQueue.isEmpty()) {
            startTimeInSeconds++;
            String product = productsQueue.poll();
            int index = -1;
            for (int i = 0; i < robotsWorkedLeft.length; i++) {
                if (robotsWorkedLeft[i] > 0) {
                    robotsWorkedLeft[i]--;
                }

                if (robotsWorkedLeft[i] == 0 && index == -1) {
                    index = i;
                }
            }

            if (index != -1) {
                robotsWorkedLeft[index] = processTime[index];
                System.out.println(printRobotData(names[index], product, startTimeInSeconds));
            } else {
                productsQueue.offer(product);
            }

        }

    }

    private static String printRobotData(String name, String product, int startTimeInSeconds) {
        long seconds = startTimeInSeconds % 60;
        long minutes = (startTimeInSeconds / 60) % 60;
        long hours = (startTimeInSeconds / (60 * 60)) % 24;
        String time = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        return String.format("%s - %s [%s]", name, product, time);
    }
}


