/*
*Titik.java 22/02/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: program berisi kelas Titik yang akan dimanfaatkan kelas MTitik
*/

class Titik{
      //atribut
      Double absis;
      Double ordinat;
      static int counterTitik;
      //konstruktor
      Titik(){
            counterTitik++;
      }
      Titik(Double a,Double o){
            absis=a;
            ordinat=o;
            counterTitik++;
      }
      //metode
      void setAbsis(Double a){
            absis=a;
      }
      void setOrdinat(Double o){
            ordinat=o;
      }
      Double getAbsis(){
            return absis;
      }
      Double getOrdinat(){
            return ordinat;
      }
      static int getCounterTitik(){
            return counterTitik;
      }    
}
