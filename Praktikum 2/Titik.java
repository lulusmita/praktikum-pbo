/*
*Titik.java 22/02/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: program berisi kelas Titik yang akan dimanfaatkan kelas MOperasiTitik
*Lab: B1
*/

class Titik{
      //atribut
      private Double absis;
      private Double ordinat;
      private static int counterTitik;
      //konstruktor
      public Titik(){
            counterTitik++;
      }
      public Titik(Double a,Double o){
            absis=a;
            ordinat=o;
            counterTitik++;
      }
      //metode
      public void setAbsis(Double a){
            absis=a;
      }
      public void setOrdinat(Double o){
            ordinat=o;
      }
      public Double getAbsis(){
            return absis;
      }
      public Double getOrdinat(){
            return ordinat;
      }
      public static int getCounterTitik(){
            return counterTitik;
      }    
}
