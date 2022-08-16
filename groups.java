package com.kody;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] questions = new String[2];
        questions[0] = "what year was kody born?";
        questions[1] = "what's kody's favorite food?";

        List<String> questionsList = new ArrayList<>();
        questionsList.add("what is the language spoken in germany?");
        questionsList.add("what is the language spoken in france?");
        questionsList.add("what is the capital of canada?");

        System.out.println(questionsList.get(0));
        questionsList.remove(0);
        System.out.println(questionsList.get(0));
        System.out.println(questionsList.size());

        List<Integer> kodysNumbers = new ArrayList<>();
        kodysNumbers.add(13);
        System.out.println(kodysNumbers.get(0));

        Map<String, String> CountryAndCapital = new HashMap<>();
        CountryAndCapital.put("Germany", "Berlin");
        CountryAndCapital.put("France", "Paris");
        CountryAndCapital.put("Italy", "Rome");

        System.out.println(CountryAndCapital.get("Germany"));
        System.out.println("Germany? " + CountryAndCapital.containsKey("Germany")); //Germany? true
        System.out.println("Berlin? " + CountryAndCapital.containsValue("Berlin")); //Berlin? true

        Set<String> friends = new HashSet<>();
        friends.add("Anne");
        friends.add("Blake");
        System.out.println(friends.add("Anne")); //false
        System.out.println(CountryAndCapital.remove("Germany")); //Berlin
        System.out.println(CountryAndCapital.remove("France", "Paris")); //true
        System.out.println(CountryAndCapital.remove("France", "Paris")); //false



    }

}
