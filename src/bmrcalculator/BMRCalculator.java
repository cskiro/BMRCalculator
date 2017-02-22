/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmrcalculator;

import java.util.Scanner;

/**
 * Chapter 2 Exercise 13
 *
 * Write a program that allows the user to input their weight in pounds, height
 * in inches and age in years. The program should then output the number of
 * chocolate bars needed to maintain one's weight.
 *
 * @author skiroc
 */
public class BMRCalculator {

    private static final String MALE = "male";
    private static final int CALORIES_PER_CHOCOLATE_BAR = 230;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables 
        String gender;
        double weight, height, bmr, numberOfChocolateBars;
        int age;

        // Creating Scanner object 
        Scanner kb = new Scanner(System.in);

        // Prompting user for their gender
        System.out.println("Are you a male or female?");
        gender = kb.nextLine().toLowerCase();

        if (gender.equalsIgnoreCase(MALE)) {
            // User is male
            System.out.println("You selected male, I will now calculate your BMR..");

            // Prompting male for weight in pounds
            System.out.println("What is your weight in pounds?");
            weight = kb.nextDouble();

            // Prompting male for height in inches
            System.out.println("What is your height in inches?");
            height = kb.nextDouble();

            // Prompting male for age
            System.out.println("What is your age?");
            age = kb.nextInt();

            // Calculating male BMR
            bmr = (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));

            // Calculating number of chocolate bars the user can eat in order
            // to maintain weight
            numberOfChocolateBars = bmr / CALORIES_PER_CHOCOLATE_BAR;

            // Displaying user's BMR
            System.out.println("Your BMR is " + bmr);

            // Displaying number of chocolate bars the user can eat
            System.out.println("In order to maintain weight you need to eat at least "
                    + numberOfChocolateBars + " chocolate bars");

        } else {
            // User is female
            System.out.println("You are a female, I will now calculate your BMR..");

            // Prompting female for weight in pounds
            System.out.println("What is your weight in pounds?");
            weight = kb.nextDouble();

            // Prompting female for height in inches
            System.out.println("What is your height in inches?");
            height = kb.nextDouble();

            // Prompting female for age
            System.out.println("What is your age?");
            age = kb.nextInt();

            // Calculating male BMR
            bmr = (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));

            // Calculating number of chocolate bars the user can eat in order
            // to maintain weight
            numberOfChocolateBars = bmr / CALORIES_PER_CHOCOLATE_BAR;

            // Displaying user's BMR
            System.out.println("Your BMR is " + bmr);

            // Displaying number of chocolate bars the user can eat
            System.out.println("In order to maintain weight you need to eat at least "
                    + numberOfChocolateBars + " chocolate bars");
        } // end if-else

    } // end main

} //end class
