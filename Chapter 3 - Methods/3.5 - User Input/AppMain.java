import javafx.scene.input.InputEvent;

import java.io.Console;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        int CalculatedAge = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int UserAge = input.nextInt();
        System.out.print("Enter the current year: ");
        int CurrentYear = input.nextInt();
        System.out.print("Enter a year in the future: ");
        int FutureYear = input.nextInt();
        System.out.print("Enter your name: ");
        String UserName = input.nextLine();

        CalculatedAge = (FutureYear - CurrentYear) + UserAge; 

        System.out.print("\n" + UserName + " will be " + CalculatedAge + " years old in " + FutureYear + ".");

        input.close();
    }

    //ignore code below, just testing before reading about Scanner
    public class CalculateUserInputs {
        public final int USERAGE = 0;
        public final int CURRENTYEAR = 2023;
        public final int INPUTFUTUREYEAR = 0;
        public final String USERNAME = "";

        public int calculateYearFromInput(int CURRENTYEAR, int FUTUREYEAR) {
            int INPUTFUTUREYEAR = CURRENTYEAR - FUTUREYEAR;
            return FUTUREYEAR;
        }
    }
}
