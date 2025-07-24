import java.util.Scanner;

 class q36{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int angle1 = sc.nextInt();

        System.out.print("Enter second angle: ");
        int angle2 = sc.nextInt();

        System.out.print("Enter third angle: ");
        int angle3 = sc.nextInt();

        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is NOT valid.");
        }
    }
}

