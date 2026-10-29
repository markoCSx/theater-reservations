package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TheaterReservations {

    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        //Scanner & Date variables
        String userText;
        DateTimeFormatter formatter;

//-------------------User prompts
        //Full Name
        System.out.print("Enter Full Name: ");
        userText = userInput.nextLine();
        String fullName = userText;
        String[] firstLastNames = fullName.split(Pattern.quote(" "));
        String firstName = firstLastNames[0];
        String lastName = firstLastNames[1];
        //Show Date
        System.out.print("Enter Showing Date (MM/dd/yyyy): ");
        userText = userInput.nextLine();
        String userDate = userText;
        //Number of Tickets
        System.out.print("Enter Number of Tickets: ");
        userText = userInput.nextLine();
        int tickets = Integer.parseInt(userText);
//-----------------------------------------------------------------
        //Formating userDate
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate showDate = LocalDate.parse(userDate, formatter);

        //Receipt
        if (tickets > 1) {
            System.out.printf("%d tickets reserved for %s under %s, %s", tickets, showDate, firstName, lastName);
        } else if (tickets == 1) {
            System.out.printf("%d ticket reserved for %s under %s, %s", tickets, showDate, firstName, lastName);
        } else {
            System.out.println("Have a good day!");
        }

    }

}

