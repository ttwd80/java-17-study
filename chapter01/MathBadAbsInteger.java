package chapter01;

public class MathAPI {
  
  public static void process(int value) {
    System.out.println("Processing " + value);
    System.out.println("Math.abs => " + Math.abs(value));
    System.out.println("Done");
  }
  
  public static void main(String[] args) {
    process(-5);
    System.out.println();
    process(0);
    System.out.println();
    process(7);
    System.out.println();
    process(81);
    System.out.println();
    process(-12);
    System.out.println();
    process(-673);
    System.out.println();
    process(592);
    System.out.println();
    process(Integer.MIN_VALUE);
    System.out.println();
    process(Integer.MAX_VALUE);
    System.out.println();
  }
}
