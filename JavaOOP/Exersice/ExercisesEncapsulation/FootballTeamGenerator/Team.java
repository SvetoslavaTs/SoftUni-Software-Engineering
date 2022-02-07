package ExercisesEncapsulation.FootballTeamGenerator;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty() || name.equals("\\s+")) {
            throw new InvalidParameterException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(String name) {
        if (this.players.stream().noneMatch(p -> p.getName().contains(name))) {
            throw new InvalidParameterException(String.format("Player %s is not in %s team.", name, this.getName()));
        }
        Player playerToRemove = this.players.stream().filter(p -> p.getName().equals(name)).findFirst().get();
        this.players.remove(playerToRemove);
    }

    public double getRating() {
        return this.players.stream().mapToDouble(player -> player.overallSkillLevel()).sum();
    }
}
