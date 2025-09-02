import java.util.Scanner;

public class basic002d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter your second integer: ");
        int num2 = scanner.nextInt();

        try {
            int sum = Math.addExact(num1, num2);
            System.out.println(sum);
        } catch (ArithmeticException e){
            System.out.println("integer overflow detected");
        }
    }
}
