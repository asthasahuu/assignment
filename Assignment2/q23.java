import java.util.Scanner;

class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of carton : ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of carton : ");
        int breadth = sc.nextInt();

        System.out.print("Enter height of carton : ");
        int height = sc.nextInt();

        System.out.print("Enter side of cube : ");
        int side = sc.nextInt();

        int cubesLength = length / side;
        int cubesBreadth = breadth / side;
        int cubesHeight = height / side;

        int totalBoxes = cubesLength * cubesBreadth * cubesHeight;

        System.out.println("Total number of cubical boxes : " + totalBoxes);

    }
}
