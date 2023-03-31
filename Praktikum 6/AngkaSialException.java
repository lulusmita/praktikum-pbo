/*
*AngkaSialException.java 31/03/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: Eksepsi buatan sendiri, menolak masukan angka 13!
*Lab: B1
*/
public class AngkaSialException extends Exception{
    public AngkaSialException(){
         super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}