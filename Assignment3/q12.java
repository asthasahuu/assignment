import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();

        if (num >= 1000 && num <= 9999) {
            int rev = 0;

            while (num != 0) {
                int digit = num % 10;   
                rev = rev * 10 + digit; 
                num = num / 10;     
            }

            System.out.println("Reversed Number: " + rev);
        } else {
            System.out.println("Please enter a valid  no.");
        }

        sc.close();
    }
}
