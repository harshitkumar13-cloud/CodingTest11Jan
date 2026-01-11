package CodingTest11Jan;
import java.util.*;
public class doubleToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");

        if(sc.hasNextDouble()) {
            double x = sc.nextDouble();
            System.out.println("Below is the double value");
            System.out.println(x);

            int y = (int) x;
            System.out.println("Below is the type casted integer value");
            System.out.println(y);
        }
        else {
            System.out.println("Please enter a valid number");
        }
        sc.close();
    }
}
