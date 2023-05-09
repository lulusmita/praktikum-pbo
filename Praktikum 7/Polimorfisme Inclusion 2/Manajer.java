/*
*Manajer.java 09/05/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: Program yang memuat kelas Manajer sebagai subclass dari kelas Pegawai
*Lab: B1
*/
public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
           setNama(nama);
    }
    
    public void tampilData(){
           super.tampilData();
           System.out.println("\nTunjangan : "+tunjangan);       
    }
}