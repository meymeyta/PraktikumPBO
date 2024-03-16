/**
 * File         : Motor.java		16/03/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 * Deskripsi    : Kelas yang berisi kontruktor dan method dari motor
 */

package org.kendaraan.motor;

import org.kendaraan.Kendaraan;

public class Motor extends Kendaraan {
    protected int cc;

    public Motor (String nama, int cc) {

        super(nama);
        this.cc = cc;
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
    public void cetakInfo() {
        System.out.println("\nJenis : Motor");
        System.out.println("CC motor : " + cc);
    }
    public double hitungHorsepower(int angka) {
        double lowerBound = cc / 17.0 * angka;
        double upperBound = cc / 15.0 * angka;
        return (lowerBound + upperBound) / 2;
    }
    public void klakson() {
        System.out.println(getNama() +" berbunyi, Womp Womp!");
    }

}
