import java.util.*;
public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("Product of Number : "+product);
    }
}
