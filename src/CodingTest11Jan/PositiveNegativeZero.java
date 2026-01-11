package CodingTest11Jan;
import java.sql.SQLOutput;
import java.util.*;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        if(sc.hasNextInt())
        {
            int x = sc.nextInt();
            String result = (x>0) ? "Positive": (x<0) ? "Negative" : "zero";
            System.out.println(result);
        }
        else {
            System.out.println("Please enter a valid number");
        }
    }
}
