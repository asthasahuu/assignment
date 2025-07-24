import java.util.Scanner;

public class q8{
 static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes: ");
        int tclass = sc.nextInt();  

        System.out.print("Enter attended classes: ");
        int aclass = sc.nextInt();  

        double p = (aclass * 100.0) / tclass; 
        System.out.println("Attendance: " + p);

        if (p >= 75) {
            System.out.println("Allowed to sit in exam.");
        } else {
            System.out.print("Do you have medical cause ");
            char m = sc.next().charAt(0);
        
            if (m == 'Y' || m == 'y') {
                System.out.println("Allowed due to medical cause.");
            } else {
                System.out.println("Not allowed to sit in exam.");
            }
        }
    }
}
