import java.util.Scanner;

public class q27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0); 

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a Vowel.");
                break;
            default:
                System.out.println(ch + " is Not a Vowel.");
        }

        sc.close();
    }
}
