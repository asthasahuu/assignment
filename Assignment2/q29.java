import java.util.Scanner;

 class q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter floor length in cm: ");
        int floorLength = sc.nextInt();

        System.out.print("Enter floor width in cm: ");
        int floorWidth = sc.nextInt();

        System.out.print("Enter side of square tile in cm: ");
        int tileSide = sc.nextInt();

        int floorArea = floorLength * floorWidth;
        int tileArea = tileSide * tileSide;

        int numberOfTiles = floorArea / tileArea;

        System.out.println("Number of tiles required: " + numberOfTiles);
    }
}

