/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendahuluanrekursi;

/**
 *
 * @author USER
 */
public class ArraysApp {
    public static void main(String[] args) {
        int maksize=100;
        Arrays arr=new Arrays(maksize);
        arr.insert(4);
        arr.insert(7);
        arr.insert(2);
        arr.insert(5);
        arr.insert(3);
        arr.insert(9);
        arr.insert(10);
        arr.insert(6);
        
        arr.display();
       // arr.merge(arr, maksize, maksize, maksize);
    }
    
}
