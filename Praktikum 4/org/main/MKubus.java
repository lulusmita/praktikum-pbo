/*
*MKubus.java 08/03/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: driver kelas untuk poligon, bujur sangkar, dan kubus
*Lab: B1
*/

package org.main;

import org.bangundatar.BujurSangkar;

import org.bangunruang.Kubus;

public class MKubus{
	public static void main(String[] args){
                BujurSangkar permukaanKubus = new BujurSangkar(4);
                Kubus cube = new Kubus(permukaanKubus);
                System.out.printf("Volume kubus: %f\n",cube.hitungVolume());
                System.out.printf("Luas alas kubus: %f\n",cube.hitungLuasAlas());
	}
}