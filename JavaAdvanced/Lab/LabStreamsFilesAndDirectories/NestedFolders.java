package LabStreamsFilesAndDirectories;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class NestedFolders {
    public static int foldersCount = 0;

    public static void main(String[] args) {
        File file = new File("E:\\Svetoslava\\SoftUni\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(file);

        int count = 0;
        while (!dirs.isEmpty()) {
            File current = dirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File nestedFile : nestedFiles)
                if (nestedFile.isDirectory())
                    dirs.offer(nestedFile);
            count++;
            System.out.println(current.getName());
        }
        System.out.println(count + " folders");


//        dfs(file);
//        System.out.println(foldersCount);
    }

//    public static void dfs(File file) {
//        foldersCount++;
//        for (File f : file.listFiles()) {
//            if(f.isDirectory()) {
//                dfs(f);
//            }
//        }
//        System.out.println(file.getName());
//    }
}
