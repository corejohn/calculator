package sayfa1;

import java.util.Scanner;
    public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number:");
            double first = scanner.nextDouble();
            System.out.println("Enter second number:");
            double second = scanner.nextDouble();
            System.out.println("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            double result;

            switch (operator) {
                case '+':
                    result = first + second;
                    break;

                case '-':
                    result = first - second;
                    break;

                case '*':
                    result = first * second;
                    break;

                    case '/':
                    result = first / second;
                    break;

                default:
                    System.out.printf("Error! operator is not correct");
                    return;
            }

            System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
        }
    }

