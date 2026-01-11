package CodingTest11Jan;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check if it is odd or even");
        int x = sc.nextInt();

        if(x%2==0)
        {
            System.out.println(x + " It is even");
        }
        else {
            System.out.println(x + " It is odd");
        }
    }
}
