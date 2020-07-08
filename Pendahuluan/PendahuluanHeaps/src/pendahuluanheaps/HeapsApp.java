/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendahuluanheaps;

/**
 *
 * @author USER
 */
public class HeapsApp {
    public static void main(String[] args) {
        int size=35;
        Heap theHeap=new Heap(size);
        
        theHeap.insert(100);
        theHeap.insert(90);
        theHeap.insert(80);
        theHeap.insert(30);
        theHeap.insert(60);
        theHeap.insert(50);
        theHeap.insert(70);
        theHeap.insert(20);
        theHeap.insert(10);
        theHeap.insert(40);
        theHeap.insert(55);
        theHeap.insert(45);
        
        System.out.println("Sebelum Perubahan Key :");
        theHeap.displayHeap();
        
        System.out.println("Setelah perubahan Key :");
        theHeap.change(4, 120);
        theHeap.displayHeap();
    }
    
}
