package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 22 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    public static void main(String[] args) {

        // scanner
        Scanner input = new Scanner(System.in);

        //init output
        int output;

        //get first number
        System.out.print("Enter the first number: ");
        String strOne = input.nextLine();
        int numOne = Integer.parseInt(strOne);

        //get second number
        System.out.print("Enter the second number: ");
        String strTwo = input.nextLine();
        int numTwo = Integer.parseInt(strTwo);

        //get third number
        System.out.print("Enter the third number: ");
        String strThree = input.nextLine();
        int numThree = Integer.parseInt(strThree);

            //algorithm
            if (numOne > numTwo){
                if (numOne > numThree){
                    output = numOne;
                } else {
                    output = numThree;
                }
            } else if (numTwo > numThree){
                output = numTwo;
            } else {
                output = numTwo;
            }

        //output
        System.out.print("The largest number is " + output + ".");

    }
}