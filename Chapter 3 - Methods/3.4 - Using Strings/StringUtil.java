import javax.sound.midi.SysexMessage;

public class StringUtil {
    public static String firstHalf(String input) {
        int StringLength = input.length();
        String NewString = "";

        for (int i = 0; i <= StringLength / 2; i++) {
            NewString += input.charAt(i);
        }

        return NewString;
    }

    public static String beforeSpace(String input) {
        int indexOfString = input.indexOf(" ");
        int from = 0;
        String NewString = "";

        for (int i = 0; i < indexOfString; i++) {
            NewString = input.substring(from, indexOfString);
        }

        return NewString;
    }

    public static String afterSpace(String input) {
        int indexOfString = input.indexOf(" ");
        int StringLength = input.length();
        String NewString = "";

        for (int i = indexOfString; i < StringLength; i++) {
            NewString = input.substring(indexOfString, StringLength);
        }

        return NewString;
    }

    public static String swapAtSpace(String input) {
        String FirstHalf = afterSpace(input);
        String SecondHalf = beforeSpace(input);

        return FirstHalf + SecondHalf;
    }

    public static char firstNonRepeatedChar(String input) {
        // Returns the first character that is not repeated later in the string (looking
        // left to right)
        // Example: "abcabcdef" -> 'd'

        return input.charAt(0);
    }
}
