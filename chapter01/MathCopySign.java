package chapter01;

public class MathCopySign {
    public static void main(String[] args) {
        double[][] values = new double[][] {
                { 11.2, 10.3 },
                { 11.2, -2.2 },
                { 11.2, 0.00 },
                { 11.2, -0.00 },
                { -108.9, 10.3 },
                { -108.9, -7.9 },
                { -108.9, 0 },
                { -108.9, -0 },
                { 0, 9.21 },
                { 0, -500.99 },
                { 0, 0 },
                { 0, -0 },
                { -0, 200.22 },
                { -0, -100.11 },
                { -0, 0 },
                { -0, -0 },
                { -0.00, 1 },
                { -0.00, -1 },
                { -0.00, 0.00 },
                { -0.00, -0.00 },
        };
        for (double[] value : values) {
            process(value[0], value[1]);
        }
    }

    private static void process(double magnitude, double sign) {
        System.out.println("Math.copySign(" + magnitude + ", " + sign + ")");
        System.out.println(Math.copySign(magnitude, sign));
        System.out.println();
    }
}
