/*
*Pegawai.java 09/05/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: Program yang memuat kelas Pegawai sebagai superclass
*Lab: B1
*/
public class Pegawai{
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
            this.nama = nama;
    }
    public void tampilData(){
            System.out.printf("Nama : %s, Gaji pokok : %d",nama,gajiPokok);
    }
}