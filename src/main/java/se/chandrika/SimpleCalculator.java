package se.chandrika;

public class SimpleCalculator {

    public static void main(String[] args) {


        System.out.println("Addition:" + add(10,10));


        System.out.println("Subtraction:" + subtract(10,10));


        System.out.println("Multiplication:" + multiply(10,10));


        System.out.println("Division:" + divide(10,10));
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return a / b;
    }
}
