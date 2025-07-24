import java.util.Scanner;
class q44{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter choice:");
        char ch=sc.next().charAt(0);
        System.out.print("num1=");
        int num1=sc.nextInt();
        System.out.print("num2=");
        int num2=sc.nextInt();
        if(ch=='+'){
            System.out.println("num1+num2="+(num1+num2));
        }
        else if(ch=='>'){
            if(num1>num2){
                System.out.println(num1+"is greater");
            }
            else
            System.out.println(num2+"is greater");
        }
        else if(ch=='='){
            if (num1==num2)
            System.out.println("both are equal");
            else
            System.out.println("both are not equal");

        }
        else
        System.out.println("wrong choice");
    }
}