package com.example.programmer;

public class CompetitionRules {
    private static CompetitionRules rules = new CompetitionRules();
    private static String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private static String competitionRule2 = "Learn every day!";
    private static String competitionRule3 = "Be the best team!";

    public void printRules(){
        System.out.println(competitionRule1 + " " + competitionRule2 + " " +  competitionRule3);

    }
    public static CompetitionRules getInstance(){
        return rules;
    }

}
    /*create a singleton class called CompetitionRules that has:
        a private variable competitionRule1 as string, initialised with "Do not copy and paste from StackOverflow!" value
        a private variable competitionRule2 as string, initialised with "Learn every day!" value
        a private variable competitionRule3 as string, initialised with "Be the best team!" value
        a method printRules() that prints the 3 rules
        create a class with the main method called Competition where you:
        print all the rules
        create 2 teams called teamA and teamB
        assign random values to teamA's and teamB's names
        assign random values to teamA's programmers p1 and p2 instance variables
        assign random values to teamB's programmers p1 and p2 instance variables
        print teamA and teamB details*/