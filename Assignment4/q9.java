import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
    
         Scanner sc = new Scanner(System.in);
      System.out.println("Enter a no.:");
      int n = sc.nextInt();
        int n1= 1, n2= 2;
        int i = 0;
        while (i < n) {
            System.out.print(n1 + " ");
            int n3 = n1 *n2;
            n1 = n2;
            n2 = n3;
            i++;
}
}
    }
