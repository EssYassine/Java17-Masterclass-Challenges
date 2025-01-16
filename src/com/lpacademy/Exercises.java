package com.lpacademy;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercises {

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

    //* ═════════════════════════════════════════════════════════════════════

    //*     ╭──────────────────────────────────────────────────────────╮
    //*     │           Section 07 - OOP Part 1 - Inheritance          │
    //*     ╰──────────────────────────────────────────────────────────╯

    //* ═════════════════════════════════════════════════════════════════════

    //region S07 - Coding Exercise 30: Sum Calculator
    public class SimpleCalculator {
        // write code here
        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber(){
            return this.firstNumber;
        }

        public double getSecondNumber(){
            return this.secondNumber;
        }

        public void setFirstNumber(double number){
            this.firstNumber = number;
        }

        public void setSecondNumber(double number){
            this.secondNumber = number;
        }

        public double getAdditionResult(){
            return firstNumber + secondNumber;
        }

        public double getSubtractionResult(){
            return firstNumber - secondNumber;
        }

        public double getMultiplicationResult(){
            return firstNumber * secondNumber;
        }

        public double getDivisionResult(){
            if (secondNumber == 0) {
                return 0;
            } else {
                return firstNumber / secondNumber;
            }
        }
    }
    //endregion

    //region S07 - Coding Exercise 31: Person
    public class Person {
        // write code here
        private String firstName;
        private String lastName;
        private int age;

        public String getFirstName(){
            return this.firstName;
        }

        public String getLastName(){
            return this.lastName;
        }

        public int getAge(){
            return this.age;
        }

        public void setFirstName(String firstName){
            this.firstName = firstName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public void setAge(int age){
            if (age < 0 || age > 100){
                this.age = 0;
            } else {
                this.age = age;
            }
        }

        public boolean isTeen(){
            return age > 12 && age < 20;
        }

        public String getFullName(){
            if (firstName.isEmpty() && lastName.isEmpty()){
                return "";
            } else if (lastName.isEmpty()){
                return firstName;
            } else if (firstName.isEmpty()){
                return lastName;
            } else {
                return firstName + " " + lastName;
            }
        }
    }
    //endregion

    //region S07 - Coding Exercise 32: Wall Area
    /*public class Wall {
        // write code here
        private double width;
        private double height;

        public Wall(){

        }

        public Wall(double width, double height){
            if (width < 0){
                this.width = 0;
            } else {
                this.width = width;
            }

            if (height < 0){
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        public double getWidth(){
            return width;
        }

        public double getHeight(){
            return height;
        }

        public void setWidth(double width){
            if (width < 0){
                this.width = 0;
            } else {
                this.width = width;
            }
        }

        public void setHeight(double height){
            if (height < 0){
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        public double getArea(){
            return height * width;
        }
    }*/
    //endregion

    //region S07 - Coding Exercise 33: Point
    /*public class Point {
        // write code here
        private int x;
        private int y;

        public Point(){

        }

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public void setX(int x){
            this.x = x;
        }
        public void setY(int y){
            this.y = y;
        }
        public double distance(){
            return distance(0,0);
        }
        public double distance(Point p){
            return distance(p.getX(), p.getY());
        }
        public double distance(int x, int y){
            return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
        }
    }*/
    //endregion

    //region S07 - Coding Exercise 34: Carpet Cost Calculator
    /*public class Floor {
        // write code here
        private double width;
        private double length;

        public Floor(double width, double length){
            if (width < 0){
                this.width = 0;
            } else {
                this.width = width;
            }

            if (length < 0){
                this.length = 0;
            } else {
                this.length = length;
            }
        }

        public double getArea(){
            return width * length;
        }
    }
    public class Carpet {
        // write code here
        private double cost;

        public Carpet(double cost){
            if (cost < 0){
                this.cost = 0;
            } else {
                this.cost = cost;
            }
        }
        public double getCost(){
            return cost;
        }


    }
    public class Calculator {
        // write code here
        private Floor floor;
        private Carpet carpet;

        public Calculator(Floor floor, Carpet carpet){
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost(){
            return floor.getArea() * carpet.getCost();
        }
    }*/
    //endregion

    //region S07 - Coding Exercise 35:Complex Operations
    /*public class ComplexNumber {
        // write code here
        private double real;
        private double imaginary;

        public ComplexNumber(double real, double imaginary){
            this.real = real;
            this.imaginary = imaginary;
        }

        public double getReal(){
            return real;
        }
        public double getImaginary(){
            return imaginary;
        }

        public void add(double real, double imaginary){
            this.real += real;
            this.imaginary += imaginary;
        }

        public void add(ComplexNumber number){
            add(number.getReal(), number.getImaginary());
        }

        public void subtract (double real, double imaginary){
            this.real -= real;
            this.imaginary -= imaginary;
        }

        public void subtract (ComplexNumber number){
            subtract (number.getReal(), number.getImaginary());
        }
    }*/
    //endregion

    //region S07 - Coding Exercise 36: Cylinder
    /*public class Circle {
        // write code here
        private double radius;

        public Circle (double radius) {
            if (radius <= 0) {
                this.radius = 0;
            } else {
                this.radius = radius;
            }
        }

        public double getRadius(){
            return radius;
        }

        public double getArea(){
            return Math.PI * Math.pow(radius,2);
        }
    }*/
    /*public class Cylinder extends Circle{
        // write code here
        private double height;

        public Cylinder(double radius, double height){
            super(radius);
            if (height <= 0){
                this.height = 0;
            } else {
                this.height = height;
            }
        }

        public double getHeight(){
            return height;
        }

        public double getVolume(){
            return height * super.getArea();
        }


    }*/
    //endregion

    //region S07 - Coding Exercise 37: Pool Area
    /*public class Rectangle {
        // write code here
        private double width;
        private double length;

        public Rectangle(double width, double length){
            this.width = (width >= 0) ? width : 0;
            this.length = (length >= 0) ? length : 0;
        }

        public double getWidth(){
            return width;
        }

        public double getLength(){
            return length;
        }

        public double getArea(){
            return width * length;
        }
    }*/
    /*public class Cuboid extends Rectangle {
        // write code here
        private double height;

        public Cuboid(double width, double length, double height){
            super(width, length);
            this.height = (height > 0) ? height : 0;
        }

        public double getHeight(){
            return height;
        }

        public double getVolume(){
            return height * super.getArea();
        }
    }*/
    //endregion

    //* ═════════════════════════════════════════════════════════════════════

    //*     ╭──────────────────────────────────────────────────────────╮
    //*     │          Section 08 - OOP Part 2 - Polymorphism          │
    //*     ╰──────────────────────────────────────────────────────────╯

    //* ═════════════════════════════════════════════════════════════════════

    //region S08 - Coding Exercise 38: Composition
    public class Lamp {
        // write code here
        private String style;
        private boolean battery;
        private int globRating;

        public Lamp(String style, boolean battery, int globRating) {
            this.style = style;
            this.battery = battery;
            this.globRating = globRating;
        }

        public void turnOn() {
            System.out.print("Lamp -> Turning on");
        }

        public String getStyle() {
            return style;
        }

        public boolean isBattery() {
            return battery;
        }

        public int getGlobRating() {
            return globRating;
        }
    }

    public class Bed{
        // write code here
        private String style;
        private int pillows, height, sheets, quilt;

        public Bed(String style, int pillows, int height, int sheets, int quilt) {
            this.style = style;
            this.pillows = pillows;
            this.height = height;
            this.sheets = sheets;
            this.quilt = quilt;
        }

        public void make() {
            System.out.print("Bed -> Making | ");
        }

        public String getStyle(){
            return style;
        }

        public int getPillows() {
            return pillows;
        }

        public int getHeight() {
            return height;
        }

        public int getSheets() {
            return sheets;
        }

        public int getQuilt() {
            return quilt;
        }

    }

    public class Ceiling {
        // write code here
        private int height;
        private int paintedColor;

        public Ceiling(int height, int paintedColor) {
            this.height = height;
            this.paintedColor = paintedColor;
        }

        public int getHeight() {
            return height;
        }

        public int getPaintedColor() {
            return paintedColor;
        }
    }

    public class Wall {
        // write code here
        private String direction;

        public Wall(String direction) {
            this.direction = direction;
        }

        public String getDirection() {
            return direction;
        }
    }

    public class Bedroom {
        // write code here
        private String name;
        private Wall wall1;
        private Wall wall2;
        private Wall wall3;
        private Wall wall4;
        private Ceiling ceiling;
        private Bed bed;
        private Lamp lamp;

        public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {

            this.name = name;
            this.wall1 = wall1;
            this.wall2 = wall2;
            this.wall3 = wall3;
            this.wall4 = wall4;
            this.ceiling = ceiling;
            this.bed = bed;
            this.lamp = lamp;
        }

        public Lamp getLamp() {
            return lamp;
        }

        public void makeBed() {
            System.out.print("Bedroom -> Making bed | ");
            bed.make();
        }
    }
    //endregion

    //region s08 - Coding Exercise 39: Encapsulation
    /*public class Printer {
        // write code here
        private int tonerLevel;
        private int pagesPrinted;
        private boolean duplex;

        public Printer(int tonerLevel, boolean duplex) {
            this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
            this.duplex = duplex;
            this.pagesPrinted = 0;
        }

        public int addToner(int tonerAmount) {
            if (tonerAmount > 0 && tonerAmount <= 100) {
                if (tonerLevel + tonerAmount <= 100) {
                    tonerLevel += tonerAmount;
                    return tonerLevel;
                }
            }
            return -1;
        }

        public int printPages(int pages) {
            int pagesToPrint = (duplex) ? (pages / 2) + (pages % 2) : pages;
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }

        public int getPagesPrinted() {
            return pagesPrinted;
        }
    }*/
    //endregion

    //region S08 - Coding Exercise 40: Polymorphism
    /*public class Car {
        // write code here
        private boolean engine = true;
        private int cylinders;
        private String name;
        private int wheels = 4;

        public Car(int cylinders, String name){
            this.cylinders = cylinders;
            this.name = name;
        }

        public String startEngine() {
            return getClass().getSimpleName() + " -> startEngine()";
        }

        public String accelerate() {
            return getClass().getSimpleName() + " -> accelerate()";
        }

        public String brake() {
            return getClass().getSimpleName() + " -> brake()";
        }

        public String getName() {
            return name;
        }

        public int getCylinders() {
            return cylinders;
        }
    }
    public class Mitsubishi extends Car {
        // write code here

        public Mitsubishi(int cylinders, String name){
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return super.startEngine();
        }

        @Override
        public String accelerate() {
            return super.accelerate();
        }

        @Override
        public String brake() {
            return super.brake();
        }
    }
    public class Holden extends Car {
        // write code here

        public Holden(int cylinders, String name){
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return super.startEngine();
        }

        @Override
        public String accelerate() {
            return super.accelerate();
        }

        @Override
        public String brake() {
            return super.brake();
        }
    }
    public class Ford extends Car {
        // write code here

        public Ford(int cylinders, String name){
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return super.startEngine();
        }

        @Override
        public String accelerate() {
            return super.accelerate();
        }

        @Override
        public String brake() {
            return super.brake();
        }
    }*/
    //endregion

    //* ═════════════════════════════════════════════════════════════════════

    //*     ╭──────────────────────────────────────────────────────────╮
    //*     │                    Section 09 - Array                    │
    //*     ╰──────────────────────────────────────────────────────────╯

    //* ═════════════════════════════════════════════════════════════════════

    //region S09 - Coding Exercise 41: Sorted Array
    /*import java.util.Scanner;
    import java.util.Arrays;

    public class SortedArray {
        // write code here

        public static int[] getIntegers(int length) {

            Scanner scanner = new Scanner(System.in);
            int[] integers = new int[length];

            for (int i = 0; i < length; i++){
                System.out.print("Enter a number: ");
                integers[i] = scanner.nextInt();
            }

            return integers;

        }

        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++){
                System.out.printf("Element %d contents %d", i, array[i]);
            }
        }

        public static int[] sortIntegers(int[] array) {
            Arrays.sort(array);
            for (int i = 0; i < (array.length) / 2; i++){
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
            return array;
        }
    }*/
    //endregion

    //region S09 - Coding Exercise 42: Minimum Element
    /*import java.util.Scanner;
    import java.util.Arrays;

    public class MinimumElement {
        // write code here
        private static int readInteger() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            return scanner.nextInt();
        }

        private static int[] readElements(int length) {
            Scanner scanner = new Scanner(System.in);
            int[] integers = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.println("Enter a number: ");
                integers[i] = scanner.nextInt();
            }
            return integers;
        }

        private static int findMin(int[] integers) {
            int[] integersCopy = integers.clone();
            Arrays.sort(integersCopy);
            return integersCopy[0];
        }
    }*/
    //endregion

    //region S09 - Coding Exercise 43: Reverse Array
    /*import java.util.Arrays;
    public class ReverseArray {
        // write code here

        private static void reverse(int[] integers) {
            System.out.println("Array = " + Arrays.toString(integers));
            for (int i = 0; i < integers.length / 2; i++){
                int temp = integers[i];
                integers[i] = integers[integers.length - 1 - i];
                integers[integers.length - 1 - i] = temp;
            }
            System.out.println("Reversed array = " + Arrays.toString(integers));
        }
    }*/
    //endregion

    //* ═════════════════════════════════════════════════════════════════════

    //*     ╭──────────────────────────────────────────────────────────╮
    //*     │              Section 10 - List, ArrayList, ...           │
    //*     ╰──────────────────────────────────────────────────────────╯

    //* ═════════════════════════════════════════════════════════════════════

    //region S10 - Coding Exercise 44: Mobile Phone
    /*public class Contact {
        // write code here
        private String name;
        private String phoneNumber;

        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public static Contact createContact(String name, String phoneNumber) {
            return new Contact(name, phoneNumber);
        }
    }
    import java.util.ArrayList;

    public class MobilePhone {
        // write code here
        private String myNumber;
        private ArrayList<Contact> myContacts;

        public MobilePhone(String phoneNumber) {
            myNumber = phoneNumber;
            myContacts = new ArrayList<>();
        }

        public boolean addNewContact(Contact contact) {
            if (findContact(contact) == -1) {
                myContacts.add(contact);
                return true;
            }
            return false;
        }

        public boolean updateContact(Contact oldContact, Contact newContact) {
            int index = findContact(oldContact);
            if (index == -1) {
                return false;
            }
            myContacts.set(index, newContact);
            return true;
        }

        public boolean removeContact(Contact contact) {
            int index = findContact(contact);
            if (index == -1) {
                return false;
            }
            myContacts.remove(index);
            return true;
        }

        //Return the index of the found contact
        private int findContact(Contact contact) {
            return  findContact(contact.getName());
        }

        //Return the index of the found contact
        private int findContact(String contactName) {
            for (int i = 0; i < myContacts.size(); i++) {
                if (myContacts.get(i).getName().equals(contactName)) {
                    return i;
                }
            }
            return -1;
        }

        public Contact queryContact(String contact) {
            return (findContact(contact) == -1 ? null : myContacts.get(findContact(contact)));
        }

        public void printContacts() {
            System.out.println("Contact List:");
            for (int i = 0; i < myContacts.size(); i++) {
                System.out.printf("%d. %s -> %s", i+1, myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber());
            }
        }
    }*/
    //endregion

    //region S10 - Coding Exercise 45: Playlist
    /*public class Song {
        // write code here
        private String title;
        private double duration;

        public Song(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString(){
            return title + ": " + duration;
        }
    }
    import java.util.*;
    public class Album {
        // write code here
        private String name;
        private String artist;
        private ArrayList<Song> songs;

        public Album(String name, String artist){
            this.name = name;
            this.artist = artist;
            songs = new ArrayList<Song>();
        }

        public boolean addSong(String title, double duration) {
            if (findSong(title) == null){
                songs.add(new Song(title, duration));
                return true;
            }
            return false;
        }

        private Song findSong(String title){
            for (Song s : songs) {
                if (s.getTitle().equals(title)) {
                    return s;
                }
            }
            return null;
        }

        public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
            if (trackNumber >= 1) {
                playlist.add(songs.get(trackNumber - 1));
                return true;
            }
            return false;
        }

        public boolean addToPlayList(String title, LinkedList<Song> playlist){
            Song song = findSong(title);
            if(song == null){
                return false;
            }
            songs.add(song);
            return true;
        }
    }*/
    //endregion

    //region S10 - Coding Exercise 46: Banking
    /*import java.util.ArrayList;

    public class Customer {
        // write code here
        private String name;
        private ArrayList<Double> transactions;

        public Customer(String name, double initialDebit){
            this.name = name;
            transactions = new ArrayList<>();
            addTransaction(initialDebit);
        }

        public String getName(){
            return name;
        }

        public ArrayList<Double> getTransactions(){
            return transactions;
        }

        public void addTransaction(double debit){
            transactions.add(debit);
        }
    }
    import java.util.ArrayList;

    public class Branch {
        // write code here
        private String name;
        private ArrayList<Customer> customers;

        public Branch(String name){
            this.name = name;
            customers = new ArrayList<>();
        }

        public String getName(){
            return name;
        }

        public ArrayList<Customer> getCustomers(){
            return customers;
        }

        private Customer findCustomer(String customerName){
            for (Customer c : customers){
                if (c.getName().equalsIgnoreCase(customerName)){
                    return c;
                }
            }
            return null;
        }

        public booleaAn newCustomer(String name, double initialDebit){
            if (findCustomer(name) == null){
                customers.add(new Customer(name, initialDebit));
                return true;
            }
            return false;
        }

        public boolean addCustomerTransaction(String name, double transaction){
            Customer customer = findCustomer(name);
            if (findCustomer(name) != null) {
                customer.addTransaction(transaction);
                return true;
            }
            return false;
        }


    }
    import java.util.ArrayList;

    public class Bank {
        // write code here
        private String name;
        private ArrayList<Branch> branches;

        public Bank(String name){
            this.name = name;
            branches = new ArrayList<Branch>();
        }

        private Branch findBranch(String name){
            for (Branch c : branches) {
                if (c.getName().equalsIgnoreCase(name)) {
                    return c;
                }
            }
            return null;
        }

        public boolean addBranch(String branchName) {
            if (findBranch(branchName) == null) {
                branches.add(new Branch(branchName));
                return true;
            }
            return false;
        }

        public boolean addCustomer(String branchName, String customerName, double initialDebit) {
            Branch branch = findBranch(branchName);
            if (branch != null) {
                return branch.newCustomer(customerName, initialDebit);
            }
            return false;
        }

        public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
            Branch branch = findBranch(branchName);
            if (branch != null) {
                return branch.addCustomerTransaction(customerName, transaction);
            }
            return false;
        }

        public boolean listCustomers(String branchName, boolean printTransactions) {
            Branch branch = findBranch(branchName);
            if (branch != null) {
                System.out.println("Customer details for branch " + branchName);
                for (int i = 0; i < branch.getCustomers().size(); i++) {
                    Customer customer = branch.getCustomers().get(i);
                    System.out.printf("Customer: %s[%d]%n", customer.getName(), i + 1);
                    if (printTransactions) {
                        System.out.println("Transactions");
                        for (int j = 0; j < customer.getTransactions().size(); j++) {
                            System.out.printf("[%d] Amount %.2f%n", j + 1, customer.getTransactions().get(j));
                        }
                    }
                }
                return true;
            }
            return false;
        }
    }*/
    //endregion

    //* ═════════════════════════════════════════════════════════════════════

    //*     ╭──────────────────────────────────────────────────────────╮
    //*     │              Section 11 - Abstraction in Java            │
    //*     ╰──────────────────────────────────────────────────────────╯

    //* ═════════════════════════════════════════════════════════════════════



}
