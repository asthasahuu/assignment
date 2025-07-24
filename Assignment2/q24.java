import java.util.Scanner;

 class q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       double brickLength = 0.25;
        double brickWidth = 0.10;
        double brickHeight = 0.075;

        double wallLength = 20;
        double wallHeight = 2;
        double wallThickness = 0.75;

        double brickVolume = brickLength * brickWidth * brickHeight;
        double wallVolume = wallLength * wallHeight * wallThickness;

        int totalBricks = (int) Math.ceil(wallVolume / brickVolume);

        double costPerThousand = 900;
        double totalCost = (totalBricks / 1000.0) * costPerThousand;

        System.out.println("Total number of bricks required: " + totalBricks);
        System.out.println("Total cost to build the wall:" + totalCost);


    }
}
