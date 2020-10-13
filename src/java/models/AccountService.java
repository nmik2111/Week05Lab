/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


/**
 *
 * @author naeun
 */
public class AccountService {
    
    public User login(String username, String password) { //the only one non-static method of this class
        /*
        calidates the user and password
        if login is successful, return a user object with password set as null
        if login is not successful, return null
        */
        User user;
        
        if (username.equals("abe") && password.equals("password")) {
            user = new User(username, password);
            return user;
        } else if (username.equals("barb") && password.equals("password")){
            user = new User(username, password);
            return user;
        } else {
        return null;
        }
    }
}
