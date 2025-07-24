import java.util.Scanner;

public class q6{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a no.: ");
        int n = sc.nextInt();
        
        if (n < 0) {
           int absolutevalue=Math.abs(n);
           System.out.println("Absolute value is:"+absolutevalue);
        }
        else if(n>0){
            System.out.println("absolute value:"+n);
        }
        else{
            System.out.println("number is Zero");
        }
}
}
