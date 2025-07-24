class A37{
    public static void main(String[] args) {
double surfaceArea = 149;
double height = 6;
double pi = 3.1416;
double a = 1;
double b = height;
double c = -(surfaceArea / (2 * pi));
double discriminant = b * b - 4 * a * c;
double radius = (-b + Math.sqrt(discriminant)) / (2 * a);
double diameter = 2 * radius;
System.out.println( radius);
System.out.println( diameter);
}
}