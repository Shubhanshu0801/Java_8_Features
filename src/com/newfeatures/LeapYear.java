package com.newfeatures;

import java.time.Year;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        int n = sc.nextInt();
        Year y = Year.of(n);
        if(y.isLeap()) {
            System.out.printf("%d is a leap year", n);
        }
        else {
            System.out.printf("%d is not a leap year", n);
        }
    }
}
