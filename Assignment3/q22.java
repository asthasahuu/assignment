import java.util.Scanner;
class q22{
  public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

System.out.println("Enter a number:");
int a = sc.nextInt();

System.out.println("Enter a number:");
int b = sc.nextInt();


System.out.println("Enter a number:");
int c= sc.nextInt();

if(a>b && a>c){
    System.out.println("greater no. is:"+a);
}
else if(b>a && b>c) {
    System.out.println("greater no. is:"+b);
}
else{
    System.out.println("greater no. is:"+c);
}
}

    }