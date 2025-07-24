import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the area of the rectangle : ");
        int area = input.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = input.nextInt();

        int length = area / breadth;

        int perimeter = 2 * (length + breadth);

        System.out.println("Length of the rectangle: " + length + " cm");
        System.out.println("Perimeter of the rectangle: " + perimeter + " cm");

    }
}
