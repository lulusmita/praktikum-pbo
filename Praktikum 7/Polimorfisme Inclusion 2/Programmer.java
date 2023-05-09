/*
*Programmer.java 09/05/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: Program yang memuat kelas Programmer sebagai subclass dari kelas Pegawai
*Lab: B1
*/
public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
           setNama(nama);
    }

    public void tampilData(){
           super.tampilData();
           System.out.println("\nBonus : "+bonus);       
    }
}