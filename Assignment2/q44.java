import java.util.Scanner;

 class q44{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term: ");
        int a = sc.nextInt();

        System.out.print("Enter the common difference: ");
        int d = sc.nextInt();

        int n = 28;
        int term = a + (n - 1) * d;

        System.out.println("The 28th term of the A.P. is: " + term);
        
    }
}

