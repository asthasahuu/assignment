public class A19 {
    public static void main(String[] args) {
        int Edge = 7;
        int cubeVolume = Edge *Edge *Edge;
        int l = 7;
        int b = 4;
         int h = 8;
        int cuboidVolume = l * b * h;
        System.out.println ( cubeVolume);
        System.out.println( cuboidVolume );
        if (cubeVolume > cuboidVolume) {
            System.out.println("Cube has more volume.");
        } else if (cuboidVolume > cubeVolume) {
            System.out.println("Cuboid has more volume.");
        } else {
            System.out.println("Both have equal volume.");
        }
    }
}
