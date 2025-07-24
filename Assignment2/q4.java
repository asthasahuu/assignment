import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the plot (in meters): ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the plot (in meters): ");
        double width = input.nextDouble();

        System.out.print("Enter the cost per 100 square meters: ");
        double costPerSqM = input.nextDouble();

        double area = length * width;

        double totalCost = (area / 100) * costPerSqM;

        System.out.println("Total area to be tiled: " + area + " square meters");
        System.out.println("Total cost of tiling: $" + totalCost);

    
    }
}
