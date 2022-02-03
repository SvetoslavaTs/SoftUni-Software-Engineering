package ExercisesDefiningClasses.Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Company company;
    private Car car;

    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Child> children;

    public Person() {
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public List<Child> getChildren() {
        return children;
    }

}