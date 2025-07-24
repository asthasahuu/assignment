import java.util.Scanner;

public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        int cost = 100;
        int total = quantity * cost;

        if (total > 1000) {
            int discount = total * 10 / 100;
            total = total - discount;
                   System.out.println("Total amount to pay:" + total);
        }
    }
}
