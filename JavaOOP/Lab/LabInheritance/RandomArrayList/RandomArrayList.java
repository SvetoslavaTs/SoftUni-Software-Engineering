package LabInheritance.RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList<Integer> {
    private Random rnd; // Initialize this…

    public RandomArrayList(Random rnd) {
        this.rnd = rnd;
    }

    public Object getRandomElement() {
        int index = this.rnd.nextInt(super.size());
        Object element = super.get(index);
        super.remove(index);
        return element;
    }

}
