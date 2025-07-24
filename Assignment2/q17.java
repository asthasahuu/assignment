import java.util.Scanner;

 class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the display board : ");
        double length = sc.nextDouble();

        System.out.print("Enter width of the display board : ");
        double width = sc.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("Luci needs " + perimeter );

    }
}
