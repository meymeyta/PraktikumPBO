/**
 * File         : persegiPanjang.java		13/03/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 * Deskripsi    : Kelas yang berisi konstruktor dan method dari persegiPanjang
 */

package org.bangundatar;

import org.poligon.poligon;

public class persegiPanjang extends poligon{
    private double panjang,lebar;

    public persegiPanjang(double panjang, double lebar, int jumlahSisi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }
    public void printInfo() {
        System.out.println("Bangun persegi panjang bersisi " + this.getJumlahSisi());
    }
}
