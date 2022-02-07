package LabEncapsulation.ValidationData;


import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSalary(salary);
        this.setAge(age);
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return this.salary;
    }

    private void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        if (this.getAge() < 30) {
            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 200));
        } else {
            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 100));
        }
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("####.#########");
        String formattedSalary = decimalFormat.format(this.getSalary());
        return String.format("%s %s gets %.1f leva.",
                this.getFirstName(), this.getLastName(), this.getSalary());
    }
}
