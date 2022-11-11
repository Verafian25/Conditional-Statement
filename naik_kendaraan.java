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
public class naik_kendaraan {
    public static void main(String[] args) {
    String kendaraan;
    Scanner transportasi = new Scanner(System.in);
    
    System.out.println("Masukan jumlah penumpang");
    kendaraan = transportasi.nextLine();
    
    switch(kendaraan){
    case "1 orang":
    System.out.println("sepeda ontel");
    break;
    
    case "2 orang":
    System.out.println("sepeda motor");
    break;
    
    case "3 orang":
    System.out.println("becak");
    break;
    
    case "4 orang":
    System.out.println("mobil");
    break;
    
    default :
        System.out.println("bus");
        
}
} 
}
