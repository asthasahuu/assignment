
import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of classes held: ");
        int totalClasses = sc.nextInt();

        System.out.print("Enter no. of classes attended: ");
        int attendClass = sc.nextInt();

        double percentage = (attendClass* 100.0) / totalClasses;

        System.out.println("Percentage of classes attend: " + percentage);

        if (percentage >= 75) {
            System.out.println("Student is allowed to sit in exam.");
        } else {
            System.out.println("Student is not allowed to sit in exam.");
        }
    }
}
