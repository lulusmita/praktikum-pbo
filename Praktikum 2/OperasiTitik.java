/*
*OperasiTitik.java 1/03/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: kelas yang berisi program untuk operasi titik
*Lab: B1
*/

class OperasiTitik{
        private void refleksisumbuX(Titik titik){
                Double ordinat = titik.getOrdinat();
                titik.setOrdinat(-1*ordinat);
       }
        private void refleksisumbuY(Titik titik){
                Double absis = titik.getAbsis();
                titik.setAbsis(-1*absis);
       }
       public Titik refleksiX(Titik t){
                Titik t4 =new Titik(t.getAbsis(),t.getOrdinat());
                refleksisumbuX(t4);
                return t4;
       }
       public Titik refleksiY(Titik t){
              Titik t4=new Titik(t.getAbsis(),t.getOrdinat());
              refleksisumbuY(t4);
              return t4;
}
       
}
