package chapter01;

public class MathBadAbsInteger {

  public static void process(int value) {
    System.out.println("Processing " + value);
    System.out.println("Math.abs => " + Math.abs(value));
    System.out.println("Done");
  }

  public static void main(String[] args) {
    final int[] values = {
        -5,
        0,
        7,
        81,
        -12,
        -673,
        592,
        Integer.MIN_VALUE,
    };
    for (int value : values) {
      process(value);
      System.out.println();
    }
  }
}
