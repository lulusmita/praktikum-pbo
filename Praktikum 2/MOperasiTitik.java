/*
*MOperasiTitik.java 22/02/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: kelas yang berisi program utama yang memanfaatkan kelas Titik dan OperasiTitik
*Lab: B1
*/

class MOperasiTitik{
     public static void main(String[] args){
          Titik t1;
          Titik t2;
          Titik t3;
          t1=new Titik();
          t2=new Titik();
          t3=new Titik(5.0,6.0);
          t1.setAbsis(1.0);
          t1.setOrdinat(2.0);
          t2.setAbsis(3.0);
          t2.setOrdinat(4.0);
          System.out.println("Jumlah objek titik : "+Titik.getCounterTitik());
          System.out.println("t1("+t1.getAbsis()+","+t1.getOrdinat()+")");
          System.out.println("t2("+t2.getAbsis()+","+t2.getOrdinat()+")");
          System.out.println("t3("+t3.getAbsis()+","+t3.getOrdinat()+")");
          
          OperasiTitik op =new OperasiTitik();
          Titik t4 = op.refleksiX(t1);
          System.out.println("Titik t1 setelah direfleksikan terhadap X adalah ("+t4.getAbsis()+","+t4.getOrdinat()+")");
          Titik t5 = op.refleksiY(t1);
          System.out.println("Titik t1 setelah direfleksikan terhadap Y adalah ("+t5.getAbsis()+","+t5.getOrdinat()+")");        
}
}
   
