package com.example.programmer;

public class Team {
    String teamName;
    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();



    public void printTeamDetails(){
        p1.printProgrammerDetails();
        p2.printProgrammerDetails();
        System.out.println(teamName);
        //System.out.println(p1.name + " - " + p1.yearsOfExperience + " - " + p1.programmingLanguage);
        //System.out.println(p2.name + " - " + p2.yearsOfExperience + " - " + p2.programmingLanguage);
    }

}




    /*create a Java class called Team that has:
        an instance variable teamName as string
        2 Programmer objects called p1 and p2
        the method printTeamDetails() that prints:
        on one line the teamName
        on one line the details of programmer p1
        on one line the details of programmers p2
        create a singleton class called CompetitionRules that has:
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

