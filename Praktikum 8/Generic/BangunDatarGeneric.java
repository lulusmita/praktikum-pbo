/*
*BangunDatarGeneric.java 22/05/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: kelas konstruksi generic untuk BangunDatar
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

/* 
* T maupun T1 itu adalah parameter generik yang akan digunakan untuk menyatakan tipe yang akan dinyatakan 
* kemudian saat menggunakan kelas atau metode generik. Saat T diganti dengan T1 dalam kelas BangunDatarGeneric,
* kita sedang mengganti tipe parameter generik T dengan tipe baru yaitu T1. Dalam hal ini, kita mengubah kelas 
* BangunDatarGeneric menjadi kelas yang lebih spesifik untuk bekerja dengan tipe T1.
*/
