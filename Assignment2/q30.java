import java.util.Scanner;

 class q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter floor length : ");
        int floorLength = sc.nextInt();

        System.out.print("Enter floor width : ");
        int floorWidth = sc.nextInt();

        System.out.print("Enter tile length : ");
        int tileLength = sc.nextInt();

        System.out.print("Enter tile width : ");
        int tileWidth = sc.nextInt();

        int floorArea = floorLength * floorWidth;
        int tileArea = tileLength * tileWidth;


        int totalTiles = floorArea / tileArea;

        System.out.println("Total number of tiles " + totalTiles);
        
    }
}
