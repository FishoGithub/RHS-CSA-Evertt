public class AppMain {
    // Your code here...
    public static void main(String[] args) {
        //run function here
        int count = 0; 
        int n = 2; 

        while (count < 20) {
            //runs isNumberPrime and increments if it returns true
            if (isNumberPrime(n)) { 
                count++;
                System.out.print(n + " ");
            }
            n++;
        }
        System.out.print("\n" + count + " prime numbers found.");
    }

    //finds whether number is prime
    public static boolean isNumberPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true; 
    }
}
