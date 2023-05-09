/*
*Car.java 09/05/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: Program yang memuat kelas Car sebagai subclass dari kelas Vehicle
*Lab: B1
*/
public class Car extends Vehicle{
   void calRent(int jarak,float harga){
        float fare=jarak*harga;
        fare=fare-100.00f;
        System.out.println("harga sewa mobil = "+fare);
    }
}
       