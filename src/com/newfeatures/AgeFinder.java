package com.newfeatures;

import java.time.*;

public class AgeFinder {
    public static void main(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(1991, 04, 10);
        LocalDate today = LocalDate.now();
        Period p = Period.between(dateOfBirth, today);
        System.out.printf("Your age is %d years %d months %d days ", p.getYears(), p.getMonths(), p.getDays());

        LocalDate deathDate = LocalDate.of(1991+70, 04, 10);
        Period p1 = Period.between(today, deathDate);
        int totalDaysLeft = p1.getYears()*365 + p1.getMonths()*12 + p1.getDays();
        System.out.printf("\nThe days left on the Earth: %d days", totalDaysLeft);
    }
}
