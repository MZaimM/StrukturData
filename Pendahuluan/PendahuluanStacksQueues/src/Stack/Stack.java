/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author USER
 */
public class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;
    
    public Stack(int size){
        maxSize=size;
        stackArray=new String[maxSize];
        top=-1;
    }
    public void push(String item){
        stackArray[++top]=item;
    }
    public String pop(){
        return stackArray[top--];
    }
    public String peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return(top==-1);
    }
    public boolean isFull(){
        return(top==maxSize-1);
    }
    
}
