package ExercisesEncapsulation.FootballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Team> teams = new LinkedHashMap<>();

        String line = reader.readLine();

        while (!line.equals("END")) {
            String[] input = line.split(";");
            if (input[0].equals("Team")) {
                try {
                    Team team = new Team(input[1]);
                    teams.put(input[1], team);
                } catch (InvalidParameterException e) {
                    System.out.println(e.getMessage());
                }
            } else if (input[0].equals("Add")) {
                Team team = teams.get(input[1]);
                if (team == null) {
                    System.out.printf("Team %s does not exist.%n", input[1]);
                } else {
                    try {
                        Player player = new Player(input[2], Integer.parseInt(input[3]), Integer.parseInt(input[4]),
                                Integer.parseInt(input[5]), Integer.parseInt(input[6]),
                                Integer.parseInt(input[7]));
                        team.addPlayer(player);
                    } catch (InvalidParameterException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else if (input[0].equals("Remove")) {
                Team team = teams.get(input[1]);
                if (team == null) {
                    System.out.printf("Team %s does not exist.%n", input[1]);
                } else {
                    try {
                        team.removePlayer(input[2]);
                    } catch (InvalidParameterException e) {
                        System.out.println(e.getMessage());
                    }
                }
            } else if (input[0].equals("Rating")) {
                Team team = teams.get(input[1]);
                if (team == null) {
                    System.out.printf("Team %s does not exist.%n", input[1]);
                } else {
                    System.out.printf("%s - %.0f%n", team.getName(), team.getRating());
                }

            }
            line = reader.readLine();
        }
    }
}
