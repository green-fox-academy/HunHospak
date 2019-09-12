package com.timbuchalka;

public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        int a = 6;
        int b = 17;

        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        System.out.println(a*b*5);
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        float c = ((float)(a*b*5)/(float)(b*52))*100;
        System.out.println("The percentage is: " + (int)(c) + "%.");
    }
}
