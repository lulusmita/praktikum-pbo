/*
*BangunDatarGeneric.java 22/05/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: kelas abstrak untuk bangun datar
*Lab: B1
*/

public class BangunDatarGeneric<T1 extends BangunDatar>{
      private T1 bangunDatar;
      public void set(T1 tipeBangunDatar){
          bangunDatar = tipeBangunDatar;
      }
      public T1 get(){
          return bangunDatar;
      }
      public double hitungKeliling(){
          return bangunDatar.hitungKeliling();
      }
}