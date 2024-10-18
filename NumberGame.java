// importing Random class , Scanner Class
import java.util.Random;
import java.util.Scanner;

public class NumberGame{

public static void main(String args[])
{
    Random random = new Random();
    try (Scanner sc = new Scanner(System.in)) {
        int totalScore = 0;
        int roundsPlayed = 0;
        boolean guessedCorrectly = false;

        //Generating a random number
   int x = random.nextInt(100) + 1;
   
   int attempts = 1;
   int maxGuess = 7;
   
   //Taking input from the user
   System.out.println("Guess a number between 0 and 100 ! You have " + maxGuess + " attempts");

   while(attempts < maxGuess){

   System.out.println("Attempt" + (attempts) + ": ");
   int user_inp = sc.nextInt();

   if(user_inp < x){
        System.out.println("TOO LOW \n TRY AGAIN.");
   }

   else if(user_inp > x){
        System.out.println("TOO HIGH \n TRY AGAIN.");
   }
   
   else{
        System.out.println("Congratualations ! You guessed it right. The random number is " + x);
        totalScore += (maxGuess - attempts) ;
        guessedCorrectly = true;
        break;
   }

   attempts++;

}
if(guessedCorrectly == false) {
System.out.println("Sorry! You have exceeded the maximum number of attempts. The random number was " + x);
}

roundsPlayed++;

System.out.println("Do you want to play again (Y=1/N=0)?");
        int a = sc.nextInt();
        if(a==0){
            System.out.println("End");
        }

System.out.println("You played " + roundsPlayed + " rounds and your total score is " + totalScore);
    }

}
}