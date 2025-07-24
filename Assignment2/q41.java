
import java.util.Scanner;

 class q41{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter (cm): ");
        double diameter = sc.nextDouble();

        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        double radius = diameter / 2;

        double volume = Math.PI * radius * radius * height;

        System.out.printf("Volume of the cylinder = %.2f cm³", volume);
    }
}
