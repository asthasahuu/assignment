import java.util.Scanner;
public class q37 {
  public static void main(String args[]){
Scanner sc = new Scanner( System.in);

System.out.println("enete a no.:");
int a = sc.nextInt();
        if (a% 5 == 0 && a% 11 == 0) {
            System.out.println(a+ " is divisible by both 5 and 11.");
        } else {
            System.out.println(a+ " is NOT divisible by both 5 and 11.");
        }


  }
}
