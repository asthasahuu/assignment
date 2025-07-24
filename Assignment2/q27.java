import java.util.Scanner;

 class q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the dining room (in meters): ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of the dining room (in meters): ");
        double breadth = sc.nextDouble();

        System.out.print("Enter tiling rate per square meter: ");
        double rate = sc.nextDouble();

        double area = length * breadth;
        double cost = area * rate;

        System.out.println("Total cost of tiling is" + cost);


    }
}
