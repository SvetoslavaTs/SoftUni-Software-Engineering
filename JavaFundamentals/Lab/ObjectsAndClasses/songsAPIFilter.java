package LabObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class songsAPIFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] data = input.split("_");
            Song current = new Song(data[0], data[1], data[2]);
            songs.add(current);
        }
        String searchWord = scanner.nextLine();

        if (searchWord.equals("all")) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }

        }
        List<Song> filteredSongs = songs
                .stream()
                .filter(e -> e.typeList.equals(searchWord))
                .collect(Collectors.toList());
        for (Song song : filteredSongs) {
            System.out.println(song.getName());
        }

    }

    private static void findSongsWithNameEqualsToSearch(List<Song> songs, String searchWord) {
        for (Song song : songs) {
            if (song.getTypeList().equals(searchWord)) {
                System.out.println(song.getName());
            }
        }
    }

    static class Song {
        private String typeList;
        private String name;
        private String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }

        public void setTypeList() {
            this.typeList = typeList;
        }

        public void setName() {
            this.name = name;
        }

        public void setTime() {
            this.time = time;
        }
    }

}
