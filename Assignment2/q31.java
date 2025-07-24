import java.util.Scanner;

 class q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square (in meters): ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;
        double area = side * side;

        System.out.println("Side of square: " + side + " meters");
        System.out.println("Area of square: " + area + " square meters");

    
    }
}
