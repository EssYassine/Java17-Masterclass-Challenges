package com.lpacademy;

import java.util.Scanner;
import java.util.concurrent.Flow;

public class Challenges {

    //* ─────────────────────────────────────────────────────────────────────────────
    //* ───────────────────────── Section 06 - Control Flow ─────────────────────────

    //region S06 - Day of the Week Coding Challenge
    public static void printDayOfWeek(int number){
        String output;
        output = switch(number){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2-> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid input";
        };
        System.out.println(output);
    }
    //endregion

    //region S06 - Reading User input Coding Challenge
    public static void sumUserNumbers() {

        Scanner scanner = new Scanner(System.in);
        int count = 1;
        // int sum = 0;
        double sum = 0;

        do {
            System.out.print("Enter number #" + count + ": ");
            String input = scanner.nextLine();
            try {
                // sum += Integer.parseInt(input);
                sum += Double.parseDouble(input);
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Try again.");
            }
        } while (count <= 5);
        System.out.println("The total value is : " + sum);
    }
    //endregion

    //region S06 - Min & Max Coding Challenge
    public static void minMax() {

        Scanner scanner = new Scanner(System.in);
        double min = 0;
        double max = 0;
        boolean isQuitting = false;

        do {
            System.out.println("Enter a number to continue or any character to quit :");
            String input = scanner.nextLine();
            try {
                double number = Double.parseDouble(input);
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } catch (NumberFormatException e) {
                System.out.println("You chose to quit!");
                isQuitting = true;
            }
        } while (!isQuitting);
        System.out.println("min = " + min + ", max = " + max);
    }
    //endregion

    //* ─────────────────── Section 07 - Oop Part 1 - Inheritance ───────────────────
    //* ─────────────────────────────────────────────────────────────────────────────

}
