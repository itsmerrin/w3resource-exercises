import java.util.Scanner;

public class basic001a{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String fname = scanner.next();

        System.out.print("Enter your second name: ");
        String lname = scanner.next();

        System.out.printf("Hello, %s %s.", fname, lname);
    }
}