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
public class Client implements IClient{
    
    private static int counter;
    
    private int id;
    private String firstName;
    private String lastName;
    ArrayList<Account>accountList = new ArrayList<Account>();
    
    
    
}
