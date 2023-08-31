/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.controller;

/**
 *
 * @author ericp
 */
public class LoginController {
    public static boolean login(String user){
        if(user.equals("admin")){
            return true;
        }
        return false;
    }
    
}
