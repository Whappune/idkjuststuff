package com.kody;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        String questionOne = "What is Armands favorite band?";
        String questionTwo = "Ya mamma?";
        String questionThree = "Whats your favorite color?:)";
        String correctAnswerOne = "wheezer";
        String correctAnswerTwo = "ya mamma";
        String correctAnswerThree = "blue or purple";




        System.out.println(questionOne);
        String responseOne = scanner.nextLine();
        if(responseOne.equals(correctAnswerOne)) {
            points++;
            System.out.println("Correct! You got " + points + " right!" );

        } else {
            System.out.println("Wrong :(((((, it was " + correctAnswerOne);
        }

        System.out.println(questionTwo);
        String responseTwo = scanner.next();
        if(responseTwo.equals(correctAnswerTwo.toLowerCase())) {
            points++;
            System.out.println("Correct! You got " + points + " right!" );

        } else {
            System.out.println("Wrong :(((((, it was " + correctAnswerTwo);
        }

        System.out.println(questionThree);
        String responseThree = scanner.next();
        if(responseThree.equals(correctAnswerThree)) {
            points++;
        } else {
            System.out.println("Wrong :(((((, it was " + correctAnswerThree);
        }
        if(points == 3) {
            System.out.println("Good job, you got them all right!!! :DDDD");
        } else if(points <3) {
            System.out.println("Wow! You fucking suck! You only got " + points + " right!");

        }


    }
}
