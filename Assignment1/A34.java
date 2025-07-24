 class A34{
    public static void main(String[] args) {
        double b1 = 128;
        double b2 = 92;
        double h = 40;
        double walkwayWidth = 4 ;
        double trapezoidArea = 0.5 * (b1 + 2) * h;
        double walkwayArea = walkwayWidth * h;

        // Total area after adding walkway
        double totalArea = trapezoidArea + walkwayArea;
        System.out.println( totalArea);
    }
}
