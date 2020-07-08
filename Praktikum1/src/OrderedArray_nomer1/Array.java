/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrderedArray_nomer1;
import java.util.Arrays;

/**
 *
 * @author USER
 */
public class Array {
    private int[]arr;
    private int nElemen;
    
    public Array(int max){
        arr=new int[max];
        nElemen=0;
    }

    public void insert(int value){
        arr[nElemen]=value;
        nElemen++;
    }
    
    public int insertedSort(int key){
        
        int capasity= arr.length;
        int n=nElemen++;
        
        if (n>=capasity) 
            return n;
        
        int i;
        for (i=n-1; (i>=0 && arr[i]>key); i--) 
            arr[i+1]=arr[i];
        
        arr[i+1]=key;
        return(n+1);
        
    }
    
    public void display(){
      
        for (int i = 0; i <nElemen ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }

    
    
}
