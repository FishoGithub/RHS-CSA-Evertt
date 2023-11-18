package patternPractice;
//print some patterns
//1
//22
//333
//4444
//55555

public class pattern_practice {
    public static void main(String[] args) {
        patternOne(5);
    }

    public static void patternOne(int input) {
        String returnString = "";
        String returnString1 = "";

        for (int y = 1; y <= input; y++) {
            for(int z = 1; z <= y; z++) {
                returnString1 = returnString1 + y;
            }
        }

        for (int i = 1; i <= input; i++) {
            for (int x = i; x > 0; x--) {
                returnString = "" + i; 
                System.out.print(returnString);
            }
            System.out.println();
        }
    }
}
