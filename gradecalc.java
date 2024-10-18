import java.util.Scanner;

public class gradecalc {
    public static void main(String[] args) {
        //Assuming there are 5 subjects in total 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of maths: ");
        float m = sc.nextFloat();

        System.out.println("Enter marks of English: ");
        float e = sc.nextFloat();

        System.out.println("Enter marks of hindi: ");
        float h = sc.nextFloat();

        System.out.println("Enter marks of science: ");
        float s = sc.nextFloat();

        System.out.println("Enter marks of social science: ");
        float ss = sc.nextFloat();

        float total = m+h+e+s+ss;
        float percent = total/6;

        String grade = null;
        if(percent>90 && percent<=100){
            grade = "A";
        }

        else if(percent>80 && percent<=90){
            grade = "B";
        }

        else if(percent>70 && percent<=80){
            grade = "C";
        }

        else if(percent>60 && percent<=70){
            grade = "D";
        }

        else if(percent>50 && percent<=60){
            grade = "E";
        }

        else {
            System.out.println("FAIL");
        }

        System.out.println("The total marks of the student of all subjects (out of 600) is "+ total);
        System.out.println("The percentage of the student is "+ percent);
        System.out.println("The grade of the student is "+ grade);
        
    }
}
