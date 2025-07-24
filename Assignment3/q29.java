import java.util.Scanner;

class q29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        int lowest;

        if (a < b && a < c && a < d) {
          lowest = a;
        } else if (b < c && b < d) {
            lowest = b;
        } else if (c < d) {
            lowest = c;
        } else {
          
            lowest = d;
        }

        System.out.println("The lowest number is: " + lowest);

    }
}

