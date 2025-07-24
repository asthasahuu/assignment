import java.util.Scanner;
class q21{
    public static void main(String args){
        Scanner sc = new Scanner(System.in);

System.out.println("Enter a number:");
int a = sc.nextInt();

System.out.println("Enter a number:");
int b = sc.nextInt();

    if (a > b) {
            System.out.println("Greater number is: " + a);
        } else if (b > a) {
            System.out.println("Greater number is: " + b);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

        }