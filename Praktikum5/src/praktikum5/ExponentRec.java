/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

/**
 *
 * @author USER
 */
public class ExponentRec {

    public static void main(String[] args) {
        ExponentRec ex=new ExponentRec();
        System.out.println("2^10 = "+ex.exponen(2, 10));
        System.out.println("3^5 = "+ex.exponen(3, 5));
        System.out.println("3^16 = "+ex.exponen(3, 16));
    }
    public int exponen (int base, int exp){
        if (exp==0) {
            return 1;
        }
        else {
         return (base*exponen(base, exp-1));
        } 
        
    }
    
}
