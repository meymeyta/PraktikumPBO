/**
 * File      : LimasSegiEmpat.java		02/03/2024
 * Nama penulis   : Meyta Rizki Khairunisa
 * NIM               : 24060122130085
 * Deskripsi : Kelas yang berisi konstruktor dan method dari LimasSegiEmpat
 */

package org.bangunruang;
import org.bangundatar.SegitigaSamaSisi;

public class LimasSegiEmpat {
    private double alasPersegi;
    private double tinggiSegitiga;

    public LimasSegiEmpat(double alasPersegi, double tinggiSegitiga){
        this.alasPersegi=alasPersegi;
        this.tinggiSegitiga=tinggiSegitiga;
    }
    public double hitungLuasPermukaan(){
        SegitigaSamaSisi segitiga = new SegitigaSamaSisi(alasPersegi);
        double luasAlas = alasPersegi * alasPersegi;
        double luasSegitiga = segitiga.hitungLuas();
        return luasAlas + 4 * luasSegitiga;
    }

    public double hitungVolume(){
    double luasAlas = alasPersegi * alasPersegi;
    return (luasAlas * tinggiSegitiga)/3;
    }
}
