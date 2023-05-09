/*
*PolimorfismeCoercien.java 09/05/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: Program yang menggunakan polimorfisme coercien 
*Lab: B1
*/
public class PolimorfismeCoercien{

    public static int kuadrat(int bilangan){
         return bilangan*bilangan;
    }

    public static void main(String[] args){
         //deklarasi objek integer
         Integer bilangan = 10;

         //objek integer 'dipaksa' untuk diubah menjadi primitif
         int hasilKuadrat = kuadrat(bilangan);

         System.out.printf("Hasil kuadrat %d adalah %d",bilangan,hasilKuadrat);
   }
}