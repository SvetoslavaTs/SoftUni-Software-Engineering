package ExercisesStreamsFilesAndDirectories;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        File file = new File(
                "E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");

        File[] folder = file.listFiles();
        int size = 0;
        if (folder != null) {
            for (File file1 : folder) {
                size += file1.length();
            }
        }
        System.out.println("Folder size: " + size);
    }
}
