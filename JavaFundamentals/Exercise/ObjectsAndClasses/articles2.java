package ExerciseObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Article> allArticles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            Article currentArticle = new Article(input[0], input[1], input[2]);
            allArticles.add(currentArticle);
        }
        String wordForSorting = scanner.nextLine();
        switch (wordForSorting) {
            case "title":
                allArticles.stream().sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                        .forEach(article -> System.out.println(article.toString()));
                break;
            case "content":
                allArticles.stream().sorted((a, b) -> a.getContent().compareTo(b.getContent()))
                        .forEach(article -> System.out.println(article.toString()));
                ;
                break;
            case "author":
                allArticles.stream().sorted((a, b) -> a.getAuthor().compareTo(b.getAuthor()))
                        .forEach(article -> System.out.println(article.toString()));
                ;
                break;
        }

    }

    static class Article {
        String title;
        String content;
        String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s",
                    this.getTitle(),
                    this.getContent(),
                    this.getAuthor());
        }
    }
}
