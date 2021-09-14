package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.printf("How many euros are you exchanging? ");
        String euro = reader.nextLine();

        System.out.printf("What is the exchange rate? ");
        String exchange = reader.nextLine();

        float euroF = Float.parseFloat(euro);
        float convF = Float.parseFloat(exchange);

        float usd = euroF * convF;


        System.out.printf("%s euros at an exchange rate of %s is\n%.2f U.S. dollars.", euro, exchange, usd);
    }
}