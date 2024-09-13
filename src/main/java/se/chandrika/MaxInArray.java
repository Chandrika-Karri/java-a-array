package se.chandrika;

public class MaxInArray {
    public static void main(String[] args) {
        double[] num = {1.0,2.0,3.0,4.0,5.0};
        double big = num[0];
        for(int i=0; i<num.length; i++) {
            if (num[i] > big) {
                big = num[i];
            }
        }

            System.out.println("the Big number is: " + big);



    }
}
