package ExercisesGenerics.GenericCountMethodStrings1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element) {
        this.values.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s: %s", value.getClass().getName(), value));
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    public void swap(int index, int index1) {
        if (index >= values.size() || index < 0 || index1 >= values.size() || index1 < 0) {
            throw new IndexOutOfBoundsException("grechksa");
        }
        T firstElement = this.values.get(index);
        T secondElement = this.values.get(index1);
        this.values.set(index, secondElement);
        this.values.set(index1, firstElement);
    }

    public int countGreaterThan(T element) {
        return (int) this.values.stream()
                .filter(e -> e.compareTo(element) > 0).count();
    }


}
