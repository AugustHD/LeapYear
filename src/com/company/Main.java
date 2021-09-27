package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        while (year != -1) {
            // Ask user to type in year
            System.out.print("Please enter year: ");
            year = in.nextInt();


            // if method isLeapYear returns a value
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year!");
            }
            // if method isLeapYear does not return a value
            else {
                System.out.println(year + " is not a leap year..");
            }
        }
    }
    public static boolean isLeapYear( int year) {
    // If statements to decide if year is leap year or not
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return true;
            }
        }
        else {
          return false;
        }
    }
}
