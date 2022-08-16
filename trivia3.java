package com.kody;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] questions = new String[3];
        String[] answers = new String[3];
        questions[0] = "What is Armands favorite band?";
        questions[1] = "Ya mamma?";
        questions[2] = "Whats your favorite color?:)";
        answers[0] = "weezer";
        answers[1] = "ya mamma";
        answers[2] = "blue or purple";

        survey(3, questions, answers);
    }

    public static void survey(int numberOfQuestions, String[] surveyQuestions, String[] surveyAnswers) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        for (int i = 0; i < numberOfQuestions; i++) {
            System.out.println(surveyQuestions[i]);
            String response = scanner.nextLine();
            if(response.equals(surveyAnswers[i])) {
                points++;
                System.out.println("Correct! You have gotten " + points + " right!");
            } else {
                System.out.println("You stupid fucking moron, how did you even get this one wrong. I can't believe you. The answer was " + surveyAnswers[i]);
            }
        }

    }

}
