package com.lpacademy.oop;

public class BankAccount {

    private long number;
    private double balance;
    private String name;
    private String email = "Unknown";
    private String phone = "Unregistered";

    //region Setters & Getters
    public long getNumber() {
        return number;
    }
    public double getBalance() {
         return balance;
    }
    public String getName(){
         return name;
    }
    public String getEmail(){
         return email;
    }
    public String getPhone(){
         return phone;
    }

    public void setNumber(long number){
        this.number = number;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public  void setPhone(String phone){
        this.phone = phone;
    }
    //endregion

    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount +
                    " processed. Remaining balance = $" + balance);
        } else{
            System.out.println("Insufficient funds! You only have $" + balance
                + " in your account.");
        }
    }
}
