package se.chandrika;

public class ForLoopSum {

    public static void main(String[] args) {

        float[] numbers;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {

            sum= sum+i;
        }
        System.out.println("Total sum of 1 to 100 is:"+" "+sum);


    }
}
