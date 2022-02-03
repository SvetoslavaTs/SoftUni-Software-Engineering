package ExercisesDefiningClasses.FamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String name;
    String birthday;
    List<Person> parents;
    List<Person> children;

    public Person(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public List<Person> getParents() {
        return parents;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setParents(List<Person> parents) {
        this.parents = parents;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.name, this.birthday);

    }
}
