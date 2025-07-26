import java.util.Scanner;
class q8 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a no.:");
      int n = sc.nextInt();
        int n1= 0, n2= 1;
        int i = 0;
        while (i < n) {
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            i++;
        }
    }
}

