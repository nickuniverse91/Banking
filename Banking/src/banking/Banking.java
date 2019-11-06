/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author cstuser
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bContinue = true;
        
        while(bContinue){
            System.out.println( "[1] Add a new Client      \t" + "[2] Create a new Account \n" +
                                "[3] Make a Deposit             \t" + "[4] Make a Withdrawal \n" +
                                "[5] List Account Transactions  \t" + "[6] List Clients\n" +
                                "[7] List Client Accounts \t" + "[8] Exit");
            
            
            switch(UserInputManager.retrieveUserOption){
                
            }
        }
    }
    
}
