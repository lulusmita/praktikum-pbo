class Titik{
      Double absis;
      Double ordinat;
      static int counterTitik;
      Titik(){
            counterTitik++;
      }
      Titik(Double a,Double o){
            absis=a;
            ordinat=o;
            counterTitik++;
      }
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