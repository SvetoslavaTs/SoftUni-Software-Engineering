package LabWorkingWithAbstraction.StudentSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StudentSystem studentSystem = new StudentSystem();
        String input = reader.readLine();
        while (!input.equals("Exit")) {
            String result = studentSystem.parseCommand(input.split("\\s+"));
            if (result != null) {
                System.out.println(result);
            }
            input = reader.readLine();
        }
    }
}
