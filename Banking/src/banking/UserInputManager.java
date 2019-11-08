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

    public static int retrieveAccountNumber(int AccNum){
        System.out.println("Please enter account number: ");
        AccNum = Integer.parseInt(Scanning());
        return AccNum;
    }
    
    public static Account retrieveAccountType(String AccountType){
        System.out.println("Please input your desired account type");
        System.out.println("Type Checking for a CheckingAccount or Type Saving for a SavingsAccount: ");
        
        AccountType = Scanning();
            if (AccountType == "Checking"){
            }
                else if (AccountType == "Saving" ) {
                }
            System.out.println(AccountType);
    return null; //to fix
        
    }
    public static int retrieveClientId(int Id){
        System.out.println("Please input your Id: ");
        Id = Integer.parseInt(Scanning());
        return Id;
    }
    
    public static Client retrieveClientInfo(String FirstName, String LastName){ 
        System.out.println("Please enter your First Name: ");
        FirstName = Scanning();
        System.out.println("Please enter your Last Name: ");
        LastName = Scanning();
        System.out.println(FirstName +" " + LastName);
        
        return null; //to fix
    }
    
    public static double retrieveTransactionAmount(double Deposit){
        String Transaction = Scanning();
        if(Transaction == "Deposit"){
            System.out.println("Please input your desired amount to deposit: ");
            Deposit = Double.parseDouble(Scanning());
            return Deposit + /* value already in the bank*/;  
        }
        else if(Transaction == "Withdraw"){
            System.out.println("Please input your desired amount to withdraw: ");
            Deposit = Double.parseDouble(Scanning());
            return Deposit - /* value already in the bank*/;  
        }
        return 0;//to fix
    }
    
    public static int retrieveUserOption(int entry){
        System.out.println("Please select one of the following numbers: ");
        entry = Integer.parseInt(Scanning());
        return entry;
    }

    
    
    
    
    
    
}
