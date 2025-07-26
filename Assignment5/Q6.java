
import java.util.Scanner;

public class Q6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter a no. which you want to find a factor:");
    int n = sc.nextInt();
       for(int i=1; i<=n;i++){
        if(n%i==0){
            System.out.println("the facotr of "+n+"is:"+i);
        }
       }

}
}