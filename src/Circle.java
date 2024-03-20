import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        final double PI = 3.14;
        System.out.print("반지름 입력:");
        double radius = scan.nextDouble();

        System.out.println("원의 둘레:" +(2*PI*radius));
        System.out.println("원의 넓이:" +(PI*radius*radius));
    }
}
