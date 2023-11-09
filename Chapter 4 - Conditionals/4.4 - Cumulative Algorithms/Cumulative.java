public class Cumulative {
    //initial full alphabet string for alphabet method
    final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

//returns string with part of alphabet
    public String alphabet(char first, int count) { 
        String returnString = "";
        for (int i = ALPHABET.indexOf(first); i < ALPHABET.indexOf(first) + count; i++) {
            if (ALPHABET.charAt(i) == 'z') {
                i = 0; 
            }
            returnString = returnString + ALPHABET.charAt(i);
        }
        return returnString;
    }

//returns sum of factors of input n 
    public int factorSum(int n) { 
        int returnValue = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                returnValue = returnValue + i;
            }
        }
        returnValue = returnValue - n;
        return returnValue;
    }

//returns true if its a perfect number
//returns false if its not a perfect number 
    public boolean isPerfect(int n) { 
        if (factorSum(n) == n) {
            return true;
        } else {
            return false;
        }

    }
}

