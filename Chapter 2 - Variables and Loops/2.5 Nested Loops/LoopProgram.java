public class LoopProgram {
    public static void main(String args[]) {
        Loop1();
        Loop2();
        Loop3();
        Loop4();
        Loop5();
        Loop6();
        Loop7();
    }

    public static void Loop1() {
        for (int i=1; i <= 6; i++) {
            for (int x= i; x > 0; x--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void Loop2() {
        for (int i=1; i <= 5; i++) {
            for (int x=i; x < 5; x++) {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }

    public static void Loop3() {
        for (int i=0; i<3; i++) {
            for (int x=0; x <= 9; x++) {
                for (int y=0; y < 3; y++) {
                    System.out.print(x);
                }
            }
            System.out.println();
        }
    }

    public static void Loop4() {
        for (int i=1; i <=5; i++) {
            for (int x=i; x <=5 ; x++) {
                System.out.print("-");
            }
            System.out.println(i);

            //next part might not work yet
            for (int y=1; y <= 9; y++) {
                System.out.println(y);
                y = y+2;
            }
        }
    }

    public static void Loop5() {
        int i;
        int x;
        for (i=0; i <= 9; i++) {
            for (x=9; x >= 1; x--) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void Loop6() {
        System.out.println();
        int firstNumber = 0;
        int secondNumber = 1;
        int addedNumbers = 0;
        int count = 0; 
        int numTerms = 30;

        for(; count <= numTerms; count++) {
            System.out.println(firstNumber);
            addedNumbers = firstNumber + secondNumber; 
            firstNumber = secondNumber; 
            secondNumber = addedNumbers;
            count += 1;
        }
    }

    public static void Loop7() {
        System.out.println();

        for (int z=0; z <=4; z++) {
            System.out.print("          |");
        }
        System.out.println();

        for (int x=0; x <=4; x++) {
            for (int i=0; i <= 9; i++) {
                System.out.print(i);
            }
        }

    }

}