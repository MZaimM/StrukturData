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
public class insert_array {
    static int insertedSort(int arr[], int n, int key, int capasity){
         if (n>=capasity) 
            return n;
        
        int i;
        for (i=n-1; (i>=0 && arr[i]>key); i--) 
            arr[i+1]=arr[i];
        
        arr[i+1]=key;
        return(n+1);
    }
    public static void main(String[] args) {
        int arr[]=new int[100];
        arr[0]=15;
        arr[1]=30;
        arr[2]=35;
        arr[3]=53;
        arr[4]=77;
        arr[5]=79;
        arr[6]=81;
        int capasity=arr.length;
        int n=7;
        int key=66;
        
        System.out.println("Sebelum insert");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("Setelah insert");
        n=insertedSort(arr, n, key, capasity);
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
}
