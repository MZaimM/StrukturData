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
public class SelectionSortApp {
    public static void main(String[] args) {
        int maxsize=100;
        SelectionSort arr;
        arr=new SelectionSort(maxsize);
        
        arr.insert(7);
        arr.insert(4);
        arr.insert(9);
        arr.insert(6);
        arr.insert(19);
        arr.insert(10);
        
        arr.display();
        arr.SelectionSort();
        arr.display();
    }
    
}
