package Exam.Dealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    public String name;
    public int capacity;
    public List<Car> Collection;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.Collection = new ArrayList<>();
    }
}
