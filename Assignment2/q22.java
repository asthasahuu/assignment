import java.util.Scanner;

 class q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the pond (in meters): ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of the pond (in meters): ");
        double breadth = sc.nextDouble();

        System.out.print("Enter the depth of the pond (in meters): ");
        double depth = sc.nextDouble();

        double volume = length * breadth * depth;

        System.out.println("Capacity of the pond is: " + volume );

    
    }
}
