import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the perimeter of the rectangle (in cm): ");
        int perimeter = input.nextInt();

        System.out.print("Enter the length of the rectangle (in cm): ");
        int length = input.nextInt();

        int breadth = (perimeter / 2) - length;

        int area = length * breadth;

        System.out.println("Breadth of the rectangle: " + breadth + " cm");
        System.out.println("Area of the rectangle: " + area + " square cm");

    }
}
