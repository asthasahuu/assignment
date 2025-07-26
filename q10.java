import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        double sum = 0.0;
        int i = 1;

        while (i <= n) {
            sum = sum + (1.0 / i);  
            i++;
        }

        System.out.println("Sum of series = " + sum);
    }
}
