import java.util.Scanner;

public class basic002e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = Math.addExact(num1, num2);

        System.out.println("Sum: " + sum);
    }
}
