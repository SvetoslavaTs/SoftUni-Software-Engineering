package ExerciseList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class softUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] tokens = input.split(":");
            String command = tokens[0];
            switch (command) {
                case "Add": {
                    String lessonTitle = tokens[1];
                    if (!list.contains(lessonTitle)) {
                        list.add(lessonTitle);
                    }
                    break;
                }
                case "Insert": {
                    String lessonTitle = tokens[1];
                    int index = Integer.parseInt(tokens[2]);
                    if (!list.contains(lessonTitle)) {
                        if (index >= 0 && index <= list.size() - 1) {
                            list.add(index, lessonTitle);
                        }
                    }
                    break;
                }
                case "Remove": {
                    String lessonTitle = tokens[1];
                    int indexOfLessonTitle = list.indexOf(lessonTitle);
                    if (indexOfLessonTitle >= 0 && indexOfLessonTitle <= list.size() - 1) {
                        if (list.contains(lessonTitle)) {
                            list.remove(list.indexOf(lessonTitle));
                        }
                        if (list.get(indexOfLessonTitle).equals(lessonTitle + "-Exercise")) {
                            list.remove(indexOfLessonTitle);
                        }
                    }
                    break;
                }
                case "Swap": {
                    String lessonTitle = tokens[1];
                    String lessonTitle1 = tokens[2];
                    int indexOfLessonTitle = list.indexOf(lessonTitle);
                    int indexOfLessonTitle1 = list.indexOf(lessonTitle1);
                    if (list.contains(lessonTitle) && list.contains(lessonTitle1)) {
                        list.set(indexOfLessonTitle, lessonTitle1);
                        list.set(indexOfLessonTitle1, lessonTitle);
                    }
                    if (indexOfLessonTitle + 1 < list.size() && indexOfLessonTitle1 + 1 < list.size()) {
                        String lesson1Exercise = list.get(indexOfLessonTitle + 1);
                        if (!lesson1Exercise.contains("Exercise")) {
                            list.add(indexOfLessonTitle1 + 1, lesson1Exercise);
                            if (indexOfLessonTitle < indexOfLessonTitle1) {
                                list.remove(indexOfLessonTitle + 1);
                            } else if (indexOfLessonTitle > indexOfLessonTitle1) {
                                list.remove(indexOfLessonTitle1 + 2);
                            }
                        }
                    }
                    if (indexOfLessonTitle + 1 < list.size() && indexOfLessonTitle1 + 1 < list.size()) {
                        String lessonExercise = list.get(indexOfLessonTitle1 + 1);
                        if (!lessonExercise.contains("Exercise")) {
                            list.add(indexOfLessonTitle + 1, lessonExercise);
                            if (indexOfLessonTitle > indexOfLessonTitle1) {
                                list.remove(indexOfLessonTitle + 1);
                            } else if (indexOfLessonTitle < indexOfLessonTitle1) {
                                list.remove(indexOfLessonTitle1 + 2);
                            }
                        }
                    }
                    break;
                }
                case "Exercise": {
                    String lessonTitle = tokens[1];
                    if (list.contains(lessonTitle)) {
                        int indexOfLessonTitle = list.indexOf(lessonTitle);
                        if (indexOfLessonTitle + 1 < list.size()) {
                            if (!list.get(indexOfLessonTitle + 1).contains("Exercise")) {
                                list.add(indexOfLessonTitle + 1, lessonTitle + "-Exercise");
                            }
                        } else {
                            list.add(lessonTitle + "-Exercise");
                        }
                    } else {
                        list.add(lessonTitle);
                        list.add(lessonTitle + "-Exercise");
                    }
                    break;
                }
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, list.get(i));
        }
    }
}
