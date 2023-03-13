/*
*Segitiga.java 08/03/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: representasi dari objek segitiga, turunan kelas poligon
*Lab: B1
*/
package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
	private double alas, tinggi;

	public Segitiga(double alas, double tinggi, int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
}

public double hitungLuas(){
	return alas*tinggi/2;
}

public void printInfo(){
      System.out.println("Bangun Segitiga bersisi "+this.getJumlahSisi());
}
}
        