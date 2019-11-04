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
public class Client implements IClient{
    
    private static int counter = 0;
    
    private int id;
    private String firstName;
    private String lastName;
    ArrayList<Account>accountList = new ArrayList<Account>();

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void addAccount(Account newAccount){
        accountList.add(newAccount);
    }
    
    public void displayAccounts(){
        for(int i = 0; i < accountList.size(); i++){
            System.out.println(accountList.get(i));
        }
    }
    
    public Account getAccount(int accountNumber){
        return accountList.get(accountNumber - 1);
    }
    
    public String toString(){
        return "(" + id + ") " + lastName + ", " + firstName;
    }
    
}
