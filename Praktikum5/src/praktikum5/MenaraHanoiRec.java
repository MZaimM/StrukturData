/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MenaraHanoiRec {
    public static void main(String[] args) {
        MenaraHanoiRec hanoi=new MenaraHanoiRec();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Jumlah cakram :");
        int cakram=scanner.nextInt();
        System.out.println("Hasil Rekursi :");
        hanoi.doMenara(cakram,'A' ,'B', 'C');
    }
    public void doMenara(int cakram, char first,char mid, char last){
        if (cakram==1) {
            System.out.println("Pindahkan cakram "+cakram+" dari "+first+" ke "+last);
        }
        else{
            doMenara(cakram-1, first, last, mid);
            System.out.println("Pindahkan cakram "+cakram+" dari "+first+" ke "+last);
            doMenara(cakram-1, mid, first, last);
        }
    }
    
}
