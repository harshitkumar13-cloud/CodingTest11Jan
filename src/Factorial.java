import javax.swing.*;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");


        int fact = 1;
        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            if (n == 0) {
                fact = 1;
            } else {
                for (int i = 1; i <= n; i++) {
                    fact = fact * i;
                }
            }
            System.out.println("Factorial of number is " + fact);
        }
         else {
            System.out.println("Please enter a valid number");
        }
    }

    }