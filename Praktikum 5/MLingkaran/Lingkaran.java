/*
*Lingkaran.java 31/03/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: kelas implementasi IArea berupa cara menghitung luas lingkaran
*Lab: B1
*/
//mengambil konstanta yang ada di kelas java.lang.Math

import static java.lang.Math.PI;

public class Lingkaran implements IArea{
     private double jejari;
     public Lingkaran(double r){
        jejari=r;
     }
     public double hitungLuas(){
        return PI*jejari*jejari;
     }
}