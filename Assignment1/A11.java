public class A11 {
    public static void main(String args[]){
        int a = 320;
        int bratio = 8;
        int hratio = 5;
       int x = (int) Math.sqrt((2*a)/(bratio *hratio));
       int base = bratio*x;
       int height = hratio*x;
       System.out.println(base);
       System.out.println(height);

    }
}
