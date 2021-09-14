package org.example;

import java.util.Objects;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 15 Solution
 *  Copyright 2021 Tyler Coleman
 */
public class App 
{
    public static void main( String[] args )
    {
        String knownPassword = "abc$123";
        Scanner in = new Scanner(System.in);
        System.out.println("What is your username? ");
        String user = in.nextLine();
        System.out.println("What is your password? ");
        String pass = in.nextLine();
        if (Objects.equals(pass, knownPassword)) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you. What are you doing in my house?");
        }
    }
}
