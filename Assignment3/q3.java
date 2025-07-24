
import java.util.Scanner;

public class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter your years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            int bonus = salary * 5 / 100;
            System.out.println(" bonus:" + bonus);
        } else {
            System.out.println("You are not eligible for a bonus.");
        }
    }
}
