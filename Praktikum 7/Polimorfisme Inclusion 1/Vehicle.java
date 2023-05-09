/*
*Vehicle.java 09/05/2023
*Penulis: Lulus Dwiyan Mita 24060121120029
*Deskripsi: Program yang memuat kelas Vehicle sebagai superclass
*Lab: B1
*/
public class Vehicle{
    void calRent(int distance,float price){
        float fare=distance*price;
        System.out.println("Vehicle price = "+fare);
    }
}