import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the area of the right triangle (in cm²): ");
        double area = sc.nextDouble();

        System.out.print("Enter the length of one leg (in cm): ");
        double leg1 = sc.nextDouble();

        if (leg1 <= 0 || area <= 0) {
            System.out.println("Area and leg must be greater than 0.");
            return;
        }

        double leg2 = (2 * area) / leg1;

        System.out.printf("The other leg = %.2f cm\n", leg2);
    }
}
