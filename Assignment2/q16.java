import java.util.Scanner;

 class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the dining room (in meters): ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the dining room (in meters): ");
        double width = sc.nextDouble();

        double area = length * width;

        System.out.println("Tina needs to buy " + area );

    }
}

