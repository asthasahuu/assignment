import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int n  = sc.nextInt();
        for( int i=2; i<=n;i++){
       if(n%i==0){
       System.out.println("this is not a prime number");
       break;
       }
       else{
        System.out.println(n+"This is a prime number");
       }

       
        }
    

    }
}
