import java.util.Scanner;

 class q32{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side length of the garden : ");
        double gardenSide = sc.nextDouble();

        System.out.print("Enter side length of the swimming pool: ");
        double poolSide = sc.nextDouble();

        double gardenArea = gardenSide * gardenSide;
        double poolArea = poolSide * poolSide;
        double remainingArea = gardenArea - poolArea;
        System.out.println("Total area of garden: " + gardenArea + " sq.m");
        System.out.println("Area of swimming pool: " + poolArea + " sq.m");
        System.out.println("Area of garden excluding swimming pool: " + remainingArea + " sq.m");

        sc.close();
    }
}
