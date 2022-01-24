package ExercisesTextProcessing;

public class letterPositionInTheAlphabet {
    public static void main(String[] args) {
        char input = 'm';
        int position = getPosition(input);
        System.out.println(position);

    }

    private static int getPosition(char input) {
        char currentChar = Character.toLowerCase(input);
        return currentChar - 96;
    }
}
