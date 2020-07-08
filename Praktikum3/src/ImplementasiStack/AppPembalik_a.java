/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImplementasiStack;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AppPembalik_a {
    public static void main(String[] args) {
        String input="kasur";
        String output;
        pembalik balik_kata=new pembalik(input);
        output=balik_kata.membalik();
        System.out.println(">>katanya...");
        System.out.println("\t"+input);
        System.out.println(">>dibalik jadi...");
        System.out.println("\t"+output);
       
    }
    
}
