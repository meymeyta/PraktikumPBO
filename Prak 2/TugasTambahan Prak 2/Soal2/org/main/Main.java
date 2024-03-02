/**
 * File      : Main.java		02/03/2024
 * Nama penulis   : Meyta Rizki Khairunisa
 * NIM               : 24060122130085
 * Deskripsi : Kelas yang berisi main dari Mahasiswa dan Wali Mahasiswa
 */

package org.main;

import org.mahasiswa.*;
import org.waliMahasiswa.WaliMahasiswa;


public class Main {
    public static void main(String[] args) {

        WaliMahasiswa Wali1 = new WaliMahasiswa("Zayn Malik", "987654321", "08796745221", "Jalan Durian Runtuh");
        Mahasiswa Mahasiswa1 = new Mahasiswa("Harry Styles", "123456789", "24060122120001", "Sastra Inggris", Wali1);

        Mahasiswa1.cetak();
    }
}