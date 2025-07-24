import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side A : ");
        double a = input.nextDouble();

        System.out.print("Enter side B : ");
        double b = input.nextDouble();

        System.out.print("Enter the perimeter of the triangle : ");
        double perimeter = input.nextDouble();

        double c = perimeter - a - b;

        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Side C: " + c );
        System.out.println("Area of the triangle: " + area );

        input.close();
    }
}
