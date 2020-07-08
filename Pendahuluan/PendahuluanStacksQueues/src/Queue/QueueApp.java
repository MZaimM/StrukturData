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
public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue=new Queue(5);
        theQueue.insert("Zaim");
        theQueue.insert("Rahim");
        theQueue.insert("Dayat");
        theQueue.insert("Ferdi");
        theQueue.remove();
        theQueue.remove();
        theQueue.remove();
        theQueue.insert("alan");
        theQueue.insert("sinta");
        theQueue.insert("anam");
        theQueue.insert("amir");
        
        while(!theQueue.isEmpty()){
            String n=theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
    }
    
}
