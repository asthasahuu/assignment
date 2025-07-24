public class A24{
    public static void main(String[] args) {
        int wallLength = 2000;
        int wallHeight = 200;
        int wallThick = 75;

        double brickLength = 25;
        double brickWidth = 10;
        double brickHeight = 7.5;

        int cost = 900;
        double wallVolume = wallLength * wallHeight * wallThick;
        double brickVolume = brickLength * brickWidth * brickHeight;

        double numberOfBricks = wallVolume / brickVolume;
        double totalCost = (numberOfBricks / 1000) * cost;

        System.out.println(numberOfBricks);
        System.out.println(totalCost);
    }
}
