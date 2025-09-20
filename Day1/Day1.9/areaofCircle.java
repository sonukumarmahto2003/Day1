import java.util.*;
public class areaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter of radius : ");
        float radius = sc.nextInt();
        float areaofCircle = 3.14f * radius * radius;
        System.out.println("Area of Circle : "+areaofCircle);
    }
}
