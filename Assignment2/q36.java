import java.util.Scanner;

public class q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter of cylinder in meters: ");
        double diameter = sc.nextDouble();
        double radius = diameter / 2;

        System.out.print("Enter height of cylinder in meters: ");
        double height = sc.nextDouble();

        double pi = 3.1416;
        double surfaceArea = 2 * pi * radius * (radius + height);

        System.out.printf("Total Surface Area = %.2f m²\n", surfaceArea);

    }
}
