import java.util.Scanner;

public class q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius : ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double pi = 3.1416;
        double surfaceArea = 2 * pi * r * (h + r);

        System.out.println( surfaceArea);
        

    }
}
