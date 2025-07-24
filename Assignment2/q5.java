import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total fencing cost : ");
        int totalCost = input.nextInt();

        System.out.print("Enter the cost per meter of fencing : ");
        int costPerMeter = input.nextInt();

        System.out.print("Enter the length of the park : ");
        int length = input.nextInt();

        int perimeter = totalCost / costPerMeter;

        int breadth = (perimeter / 2) - length;

        int area = length * breadth;
        System.out.println("Breadth of the park: " + breadth + " meters");
        System.out.println("Perimeter of the park: " + perimeter + " meters");
        System.out.println("Area of the park: " + area + " square meters");

    }
}
