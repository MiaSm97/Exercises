package com.example.programmer;

public class Competition {
    public static void main(String[] args) {

        CompetitionRules rules = CompetitionRules.getInstance();
        rules.printRules();


        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "Milan";
        teamB.teamName = "Juve";

        teamA.p1.name = "Mia";
        teamA.p1.programmingLanguage = "english";
        teamA.p1.yearsOfExperience = 0;

        teamA.p2.name = "Gaetano";
        teamA.p2.programmingLanguage = "english";
        teamA.p2.yearsOfExperience = 0;

        teamB.p2.name = "Christian";
        teamB.p2.programmingLanguage = "english";
        teamB.p2.yearsOfExperience = 0;

        teamB.p1.name = "Francesca";
        teamB.p1.programmingLanguage = "english";
        teamB.p1.yearsOfExperience = 0;

        teamA.printTeamDetails();
        teamB.printTeamDetails();





    }
}
    /*create a class with the main method called Competition where you:
        print all the rules
        create 2 teams called teamA and teamB
        assign random values to teamA's and teamB's names
        assign random values to teamA's programmers p1 and p2 instance variables
        assign random values to teamB's programmers p1 and p2 instance variables
        print teamA and teamB details*/