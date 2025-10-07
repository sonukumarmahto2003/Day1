import java.util.*;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n < 2) {
            System.out.println("not prime number : "+ n);
        } else {
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true) {
                System.out.println("prime number : "+ n);
            } else {
                System.out.println("not prime number : "+ n);
            }
        }
    }
}
