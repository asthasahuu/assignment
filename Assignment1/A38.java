 class A38 {
    public static void main(String[] args) {
        double volume = 1287;
        double radius = 10;
        double pi = 3.1416;
        double height = volume / (pi * radius * radius);

        double surfaceArea = 2 * pi * radius * (radius + height);
        System.out.println( height);
        System.out.println( surfaceArea);
    }
}
