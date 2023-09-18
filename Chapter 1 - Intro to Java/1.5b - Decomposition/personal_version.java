public class personal_version {
    public static void main(String[] args) {
//      functions written below are called always in the main function
        seqA();
        seqB();
        seqC();
        seqB();
        seqA();

//      second version, without using function for united states
//      longer to call, but doesn't use a function for something that isn't repeated.

        seq1();
        seq2();
        seq3();
        seq2();
        System.out.println("|UNITED|" );
        System.out.println("|STATES|" );
        seq2();
        seq3();
        seq2();
        seq1();
    }
/*
 * outside of main, all functions are written
 * cannot be written inside of main, otherwise throws an error
 * make sure to write functions when things are repeated more than once
 * functions make things easier, more readable, and faster
 */
    public static void seqA() {
        System.out.println("   /\\" );
        System.out.println("  /  \\" );
        System.out.println(" /    \\" );
    }

    public static void seqB() {
        System.out.println("+------+" );
        System.out.println("|      |" );
        System.out.println("|      |" );
        System.out.println("+------+" );
    }

    public static void seqC() {
        System.out.println("|UNITED|" );
        System.out.println("|STATES|" );
    }

// version 2
// a version like this is also valid, since united states
// doesn't repeat, so it shouldn't be put into a function. 

    public static void seq1() {
        System.out.println("   /\\" );
        System.out.println("  /  \\" );
        System.out.println(" /    \\" );
    }

    public static void seq2() {
        System.out.println("+------+" );
    }

    public static void seq3() {
        System.out.println("|      |" );
        System.out.println("|      |" );
    }
}
