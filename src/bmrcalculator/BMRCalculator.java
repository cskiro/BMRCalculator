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
            System.out.println("You selected male, I will now calculate your BMR..");

            System.out.println("What is your weight in pounds?");
            weight = kb.nextDouble();

            System.out.println("What is your height in inches?");
            height = kb.nextDouble();

            System.out.println("What is your age?");
            age = kb.nextInt();

            bmr = (66 + (6.3 * weight) + (12.9 * height) - (6.8 * age));

            numberOfChocolateBars = bmr / CALORIES_PER_CHOCOLATE_BAR;
            
            System.out.println("Your BMR is " + bmr);

            System.out.println("In order to maintain weight you need to eat at least " 
                    + numberOfChocolateBars + " chocolate bars");

        } else {
            System.out.println("You are a female, I will now calculate your BMR..");

            System.out.println("What is your weight in pounds?");
            weight = kb.nextDouble();

            System.out.println("What is your height in inches?");
            height = kb.nextDouble();

            System.out.println("What is your age?");
            age = kb.nextInt();

            bmr = (655 + (4.3 * weight) + (4.7 * height) - (4.7 * age));

            numberOfChocolateBars = bmr / CALORIES_PER_CHOCOLATE_BAR;
            
            System.out.println("Your BMR is " + bmr);

            System.out.println("In order to maintain weight you need to eat at least " 
                    + numberOfChocolateBars + " chocolate bars");
        }

    } // end main

} //end class
