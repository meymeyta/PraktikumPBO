/**
 * File         : Kendaraan.java		16/03/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 * Deskripsi    : Kelas yang berisi kontruktor dan method dari kendaraan
 */

package org.kendaraan;
public class Kendaraan {
    protected int kecepatan;

    private String nama;


    public Kendaraan (String nama) {

        this.nama = nama;
    }
    public String getNama() {

        return nama;
    }

    public int getKecepatan() {

        return kecepatan;
    }

    public void setNama(String nama) {

        this.nama = nama;
    }

    public void setKecepatan(int kecepatan) {

        this.kecepatan = kecepatan;
    }

    public void cetakInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Jenis : kendaraan ");
        System.out.println("Kecepatan : "+ kecepatan);
    }


    public void gas(int kecepatan, int durasi) {

        this.kecepatan += kecepatan * durasi;
    }
    public void berhenti() {
        this.kecepatan = 0;
    }
    public void klakson() {
        System.out.println(nama +" berbunyi");
    }



}
