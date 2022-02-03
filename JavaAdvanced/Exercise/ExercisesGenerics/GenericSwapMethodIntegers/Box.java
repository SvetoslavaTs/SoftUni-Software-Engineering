package ExercisesGenerics.GenericSwapMethodIntegers;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
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
            throw new IndexOutOfBoundsException("greshka");
        }
        T firstElement = this.values.get(index);
        T secondElement = this.values.get(index1);
        this.values.set(index, secondElement);
        this.values.set(index1, firstElement);
    }


}
