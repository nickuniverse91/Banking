/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Scanner;


public class UserInputManager implements IUserInputManager{
    
    private String Scanning(){
        Scanner scan = new Scanner(System.in);
        String Input = scan.nextLine();
        return Input;
    }


    public int retrieveAccountNumber(){
        System.out.println("Please enter account number: ");
        int AccNum = Integer.parseInt(Scanning());
        return AccNum;
    }
    
    public Account retrieveAccountType(){
        System.out.println("Please input your desired account type");
        System.out.println("Type Checkings for a CheckingAccount or Type Savings for a SavingsAccount: ");
        Account a = null;
        
        String AccountType = Scanning();
            if (AccountType.equalsIgnoreCase("Checkings")){
                a = new CheckingAccount();
            }
            else if (AccountType.equalsIgnoreCase("Savings")){
                a = new SavingsAccount();
            }
            System.out.println(AccountType);
            return a; //to fix
        
    }
    public int retrieveClientId(){
        System.out.println("Please input your Id: ");
        int Id = Integer.parseInt(Scanning());
        return Id;
    }
    
    public Client retrieveClientInfo(){ 
        System.out.println("Please enter your First Name: ");
        String FirstName = Scanning();
        System.out.println("Please enter your Last Name: ");
        String LastName = Scanning();
        System.out.println(FirstName +" " + LastName);
        
        return new Client(FirstName, LastName); //to fix
    }
    
    public double retrieveTransactionAmount(){
        //double deposit;
        String Transaction = Scanning();
        /*if(Transaction == "Deposit"){
            System.out.println("Please input your desired amount to deposit: ");
            deposit = Double.parseDouble(Scanning());
            return deposit;  
        }
        else if(Transaction == "Withdraw"){
            System.out.println("Please input your desired amount to withdraw: ");
            deposit = Double.parseDouble(Scanning());
            return deposit;  
        }*/
        return Double.parseDouble(Transaction);
               
    }
    
    public int retrieveUserOption(){
        System.out.println("Please select one of the following numbers: ");
        int entry = Integer.parseInt(Scanning());
        return entry;
    }

    
    
    
    
    
    
}
