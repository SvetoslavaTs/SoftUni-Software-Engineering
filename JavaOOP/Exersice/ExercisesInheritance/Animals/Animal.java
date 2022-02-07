package ExercisesInheritance.Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String produceSound() {
        return "";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    private void setName(String name) {
        if (name.equals("")) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.age = age;
    }

    private void setGender(String gender) {
        if (gender.equals("")) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(System.lineSeparator())
                .append(String.format("%s %d %s%n",
                        this.getName(), this.getAge(), this.getGender()))
                .append(produceSound());
        return sb.toString();

    }
}

