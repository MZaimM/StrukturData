/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting_String;

import Sorting_Object.Mahasiswa.*;

/**
 *
 * @author USER
 */
public class DataArrayApp2 {
    public static void main(String[] args) {
        int maxSize=100;
        DataArray2 arr;
        arr=new DataArray2(maxSize);
        
        arr.insert(16650210, "jundi", "Malang");
        arr.insert(16650200, "Ahmad", "Sidoarjo");
        arr.insert(16650240, "Ismail", "banyuwangi");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650220, "Dinda", "Bandung");
        arr.insert(16650280, "rais", "Ambon");
        arr.insert(16650270, "halo", "surabaya");
        arr.insert(16650250, "nunung", "ponorogo");
        arr.insert(16650260, "yati", "bali");
        
        arr.display();
        System.out.println("");
        arr.insertionSortNama();
        arr.insertionSortAsal();
        
       
        
        
      
        
        
    }
    
}
