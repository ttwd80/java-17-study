package chapter01;

public class MathCeil {
    public static void main(String[] args) {
        // 0.0 will return 0.0
        mathCeil(0.0);
        System.out.println();

        // 1.0 will return 1.0
        mathCeil(1.0);
        System.out.println();

        // -1.0 will return -1.0
        mathCeil(-1.0);
        System.out.println();

        // it is not round
        // 7.59 will return 8.0
        mathCeil(7.59);
        System.out.println();

        // it is not round
        // 7.02 will return 8.0
        mathCeil(7.02);
        System.out.println();

        // it is not round
        // -7.59 will return -7.0
        mathCeil(-7.59);
        System.out.println();

        // it is not round
        // -7.02 will return -7.0
        mathCeil(-7.02);
        System.out.println();

        // negative zero?
        // from javadoc
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html#ceil(double)
        // If the argument value is less than zero but greater than -1.0, then the
        // result is negative zero.
        mathCeil(-0.0163);
        System.out.println();

        // If the argument is NaN or an infinity or positive zero or negative zero, then
        // the result is the same as the argument.
        mathCeil(Double.NaN);
        System.out.println();

        // If the argument is NaN or an infinity or positive zero or negative zero, then
        // the result is the same as the argument.
        mathCeil(Double.NEGATIVE_INFINITY);
        System.out.println();

        // If the argument is NaN or an infinity or positive zero or negative zero, then
        // the result is the same as the argument.
        mathCeil(Double.POSITIVE_INFINITY);
        System.out.println();

        // If the argument is NaN or an infinity or positive zero or negative zero, then
        // the result is the same as the argument.
        mathCeil(+0.0);
        System.out.println();

        // If the argument is NaN or an infinity or positive zero or negative zero, then
        // the result is the same as the argument.
        mathCeil(-0.0);
        System.out.println();

    }

    private static void mathCeil(double value) {
        System.out.println("Processing: " + value);
        System.out.print("Math.ceil(" + value + ") => ");
        System.out.println(Math.ceil(value));
    }
}
