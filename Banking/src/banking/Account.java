/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.ArrayList;

/**
 *
 * @author cstuser
 */
public class Account implements IAccount{
    
    private static int counter = 0;
    
    protected int accountNumber;
    protected double balance;
    protected ArrayList<Transaction>transactions  = new ArrayList<Transaction>();
    protected Client owner;
    protected String type;

    public Account(/*Client owner,*/ String type) {
        //this.owner = owner;
        this.balance = 0;
        counter++;
        this.accountNumber = counter;
        this.type = type;
    }

    public Account(int accountNumber, double balance, Client owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
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
        Transaction t = new Transaction("Deposit of", d);
        transactions.add(t);
        return this.balance;
    }
    
    public void displayAllTransactions(){
            for(int i = 0; i <= transactions.size(); i++){
                System.out.println(transactions.get(i));
            }
    }
    
    public ArrayList<Transaction> getTransactions(){
        return this.transactions;
    }
    
    public String toString(){
        return this.type + "(" + this.accountNumber + ")" + ": " + this.balance + "$";
    }
    
    public double withdrawal(double w){
        this.balance += w;
        Transaction t = new Transaction("Withdrawal of", w);
        transactions.add(t);
        return this.balance;
    }
}
