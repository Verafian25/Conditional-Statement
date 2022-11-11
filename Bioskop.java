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
public class Bioskop {
       public static void main(String[] args) {
    String penonton;
    Scanner bioskop = new Scanner(System.in);
    
    System.out.println("Masukan kelompok umur anda");
    penonton = bioskop.nextLine();
    
    switch(penonton){
    case "anak-anak":
    System.out.println("Film Anak-anak");
    break;
    
    case "remaja":
    System.out.println("Film Remaja");
    break;
    
    case "dewasa":
    System.out.println("Film Dewasa");
    break;
   
    default :
        System.out.println("Invalid");
        
}
} 
}
