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