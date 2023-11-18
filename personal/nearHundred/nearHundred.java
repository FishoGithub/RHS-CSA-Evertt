package nearHundred;
import java.lang.Math; 

//given int input return true if within 10 of 100 or 200
//use Math.abs();

public class nearHundred {
    public final double CONSTANT_100 = 100; 
    public final double CONSTANT_200 = 200; 
    
    public boolean function(double input) {
        double computedNumber1 = 0;
        double computedNumber2 = 0;  
        computedNumber1 = Math.abs(input - CONSTANT_100); 
        computedNumber2 = Math.abs(input - CONSTANT_200 ); 

        if (computedNumber1 < (CONSTANT_100 + 10) || 
        computedNumber1 > (CONSTANT_100 - 10)) {
            return true; 
        } else if (computedNumber2 < (CONSTANT_200 + 10) || 
        computedNumber2 > (CONSTANT_200 - 10)) {
            return true; 
        } else {
            return false; 
        } 
    }
}
