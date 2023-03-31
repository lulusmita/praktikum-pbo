/*
*Asersi2.java 31/03/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
*Lab: B1
*/
//class Lingkaran
class Lingkaran{
  private double jariJari;
  public Lingkaran(double jariJari){
       this.jariJari=jariJari;
  }
  public double hitungKeliling(){
       double keliling = 2*Math.PI*jariJari;
       return keliling;
  }
}
//class Asersi2
public class Asersi2{
  public static void main(String[] args){
       double jariJari=0;
       assert(jariJari>0):"jari jari tidak boleh nol!!!";
       Lingkaran l = new Lingkaran(jariJari);
       double kelilingLingkaran = l.hitungKeliling();
       System.out.println("Keliling lingkaran = "+kelilingLingkaran);
   }
}
//secara konsep, ada yang kurang tepat pada program Asersi2 di atas?

//Secara konsep, program Asersi2 di atas sudah cukup tepat. Namun, ada satu hal yang perlu diperhatikan, yaitu asersi yang digunakan.
//Pada baris assert(jariJari>0):"jari jari tidak boleh nol!!!";, asersi tersebut memeriksa apakah nilai jari-jari lebih besar dari nol. 
//Sebenarnya, jari-jari pada program tersebut memiliki nilai awal 0, sehingga asersi tersebut akan selalu menghasilkan false. 
//Sebaiknya, nilai awal jari-jari diberikan nilai yang lebih besar dari nol, misalnya 1, sehingga asersi tersebut bisa berfungsi dengan benar. 
