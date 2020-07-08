/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author USER
 */
public class Queue {
    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;
    
    public Queue(int size){
        this.maxSize=size;
        queArray=new String[maxSize];
        front=0;
        rear=-1;
        nItems=0;
    }

    
    public void insert(String value){
        if (rear==maxSize-1) {
            rear=-1;
        }
        queArray[++rear]=value;
        nItems++;
    }
    public String remove(){
        String temp=queArray[front++];
        if (front==maxSize) {
            front=0;
        }
        nItems--;
        return temp;
    }
    public String peekFront(){
        return queArray[front];
    }
    public boolean isEmpty(){
        return(nItems==0);
    }
    public boolean isFull(){
        return (nItems==maxSize);
    }
    public int size(){
        return nItems;
    }
        
}
