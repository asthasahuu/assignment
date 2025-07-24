import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of one tile: ");
        int tLength = input.nextInt();

        System.out.print("Enter the breadth of one tile: ");
        int tBreadth = input.nextInt();

        System.out.print("Enter the length of the floor : ");
        int floorLength = input.nextInt();

        System.out.print("Enter the breadth of the floor: ");
        int floorBreadth = input.nextInt();

        int tileArea = tLength * tBreadth;
        int floorArea = floorLength * floorBreadth;

        int numberOfTiles = floorArea / tileArea;

        System.out.println("Number of tiles required: " + numberOfTiles);

    }
}
