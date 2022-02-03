package ExercisesDefiningClasses.Google;

import java.util.Date;

public class Child {
    String childName;
    String childBirthdate;

    public Child(String childName, String childBirthdate) {
        this.childName = childName;
        this.childBirthdate = childBirthdate;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.childName, this.childBirthdate);
    }
}
