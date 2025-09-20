import java.util.*;
public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int c = sc.nextInt();
        int sum = a + b + c;
        float average = sum / 3.0f;
        System.out.println("average of Number: "+average);
    }
}
