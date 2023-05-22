/*
*BangunDatarGenericTest.java 22/05/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: main class untuk generic bangun datar
*Lab: B1
*/

public class BangunDatarGenericTest{
     public static void main(String[] args){
          Lingkaran l = new Lingkaran(2);
          BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
          bdg.set(1);
          System.out.println("keliling lingkaran : "+bdg.hitungKeliling());
          System.out.println("tipe generic : "+bdg.get().getClass().getName());
     }
}