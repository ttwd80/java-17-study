package chapter01;

public class WrapperInteger {
    public static void main(String[] args) {
        Integer[] values = new Integer[] {
                Integer.valueOf(10),
                Integer.valueOf(-40),
                null,
                91,
                -11,
                0,
        };

        for (Integer value : values) {
            System.out.println("Processing " + value);
            Exception e = null;
            try {
                process(value);
            } catch (Exception ex) {
                e = ex;
            }
            if (e != null) {
                System.out.println("Exception was: " + e.toString());
            }
        }
    }

    private static void process(int value) {
    }

}
