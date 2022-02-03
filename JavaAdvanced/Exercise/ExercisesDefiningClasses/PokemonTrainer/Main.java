package ExercisesDefiningClasses.PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Trainer> trainerMap = new LinkedHashMap<>();


        while (!input.equals("Tournament")) {
            String[] tokens = input.split("\\s+");
            String trainerName = tokens[0];
            String pokemontName = tokens[1];
            String pokemontElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokemontName, pokemontElement, pokemonHealth);

            trainerMap.putIfAbsent(trainerName, new Trainer());
            trainerMap.get(trainerName).getPokemons().add(pokemon);

            input = scanner.nextLine();
        }
        String line = scanner.nextLine();
        while (!line.equals("End")) {

            for (Map.Entry<String, Trainer> entry : trainerMap.entrySet()) {
                if (entry.getValue().getPokemons().size() > 0) {
                    boolean isContainElement = false;
                    for (Pokemon pokemon : entry.getValue().getPokemons()) {
                        if (pokemon.getElement().equals(line)) {
                            isContainElement = true;
                            entry.getValue().setNumberOfBadges();
                            break;
                        }
                    }
                    if (!isContainElement) {
                        for (Pokemon pokemon : entry.getValue().getPokemons()) {
                            pokemon.setHealth();
                        }
                        entry.getValue().deadPokemon();
                    }
                }
            }
            line = scanner.nextLine();
        }

        trainerMap.entrySet().stream()
                .sorted((t1, t2) -> Integer.compare(t2.getValue().getNumberOfBadges(), t1.getValue().getNumberOfBadges()))
                .forEach(t -> System.out.println(String.format("%s %s %s",
                        t.getKey(), t.getValue().getNumberOfBadges(), t.getValue().getPokemons().size())));
    }
}
