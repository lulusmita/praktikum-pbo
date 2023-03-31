/*
*AngkaSial.java 31/03/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: Program penggunaan exception buatan sendiri. Pengenalan klausa 'throw' dan 'throws'
*Lab: B1
*/
public class AngkaSial{
      public void cobaAngka(int angka) throws AngkaSialException {
            if (angka==13) {
               throw new AngkaSialException();
            }
            System.out.println(angka+" bukan angka sial");
      }
      public static void main(String[] args){
           AngkaSial as = new AngkaSial();
           try{
               as.cobaAngka(10);
               as.cobaAngka(13);
               as.cobaAngka(12);
           } catch(AngkaSialException ase) {
               //method getMessage() telah ada pada kelas "Exception"
               System.out.println(ase.getMessage());
               System.out.println("hati-hati memasukkan angka!!!");
           }
      }
  }

//Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?

//Jika terjadi eksepsi pada baris as.cobaAngka(13);, maka baris System.out.println(angka+" bukan angka sial");
// pada method cobaAngka() tidak akan dieksekusi. Ketika baris throw new AngkaSialException(); 
//dijalankan, program akan langsung melompat ke bagian catch pada method main(), 
//dan baris-baris di dalam blok try yang tersisa tidak akan dieksekusi. Sehingga, baris System.out.println(angka+" bukan angka sial");
// pada method cobaAngka() tidak akan dijalankan ketika terjadi eksepsi.

//Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

//Jika terjadi eksepsi pada saat menjalankan baris as.cobaAngka(13);, maka program akan mengeksekusi blok catch pada method main()
// pada baris } catch(AngkaSialException ase) {. Blok catch akan menangkap objek AngkaSialException yang dilemparkan oleh baris
// throw new AngkaSialException(); pada method cobaAngka(). Setelah itu, program akan mengeksekusi baris-baris yang ada
// di dalam blok catch. Jadi, jawabannya adalah ya, baris catch pada AngkaSial.java di atas akan dieksekusi ketika terjadi eksepsi.

  