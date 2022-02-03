package LabIteratorsAndComparators.ComparableBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> arrayList = new ArrayList<>(Arrays.asList(
                new Book("O", 15, "asd"),
                new Book("O", 12),
                new Book("M", -5),
                new Book("A", 123))
        );
        arrayList.stream()
                .sorted(new BookComparator())
                .peek(book -> System.out.println(book))
                .collect(Collectors.toList());
    }
}
