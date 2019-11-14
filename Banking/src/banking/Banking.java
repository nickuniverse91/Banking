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
        Bank myBank = new Bank("4206934", "123 Seasame Street");
        UserInputManager uim = new UserInputManager();
        int id;
        
        while(bContinue){
            System.out.println( "[1] Add a new Client      \t" + "[2] Create a new Account \n" +
                                "[3] Make a Deposit             \t" + "[4] Make a Withdrawal \n" +
                                "[5] List Account Transactions  \t" + "[6] List Clients\n" +
                                "[7] List Client Accounts \t" + "[8] Exit");
            
            switch(uim.retrieveUserOption()){
                case 1:
                    Client nClient = uim.retrieveClientInfo();
                    myBank.addClient(nClient);
                    break;
                case 2:
                    id = uim.retrieveClientId();
                    Account newAccount = uim.retrieveAccountType();
                    newAccount.setOwner(myBank.getClient(id));
                    myBank.getClient(id).addAccount(newAccount);
                    System.out.println("This is owner " + newAccount.getOwner());
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    myBank.displayClientList();
                    break;
                case 7:
                    id = uim.retrieveClientId();
                    myBank.displayClientAccounts(id);
                    break;
                default:
                    bContinue = false;
            }
        }
    }
    
}
