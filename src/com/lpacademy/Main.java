package com.lpacademy;

import com.lpacademy.oop.BankAccount;
import com.lpacademy.oop.Customer;
import com.lpacademy.oop.InheritanceChallenge.Employee;
import com.lpacademy.oop.InheritanceChallenge.HourlyEmployee;
import com.lpacademy.oop.InheritanceChallenge.SalariedEmployee;
import com.lpacademy.oop.Student;

import java.time.Year;

import static com.lpacademy.Challenges.*;
import static com.lpacademy.Exercises.*;

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

    }
}