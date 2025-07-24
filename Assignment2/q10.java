import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the equal sides : ");
        double side = input.nextDouble();

        double area = 0.5 * side * side;

        System.out.printf("Area of the isosceles right-angled trianle", area);

        input.close();
    }
}

