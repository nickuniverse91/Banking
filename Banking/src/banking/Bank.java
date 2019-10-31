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
    
}
