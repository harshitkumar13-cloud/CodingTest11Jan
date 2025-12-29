import java.sql.SQLOutput;
import java.util.*;
public class TriangleClassifier {
    public static void main(String[] args) {
        System.out.println("Enter all 3 sides of a triangle");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        if(s1==s2 && s2==s3){
            System.out.println("this is an equilateral triangle");
        }
        else if(s1==s2 || s2==s3 || s3==s1) {
            System.out.println("This is an isosceles triangle");
        }
        else{
            System.out.println("This is a scalene triangle");
        }

    }
}
