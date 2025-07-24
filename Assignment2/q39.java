import java.util.Scanner;

class q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter of the cylinder (cm): ");
        double diameter = sc.nextDouble();

        System.out.print("Enter height of the cylinder (cm): ");
        double height = sc.nextDouble();

        double radius = diameter / 2;

        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        System.out.println("Surface Area of the cylinder is: "+ surfaceArea);
    }
}

