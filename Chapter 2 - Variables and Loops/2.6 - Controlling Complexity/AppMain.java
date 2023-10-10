public class AppMain {

    //couldnt figure out how to print the dots in the middle, other parts work 
    //will ask about it in class later

    public static final int SIZE = 4;
    public static void main(String[] args) {
        drawTopBottom();
        DrawMiddle();
        drawTopBottom();
    }

    public static void drawTopBottom() {
        //draws top of smaller drawing
        // System.out.println("#============#"); 12 equals

        System.out.print("#");
        for (int i = 0; i <= SIZE*4; i++) {
            System.out.print("=");
        }
        System.out.print("#\n");
    }

    public static void DrawMiddle() {
            System.out.print("|");
            System.out.print("<");
            System.out.print(">");
            System.out.println("|");

        for (int i = 0; i < SIZE*2; i++) {
            for (int y=1; y <= i; y+=2) {
                System.out.print("<");
            }
        for (int z= 0; z < 3; z++) {
            for (int u=4; u < z; u+=4) {
                System.out.print(".");
            }
        }

            System.out.print(">");
            System.out.println("|");
        }
            


    }

}

    // Desired output (two different examples, depending on what the constant is set to)...
    // SIZE = 3
    //   #============#
    //   |    <><>    |
    //   |  <>....<>  |
    //   |<>........<>|
    //   |<>........<>|
    //   |  <>....<>  |
    //   |    <><>    |
    //   #============#
    // SIZE = 4
    //   #================#
    //   |      <><>      |
    //   |    <>....<>    |
    //   |  <>........<>  |
    //   |<>............<>|
    //   |<>............<>|
    //   |  <>........<>  |
    //   |    <>....<>    |
    //   |      <><>      |
    //   #================#
    