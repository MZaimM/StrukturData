/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendahuluansimplesorting;

/**
 *
 * @author USER
 */
public class BubbleSortApp {
    public static void main(String[] args) {
        int maxSize=100;
        BubbleSort arr;
        arr=new BubbleSort(maxSize);
        
        arr.insert(7);
        arr.insert(10);
        arr.insert(9);
        arr.insert(6);
        arr.insert(19);
        arr.insert(4);
        
        arr.display();
        arr.BubbleSort();
       
        
        arr.display();
        
    }
    
}
