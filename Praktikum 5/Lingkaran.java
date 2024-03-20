/**
 * File         : Lingkaran.java		20/03/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 * Deskripsi    : Kelas yang berisi method dan kontruktor dari lingkaran
 */

import static java.lang.Math.PI;
class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    @Override
    public double hitungLuas() {
        return PI*jejari*jejari;
    }
}
