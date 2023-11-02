public class AppMain {
    public static final double EPSILON = 0.01;

    public static void main(String[] args) {
        System.out.println("-------- firstStars --------");
        Conditionals.firstStars("abcd");
        Conditionals.firstStars("abc");
        // add your test cases here

        System.out.println("------ compareDouble -------");
        Conditionals.compareDouble(6.001, 6.021);
        // add your test cases here

        System.out.println("-------- logicCheck --------");
        Conditional.logicCheck(10, 12);
        // add your test cases here
    }
}
