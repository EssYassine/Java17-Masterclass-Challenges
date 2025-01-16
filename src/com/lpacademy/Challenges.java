package com.lpacademy;

import com.lpacademy.collections.Place;

import java.util.*;

public class Challenges {

    //* ─────────────────────────────────────────────────────────────────────────────────
    //* ───────────────────────── Section 06 - Control Flow ─────────────────────────────

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

    //* ─────────────────── Section 08 - Oop Part 2 - Polymorphism ──────────────────────

    //* ─────────────────────────── Section 09 - Arrays ─────────────────────────────────

    //region S09 - Arrays Challenge
    public static int[] randomArray(){
        Random random = new Random();
        int[] integers = new int[10];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(100);
        }
        return integers;
    }

    public static int[] sortIntegers(int[] array) {
        for (int i = 0; i < (array.length) / 2; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
    //endregion

    //region S09 - Minimum Element Challenge
    public static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        String[] userInput = scanner.nextLine().split(",");
        int[] integers = new int[userInput.length];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.parseInt(userInput[i]);
        }
        return integers;
    }

    public static int findMin(int[] integers) {
        int[] arrayCopy= integers.clone();
        Arrays.sort(arrayCopy);
        return arrayCopy[0];
    }
    //endregion

    //region S09 - Reverse Array Challenge
    public static void reverse(int[] integers) {
        Arrays.sort(integers);
        for (int i = 0; i < integers.length / 2; i++) {
            int temp = integers[integers.length - 1 - i];
            integers[integers.length - 1 - i] = integers[i];
            integers[i] = temp;
        }
    }
    //endregion

    //* ────── Section 10 - List, Arraylist, LinkedList, Iterator, Autoboxing ───────────

    //region S10 - ArrayList Challenge
    public static void GroceryList(ArrayList<String> groceries) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addGroceryItems(groceries);
                case 2 -> removeGroceryItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    private static void printActions() {
        String textBlock = """
                Available actions :
                [0] - to shutdown
                [1] - to add item(s) to list (comma delimited list)
                [2] - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:""";
        System.out.print(textBlock + " ");
    }

    private static void addGroceryItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma]:");
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split(",");
        //groceries.addAll(List.of(items));
        for (String i : items) {
            String trimmed = i.trim().toLowerCase();
            if(!groceries.contains(trimmed)){
                groceries.add(trimmed);
            }
        }
    }

    private static void removeGroceryItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]:");
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split(",");
        //groceries.removeAll(List.of(items));
        for (String i : items) {
            String trimmed = i.trim().toLowerCase();
            groceries.remove(trimmed);
        }
    }
    //endregion

    //region S10 - LinkedList Challenge
    public static void auItinerary(LinkedList<Place> list){
        String text = "Current place: ";
        Scanner scanner = new Scanner(System.in);
        ListIterator<Place> listIterator = list.listIterator();
        System.out.println("\n" + text + listIterator.next().toString() + "\n");
        boolean flag = true;
        while (flag) {
            printfActions();
            Place currentPlace;
            switch(scanner.nextLine().toUpperCase().substring(0,1)){
                case "F" -> {
                    if(!listIterator.hasNext()){
                        text = "Originating: ";
                        listIterator = list.listIterator();
                    }
                    else text = "Current place: ";
                    System.out.println(text + listIterator.next().toString());
                }
                case "B" -> {
                    if(!listIterator.hasPrevious()){
                        text = "Originating: ";
                        listIterator = list.listIterator(list.size());
                    } else text = "Current place: ";
                    System.out.println(text + listIterator.previous().toString());
                }
                case "L" -> {
                    for (Place place : list) {
                        System.out.println(place.toString());
                    }
                }
                default -> flag = false;
            }
        }
    }

    public static void addPlace(LinkedList<Place> list, Place place) {
        // If the place already exists in the list
        for (Place p : list) {
            if (p.name().equalsIgnoreCase(place.name())) {
                System.out.println("Found duplicate: " + place);
                return;
            }
        }
        //
        int matchedIndex = 0;
        for (var listPlace : list) {
            if (place.distance() < listPlace.distance()) {
                list.add(matchedIndex, place);
                return;
            }
            matchedIndex++;
        }
        list.add(place);
    }

    private static void printfActions(){
        String textBlock = """
                Available actions (select word or letter):
                (F)orward
                (B)ackward
                (L)ist Places
                (M)enu
                (Q)uit
                """;
        System.out.println(textBlock + " ");
    }
    //endregion

    //* ────────────────────────────── Abstraction In Java ──────────────────────────────

    //* ─────────────────────────────────────────────────────────────────────────────────
}
