/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex20.base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        int amount = input.nextInt();

        System.out.print("What state do you live in? ");
        String state = input.next().toLowerCase();

        String county = "none";

        if("wisconsin".equalsIgnoreCase(state)){
            System.out.print("What county do you live in? ");
            county = input.next().toLowerCase();
        }

        StateTax salesTax = new StateTax(state, county, amount);
        System.out.println(salesTax.stateTax());
    }
}
