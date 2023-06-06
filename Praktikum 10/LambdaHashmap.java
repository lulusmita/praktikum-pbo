/*
*LambdaHashmap.java 06/06/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: Program untuk menampilkan key dan value dari sebuah Map
*Lab: B1
*/
import java.util.*;

public class LambdaHashmap{
    public static void main(String[] args){
        //Membuat HashMap
        Map<String, String> mahasiswaList = new HashMap<String, String>();
        //Memberi Nilai
        mahasiswaList.put("24060121120029","Lulus");
        mahasiswaList.put("24060119120029","Dwiyan");
        mahasiswaList.put("24060120120001","Mita");
        mahasiswaList.forEach((key,value)->System.out.println("Nim: "+key+" Nama: "+value));
    }
}