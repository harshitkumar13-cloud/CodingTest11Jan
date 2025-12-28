public class Max_of_three {
    public static void main(String[] args) {
        int n1 = 50;
        int n2 = 10;
        int n3 = 60;
        int max = (n1 > n2)
                ? (n1 > n3 ? n1 : n3)
                : (n2 > n3 ? n2 : n3);

        System.out.println(max);
    }
}
