package ExercisesIteratorsAndComparators.ListyIterator;

import java.util.Iterator;
import java.util.List;

public class ListyIterator {

    private List<String> data;
    private int index;

    public ListyIterator(List<String> data) {
        this.data = data;
        if (data.size() != 0) {
            this.index = 0;
        } else {
            this.index = -1;
        }
    }

    public boolean Move() {
        if (index < data.size() - 1) {
            index++;
            return true;
        } else {
            return false;
        }
    }

    public void Print() {
        if (index == -1) {
            System.out.println("Invalid Operation!");
        } else {
            System.out.println(this.data.get(this.index));
        }
    }

    public boolean HasNext() {
        return this.index < data.size() - 1;
    }
}
