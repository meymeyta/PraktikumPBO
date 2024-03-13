/**
 * File         : MPoligon.java		13/03/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 * Deskripsi    : Kelas yang berisi main dari poligon
 */

package org.main;

import org.bangundatar.*;
public class MPoligon {
    public static void main (String[] args) {
        System.out.println("BANGUN PERSEGI PANJANG");
        persegiPanjang persegi = new persegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas persegi panjang " + persegi.hitungLuas());

        System.out.println("BANGUN SEGITIGA");
        segitiga segitiga = new segitiga(8, 9, 3);
        segitiga.printInfo();
        System.out.println("Luas segitiga " + segitiga.hitungLuasSegitiga());
    }
}
