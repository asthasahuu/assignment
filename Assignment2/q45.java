import java.util.Scanner;

 class q45{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term : ");
        int a = sc.nextInt();

        System.out.print("Enter the common difference): ");
        int d = sc.nextInt();

        System.out.print("Enter the number of terms): ");
        int n = sc.nextInt();
        int sum = n * (2 * a + (n - 1) * d) / 2;

        System.out.println("Sum of first " + n +"term:"+sum);
        
        sc.close();
    }
}
