/**
 * File         : BangunDatar.java		20/03/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 * Deskripsi    : Kelas yang berisi kontruktor dan method dari bangundatar
 */

public abstract class BangunDatar {
    protected double luas;
    public abstract double hitungLuas(double sisi);
    public void setLuas(double l) {
        luas = l;
    }

    public double getLuas() {
        return luas;
    }
}

