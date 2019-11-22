/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.ArrayList;

/*

Alessio Cipriano-Kardous

*/
public class Account implements IAccount{
    
    private static int counter = 0;
    
    protected int accountNumber;
    protected double balance;
    protected ArrayList<Transaction>transactions  = new ArrayList<Transaction>();
    protected Client owner;
    protected String type;

    public Account(String type) {
        this.balance = 0;
        counter++;
        this.accountNumber = counter;
        this.type = type;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return this.owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
    
    
    public double deposit(double d){
        this.balance += d;
        Transaction t = new Transaction("Deposit", d);
        transactions.add(t);
        System.out.println(this);
        return this.balance;
    }
    
    public void displayAllTransactions(){
        for(int i = 0; i < transactions.size(); i++){
            System.out.println(transactions.get(i));
        }
        System.out.println(this);
    }
    
    public ArrayList<Transaction> getTransactions(){
        return this.transactions;
    }
    
    public String toString(){
        return this.type + "(" + this.accountNumber + ")" + ": " + this.balance + "$";
    }
    
    public double withdrawal(double w){
        this.balance -= w;
        Transaction t = new Transaction("Withdrawal", w);
        transactions.add(t);
        System.out.println(this);
        return this.balance;
    }
}
