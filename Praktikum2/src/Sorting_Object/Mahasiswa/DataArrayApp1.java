/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting_Object.Mahasiswa;

/**
 *
 * @author USER
 */
public class DataArrayApp1 {
    public static void main(String[] args) {
        int maxSize=100;
        DataArray1 arr;
        arr=new DataArray1(maxSize);
        
        arr.insert(16650210, "jundi", "Malang");
        arr.insert(16650200, "Ahmad", "Sidoarjo");
        arr.insert(16650240, "Ismail", "banyuwangi");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650220, "Dinda", "Bandung");
        arr.insert(16650280, "rais", "Ambon");
        arr.insert(16650270, "halo", "surabaya");
        arr.insert(16650250, "nunung", "ponorogo");
        arr.insert(16650260, "yati", "bali");
        
        System.out.println("Sebelum Urut "+arr.display());
        
        
        System.out.println("Bubble Sort "+arr.BubbleSort());
        System.out.println("SelectionSort "+arr.SelectionSort());
        System.out.println("InsertionSort "+arr.insertionSort());
        
        
    }
    
}
