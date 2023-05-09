/*
*PegawaiDanGaji.java 09/05/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: Program driver class untuk Pegawai,Manajer,Programmer,dan Payroll
*Lab: B1
*/
public class PegawaiDanGaji{
    public static void main(String[] args){
         Pegawai pegawai = new Programmer("Mira");
         Pegawai pegawai2 = new Manajer("Joko");
         Pegawai pegawai3 = new Manajer("Argo");

         Payroll payroll = new Payroll();
         payroll.cetakGaji(pegawai);
         payroll.cetakGaji(pegawai2);
         payroll.cetakGaji(pegawai3);
      }
}