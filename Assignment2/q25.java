

import java.util.Scanner;
 class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lengthCm = 24;
        double breadthCm = 15;
        int numberOfBricks = 100;

        double length = lengthCm / 100.0;
        double breadth = breadthCm / 100.0;

        double areaOfOneBrick = length * breadth;
        double totalArea = numberOfBricks * areaOfOneBrick;

        System.out.println("Total area of the path = " + totalArea);

    }
}
