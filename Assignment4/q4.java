import java.util.Scanner;

public class q4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter a number:");
         int n = sc.nextInt();
        
      int i = 1,sum=0;
      while(i <= n){
        if(i%2 == 0){
          sum = sum -i;
        }   
        else{
          sum = sum +i;
        } 
    i++;
      } 
    
    System.out.println(sum);
}
}