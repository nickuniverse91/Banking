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
    
    private static int counter;
    
    protected int accountNumber;
    protected double balance;
    protected ArrayList<Transaction>transactions  = new ArrayList<Transaction>();
    protected Client owner;

    public Account() {
        this.balance = 0;
    }

    public Account(int accountNumber, double balance, Client owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }
    
    
    double deposit(double d){
        
        
    }
    void displayAllTransactions();
    ArrayList<Transaction> getTransactions();
    String toString();
    double withdrawal(double w);
}
