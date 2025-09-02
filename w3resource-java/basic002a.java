import java.util.Scanner;

public class basic002a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + (num1 + num2));
    }
}
