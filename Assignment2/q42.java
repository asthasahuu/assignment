import java.util.Scanner;

 class q42{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter : ");
        double diameter = sc.nextDouble();

        System.out.print("Enter height : ");
        double height = sc.nextDouble();

        double radius = diameter / 2;

        double volume = Math.PI * radius * radius * height;

        System.out.println("volume of the cylinder:"+volume);
    }
}

