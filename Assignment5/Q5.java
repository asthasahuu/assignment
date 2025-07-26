
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter a no.:");
    int n = sc.nextInt();
    int fac = 1;
  for(int i =1;i<=n;i++){
  fac=fac*i;
   }
    System.out.println(fac);
}
}