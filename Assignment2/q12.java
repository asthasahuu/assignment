import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the hypotenuse : ");
        double hypotenuse = sc.nextDouble();

        System.out.print("Enter the length of one side : ");
        double sideOne = sc.nextDouble();

        if (hypotenuse <= sideOne) {
            System.out.println("Invalid input! ");
            return;
        }

        double sideTwo = Math.sqrt(hypotenuse * hypotenuse - sideOne * sideOne);

        double area = 0.5 * sideOne * sideTwo;

        System.out.printf("The other side = %.2f cm\n", sideTwo);
        System.out.printf("Area of the triangle = %.2f cm²\n", area);
    }
}
