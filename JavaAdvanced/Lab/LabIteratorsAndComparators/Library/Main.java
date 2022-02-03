package LabIteratorsAndComparators.Library;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Library library = new Library(new Book("Foo", 12, "Afwoe"),
                new Book("Bar", 1587));
        for (Book book : library) {
            System.out.println(book.getTitle());
        }
    }
}
