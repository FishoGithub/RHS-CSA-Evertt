

public class AppMain {
    public static void main(String[] args) {
        // Line 1
        // TODO


        // Line 2
        // TODO
        returnValue(0, 100);
    }

    public static int returnValue(double min, double max) {
        return (int) ((int) (Math.random() * (max-min)) +min);
    }
    
    public static int returnValue(int x, int y) {
        double RandomNumber = Math.random();
        int ConvertedNumber = (int) RandomNumber;
        System.out.println(ConvertedNumber);

        return ConvertedNumber;
    }


    // Put your functions here...
    // Function 1 should: should return a value less than a maximum provided value: [0,𝑚𝑎𝑥𝑉𝑎𝑙𝑢𝑒).
    // Function 2 should: should return a value between two provided doubles: [𝑚𝑖𝑛𝑉𝑎𝑙𝑢𝑒,𝑚𝑎𝑥𝑉𝑎𝑙𝑢𝑒).
}


