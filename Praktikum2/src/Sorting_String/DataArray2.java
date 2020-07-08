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
public class DataArray2 {
    private Mahasiswa mhs[];
    private int nElemen;
    
    public DataArray2(int max){
        mhs=new Mahasiswa[max];
        nElemen=0;
    }
    public void insert(long nim,String nama, String asal){
        mhs[nElemen]=new Mahasiswa(nim, nama, asal);
        nElemen++;
    }
   public void insertionSortNama(){
       System.out.println("Urut sesuai nama :");
       int i;
       int curIn;
       
       for (curIn = 1;  curIn< nElemen; curIn++) {
           Mahasiswa temp=mhs[curIn];
           i=curIn;
           while(i>0 && mhs[i-1].getNama().compareToIgnoreCase(temp.getNama())>0){
               mhs[i]=mhs[i-1];
               i--;
           }
           mhs[i]=temp;
       }
       display();
       
   }
   public void insertionSortAsal(){
       System.out.println("Urut sesuai Asal :");
       int i,curIn;
       for (curIn = 1; curIn < nElemen; curIn++) {
           Mahasiswa temp=mhs[curIn];
           i=curIn;
           while(i>0 && mhs[i-1].getAsal().compareToIgnoreCase(temp.getAsal())>0){
               mhs[i]=mhs[i-1];
               i--;
           }
           mhs[i]=temp;
       }
       display();
   }
   
    public void display(){
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
        //System.out.println("\n"+mhs[2].getNama().compareTo(mhs[3].getNama()));
        
    }
    
}
