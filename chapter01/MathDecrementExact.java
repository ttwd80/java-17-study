package chapter01;

public class MathDecrementExact {
    public static void main(String[] args) {
        // int
        int[] intValues = {
                10,
                20,
                1_000_210_436,
                -100,
                -5_000_020,
                -1_000_000,
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
        };

        long[] longValues = {
                10L,
                20L,
                10_000_000_493L,
                -100L,
                -20_200_900_589L,
                Long.MAX_VALUE,
                Long.MIN_VALUE,
        };

        System.out.println("Math.decrementExact(int a)");
        for (int value : intValues) {
            mathDecrementExact(value);
        }

        System.out.println("Math.decrementExact(long a)");
        for (long value : longValues) {
            mathDecrementExact(value);
        }

    }

    private static void mathDecrementExact(long value) {
        System.out.println("Value: " + value);
        try {
            System.out.println("Decrement using -");
            System.out.println(value + " - 1  = " + (value - 1));
            System.out.println("Math.decrementExact(" + value + ")");
            System.out.println(Math.decrementExact(value));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    private static void mathDecrementExact(int value) {
        System.out.println("Value: " + value);
        try {
            System.out.println("Decrement using -");
            System.out.println(value + " - 1  = " + (value - 1));
            System.out.println("Math.decrementExact(" + value + ")");
            System.out.println(Math.decrementExact(value));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }

}
