import java.util.Scanner;
 class q43{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height o: ");
        double h = sc.nextDouble();

        System.out.print("Enter slant height ): ");
        double l = sc.nextDouble();

        double r = Math.sqrt(l * l - h * h);
        double baseArea = Math.PI * r * r;

        double costPerSqCm = 10;
        double totalCost = baseArea * costPerSqCm;

        System.out.println ("radiuc:"+r);
            System.out.println ("base area:"+baseArea);
        System.out.println ("total cost:"+totalCost);
    }
 }