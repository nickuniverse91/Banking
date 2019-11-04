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
public class Bank implements IBank{
    
    private String bankNumber;
    private String address;
    private ArrayList<Client>clientList = new ArrayList<Client>();
	
    public Bank(String bankNumber, String address){
        this.bankNumber = bankNumber;
        this.address = address;
    }
	
    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void addClient(Client newClient){
        clientList.add(newClient);
    }
    
    public void displayClientAccounts(int clientId){
        clientList.get(clientId - 1).displayAccounts();
    }
    
    public void displayClientList(){
        for(int i = 0; i < clientList.size(); i++){
            System.out.println(clientList.get(i));
        }
    }
    
    public Client getClient(int id){
        return clientList.get(id - 1);
    }
    
    public Account getClientAccount(int clientId, int accountNumber){
        Client cl = clientList.get(clientId - 1);
        return cl.getAccount(accountNumber - 1);
    }
    
}
