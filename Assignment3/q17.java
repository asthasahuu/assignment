import java.util.Scanner;

class q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double len = sc.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();

        double area = len * breadth;

        System.out.println("Area of the rectangle is: " + area);

    }
}
