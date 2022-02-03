package ExercisesIteratorsAndComparators.Collection;

import java.util.Iterator;
import java.util.List;

public class ListyIterator implements Iterable<String> {

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
        return this.index < this.data.size() - 1;
    }

    public void PrintAll() {
        data.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return this.index < data.size();
            }

            @Override
            public String next() {
                return data.get(this.index++);
            }
        };
    }
}

