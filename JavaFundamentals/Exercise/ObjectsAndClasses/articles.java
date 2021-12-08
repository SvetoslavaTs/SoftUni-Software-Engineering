package ExerciseObjectAndClasses;

import java.util.Scanner;

public class articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Article article = new Article(input[0], input[1], input[2]);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(": ");
            String command = line[0];
            if (command.equals("Edit")) {
                editNewContent(article, line[1]);
            } else if (command.equals("ChangeAuthor")) {
                changeAuthor(article, line[1]);
            } else if (command.equals("Rename")) {
                rename(article, line[1]);
            }
        }
        System.out.println(article.toString());
    }


    private static void rename(Article article, String title) {
        article.setTitle(title);
    }

    private static void changeAuthor(Article article, String author) {
        article.setAuthor(author);
    }

    private static void editNewContent(Article article, String newContent) {
        article.setContent(newContent);
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

        public void setTitle(String title) {
            this.title = title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthor(String author) {
            this.author = author;
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
