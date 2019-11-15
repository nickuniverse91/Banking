/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.ArrayList;

/*

Nicholas Piperni

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
        //@RR
        for (int i = 0; i < clientList.size(); i++) {
            if(clientId == clientList.get(i).getId()){
                System.out.println(clientList.get(i));
                clientList.get(i).displayAccounts();
            }
                
        }
    }
    
    public void displayClientList(){
        for(int i = 0; i < clientList.size(); i++){
            System.out.println(clientList.get(i));
        }
    }
    
    //@RR
    public Client getClient(int clientId){
        for (int i = 0; i < clientList.size(); i++) {
            if(clientId == clientList.get(i).getId()){
                return clientList.get(i);
            }
        }
        return null;
  }
    
    public Account getClientAccount(int clientId, int accountNumber){
        for (int i = 0; i < clientList.size(); i++) {
            if(clientId == clientList.get(i).getId()){
                return clientList.get(i).getAccount(accountNumber);
            }
        }
        return null;
    }
    
}
