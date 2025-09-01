import java.util.Scanner;

public class basic001{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello\nSteve!");

        System.out.print("Enter your first name: ");
        String fname = scanner.next();

        System.out.print("Enter your last name: ");
        String lname = scanner.next();

        System.out.printf("Hello%n%s %s!",fname, lname);
        // hello, [name]
        System.out.printf("%nHello, %s %s", fname, lname);

        // uppercase hello - lowercase name
        System.out.printf("%nHELLO, %s %s", fname.toLowerCase(), lname.toLowerCase());

        // hello - name -> each letter on a new line
        System.out.println("\nH\ne\nl\nl\no\n\nS\nt\ne\nv\ne\n!\n");

        // hello - name -> reverse the order of the chars
        System.out.println("!evetS\nolleH");

    }

}
