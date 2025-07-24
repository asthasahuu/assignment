import java.util.Scanner;

 class q38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the volume of the cylinder: ");
        double volume = sc.nextDouble();

        System.out.print("Enter the radius of the base: ");
        double radius = sc.nextDouble();

        double height = volume / (Math.PI * radius * radius);

        double surfaceArea = 2 * Math.PI * radius * (radius + height);

        System.out.println( height);
        System.out.println( surfaceArea);
    }
}
