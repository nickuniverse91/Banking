/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Scanner;

/*

Pratham Patel 

*/
public class UserInputManager implements IUserInputManager{
    //@RR
    private Scanner scan = new Scanner(System.in);

    public int retrieveAccountNumber(){
        //@RR
        System.out.print("Please enter account number: ");
        return this.scan.nextInt();
    }
    
    public Account retrieveAccountType(){
        System.out.println("Please input your desired account type");
        String type;
        Account a;
        do{
            System.out.println("Type Checking for a CheckingAccount or Type Savings for a SavingsAccount: ");
            type = this.scan.nextLine();
            if(type.equalsIgnoreCase("checking")) {
                a = new CheckingAccount();
            }else if(type.equalsIgnoreCase("savings")) {
                a = new SavingsAccount();
            }else {
                a = null;
            }
            
        }while(!type.equalsIgnoreCase("checking") && !type.equalsIgnoreCase("savings"));
        return a;       
    }
    
    public int retrieveClientId(){
        System.out.println("Please input your Id: ");
        int Id = this.scan.nextInt();
        return Id;
    }
    
    public Client retrieveClientInfo(){ 
        System.out.print("Please enter your First Name: ");
        //@RR
        String firstName = this.scan.nextLine();
        System.out.print("Please enter your Last Name: ");
        String lastName = this.scan.nextLine();
        
        Client c = new Client(firstName, lastName);
        
        return c;
    }
    
    public double retrieveTransactionAmount(){
        System.out.println("Please input your desired amount: ");
        double amount = this.scan.nextDouble();
        return amount;
               
    }
    
    public int retrieveUserOption(){
        System.out.println("Please select one of the following numbers: ");
        int entry = this.scan.nextInt();
        return entry;
    }

    
    
    
    
    
    
}
