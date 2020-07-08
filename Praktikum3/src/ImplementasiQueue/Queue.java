/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImplementasiQueue;

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

    
    public void insert(String name){
        if (!isFull()) {
            queArray[++rear]=name;
            System.out.println(name+" Masuk antrian");
            nItems++;
        }else if(isFull()){
            System.out.println("Maaf "+name+" Antrian sudah penuh");
        }
    }
    public String remove(){
        String temp=queArray[front];
        queArray[front]="kosong";
        front++;
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
    public void display(){
       int temp=this.front;
        for (int i = 0; i < maxSize; i++) {
            System.out.print(queArray[front++]+" ");
            if (front==maxSize) {
                front=0;
            }
        }
        System.out.println("");
        front=temp;
    }
    
    public int size(){
        return nItems;
    }
        
}
