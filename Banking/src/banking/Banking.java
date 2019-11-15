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
        int accNum;
        double transaction;
        Client cl;
        Account acc;
        
        while(bContinue){
            System.out.println( "[1] Add a new Client      \t" + "[2] Create a new Account \n" +
                                "[3] Make a Deposit             \t" + "[4] Make a Withdrawal \n" +
                                "[5] List Account Transactions  \t" + "[6] List Clients\n" +
                                "[7] List Client Accounts \t" + "[8] Exit");
            
            switch(uim.retrieveUserOption()){
                case 1:
                    cl = uim.retrieveClientInfo();
                    myBank.addClient(cl);
                    break;
                case 2:
                    id = uim.retrieveClientId();
                    acc = uim.retrieveAccountType();
                    acc.setOwner(myBank.getClient(id));
                    myBank.getClient(id).addAccount(acc);
                    break;
                case 3:
                    id = uim.retrieveClientId();
                    accNum = uim.retrieveAccountNumber();
                    transaction = uim.retrieveTransactionAmount();
                    myBank.getClient(id).getAccount(accNum).deposit(transaction);
                    break;
                case 4:
                    id = uim.retrieveClientId();
                    accNum = uim.retrieveAccountNumber();
                    transaction = uim.retrieveTransactionAmount();
                    myBank.getClient(id).getAccount(accNum).withdrawal(transaction);
                    break;
                case 5:
                    id = uim.retrieveClientId();
                    accNum = uim.retrieveAccountNumber();
                    cl = myBank.getClient(id);
                    acc = cl.getAccount(accNum);
                    acc.displayAllTransactions();
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
