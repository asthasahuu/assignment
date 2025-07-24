 class A26{
        public static void main(String[] args) {
          double pathLength = 120;
        double pathBreadth = 2.4;
        double brickLength = 0.24;
        double brickBreadth = 0.15;

        double pathArea = pathLength * pathBreadth;
        double brickArea = brickLength * brickBreadth;

        double noOfbricks =  (int)(pathArea/brickArea);
        System.out.println( pathArea);
        System.out.println(brickArea );
        System.out.println( noOfbricks);
    }
}

