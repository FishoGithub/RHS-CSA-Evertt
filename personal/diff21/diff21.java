package diff21;
import java.lang.Math; 

//given int n return absolute diff between n and 21
//return double the absolute diff if n > 21

public class diff21 {
    public final int CONSTANT = 21;
    public static void main(String[] args) {
        //run solution here
        System.out.println(function(19));
        System.out.println(function(10)); 
        System.out.println(function(21));
    }

    public static int function(int n) {
        int computedNumber = 0; 
        computedNumber = Math.abs(n - 21); 

        if (n > 21) {
            return computedNumber * 2; 
        }
        else if (n == 21) {
            return 0; 
        }
        else {
            return computedNumber;
        }
    }
}