/*
*MLingkaran.java 31/03/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: implementasi cara menghitung luas lingkaran
*Lab: B1
*/

import java.util.Scanner;

public class MLingkaran{
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan"+" jejari "+jejari+" satuan adalah "+l.hitungLuas());
     }
}