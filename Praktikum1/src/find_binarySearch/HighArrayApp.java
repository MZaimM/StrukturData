/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find_binarySearch;

/**
 *
 * @author USER
 */
public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize=11;
        HighArray arr;
        arr=new HighArray(maxSize);
        
        
        arr.insert(70);
        arr.insert(80);
        arr.insert(75);
        arr.insert(55);
        arr.insert(85);
        arr.insert(25);
        arr.insert(30);
        arr.insert(00);
        arr.insert(90);
        arr.insert(40);
        
        arr.display();
        
        int key=25;
        if (arr.find(key)) {
            System.out.println(key+" ditemukan");
            
        }
        else{
            System.out.println(key+" Tidak ditemukan");
        }
        
        arr.delete(00);
        arr.delete(80);
        arr.delete(55);
        
        arr.display();
        
        arr.size();
    }
    
}
