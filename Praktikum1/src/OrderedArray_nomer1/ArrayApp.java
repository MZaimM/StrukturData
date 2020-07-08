/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderedArray_nomer1;

/**
 *
 * @author USER
 */
public class ArrayApp {
    public static void main(String[] args) {
        int max=20;
        Array arr;
        arr=new Array(max);
        
        arr.insert(15);
        arr.insert(30);
        arr.insert(45);
        arr.insert(53);
        arr.insert(77);
        arr.insert(79);
        arr.insert(81);
        
        
        
        
        arr.display();
        arr.insertedSort(66);
        arr.display();
        
    }
    
}
