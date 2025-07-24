public class A29{
    public static void main(String[] args) {
        int floorL = 800;
        int floorW = 900;
        int tileS = 10;
        int floorArea = floorL * floorW;
        int tileArea = tileS * tileS;
        int numberOfTiles = floorArea / tileArea;
        System.out.println( floorArea );
        System.out.println( tileArea);
        System.out.println( numberOfTiles);
    }
}
