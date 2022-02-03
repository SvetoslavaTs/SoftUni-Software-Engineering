package ExercisesDefiningClasses.Google;


public class Parent {
    String parentName;
    String parentBirthdate;

    public Parent(String parentName, String parentBirthdate) {
        this.parentName = parentName;
        this.parentBirthdate = parentBirthdate;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.parentName, this.parentBirthdate);
    }
}
