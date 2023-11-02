public class Cumulative {
    final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public String alphabet(char first, int count) {
        String returnString = "";
        for (int i = ALPHABET.indexOf(first); i < ALPHABET.indexOf(first) + count; i++) {
            if (ALPHABET.charAt(i) == 'z') {
                i = 0; 
            }
            returnString = returnString + ALPHABET.charAt(i);
        }
        System.out.println(returnString);
        return returnString;
    }

    public int factorSum(int n) {
        // Returns the sum of all factors of n, except for n itself
        
        // Examples...
        //  factorSum(6) -> 6      // 1 + 2 + 3
        //  factorSum(14) -> 10    // 1 + 2 + 7
        return 0;
    }

    public boolean isPerfect(int n) {
        // Returns true if n is a perfect number, false otherwise
        //  A perfect number is a positive integer that is equal to the sum of its proper divisors.
        //  Use the factorSum function you wrote to help you do this (and do not copy the code).
        
        // Examples...
        //  factorSum(6) -> true   // 1 + 2 + 3 = 6, so it is a perfect number
        //  factorSum(14) -> false // 1 + 2 + 7 = 10, which is not 14, so not perfect
        return false;
    }
}


        // Return a String consiting of a section of the alphabet.
        //  It should start with letter 'first' and contain 'count' letters.
        //  If count goes past 'z', then it should wrap back around to 'a' 
        //    for the next letter.
        //  You can assume that first is a lowercase letter.
        
        // Examples...
        //  alphabet('a', 5) -> "abcde"
        //  alphabet('c', 4) -> "cdef"
        //  alphabet('y', 6) -> "yzabcd"

