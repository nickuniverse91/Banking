/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.Scanner;


public class UserInputManager implements IUserInputManager{
    
    private static String Scanning(){
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
        System.out.println("Type Checking for a CheckingAccount or Type Saving for a SavingsAccount: ");
        
        String AccountType = Scanning();
            if (AccountType == "Checking"){
            }
                else if (AccountType == "Saving" ) {
                }
            System.out.println(AccountType);
    return null; //to fix
        
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
        
        return null; //to fix
    }
    
    public double retrieveTransactionAmount(){
        String Transaction = Scanning();
        if(Transaction == "Deposit"){
            System.out.println("Please input your desired amount to deposit: ");
            double Deposit = Double.parseDouble(Scanning());
            return Deposit + /* value already in the bank*/;  
        }
        else if(Transaction == "Withdraw"){
            System.out.println("Please input your desired amount to withdraw: ");
            double Deposit = Double.parseDouble(Scanning());
            return Deposit - /* value already in the bank*/;  
        }
        return 0;//to fix
    }
    
    public int retrieveUserOption(){
        System.out.println("Please select one of the following numbers: ");
        int entry = Integer.parseInt(Scanning());
        return entry;
    }

    
    
    
    
    
    
}
