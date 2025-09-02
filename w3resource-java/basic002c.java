import java.util.Scanner;

public class basic002c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first f-p number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter your second f-p number: ");
        double num2 = scanner.nextDouble();

        System.out.printf("Sum: %.2f", num1 + num2);
    }
}
