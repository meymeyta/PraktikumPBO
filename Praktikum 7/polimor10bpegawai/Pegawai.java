/**
 * File         : Pegawai.java		08/05/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 */

public class Pegawai {
    private String nama;
    protected int gajiPokok = 5000000;

    public Pegawai (String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji Pokok : " + gajiPokok);
    }

}
