package com.example.programmer;

public class TestProgrammers {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        Programmer programmer2 = new Programmer();

        programmer.name = "Mia";
        programmer.age = 25;
        programmer.wearsGlasses = true;

        programmer2.name = "Christian";
        programmer2.age = 25;
        programmer2.wearsGlasses = true;
        programmer.drinkCoffee();
        programmer.printDetails();
        programmer2.printDetails();
        programmer2.hasGlasses();
    }

}
    /*create a Java tester class called TestProgrammers where you:
        create 2 Programmer objects (class instance)
        define the state of the objects by assigning values to the instance variables
        call the drinkCoffee() and printDetails() methods for the first Programmer object
        call the printDetails() and hasGlasses() methods for the second Programmer object*/