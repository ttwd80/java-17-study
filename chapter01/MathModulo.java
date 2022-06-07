package chapter01;

public class MathModulo {
    public static void main(String[] args) {
        normalModulo();
        System.out.println();

        mathFloorMod();
        System.out.println();
    }

    private static void mathFloorMod() {
        // if the signs are the same on both sides,
        // the result is the same as the % operator
        System.out.println("mathFloorMod");
        System.out.println("All positive");
        mathFloorMod(38, 10);
        System.out.println();

        System.out.println("All negative");
        // -38 % -10
        // throw away the sign
        // 38 % 10 = 8
        // use the sign from -38 (negative)
        // -8
        mathFloorMod(-38, -10);
        System.out.println();

        // first get the non floor divide result
        // 31 / -10 = -3.1
        // we floor -3.1
        // -4.0 ... -3.1 ... -3.0
        // the floor is -4
        // -4 x -10 is 40
        // our result is 38 - 40, which is -2
        System.out.println("Math.floorMod(positive, negative)");
        mathFloorMod(38, -10);
        System.out.println();

        // first get the non floor divide result
        // -31 / 10 = -3.1
        // we floor -3.1
        // -4.0 ... -3.1 ... -3.0
        // the floor is -4
        // -4 x 10 is -40
        // our result is (-38) - (-40), which is 2
        System.out.println("Math.floorMod(negative, positive)");
        mathFloorMod(-38, 10);
        System.out.println();

        // zero with positive, would get 0
        mathFloorMod(0, 10);
        System.out.println();

        // zero with negative, would get 0
        mathFloorMod(0, -10);
        System.out.println();

        // ArithmeticException: / by zero
        mathFloorMod(10, 0);
        System.out.println();

        // ArithmeticException: / by zero
        mathFloorMod(-10, 0);
        System.out.println();

    }

    private static void mathFloorMod(int x, int y) {
        try {
            System.out.print("Math.floorMod(" + x + ", " + y + ") => ");
            System.out.println(Math.floorMod(x, y));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void normalModulo() {
        System.out.println("normalModulo");
        System.out.println("Positive % Positive => Positive");
        System.out.println("Positive % Negative => Positive");
        System.out.println("Negative % Positive => Negative");
        System.out.println("Negative % Negative => Negative");

        // 38 % 10 = 8
        // 38 - 8 = 30, 30 / 10 = 3
        normalModulo(38, 10);

        // 38 % -10 = 8
        // Ignore the signs, do the normal 38 % 10,
        // then follow the sign of the first number
        // since we have 38, the answer is also positive, 8
        // the negative in -10 can be ignored
        normalModulo(38, -10);

        // -38 % 10 = -8
        // Ignore the signs, do the normal 38 % 10,
        // then follow the sign of the first number
        // since we have -38, the answer is also negative, -8
        // the positive in 10 can be ignored
        normalModulo(-38, 10);

        // -38 % -10 = -8
        // Ignore the signs, do the normal 38 % 10,
        // then follow the sign of the first number
        // since we have -38, the answer is also negative, -8
        // the negative in -10 can be ignored
        normalModulo(-38, -10);

        // zero with positive, would get 0
        normalModulo(0, 10);

        // zero with negative, would get 0
        normalModulo(0, -10);

        // ArithmeticException: / by zero
        normalModulo(10, 0);

        // ArithmeticException: / by zero
        normalModulo(-10, 0);
    }

    private static void normalModulo(int x, int y) {
        try {
            System.out.print(x + " % " + y + " = ");
            System.out.println(x % y);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
