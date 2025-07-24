import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number(1-7): ");
        int day= sc.nextInt();
        
        switch (day) {
            case 1:
                System.out.println("expected output:Monday"
                );
                break;
            case 2:
                System.out.println("expected outpuy:Tuesday");
                break;
            case 3:
                System.out.println("expected output:Wednesday");
                break;
            case 4:
                System.out.println("expected output:Thursday");
                break;
            case 5:
                System.out.println("expected output:Friday");
                break;
            case 6:
                System.out.println("expected output:Saturday");
                break;
            case 7:
                System.out.println("expected output:Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        sc.close();
    }
}

