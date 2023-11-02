public class Conditionals {

    public static boolean firstStars(String text) {
        int InputStringLength = text.length();

        for (int i = 0; i <= text.length(); i++) {
            if (text.length() >= 3) {
                System.out.print("*");
                return true;
            } else {
                for (int y = 0; y <= 3; y++) {
                    System.out.print("*");
                }

        }
        
            for (int x = 0; x <= 2; x++) {
                char temp = text.charAt(i);
                System.out.print(temp);
                return false;
            }
        }
        return false; 
    }

    public boolean compareDouble(double number, double expected) {
        // Returns true if number is close to expected.
        //  Use the constant EPSILON, defined in AppMain for this function.
        //  If number is within EPSILON of expected (exclusive), then return true. False otherwise.
        
        // Examples...
        //  compareDouble(6.001, 6) -> true
        //  compareDouble(6.011, 6) -> false
        //  compareDouble(-1.1, -1) -> false

        double inputtedNumber = number; 
        double expectedNumber = expected; 
        // int roundedInputNumber = (int) Math.round(number);
        String inputNumberAsString = "" + number; 
        int indexOfDecimal = inputNumberAsString.indexOf(".");

        for (int i = indexOfDecimal + 1; i <= 2) {
            if (inputNumberAsString.charAt(i))
        }
        return false;
    }

    public boolean logicCheck(int x, int y, boolean b) {
        // Rewrite the following logic into a single return statement.
        // You cannot use any if statements, only a single return statement.
        // The logic should remain the same.

        if (x > 10) {
            return true;
        } else if (x > y) {
            return b;
        }
        return false;
    }
}

// Returns true under the following conditions (false in all others).
// If the string has three or less characters, then all characters must be
// stars/asterisks.
// If the string has more than three characters, then the first three must be
// stars/asterisks.

// Examples...
// minThreeStars("**") -> true
// minThreeStars("*-") -> false
// minThreeStars("***abc") -> true
// minThreeStars("**a*") -> false
