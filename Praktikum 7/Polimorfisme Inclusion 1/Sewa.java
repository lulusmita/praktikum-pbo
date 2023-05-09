/*
*Sewa.java 09/05/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: Program driver class untuk Vehicle,Car,dan Bus
*Lab: B1
*/
public class Sewa{
    public static void main(String[] args){
          Vehicle kendaraan = new Vehicle();
          Vehicle mobil = new Car();
          Vehicle bis = new Bus();
          kendaraan.calRent(50,1000);
          mobil.calRent(50,1000);
          bis.calRent(50,1000);
      }
}