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
public class DataArrayApp {
    public static void main(String[] args) {
        int maxSize=100;
        DataArray arr;
        arr=new DataArray(maxSize);
        
        arr.insert(16650200, "jundi", "Malang");
        arr.insert(16650210, "Ahmad", "Sidoarjo");
        arr.insert(16650220, "Ismail", "banyuwangi");
        arr.insert(16650230, "Sofi", "Semarang");
        arr.insert(16650240, "Dinda", "Bandung");
        arr.insert(16650250, "rais", "Ambon");
        arr.insert(16650260, "halo", "surabaya");
        arr.insert(16650270, "nunung", "ponorogo");
        arr.insert(16650280, "yati", "bali");
        
        arr.diplayArray();
        
        long searchkey=16650270;
        Mahasiswa mhs=arr.find(searchkey);
        if (mhs != null ) {
            System.out.println("\nketemu");
            mhs.displayMhs();
        }else{
            System.out.println("ga ketemu"+searchkey);
        }
        
        searchkey=16650240;
        System.out.println("\nhapus nim"+searchkey);
        arr.delete(searchkey);
        
        arr.diplayArray();
    }
}
