package chapter01;


public class MathAddExact {
    public static void main(String[] args) {
        //int
        add(10, 100);
        add(1_500_000_000, 1_600_000_000);

        add(10L, 100L);
        add(1_500_000_000L, 1_600_000_000L);
        add(5_000_000_000_000_000_000L, 4_000_000_000_000_000_000L);
        add(5_000_000_000_000_000_000L, 5_000_000_000_000_000_000L);
    }

    private static void add(int i, int j) {
        System.out.println("Adding two int values:");
        System.out.println(i);
        System.out.println(j);
        try {
            System.out.println("Result with normal '+'      -> " + (i + j));
            System.out.println("Result with Math.addExact() -> " + Math.addExact(i, j));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }
    private static void add(long i, long j) {
        System.out.println("Adding two long values:");
        System.out.println(i);
        System.out.println(j);
        try {
            System.out.println("Result with normal '+'      -> " + (i + j));
            System.out.println("Result with Math.addExact() -> " + Math.addExact(i, j));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}