package com.company;


import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the PV student account generator");
        System.out.println("");

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("John");

        System.out.println("Smith");

        System.out.println("");

        System.out.print("JS");

        Random rand = new Random();
        int value = rand.nextInt(999);

        System.out.println(value);
        System.out.println("Password > pizza=10");

        //Your goal is to create a system that uses the user input to generate an ID just like PV does.
        //You'll need to use substring, just as we talked about yesterday.
        //All usernames are first name initial followed by last name initial followed by last 3 digits
        //Output the username to the console and then provide the PV default password: pizza=10
        //Once done, send that back to GitHub and we'll review tomorrow
        //Think you are the next Zuckerburg?
        //This is the hacker challenge if you have time...
        //randomly generate a 128 bit secure password for the user. PV takes security serious
        //Finally, and if you truly are the Zuck, prompt the user to see if the user to create is a staff
        //If that is the case, use firstName initial and the full lastName

        //Program begins here...
    }


}