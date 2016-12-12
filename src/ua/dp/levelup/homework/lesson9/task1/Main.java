package ua.dp.levelup.homework.lesson9.task1;

import java.util.Scanner;


//     1) Доделать консольный калькулятор, таким образом, чтобы была возможность применять базовые операции (+,-,/,*) для разных типов входных данных, таких как:
//        - Integer a, Integer b
//        - Double a, Double b
//        - String a, String b
//        * Реализовать такую функциональность можно при помощи оператора instanceof. Например, у нас есть два целых числа Integer a и Integer b, применив к ним оператор instanceof
//        (а instanceof Integer) мы получим булевское выражение(true), и сможем подобрать необходимую перегрузку метода.
//        **  Разбить функциональность на отдельные методы.

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            Object a;
            Object b;
            System.out.print("Enter the operator (+ - * /): ");
            String operator = scanner.next();

            System.out.print("Enter first operand: ");
            a = Calc.parse(scanner.next());

            System.out.print("Enter second operand: ");
            b = Calc.parse(scanner.next());

            switch (operator)
            {
                case "+":
                    System.out.print((a + operator + b) + " = " + Calc.sum(a, b));
                    break;
                case "-":
                    System.out.print((a + operator + b) + " = " + Calc.subtract(a, b));
                    break;
                case "/":
                    System.out.print((a + operator + b) + " = " + Calc.divide(a, b));
                    break;
                case "*":
                    System.out.print((a + operator + b) + " = " + Calc.multiply(a, b));
                    break;
                default:
                    System.out.print("Unsupported operation!");
            }
            System.out.print("\nRepeat the calculation? (y/n)");
            String exitWord = scanner.next();
            if (exitWord != null && exitWord.length() > 0 && !exitWord.equalsIgnoreCase("y")) break;
            scanner.close();
        }
    }
}