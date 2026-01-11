package CodingTest11Jan;
import java.util.*;
public class CalculatorInt {

    static int add(int x, int y)
    {
        return x+y;
    }

    static int difference(int x, int y)
    {
        return x-y;
    }

    static int multiply(int x, int y)
    {
        return x*y;
    }

    static int divide(int x, int y)
    {
        if(y==0)
        {
            System.out.println("Division by zero, not allowed");
        }
       return x/y;
    }

    static int mod(int x, int y)
    {
        return x%y;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two integers");
    int x = sc.nextInt();
    int y = sc.nextInt();

        System.out.println( add(x,y));
        System.out.println(difference(x,y));
        System.out.println(multiply(x,y));
        System.out.println(divide(x,y));
        System.out.println(mod(x,y));
    }
}
