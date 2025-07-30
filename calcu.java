import java.sql.SQLOutput;
import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result = 0;
        char operator;

        System.out.print("enter first number : ");
        num1 = scanner.nextDouble();
        System.out.print("enter operator (+ - * /): ");
        operator = scanner.next().charAt(0);
        System.out.println("enter second number : ");
        num2 = scanner.nextDouble();


        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '^' -> result = Math.pow(num1,num2);
            case '/' -> {
                if (num2 == 0){
                    System.out.println("cannot be divided by zero");
                }
                else{
                    result = num1 / num2;
                }
            }
            default -> System.out.println("invalid operator");
        }

        System.out.println(result);
        scanner.close();
    }
}

