/*
*MBujurSangkar.java 31/03/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: kelas yang mengimplementasikan cara menghitung luas bujur sangkar
*Lab: B1
*/
import java.util.Scanner;

class MBujurSangkar{
   public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         BujurSangkar bs = new BujurSangkar();
         System.out.print("Masukkan sisi bujur sangkar: ");
         double sisi = scan.nextDouble();
         System.out.println("Luas bujur sangkar dengan sisi "+sisi+" satuan adalah "+bs.hitungLuas(sisi));
   }
}
//Praktekkan: apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada BangunDatar? jelaskan ?
   
