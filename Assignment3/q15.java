import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price : ");
        int cP = sc.nextInt();

        double tax;
        if (cP > 100000) {
            tax = cP * 0.15;
        } else if (cP > 50000 && cP <= 100000) {
            tax = cP * 0.10;
        } else {
            tax = cP * 0.05;
        }

        System.out.println("Road Tax to be paid: Rs. " + tax);

    }
}