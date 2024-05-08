/**
 * File         : Lingkaran.java		08/05/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 */

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }
    public double hitungKeliling() {
        return 2*jejari*3.14;
    }
}
