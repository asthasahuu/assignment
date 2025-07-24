import java.util.Scanner;

 class q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter edge of cube : ");
        int edge = sc.nextInt();
        int volumeCube = edge * edge * edge;

        System.out.print("Enter length of cuboid : ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of cuboid: ");
        int breadth = sc.nextInt();

        System.out.print("Enter height of cuboid : ");
        int height = sc.nextInt();

        int volumeCuboid = length * breadth * height;
        System.out.println("Volume of Cube = " + volumeCube );
        System.out.println("Volume of Cuboid = " + volumeCuboid);

        if(volumeCube > volumeCuboid) {
            System.out.println("Cube has more volume " + (volumeCube - volumeCuboid) );
        } else if(volumeCuboid > volumeCube) {
            System.out.println("Cuboid has more volume " + (volumeCuboid - volumeCube) );
        } else {
            System.out.println("Both have equal volume.");
        }


    }
}
