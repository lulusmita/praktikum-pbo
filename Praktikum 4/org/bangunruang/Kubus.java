/*
*Kubus.java 08/03/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: representasi dari objek kubus, dengan memanfaatkan kelas bujursangkar
*Lab: B1
*/
package org.bangunruang;

import org.bangundatar.*;

public class Kubus {

    private BujurSangkar permukaan;

    public Kubus(BujurSangkar bj){
        this.permukaan = bj;
    }

    public Kubus(){}
    
    public double hitungVolume(){
            return this.permukaan.getPanjangSisi()*this.permukaan.getPanjangSisi()*this.permukaan.getPanjangSisi();
    }

    public double hitungLuasAlas(){
            return this.permukaan.hitungLuas();
    }

}