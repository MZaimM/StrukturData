/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImplementasiStack;

/**
 *
 * @author USER
 */
public class pembalik{
    private String input;
    private String output;
    
    public pembalik(String in){
        input=in;
    }
    public String membalik(){
        int stackSize=input.length();
        Stack theStack= new Stack(stackSize);
        
        for (int i = 0; i < input.length(); i++) {
            char ch=input.charAt(i);
            theStack.push(ch);
        }
        output="";
        while(!theStack.isEmpty()){
            char ch=theStack.pop();
            output+=ch;
        }
        return output;
    }
    
}