public class A33{
    public static void main(String[] args) {
        int length = 30;
        int width = 20;

        int onePathWidth = 3;
        int twopathWidth = 4;
        int totalArea = length * width;
        int onePathArea = length * onePathWidth;
        int twoPathArea = width * twopathWidth;
        int overlapArea = onePathWidth * twopathWidth;

        int pathArea = onePathArea + twoPathArea - overlapArea;
        int Area = totalArea - pathArea;
        System.out.println( totalArea );
        System.out.println( pathArea);
        System.out.println( Area);
    }
}
