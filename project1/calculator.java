import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("-----------------");

        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        System.out.println("Choose operation: + - * /");
        String op = sc.next();

        double ans = 0;

        if (op.equals("+")) {
            ans = a + b;
        } else if (op.equals("-")) {
            ans = a - b;
        } else if (op.equals("*")) {
            ans = a * b;
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Cannot divide by zero!");
                return;
            }
            ans = a / b;
        } else {
            System.out.println("Invalid operation");
            return;
        }

        System.out.println("Result = " + ans);
    }
}
