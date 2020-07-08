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
public class DataArray1 {
    private Mahasiswa mhs[];
    private int nElemen;
    
    public DataArray1(int max){
        mhs=new Mahasiswa[max];
        nElemen=0;
    }
    public void insert(long nim,String nama, String asal){
        mhs[nElemen]=new Mahasiswa(nim, nama, asal);
        nElemen++;
    }
    public double BubbleSort(){
        int batas, i;
        for (batas = nElemen-1 ; batas >0; batas--) {
            for (i = 0; i < batas; i++) {
                if (mhs[i].getNIM()> mhs[i+1].getNIM()) {
                    swap(i,i+1);
                }
            }
        }System.out.println("");
        display();
        return 0;    
    }
    public double SelectionSort(){
        int awal,i, min;
        for ( awal = 0; awal < nElemen-1; awal++) {
            min=awal;
            for (i = awal; i < nElemen; i++) {
                if (mhs[i].getNIM()<mhs[min].getNIM()) {
                    min=i;
                }
            }
            swap(awal,min);
        }
        System.out.println("");
        display();
        return 0;
    }
    public double insertionSort(){
        int i, curIn;
        
        for (curIn = 1;  curIn< nElemen; curIn++) {
            Mahasiswa tukar=mhs[curIn];
            i=curIn;
            while(i>0 && mhs[i-1].getNIM()>= tukar.getNIM()){
                mhs[i]=mhs[i-1];
                i--;
            }
            mhs[i]=tukar;
        }
        System.out.println("");
        display();
        return 0;
    }
    public void swap(int one, int two){
        Mahasiswa temp;
        temp=mhs[one];
        mhs[one]=mhs[two];
        mhs[two]=temp;
        
    }
    public double display(){
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
        System.out.println("");
        return 0;
    }
    
}
