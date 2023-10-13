import java.util.Random;

public class AppMain {
    public static void main(String[] args) {
        // Line 1
        // TODO
        for (int i = 0; i <=5; i++) {
            ReturnValue(100);
        }

        System.out.println();

        for (int i = 0; i <= 4; i++) {
            ReturnValue(100, 500);
        }

    }

    public static int ReturnValue(double firstValue) {
        int returnedNumber = (int) (100* Math.random());
        System.out.print(returnedNumber + " ");
        return (int) ((int) Math.random() * (firstValue));

    }

    public static int ReturnValue(int min, int max) {
        int randomNumber = (int) (Math.random() * (max-min) +min);
        System.out.print(randomNumber + " ");
        return randomNumber;
    }
}


