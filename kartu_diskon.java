/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author HP 240 G8
 */
public class kartu_diskon {
        public static void main(String[] args) {
        int harga;
        int diskon;
        int total;
        
        Scanner belanja = new Scanner(System.in);
        
        System.out.println("Masukkan harga belanja anda");
        harga = belanja.nextInt();
        
        if(harga > 500000){
            diskon = harga - 75000;
            System.out.println("mendapat diskon Rp.10.000" );
            System.out.println("total belanja anda adalah " + diskon);
        }else if (harga > 300000){
            diskon = harga - 50000;
            System.out.println("mendapat diskon Rp.20.000" );
            System.out.println("total belanja anda adalah " + diskon);
        }else if (harga > 150000){
            diskon = harga - 20000;
            System.out.println("mendapat diskon Rp.50.000" );
            System.out.println("total belanja anda adalah " + diskon);
        }else if (harga > 100000){
            System.out.println( " mendapat diskon Rp.75.000");
            diskon = harga - 10000;
            System.out.println("mendapat diskon Rp.75.000" );
            System.out.println("total belanja anda adalah " + diskon);
        }else{
            System.out.println("Anda tidak mendapatkan diskon");
        }
    }
}
