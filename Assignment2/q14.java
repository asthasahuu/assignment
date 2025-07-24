import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the diagonal : ");
        double dl = sc.nextDouble();

        System.out.print("Enter the first perpendicular height: ");
        double h1 = sc.nextDouble();

        System.out.print("Enter the second perpendicular height : ");
        double h2 = sc.nextDouble();

        double area = 0.5 * dl * (h1 + h2);
        System.out.printf("The area of the field is %.2f square meters.\n", area);
    }
}

