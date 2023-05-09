package com.sai.leet.pro.kusuu;

class AgeException extends Exception {
    public AgeException(String Message) {
        super(Message);
    }
}

class Voter {
    private int age;

    public Voter(int age) {
        this.age = age;
    }

    public void checkEligibility() throws AgeException {
        if (age < 18) {
            throw new AgeException("VOTER IS NOT ELIGIBLE TO VOTE");
        }
        System.out.println("VOTER IS ELIGIBLE TO VOTE");
    }
}

public class Main {
    public static void main(String[] args) {
        Voter voter1 = new Voter(20);
        try {
            voter1.checkEligibility();
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }

        Voter voter2 = new Voter(16);
        try {
            voter2.checkEligibility();
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
