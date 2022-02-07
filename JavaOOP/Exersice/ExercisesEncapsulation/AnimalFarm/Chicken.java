package ExercisesEncapsulation.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalStateException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double productPerDay() {
        return calculateProductPerDay();

    }

    private double calculateProductPerDay() {
        double eggsPerDay = 0;
        if (this.age >= 0 && this.age <= 5) {
            eggsPerDay = 2;
        } else if (this.age >= 6 && this.age <= 11) {
            eggsPerDay = 1;
        } else if (this.age > 11) {
            eggsPerDay = 0.75;
        }
        return eggsPerDay;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",
                getName(), getAge(), this.productPerDay());
    }
}
