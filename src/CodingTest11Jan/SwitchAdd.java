package CodingTest11Jan;
import java.util.*;
public class SwitchAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");

        if(sc.hasNextInt()) {
            int x = sc.nextInt();
            if (sc.hasNextInt()) {
                int y = sc.nextInt();
                System.out.println("For addition enter 1");
                System.out.println("For subtraction enter 2");
                System.out.println("For multiplication enter 3");
                System.out.println("For division enter 4");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:

                        System.out.println("Sum of two numbers is: " + (x + y));
                        break;

                    case 2:
                        System.out.println("Difference of two numbers is: " + (x - y));
                        break;

                    case 3:
                        System.out.println("Multiplied value of two numbers is: " + (x * y));
                        break;

                    case 4:
                        if (y == 0) {
                            System.out.println("Division by zero is not allowed");
                        } else {
                            System.out.println("Divided value of two numbers is: " + (x / y));
                        }
                        break;

                    default: {
                        System.out.println("Please enter a number between 1 to 4");
                    }
                }
            } else {
                System.out.println("Second input is not an integer");
            }
        }else {
            System.out.println("First input is not an integer");
        }
    }
}
