
import java.util.Scanner;

class q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the carpet (in meters): ");
        double length = sc.nextDouble();

        System.out.print("Enter width of the carpet (in meters): ");
        double width = sc.nextDouble();

        System.out.print("Enter rate per square meter: ");
        double rate = sc.nextDouble();

        double area = length * width;
        double price = area * rate;

        System.out.println("Total price of the carpet is: $" + price);


    }
}
