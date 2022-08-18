package com.kody;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stringInput = new Scanner(System.in);
        Scanner intInput = new Scanner(System.in);
        /*
        String bad = "Bennie Schroeder";
        System.out.println(bad.subSequence(0, bad.indexOf(" ")));
        System.out.println(bad.substring(bad.indexOf(" ") + 1));
        */
        Account Bennie = new Account("Bennie Schroeder", 1761, 18);
        Map<String, Integer> Accounts = new HashMap<>();
        Accounts.put(Bennie.name, Bennie.getSsn());



        System.out.println("");
        System.out.println("Hello, what is your first and last name?");
        String firstAndLastName = stringInput.nextLine();
        if(Accounts.containsKey(firstAndLastName)) {
            System.out.println("Hello, " + firstAndLastName + "! I see you do not have an account in our system, "
            + "would you like to create an account today?");

            if(stringInput.nextLine().toLowerCase().equals("yes")) {
                System.out.println("Cool beans!!! To get started, we need the last four digits of your SSN.");
                int lastFourDigits = intInput.nextInt();

                while(lastFourDigits > 9999 || lastFourDigits < 999) {
                    System.out.println("Please enter a valid number!");
                    lastFourDigits = intInput.nextInt();
                }

                System.out.println("Lastly, what is your age?");
                int userAge = intInput.nextInt();

                Accounts.put(firstAndLastName, lastFourDigits);

            }
        }



    }


    public Account CreateAccount(String firstAndLastName, int ssn, int age ) {
        return(new Account(firstAndLastName, ssn, age));
    }
    public String extractFirstName(String firstAndLast) {
        return (String)firstAndLast.subSequence(0, firstAndLast.indexOf(" "));
    }
}
/*
plan:
hi welcome to bank who are you
if result is of string[customers or whatever]
    input last 4 of social as password
    if correct, able to check bank info through checkBank()
if not of string[customers]
    "new account? costs $XX, input your info"
 */
