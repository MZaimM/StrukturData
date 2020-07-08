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
public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue=new Queue(4);
        System.out.println(">>beberapa mulai mengantri");
        theQueue.insert("Andi");
        theQueue.insert("Ahmad");
        theQueue.insert("Satria");
        theQueue.insert("Afrizal");
        theQueue.insert("Sukran");
        theQueue.insert("Mahmud");
        
        System.out.println("");
        System.out.println(">>isi Antrian");
        theQueue.display();
        
        
        System.out.println("\n\n>>satu persatu keluar antrian");
        System.out.println(theQueue.remove()+" Keluar antrian");
        
        theQueue.display();
        
        System.out.println("\n");
        System.out.println(theQueue.remove()+" Keluar antrian");
        theQueue.display();
        
        System.out.println("\n");
        System.out.println(theQueue.remove()+" Keluar antrian");
        theQueue.display();
        
        System.out.println("\n");
        System.out.println(theQueue.remove()+" Keluar antrian");
        theQueue.display();
        
        
        
        
       
        
        
        
    }
    
}
