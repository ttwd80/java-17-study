package chapter01;

public class MathFloor {
    public static void main(String[] args) {
        Double values[] = {

            //normal positive number
            //Math.floor(7.2) => 7.0
            7.2,

            //Math.floor(152.99) => 152.0
            152.99,

            //Math.floor(-2.03) => -3.0
            -2.03,

            //Math.floor(-16.98) => -17.0
            -16.98,

            //Math.floor(0.0) => 0.0
            0.0,

            //Math.floor(-0.0) => -0.0
            -0.0,

            //Math.floor(0.1) => 0.0
            0.1,

            //Math.floor(-0.1) => -1.0
            -0.1,

            //Math.floor(NaN) => NaN
            Double.NaN,

            //Math.floor(-Infinity) => -Infinity
            Double.NEGATIVE_INFINITY,

            //Math.floor(Infinity) => Infinity
            Double.POSITIVE_INFINITY,

        };
        for (Double value: values) {
            mathFloor(value);
            System.out.println();
        }
    }

    private static void mathFloor(Double value) {
        System.out.print("Math.floor(" + value + ") => ");
        System.out.println(Math.floor(value));
    }    
}
