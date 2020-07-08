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
public class InsertionSort {
    private int arr[];
    private int nElemen;
    
    public InsertionSort(int max){
        arr=new int[100];
        nElemen=0;
    }
    public void insert(int value){
        arr[nElemen]=value;
        nElemen++;
    }
    public void InsertionSort(){
        int i,curIn;
        for (curIn = 1; curIn < nElemen; curIn++) {
            int temp=arr[curIn];
            i=curIn;
            
            while(i>0 && arr[i-1]>=temp){
                arr[i]=arr[i-1];
                for (int j = 0; j < nElemen; j++) {
                    System.out.print(arr[j]+" ");
                }
                System.out.println("");
                i--;
            }
            arr[i]=temp;
            System.out.println("");
            for (int j = 0; j < nElemen; j++) {
                    System.out.print(arr[j]+" ");
                }
                System.out.println("");
        }
        
    }
    public void display(){
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
}
