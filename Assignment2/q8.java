import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the altitude (height) of the triangle (in cm): ");
        double height = input.nextDouble();

        System.out.print("Enter the area of the triangle (in m²): ");
        double areaInSquareMeter = input.nextDouble();
        double areaInCm2 = areaInSquareMete * 10000;

        double base = (2 * area) / height;

        System.out.println("Base of the triangle: " + base );
    }
}
