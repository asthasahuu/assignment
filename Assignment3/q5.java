import java.util.Scanner;
class q5{
public static void main(String args[]){
    Scanner sc =  new Scanner(System.in);

    System.out.println("enter no. 1:");
    int a = sc.nextInt();

    
    System.out.println("enter no. 2:");
    int b = sc.nextInt();

System.out.println("entewr no. 3:");
int c = sc.nextInt();

if(a>b && a>c){
    System.out.println("a is oldest");
} else if (b>a&&b>c){
    System.out.println("b is oldest");

}else{
     System.out.println("c is oldest");
}

}
}