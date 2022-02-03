package ExercisesDefiningClasses.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {
    private int numberOfBadges;
    private List<Pokemon> pokemons;

    public Trainer() {
        this.numberOfBadges = 0;
        this.pokemons = new ArrayList<>();
    }


    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setNumberOfBadges() {
        this.numberOfBadges++;
    }

    public void deadPokemon() {
        this.pokemons = this.pokemons.stream()
                .filter(pokemon -> pokemon.getHealth() > 0)
                .collect(Collectors.toList());
    }
}
