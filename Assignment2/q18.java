import java.util.Scanner;

 class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the park : ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of the park : ");
        double breadth = sc.nextDouble();

        double perimeter = 2 * (length + breadth);

        double tDistance = perimeter * 10;

        double tDistancekm = tDistance/ 1000;

        System.out.println("Ron covers " + tDistance);

    
    }
}
