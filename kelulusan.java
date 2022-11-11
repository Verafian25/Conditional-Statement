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
public class kelulusan {
        public static void main(String[] args) {
        String nama;
        int nilai;
        
        Scanner kelulusan = new Scanner(System.in);
        
        System.out.println("Masukkan nama anda");
        nama = kelulusan.nextLine();
        System.out.println("Masukkan nilai anda");
        nilai = kelulusan.nextInt();
        
        if(nilai > 90){
            System.out.println("selamat " + nama + " nilai A anda lulus" );
        }else if (nilai > 80){
            System.out.println("selamat " + nama + " nilai B anda lulus");
        }else if (nilai > 70){
            System.out.println("Maaf " + nama + " nilai C anda tidak lulus");
        }else if (nilai > 60){
            System.out.println("Maaf " + nama + " nilai D anda tidak lulus");
        }else{
            System.out.println("Maaf " + nama + " nilai E anda tidak lulus");
        }
    }
}
