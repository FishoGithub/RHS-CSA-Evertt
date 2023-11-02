import java.util.Scanner;

import org.omg.PortableInterceptor.USER_EXCEPTION;

public class Personal_practice_1 {
    public final int USER_STRING = 0;
    public final int NUMBER_OF_ASTERISKS = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer:"); 
        int USER_STRING = input.nextInt();

    }

    public static int CalculateFactorsOfInput(int input) {
        for (int i = 0; i <= input; i++) {
            for (int x = 0; x <= input; x++) {
                if (i % x <=input) {
                    
                }
            }
        }
        return input; 
    }
}
