package com.lpacademy;

import com.lpacademy.collections.Bank;
import com.lpacademy.collections.Customer;
import com.lpacademy.collections.Place;

import java.util.LinkedList;

import static com.lpacademy.Challenges.*;

public class Main {
    public static void main(String[] args) {

        //* ───────────────────────────── Coding Exercises ──────────────────────────────

        //region Section 06 - Control Flow

        //region S06 - Day of the Week Coding Challenge
        //printDayOfWeek(5);
        //printDayOfWeek('a');
        //endregion

        //region S06 - Reading User Input Coding Challenge
        //sumUserNumbers();
        //endregion

        //region S06 - Min & Max Coding Challenge
        //minMax();
        //endregion

        //endregion



        //* ─────────────────────────────────────────────────────────────────────────────
        //* ───────────────────────────── Coding Challenges ─────────────────────────────

        //region S07 - OOP Part 1 - Inheritance

        //region S07 - Classes Challenge
        /*BankAccount myBankAccount = new BankAccount();
        myBankAccount.setName("Yassine");

        myBankAccount.deposit(250);
        myBankAccount.withdraw(50);
        myBankAccount.withdraw(200);

        myBankAccount.deposit(100);
        myBankAccount.withdraw(45.55);
        myBankAccount.withdraw(54.46);*/
        //endregion

        //region S07 - Constructors in Java
        /*Customer bob = new Customer();
        Customer john = new Customer("john", 1000, "john@email.com");
        Customer james = new Customer("james@email.com");

        System.out.println("Bob ──────────────────────────────────────────────────────────────────────");
        System.out.println(bob.getName());
        System.out.println(bob.getCreditLimit());
        System.out.println(bob.getEmail());

        System.out.println("John ──────────────────────────────────────────────────────────────────────");
        System.out.println(john.getName());
        System.out.println(john.getCreditLimit());
        System.out.println(john.getEmail());

        System.out.println("James ──────────────────────────────────────────────────────────────────────");
        System.out.println(james.getName());
        System.out.println(james.getCreditLimit());
        System.out.println(james.getEmail());*/
        //endregion

        //region S07 - Java's Records
        /*for (int i = 1; i <= 5; i++){
            Student s = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/1985");
            System.out.println(s);
        }*/
        //endregion

        //region S07 - Inheritance Challenge
        /*Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());
        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee jane = new HourlyEmployee("Jane", "05/05/1970", "03/03/2021", 15);
        System.out.println("Jane's paycheck = $" + jane.collectPay());
        System.out.println("Jane's Holiday pay = $" + jane.getDoublePay());*/
        //endregion

        //endregion

        //region S08 - OOP Part 2
        //region S08 - Composition Challenge
        /*SmartKitchen kitchen = new SmartKitchen();
        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();*/
        //endregion

        //region S08 - Encapsulation Challenge
        /*Printer printer = new Printer(50, true);
        System.out.println("Initial page count : " + printer.getPaperPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPaperPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current Job Pages: %d, Printer Total: %d %n",
                pagesPrinted, printer.getPaperPrinted());*/
        //endregion

        //region S08 - Polymorphism Challenge
        /*GasPoweredCar car = new GasPoweredCar("2022 Blue Ferrari 296 GTS");
        car.startEngine();
        car.drive();
        car.runEngine();*/
        /*Car tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        tesla.startEngine();
        tesla.runEngine();
        tesla.drive();*/
        //endregion

        //region S08 - OOP Master Challenge
        /*Drink drink = new Drink();
        drink.setSize("Medium");
        drink.printItem();*/
        /*Side side = new Side("Fries");
        side.printItem();*/
        /*Burger burger = new Burger("bacon");
        burger.addToppings("BACON", "CHEESE", "MAYO");
        burger.printItem();*/
        /*MealOrder order = new MealOrder();
        order.addBurgerToppings("BACON", "CHEESE", "MAYO");
        order.setDrinkSize("LARGE");
        order.printItemizedList();*/
        //endregion
        //endregion

        //region S09 - Arrays Challenge
        /*int[] integers = randomArray();
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers);
        System.out.println(Arrays.toString(integers));
        sortIntegers(integers);
        System.out.println(Arrays.toString(integers));*/
        //endregion

        //region s09 - Minimum Element Challenge
        //System.out.println((Arrays.toString(readIntegers())));
        /*int[] integers = randomArray();
        System.out.println(Arrays.toString(integers));
        System.out.println("The minimum value is: " + findMin(integers));*/
        //endregion

        //region S09 - Reverse Array Challenge
        /*int[] integers = randomArray();
        System.out.println(Arrays.toString(integers));
        reverse(integers);
        System.out.println(Arrays.toString(integers));*/
        //endregion

        //region S10 - ArrayList Challenge
        /*ArrayList<String> groceries = new ArrayList<>();
        GroceryList(groceries);*/
        //endregion

        //region S10 - LinkedList Challenge
        /*LinkedList<Place> list = new LinkedList<Place>();
        addPlace(list, new Place("Sydney", 0));
        addPlace(list, new Place("Adelaide", 1374));
        addPlace(list, new Place("Alice Springs", 2771));
        addPlace(list, new Place("Brisbane", 917));
        addPlace(list, new Place("Darwin", 3972));
        addPlace(list, new Place("Melbourne", 877));
        addPlace(list, new Place("Perth", 3923));
        *//*for (Place element : list) {
            System.out.println("Next: " + element);
        }*//*
        //System.out.println(list);
        auItinerary(list);*/
        //endregion

        //region S10 -  Autoboxing and unboxing Challenge
        //Customer bob = new Customer("Bob S.", 1000.0);
//        Bank bank = new Bank("Chase");
//        bank.addCustomer("Jane A", 500.0);
//        bank.addTransaction("Jane A", -10.25);
//        bank.addTransaction("Jane A", -75.01);
//        bank.printStatement("Jane a");
        //endregion


    }


}
