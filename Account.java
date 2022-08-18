package com.kody;

public class Account {
    public String name;
    public String firstName;
    public String lastName;

    public int getSsn() {
        return ssn;
    }
    public int getAge() {
        return age;
    }

    private final int ssn;
    private int age;

    public Account(String firstAndLastName, int ssn, int age) {
        this.name = firstAndLastName;
        this.ssn = ssn;
        this.age = age;
        this.firstName = (String)firstAndLastName.subSequence(0, firstAndLastName.indexOf(" "));
        this.lastName = firstAndLastName.substring(firstAndLastName.indexOf(" "));
    }
    public void Birthday(Account account) {
        this.age++;
    }


    


}
