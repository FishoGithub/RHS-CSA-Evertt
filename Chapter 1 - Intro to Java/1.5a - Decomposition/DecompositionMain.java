public class DecompositionMain {
    public static void main(String[] args) {
        seqA();
        seqB();
        seqA();
        seqB();
    }

    public static void seqA() {
        System.out.println("  /\\" );
        System.out.println(" /  \\" );
        System.out.println("/    \\" );
    }

    public static void seqB() {
        System.out.println("\\    /" );
        System.out.println(" \\  /" );
        System.out.println("  \\/" );
    }
}
