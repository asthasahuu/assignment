public class A6 {
public static void main(String[] args) {
    int s1 = 10;
    int s2 = 9;
    int p =  36;
    int s3 = (p-s1-s2);
    int sp = p/2;
    double area = Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s3));
    System.out.println(area);
}
}