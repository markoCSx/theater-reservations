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

        //User prompts
        System.out.println("Enter Full Name: ");
        userText = userInput.nextLine();
        String fullName = userText;

        System.out.println("Enter Showing Date (dd/MM/yyyy): ");
        userText = userInput.nextLine();
        String userDate = userText;

        //Formating userDate
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate showDate = LocalDate.parse(userDate, formatter);

    }

}

