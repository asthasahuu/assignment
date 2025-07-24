import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side length of the equilateral triangle : ");
        double a = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * a * a;

        System.out.printf("Area of the equilateral" + area);

        input.close();
    }
}
