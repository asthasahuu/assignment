import java.util.Scanner;

public class q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the garden: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of the garden: ");
        double breadth = sc.nextDouble();
        System.out.print("Enter width of first pathway: ");
        double path1 = sc.nextDouble();

        System.out.print("Enter width of second pathway: ");
        double path2 = sc.nextDouble();

        double totalArea = length * breadth;
        double areaPath1 = length * path1;
        double areaPath2 = breadth * path2;
        double overlapArea = path1 * path2;

        double usableArea = totalArea - (areaPath1 + areaPath2 - overlapArea);

        System.out.println("Usable area of the garden is: " + usableArea );


    }
}
