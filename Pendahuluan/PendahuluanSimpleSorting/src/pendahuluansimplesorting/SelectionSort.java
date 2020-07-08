/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendahuluansimplesorting;

/**
 *
 * @author USER
 */
public class SelectionSort {
    private int arr[];
    private int nElemen;
    
    public SelectionSort(int max){
        arr=new int[max];
        nElemen=0;
    }
    public void insert(int value){
        arr[nElemen]=value;
        nElemen++;
    }
    public void SelectionSort(){
        int awal,i, min ;
        for (awal = 0; awal < nElemen-1; awal++) {
            min=awal;
            for (i = awal+1; i < nElemen; i++) {
                if (arr[i]<arr[min]) {
                    min=i;
                }
            }
            swap(awal,min);
            for (int j = 0; j < nElemen; j++) {
                    System.out.print(arr[j]+" ");
                }
                System.out.println("");
            
        }
    }
    public void swap(int one, int two){
        int temp=arr[one];
        arr[one]=arr[two];
        arr[two]=temp;
    }
    public void display(){
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
    
}
