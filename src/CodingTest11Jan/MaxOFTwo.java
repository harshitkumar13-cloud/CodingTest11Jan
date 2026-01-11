package CodingTest11Jan;
import java.util.*;
public class MaxOFTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers");
        if(sc.hasNextInt())
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int max = (x>y) ? x:y;
            System.out.println("Max number between two inputs is: " + max);
        }
        else {
            System.out.println("Please enter a valid number");
        }
    }
}

