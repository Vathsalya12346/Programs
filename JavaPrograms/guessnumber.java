import java.util.Random;
import java.util.Scanner;

public class guessnumber{
    public static void main(String[]args){
        Random Random=new Random();//obj

        int randomnumber=Random.nextInt(25)+1;//0 to24
        Scanner Scanner=new Scanner(System.in);
        System.out.println("I have choosen a number bbetween 1 to 25,Guess in three attempts");

        boolean hasGuessedCorrectly = false;

        for (int attempt=1;attempt<=3;attempt++){
            System.out.print("Attempt"+attempt+"Enter your guess:");
            int userguess=Scanner.nextInt();
            hasGuessedCorrectly = true;

            if(userguess==randomnumber){
                System.out.println("congrats,youve guessed correctly");
            }else if(userguess>randomnumber){
                System.out.println("too high");
            }else{
                System.out.println("too low");
            }
        }
        if(hasGuessedCorrectly) {
            System.out.println("Sorry, you've used all 3 attempts. The correct number was: " + randomnumber);
        }
    }

}
