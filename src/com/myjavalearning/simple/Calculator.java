package com.myjavalearning.simple;

import java.util.Scanner;

/**
 * Created by nitishku on 8/1/2017.
 */
public class Calculator
{
    public static void main(String[] args)
    {
        int operand1,operand2;
        String operation = "null";
        int sum,diff,quotient,product;
        Scanner scanner=new Scanner(System.in);
            System.out.println("Enter 2 nos");
            operand1 = scanner.nextInt();
            operand2 = scanner.nextInt();
            System.out.println("Enter operation");
            operation = scanner.next();
            char realOperation = operation.charAt(0);
            switch (realOperation) {
                case '+':
                    sum = operand1 + operand2;
                    System.out.println("Sum=" + sum);
                    break;
                case '-':
                    diff = operand1 - operand2;
                    System.out.println("Diff=" + diff);
                    break;
                case '/':
                    quotient = operand1 / operand2;
                    System.out.println("Quotient=" + quotient);
                    break;
                case '*':
                    product = operand1 * operand2;
                    System.out.println("Product=" + product);
                    break;
            }

    }
}
