import java.util.Scanner;

public class q37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter surface area : ");
        double surfaceArea = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double pi = 3.1416;

        double a = 1;
        double b = height;
        double c = -(surfaceArea / (2 * pi));

        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            System.out.println("No real solution for radius.");
        } else {
        
            double r = (-b + Math.sqrt(discriminant)) / (2 * a);

            double diameter = 2 * r;

            System.out.printf("The diameter of the cylinder is: %.2f cm\n", diameter);
        }

    }
}

