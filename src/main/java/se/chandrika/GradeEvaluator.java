package se.chandrika;

public class GradeEvaluator {
    public static void main(String[] args) {
        int betyg =60;
        if(betyg>=80){
            System.out.println("väl godkänt");
        }
        else if(betyg>=70){
            System.out.println("godkänt");
        }
        else{
            System.out.println("underkänt");
        }
    }
}
