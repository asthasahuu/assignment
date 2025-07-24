import java.util.Scanner;

 class q31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice : ");
        char choice = sc.next().charAt(0);

        if (choice == 'C' || choice == 'c') {
            System.out.print("Enter temperature : ");
            double f = sc.nextDouble();
            double celsius = (f - 32) * 5 / 9;
            System.out.println("Temperature = "+celsius);
        } else if (choice == 'F' || choice == 'f') {
    
            System.out.print("Enter temperature : ");
            double c = sc.nextDouble();
            double fahrenheit = (c * 9 / 5) + 32;
            System.out.println("Temperature  = " + fahrenheit);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
