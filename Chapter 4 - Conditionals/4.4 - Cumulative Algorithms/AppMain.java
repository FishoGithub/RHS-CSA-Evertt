public class AppMain {
    public static void main(String[] args) {
        Cumulative testCases = new Cumulative();

        System.out.println("-------- alphabet --------");
        System.out.print(testCases.alphabet('g', 8) + "\n");
        System.out.print(testCases.alphabet('d', 3) + "\n");
        System.out.print(testCases.alphabet('l', 9) + "\n");
        // add your test cases here

        System.out.println("------- factorSum --------");
        System.out.print(testCases.factorSum(3) + "\n");
        System.out.print(testCases.factorSum(15) + "\n");
        System.out.print(testCases.factorSum(7) + "\n");
        // add your test cases here

        System.out.println("------- isPerfect --------");
        // add your test cases here
        System.out.print(testCases.isPerfect(6) + "\n");
        System.out.print(testCases.isPerfect(14) + "\n");
        System.out.print(testCases.isPerfect(28) + "\n");
    }
}
