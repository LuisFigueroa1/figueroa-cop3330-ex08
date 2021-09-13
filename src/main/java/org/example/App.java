package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 08 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App
{
    public static void main( String[] args ) //main function
    {
        Scanner userInput = new Scanner(System.in);

        //declare the variables that will be used
        int nPeople; //number of peoples
        int nPizza; //number of pizzas
        int nSlice; //number of slices

        System.out.println("How many people? "); //prompt how many people
        nPeople = userInput.nextInt(); //scan the input
        System.out.println( "How many pizzas do you have? " ); //prompt how many pizzas
        nPizza = userInput.nextInt();
        System.out.println( "How many slices per pizza? " ); //prompt how many slices
        nSlice = userInput.nextInt();

        int totalSlice = nSlice * nPizza; //total slices
        int ration = totalSlice / nPeople; //slices per person
        int leftover = totalSlice % nPeople; //leftovers of slices

        //print output
        System.out.println(nPeople + " people with " + nPizza + " pizzas (" + totalSlice + " slices)\n" +
                        "Each person gets " + ration + " pieces of pizza.\n" +
                "There are " + leftover + " leftover pieces.");
    }
}