/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 Jenna Busch
 */

import java.util.Scanner;

public class exercise28 {

    public static void main(String[] args) {

        //create a scanner
        Scanner input = new Scanner(System.in);
        int result = 0;

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            String num = input.next();
            int convNum =Integer.parseInt(num);

            result+=convNum;
        }

        System.out.println("The total is "+result+".");

    }

}

