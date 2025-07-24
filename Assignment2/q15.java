import java.util.Scanner;

 class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of Shelly's garden: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of Shelly garden: ");
        int breadth = sc.nextInt();

        int areaShelly = length * breadth;

        System.out.print("Enter side of Rachel garden: ");
        int side = sc.nextInt();

        int areaRachel = side * side;

        System.out.println("Area of Shelly's garden = " + areaShelly );
        System.out.println("Area of Rachel's garden = " + areaRachel);

        if (areaRachel > areaShelly) {
            System.out.println("Rachel's garden is bigger by " + (areaRachel - areaShelly) + " m²");
        } else if (areaShelly > areaRachel) {
            System.out.println("Shelly's garden is bigger by " + (areaShelly - areaRachel) + " m²");
        } else {
            System.out.println("Both gardens are of the same size.");
        }

    
    }
}
