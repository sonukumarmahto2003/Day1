public class largestOf3 {
    public static void main(String[] args) {
        int A = 1, B = 2, C = 3;
        if (A == B && B == C) {
            System.out.println("All are equal");
        } else if ((A >= B) && (A >= C)) {
            System.out.println("Largest is A: " + A);
        } else if (B >= C) {
            System.out.println("Largest is B: " + B);
        } else {
            System.out.println("Largest is C: " + C);
        }

    }
}
