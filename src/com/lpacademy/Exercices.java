package com.lpacademy;

import java.util.Scanner;

public class Exercices {
    public static void main(String[] args) {

    }

    //* ═════════════════════════════════════════════════════════════════════

    //*     ╭──────────────────────────────────────────────────────────╮
    //*     │       Section 05 - Expressions, Statements & More        │
    //*     ╰──────────────────────────────────────────────────────────╯

    //* ═════════════════════════════════════════════════════════════════════

    //region S05 - Coding Exercise 01: Positive, Negative Or Zero
    // TODO: Add number validation
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0 ) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
    //endregion

    //region S05 - Coding Exercise 02: Speed Converter
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609d);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }

    }
    //endregion

    //region S05 - Coding Exercise 03: MegaBytes Converter
    /* TODO:
        * [ ] Optimise the println message components
        * [ ] Add number validation
    */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = "
                    + (int) Math.round(kiloBytes / 1024)
                    + " MB and "
                    + kiloBytes % 1024
                    + " KB"
            );
        }
    }
    //endregion

    //region S05 - Coding Exercise 04: Barking Dog
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        return hourOfDay < 8 || hourOfDay > 22;
    }
    //endregion

    //region S05 - Coding Exercise 05: Leap Year Calculator
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year < 9999) {
            return ((year % 4 == 0) && (year % 100 != 0)) || ((year % 100 == 0) && (year % 400 == 0));
        }
        return false;
    }
    //endregion

    //region S05 - Coding Exercise 06: Decimal Comparator
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {
        return (int) (firstNumber * 1000) == (int) (secondNumber * 1000);
    }
    //endregion

    //region S05 - Coding Exercise 07: Equal Sum Checker
    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        return firstNumber + secondNumber == thirdNumber;
    }
    //endregion

    //region S05 - Coding Exercise 08: Teen Number Checker
    public static boolean hasTeen(int firstValue, int secondValue, int thirdValue) {
        return isTeen(firstValue) || isTeen(secondValue) || isTeen(thirdValue);
    }

    public static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }
    //endregion

    //region S05 - Coding Exercise 09: Area Calculator
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        else {
            return Math.PI * Math.pow(radius, 2);
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        else {
            return x * y;
        }
    }
    //endregion

    //region S05 - Coding Exercise 10: Minutes To Years and Days Calculator
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / (365 * 24 * 60);
            long days = (minutes / (24 * 60)) % 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
    //endregion

    //region S05 - Coding Exercise 11: Equality Printer
    public static void printEqual(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber < 0 || secondNumber < 0 || thirdNumber < 0) {
            System.out.println("Invalid Value");
        } else if ((firstNumber == secondNumber) && (secondNumber == thirdNumber)){
            System.out.println("All numbers are equal");
        } else if ((firstNumber != secondNumber) && (secondNumber != thirdNumber) && (firstNumber != thirdNumber)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
    //endregion

    //region S05 - Coding Exercise 12: Playing Cat
    public static boolean isCatPlaying(boolean summer, int temperature){
        return (summer && temperature >= 25 && temperature <= 45) || (!summer && temperature >= 25 && temperature<= 35);
    }
    //endregion

    //* ═════════════════════════════════════════════════════════════════════

    //*     ╭──────────────────────────────────────────────────────────╮
    //*     │               Section 06 - Control Flow                  │
    //*     ╰──────────────────────────────────────────────────────────╯

    //* ═════════════════════════════════════════════════════════════════════

    //region S06 - Coding Exercise 13: Number In Word
    public static void printNumberInWord(int number){
        String numberInWord = switch(number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";
        };
        System.out.println(numberInWord);
    }
    //endregion

    //region S06 - Coding Exercise 14: Number Of Days In Month
    public static int getDaysInMonth(int month, int year){
        if (year < 1 || year > 9999) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> -1;
        };
    }
    //endregion

    //region S06 - Coding Exercise 15: Sum Odd
    public static boolean isOdd(int number){
        return (number > 0) && (number % 2 != 0);
    }

    public static int sumOdd(int start, int end){
        if (end < start || start <= 0 || end <= 0){
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++){
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
    //endregion

    //region S06 - Coding Exercise 16: Number Palindrome
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = Math.abs(number);
        if (num > 10) {
            while (num > 9) {
                reverse = (reverse * 10) + (num % 10);
                num /= 10;
            }
            reverse = (reverse * 10) + num;
            return (Math.abs(number) == reverse);
        }
        return false;
    }
    //endregion

    //region S06 - Coding Exercise 17: First And Last Digit Sum
    public static int sumFirstAndLastDigit(int number){
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        while (number > 9) {
            number /= 10;
        }
        return lastDigit + number;
    }
    //endregion

    //region S06 - Coding Exercise 18: Even Digit Sum
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 9){
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;
        }
        return (number % 2 == 0) ? (sum + number) : sum;
    }
    //endregion

    //region S06 - Coding Exercise 19: Shared Digit
    public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if ((firstNumber >= 10 && firstNumber <= 99) && (secondNumber >= 10 && secondNumber <= 99)){
            return ((firstNumber % 10 == secondNumber % 10) || (firstNumber / 10 == secondNumber / 10) || (firstNumber % 10 == secondNumber / 10) || (firstNumber / 10 == secondNumber % 10));
        } return false;
    }
    //endregion

    //region S06 - Coding Exercise 20: Last Digit Checker
    public static boolean hasSameLastDigit(int firstNum, int SecondNum, int thirdNum){
        if (isValid(firstNum) && isValid(SecondNum) && isValid(thirdNum)){
            return ((firstNum % 10 == SecondNum % 10) || (SecondNum % 10 == thirdNum % 10) || (thirdNum % 10 == firstNum % 10));
        }
        return false;
    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
    //endregion

    //region S06 - Coding Exercise 21: All Factors
    public static void printFactors(int number){
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int j = 1;
        String factors = "";
        while (j <= number){
            if (number % j == 0){
                factors += " " + j;
            }
            j++;
        }
        System.out.println(factors);
    }
    //endregion

    //region S06 - Coding Exercise 22: Greatest Common Divisor
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        int j = 1;
        int greatestDivisor = 1;
        while (j <= Math.min(first, second)){
            if ((first % j == 0) && (second % j == 0)){
                greatestDivisor = j;
            }
            j++;
        }
        return greatestDivisor;
    }
    //endregion

    //region S06 - Coding Exercise 23: Perfect Number
    public static boolean isPerfectNumber(int number) {
        if (number < 1){
            return false;
        }
        int totalDivisors = 0;
        int j = 1;
        while (j < number){
            if (number % j == 0){
                totalDivisors += j;
            }
            j++;
        }
        return (number == totalDivisors);
    }
    //endregion

    //region S06 - Coding Exercise 24: Number To Words
    public static void numberToWords(int number){

        String numberInWords = "";
        int reverseNumber = reverse(number);
        int lastDigit = reverseNumber % 10;
        int remainingDigits = getDigitCount(reverseNumber);
        int digitCount = getDigitCount(number) - getDigitCount(reverseNumber);

        if (number < 0){
            numberInWords += "Invalid Value";
        }
        while (remainingDigits > 0){
            numberInWords += (numberInWords.isEmpty() ? "" : " ") + switch (lastDigit) {
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "Zero";
            };
            reverseNumber /= 10;
            lastDigit = reverseNumber % 10;
            remainingDigits--;
        }
        for (int i = 0; i < digitCount; i++){
            numberInWords += " Zero";
        }
        System.out.println(numberInWords);

    }

    public static int reverse(int number){
        String reverseNumber = "";
        int absNumber = Math.abs(number);
        while (absNumber > 9){
            reverseNumber += absNumber % 10;
            absNumber /= 10;
        }
        reverseNumber += absNumber;
        return (number > 0 ? 1 : -1) * Integer.parseInt(reverseNumber);
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        int count = 1;
        while (number / 10 != 0){
            count++;
            number /= 10;
        }
        return count;
    }
    //endregion

    //region S06 - Coding Exercise 25: Flour Pack Problem
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        int pack = 0;
        while (pack <= goal && bigCount > 0){
            if (goal >= pack + 5){
                pack += 5;
            }
            bigCount--;
        }
        return (pack + smallCount >= goal);
    }
    //endregion

    //region S06 - Coding Exercise 26: Largest Prime
    public static int getLargestPrime(int number){
        if (number <= 1) {
            return -1;
        }
        int i = 2;
        int largestPrime = 1;
        while(i <= number){
            boolean isPrime = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime && number % i == 0){
                largestPrime = i;
            }
            i++;
        }
        return largestPrime;
    }
    //endregion

    //region S06 - Coding Exercise 27: Diagonal Star
    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        } else {
            for (int currentRow = 1; currentRow <= number; currentRow++){
                for (int currentColumn = 1; currentColumn < number; currentColumn++){
                    if ((currentRow == 1) || (currentColumn == 1) || (currentRow == number) || (currentRow == currentColumn) || (currentColumn == (number - currentRow + 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("*");
            }
        }
    }
    //endregion

    //region S06 - Coding Exercise 28: Input Calculator
    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long avg = 0;
        boolean quit = false;
        do {
            String userInput = scanner.nextLine();
            try {
                int number = Integer.parseInt(userInput);
                sum += number;
                count++;
                avg = Math.round((double) sum / count);
            } catch (NumberFormatException e){
                quit = true;
                System.out.println("SUM = " + sum + " AVG = " + avg);
            }

        } while (!quit);
    }
    //endregion

    //region S06 - Coding Exercise 29: Paint Job
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        return (int) Math.ceil((height * width) / areaPerBucket) - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){

        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int) Math.ceil((height * width) / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){

        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int) Math.ceil(area / areaPerBucket);
    }
    //endregion

    //S07 - Coding Exercise

}
