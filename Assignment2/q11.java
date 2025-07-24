import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the area of the triangle (in m²): ");
        double area = sc.nextDouble();

        int baseRatio = 8;
        int heightRatio = 5;

        double constant = 0.5 * baseRatio * heightRatio;

        double xSquare = area / constant;

        double x = Math.sqrt(xSquare);

        
        double base = baseRatio * x;
        double height = heightRatio * x;

        System.out.println( base);
        System.out.println( height);
    }
}
      
