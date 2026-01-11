import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;


public class GuessTheNumber {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       Random rm = new Random();
       int numberToGuess = rm.nextInt(100 );
        System.out.println(numberToGuess);


    }
}
