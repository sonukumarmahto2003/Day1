public class largestOf3 {
    public static void main(String[] args) {
        int A = 1, B = 1, C = 1;

        if( (A >= B) && (A >= C)) {
            System.out.println("largest is A");
        }
        else if(B >= C) {
            System.out.println("largest is B");
        }
        else {
            System.out.println("largest is C");
        }
    }
}
