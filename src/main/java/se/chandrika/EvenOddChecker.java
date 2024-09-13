package se.chandrika;

public class EvenOddChecker {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2==0){
                System.out.println("The number is Even:" +" "+ numbers[i]);
            }
            else{
                System.out.println("The number is Odd:" + " " + numbers[i]);
            }
        }

    }


}
