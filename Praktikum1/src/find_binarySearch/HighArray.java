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

public class HighArray {
    private int[] arr;
    private int nElemen;
    
    public HighArray(int max){
        arr=new int[max];
        nElemen=0;
    }
    
    public void insert(int value){
        arr[nElemen]=value;
        nElemen++;
    }
    public boolean find(int key){
        int start,med,end;
        start=0;
        end=arr.length-1;
        while(start<end){
            med=(start+end)/2;
            if (arr[med]==key) {
                return true;
                
            }
            else if (arr[med]<key) {
                start=med+1;
                
            }
            else{
                end=med-1;
            }
           
        }return false;
      
                    
        
        
    }
    
    public boolean delete(int value){
        int i;
        for ( i = 0; i < nElemen; i++) {
            if (value==arr[i]) {
                break;
                
            }
            
        }
        if (i==nElemen) {
            return false;
            
        }else{
            for (int j = i; j < nElemen; j++) {
                arr[j]=arr[j+1];
                
            }
            nElemen--;
            return true;
        }
    }
    public void display(){
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
            
        }
    public double size(){
        int jumlah_elemen = 0;
        for (int i = 0; i < nElemen; i++) {
            jumlah_elemen +=arr[i];           
        }
        System.out.println("Jumlah = "+jumlah_elemen);
        return jumlah_elemen;
    }
    
    
    
}


