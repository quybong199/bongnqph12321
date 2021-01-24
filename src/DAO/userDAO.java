/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import model.user;

/**
 *
 * @author Quy Bong
 */
public class userDAO {
    List<user> ls  = new  ArrayList<>();

    public userDAO() {
        ls.add(new user("admin","12345",true));
    }
    public boolean checklogin(String username,String pass){
        for(user u : ls){
            if(u.getUsername().equals(username)&&u.getPassword().equals(pass)){
                return true;
            }
        }
        return  false;
    }

}
