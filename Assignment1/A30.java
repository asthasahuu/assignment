class A30 {
    public static void main(String[] args) {
        int floorLength = 200;
        int floorWidth = 400;
        int tileLength = 5;
        int tileWidth = 8;
        int floorArea = floorLength * floorWidth;
        int tileArea = tileLength * tileWidth;
        int numberOfTiles = floorArea / tileArea;

        System.out.println( floorArea );
        System.out.println( tileArea );
        System.out.println( numberOfTiles);
    }
}
