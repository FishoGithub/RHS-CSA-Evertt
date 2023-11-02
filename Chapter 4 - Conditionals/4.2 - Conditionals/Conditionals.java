public class Conditionals {
    public static boolean firstStars(String text) {
        if (text.length() >= 3) {
            for (int i = 1; i <= text.length(); i++) {
                System.out.print("*");
            }
            System.out.println();
            return true;
        } else if (text.length() < 3) {
            for (int i = 0; i <= 3; i++) {
                System.out.print("*");
            }
            System.out.print(text.substring(4));
            return false;
        }
        return true;
    }

    public static boolean compareDouble(double number, double expected) {
        String inputNumberAsString = "" + number;
        String expectedNumberAsString = "";
        int indexOfDecimalExpected = expectedNumberAsString.indexOf(".");
        int indexOfDecimal = inputNumberAsString.indexOf(".");

        if (indexOfDecimalExpected + 2 == indexOfDecimal + 2) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    public static boolean logicCheck(int x, int y, boolean b) {
        return x > 10 || x > y == b;

    }
}
