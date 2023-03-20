/*
*BujurSangkar.java 15/03/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: representasi dari objek bujur sangkar, turunan kelas poligon
*Lab: B1
*/
package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;


	public BujurSangkar(double panjangSisi){
		super();
		super.setJumlahSisi(4);
		this.panjangSisi = panjangSisi;
    }

public double hitungLuas(){
	return this.panjangSisi*this.panjangSisi;
}

public double getPanjangSisi(){
    return this.panjangSisi;
}


}
        
