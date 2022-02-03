package LabIteratorsAndComparators.BookComparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        setTitle(title);
        setYear(year);
        setAuthors(authors);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(String... authors) {
        List<String> currentAuthors = new ArrayList<>();
        if (authors.length != 0) {
            currentAuthors.addAll(Arrays.asList(authors));
        }
        this.authors = currentAuthors;
    }

    @Override
    public int compareTo(Book other) {
        if (this.title.compareTo(other.title) != 0) {
            return this.title.compareTo(other.title);
        } else {
            return Integer.compare(this.year, other.getYear());
        }
    }

    @Override
    public String toString() {
        return String.format("title: %s, year %d", this.title, this.year);
    }
}
