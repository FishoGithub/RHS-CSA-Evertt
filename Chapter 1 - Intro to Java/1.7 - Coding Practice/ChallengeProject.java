import java.util.concurrent.TimeUnit;

public class ChallengeProject {
    public static void main(String[] args) {
        System.out.print("\033[33m"); // Yellow
        MainLoop();

            
        resetColor();
    }

    public static void Ears() {
        System.out.println("           /\\____/\\");
    }

    public static void LegsAndFeet() {
        System.out.println("          \\|   | |  |");
        System.out.println("          |,, | |,,| ");
    }


    public static void endFrame() {
        endFrame(250);
    }
    public static void endFrame(int delayMilliSeconds) {  
        // Delay a for a short time (leave it on the screen)
        try {
            Thread.sleep(delayMilliSeconds);
        } 
        catch (Exception ex) {
        }

        // Clear the console
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    } 
    public static void resetColor() {
        System.out.print("\033[0m");
    }

    public static void MainLoop() {
        catAnimation();

        System.out.println("");
    }

    public static void carAnimation() {
        System.out.println("             _/\\______\\\\__");
        System.out.println("            / ,-. -|-  ,-.`-.");
        System.out.println("            `( o )----( o )-'");
    }

    public static void catAnimation() {
        int i=0;
        while (i <= 2) {

            Ears();
            System.out.println("       () ( '  o  ')___");
            System.out.println("        \\\\|__)   ______)");
            LegsAndFeet();
            endFrame(100);

            Ears();
            System.out.println("       () ( '  o  ')___");
            System.out.println("        \\\\|___)   _____)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ')__");
            System.out.println("        \\\\|____)   ___)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ')__");
            System.out.println("        \\\\|____)   ___)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ')");
            System.out.println("        \\\\|______)  _)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ')");
            System.out.println("        \\\\ |______)  _)");
            LegsAndFeet();
            endFrame(50); 

            Ears();
            System.out.println("       () ( '  o  ')");
            System.out.println("        \\\\ |_______) )");
            LegsAndFeet();
            endFrame(50);
            
            Ears();
            System.out.println("       () ( '  o  ')");
            System.out.println("        \\\\|__________)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ')_");
            System.out.println("        \\\\|__________)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ')__");
            System.out.println("        \\\\|___________)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ') __");
            System.out.println("        \\\\|____________)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ') __");
            System.out.println("        \\\\|____________)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ') ___");
            System.out.println("        \\\\|   __________)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ') __");
            System.out.println("        \\\\|  __________)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ') __");
            System.out.println("        \\\\|____________)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ') _");
            System.out.println("        \\\\|___________)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ')");
            System.out.println("        \\\\|__________)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ')");
            System.out.println("        \\\\|__________)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ')");
            System.out.println("        \\\\|_______) )");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ')");
            System.out.println("        \\\\|______)  _)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ')__");
            System.out.println("        \\\\|____)   ___)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ')___");
            System.out.println("        \\|___)   _____)");
            LegsAndFeet();
            endFrame(50);

            Ears();
            System.out.println("       () ( '  o  ')___");
            System.out.println("        \\|__)   ______)");
            LegsAndFeet();
            endFrame(50);

            i++;

        }
    }

    public static void test1(String[] args) {
        System.out.print("\033[33m"); // Yellow
        System.out.print("      .");
        endFrame();
        System.out.print("     < >");
        endFrame();
        System.out.print("    <   >");
        endFrame(); 
        System.out.print("   <     >");
        endFrame();
        System.out.print("  <       >");
        endFrame();
        System.out.print(" <         >");
        endFrame();
        System.out.print("<           >");
        // END of sample animation code
        resetColor();
    }
}
