package day1;

import java.util.Scanner;

public class calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number:");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();
            System.out.println("Enter the operator");
            char operator1 = scanner.next().charAt(0);
            double result =0;
            switch (operator1) {
                // case to add two numbers
                case '+':
                    result = num1 + num2;
                    break;

                // case to subtract two numbers
                case '-':
                    result = num1 - num2;
                    break;

                // case to multiply two numbers
                case '*':
                    result = num1 * num2;
                    break;

                // case to divide two numbers
                case '/':
                    result = num1 / num2;
                    break;

                default:
                    System.out.println("You enter wrong input");
            }







            System.out.println(result);
            scanner.close();


        }
    }



