 class A43 {
    public static void main(String[] args) {
        double height = 4;
        double slantHeight = 5;
        double rate = 10;
        double pi = 3.1416;
        double radius = Math.sqrt(slantHeight * slantHeight - height * height);
        double baseArea = pi * radius * radius;
        double cost = baseArea * rate;
        System.out.println( radius);
        System.out.println( baseArea);
        System.out.println( cost);
    }
}
