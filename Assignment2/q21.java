import java.util.Scanner;

 class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brick length : ");
        int brickLength = sc.nextInt();

        System.out.print("Enter brick breadth : ");
        int brickBreadth = sc.nextInt();

        System.out.print("Enter brick height : ");
        int brickHeight = sc.nextInt();

        System.out.print("Enter wall length : ");
        double wallLengthM = sc.nextDouble();

        System.out.print("Enter wall breadth : ");
        double wallBreadthM = sc.nextDouble();

        System.out.print("Enter wall height : ");
        double wallHeightM = sc.nextDouble();

        int wallLength = (int)(wallLengthM * 100);
        int wallBreadth = (int)(wallBreadthM * 100);
        int wallHeight = (int)(wallHeightM * 100);

    
        int brickVolume = brickLength * brickBreadth * brickHeight;
        int wallVolume = wallLength * wallBreadth * wallHeight;

        int numberOfBricks = wallVolume / brickVolume;

        System.out.println("Total number of bricks required: " + numberOfBricks);

    }
}
