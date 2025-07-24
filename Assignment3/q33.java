import java.util.Scanner;

 class q33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if ((num & 1) == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }

    }
}

