/**
 * File         : segitiga.java		13/03/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 * Deskripsi    : Kelas yang berisi konstruktor dan method dari segitiga
 */

package org.bangundatar;

import org.poligon.poligon;
public class segitiga extends poligon{
    private double alas,tinggi;

    public segitiga(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuasSegitiga(){
        return 0.5 * alas * tinggi;
    }

    public void printInfo(){
        System.out.println("Bangun segitiga bersisi " + this.getJumlahSisi());
    }

}
