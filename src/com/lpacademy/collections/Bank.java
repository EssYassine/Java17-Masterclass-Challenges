package com.lpacademy.collections;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    private Customer getCustomer(String customerName){
        for (var customer : customers){
            if(customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        //System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public boolean addCustomer(String customerName, double initialDeposit){
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("new Customer added : " + customer);
            return true;
        }
        return false;
    }

    public void addTransaction(String name, double transaction){
        Customer customer = getCustomer(name);
        if (customer != null){
            customer.transactions().add(transaction);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
        if (customer == null){
            return;
        }
        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions:");
        for (double transaction : customer.transactions()) {
            System.out.printf(" $%10.2f (%s)%n", transaction, transaction >= 0 ? "credit" : "debit");
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }
}
