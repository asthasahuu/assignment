
public class A23 {
    public static void main(String[] args) {
    
        int boxSide = 3;
        int cartonLength = 15;
        int cartonBreadth = 9;
        int cartonHeight = 12;
        int boxVolume = boxSide * boxSide * boxSide;
        int cartonVolume = cartonLength * cartonBreadth * cartonHeight;
        int numberOfBoxes = cartonVolume / boxVolume;

        System.out.println( numberOfBoxes);
    }
}
