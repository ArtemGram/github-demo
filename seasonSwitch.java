package com.example.javatimestuff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class seasonSwitch {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type month");
        String month = reader.readLine();
        switch(month)
        {
            case "February":
            case "January":
            case "December":
                System.out.println("Winter");
                break;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring");
                break;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer");
                break;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn");
                break;
            default: System.out.println("Incorrect");
        }
    }
}