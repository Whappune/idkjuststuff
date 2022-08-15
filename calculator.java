package com.kody;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("What would you like to do today? add, subtract, divide or multiply?");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        Scanner number = new Scanner(System.in);
        System.out.println("First number?");
        int numberOne = scanner.nextInt();
        System.out.println("Second number?");
        int numberTwo = scanner.nextInt();
        int result;
        switch(operation) {
            case "add": {
                result = numberOne + numberTwo;
                System.out.println(numberOne + " + " + numberTwo + " = " + result);
                break;
            }
            case "subtract": {
                result = numberOne - numberTwo;
                System.out.println(numberOne + " - " + numberTwo + " = " + result);
                break;
            }
            case "multiply": {
                result = numberOne * numberTwo;
                System.out.println(numberOne + " * " + numberTwo + " = " + result);
            }
            case "divide": {
                result = numberOne / numberTwo;
                System.out.println(numberOne + " / " + numberTwo + " = " + result);
                break; }
            default: {
                System.out.println("I'm sorry, I don't understand!");
            }
        }
    }
}
