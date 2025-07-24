import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter the area of the triangle: ");
        double area = input.nextDouble();

        double height = (2 * area) / base;

        System.out.println("Height of the triangle: " + height );

    }

        }