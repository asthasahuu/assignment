import java.util.Scanner;

 class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of brick : ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of  brick : ");
        int breadth = sc.nextInt();

        System.out.print("Enter height of  brick : ");
        int height = sc.nextInt();

        int volume = length * breadth * height;

        System.out.println("Volume of the brick is: " + volume );


    }
}
