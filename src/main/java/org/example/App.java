/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        String username, password = "abc$123";
        Scanner input = new Scanner(System.in);

        System.out.print("What is the username? ");
        username = input.nextLine();

        System.out.print("What is the password? ");
        password = input.nextLine();

        if (password.compareTo("abc$123") == 0)
        {
            System.out.print("Welcome!");
        }
        else
        {
            System.out.print("I don't know you.");
        }
    }
}