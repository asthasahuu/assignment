public class A15 {
    public static void main(String[] args) {
        int length = 22;       
        int breadth= 15;
        int sside = 21;
        int shellyArea = length * breadth;
        int rachelArea = sside * sside;
        if (shellyArea > rachelArea) {
            System.out.println( (shellyArea - rachelArea) );
        } else if (rachelArea > shellyArea) {
            System.out.println( (rachelArea - shellyArea) );
        } else {
            System.out.println("Both gardens are equal in size.");
        
    }
}
}
   

