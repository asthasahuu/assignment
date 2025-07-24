public class A21 {
    public static void main(String[] args) {
        int wallL= 1500;
        int wallB = 1000;
        int wallH = 800;
        int brickL = 15;
        int brickB = 8;
        int brickH = 5;

        long wallVolume = (long) wallL* wallB * wallH;
        int brickVolume = brickL* brickB * brickH;
        long numberOfBricks = wallVolume / brickVolume;
        System.out.println( numberOfBricks);
    }
}

