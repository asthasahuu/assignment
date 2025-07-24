public class A12 {
    public static void main(String[] args) {
        int hypo = 13;
        int s1 = 12;
        int s2 = (int) Math.sqrt(hypo * hypo - s1 * s1);
        double area = 0.5 * s1 * s2;
        System.out.println( s2 );
        System.out.println(  area );
    }
}
