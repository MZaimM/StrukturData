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
public class latihan {
    static int insertedsort(int[] arr,int n,int key,int capasity){
        if (n>=capasity) {
            return n;
        }
        int i;
        for (i = n-1;(i>=0 && arr[i]>key); i--) 
           arr[i+1]=arr[i];
        
        arr[i+1]=key;
        
        return(n+1);
        
        
    }
    public static void main(String[] args) {
        int arr[]= new int[100];
        arr[0]=15;
        arr[1]=30;
        arr[2]=45;
        arr[3]=53;
        arr[4]=77;
        arr[5]=79;
        arr[6]=81;
        int capasity=arr.length;
        int n=7;
        int key=26;
        
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("");
        n=insertedsort(arr, n, key, capasity);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
                    
    }
                
    
}
