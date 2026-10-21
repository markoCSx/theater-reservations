package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {

    static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        //Scanner variable
        String userText;
        DateTimeFormatter formatter;

//-------------------User prompts
        //Full Name
        System.out.print("Enter Full Name: ");
        userText = userInput.nextLine();
        String fullName = userText;
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
        System.out.printf("%d ticket(s) reserved for %s under %s", tickets, showDate, fullName);

    }

}

