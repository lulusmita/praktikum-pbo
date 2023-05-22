/*
*Lingkaran.java 22/05/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: Implementasi Lingkaran sebagai BangunDatar
*Lab: B1
*/

public class Lingkaran extends BangunDatar{
      private double jejari;
      public Lingkaran(double jejari){
            this.jejari=jejari;
      }
      public double hitungKeliling(){
            return 2*jejari*3.14;
      }

}