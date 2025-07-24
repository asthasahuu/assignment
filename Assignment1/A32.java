public class A32{
    public static void main(String[] args) {
        int gardenSide = 150;
        int poolSide = 25;
        int gardenArea = gardenSide * gardenSide;
        int poolArea = poolSide * poolSide;

        int gardenWithoutPool = gardenArea - poolArea;
        System.out.println( gardenArea);
        System.out.println( gardenWithoutPool);
    }
}

