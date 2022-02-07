package LabInheritance.StackOfStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String str) {
        this.data.add(str);
    }

    public String pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Cannot pop on empty Stack");
        }
        return this.data.remove(this.data.size() - 1);
    }

    public String peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Cannot peek on empty Stack");
        }
        return this.data.get(this.data.size() - 1);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

}
