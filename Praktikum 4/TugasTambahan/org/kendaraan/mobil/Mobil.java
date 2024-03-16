/**
 * File         : Mobil.java		16/03/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 * Deskripsi    : Kelas yang berisi kontruktor dan method dari mobil
 */

package org.kendaraan.mobil;

import org.kendaraan.Kendaraan;

public class Mobil extends Kendaraan {
    protected int jumlahPintu;

    // Constructor
    public Mobil(String nama, int jumlahPintu) {
        super(nama);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    public void cetakInfo() {
        System.out.println("\nJenis : Mobil");
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }


    public void bukaPintu(int nomorPintu) {
        System.out.println("Pintu mobil ke - " + nomorPintu + " terbuka");
    }


    public void klakson() {
        System.out.println(getNama() + " berbunyi, Vroom Vroom!");
    }
}

