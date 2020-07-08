/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Storing_object_nomer3;

/**
 *
 * @author USER
 */
class Mahasiswa{
    private long nim;
    private String nama;
    private String asal;
    
    public Mahasiswa(long nim, String nama,String asal){
        this.nim=nim;
        this.nama=nama;
        this.asal=asal;
    }
    public void displayMhs(){
        System.out.print("\tNIM: "+nim);
        System.out.print(", Nama: "+nama);
        System.out.println(", Asal: "+asal);
    }
    public long getNim(){
        return nim;
    }
}
public class DataArray {
    private Mahasiswa[] mhs;
    private int nElemen;
    
    public DataArray(int max){
        mhs=new Mahasiswa[max];
        nElemen=0;
    }
    public Mahasiswa find(long searchNim){
        int i;
        for (i = 0; i < nElemen; i++) {
            if (mhs[i].getNim()==searchNim) {
                break;
            }
        }
        if (i==nElemen) {
            return null;
        }else{
            return mhs[i];
        }
    }
    public void insert(long nim,String nama,String asal){
        mhs[nElemen]=new Mahasiswa(nim, nama, asal);
        nElemen++;
    }
    public boolean delete(long searchNim){
        int i;
        for (i = 0; i < nElemen; i++) {
            if (mhs[i].getNim()==searchNim) {
                break;
            }
        }
        if (i==nElemen) {
            return false;
        }
        else{
            for (int j = i; j < nElemen; j++) {
                mhs[j]=mhs[j+i];
            }
            nElemen--;
            return true;
        }
    }
    public void diplayArray(){
        for (int i = 0; i < nElemen; i++) {
            mhs[i].displayMhs();
        }
    }
}
