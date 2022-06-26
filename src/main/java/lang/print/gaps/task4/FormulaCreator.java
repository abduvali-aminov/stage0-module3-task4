package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        int a;
        int b;
        a = 1;
        b = 2;
        double y = (9*Math.pow(a, 2) - 5*b + 2 + a - 7) * ((a + b - 4.0*a*b) / 2);
        System.out.println(y);
    }
}
