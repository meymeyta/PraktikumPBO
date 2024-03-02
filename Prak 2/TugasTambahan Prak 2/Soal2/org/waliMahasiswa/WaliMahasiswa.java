/**
 * File      : Mahasiswa.java		02/03/2024
 * Nama penulis   : Meyta Rizki Khairunisa
 * NIM               : 24060122130085
 * Deskripsi : Kelas yang berisi konstruktor dan method dari Wali Mahasiswa
 */

package org.waliMahasiswa;

public class WaliMahasiswa {

    private  String namaWali;

    private  String nikWali;
    private String nomorHP;
    private String alamat;

    public WaliMahasiswa(String namaWali, String nikWali, String nomorHP, String alamat){
        this.namaWali = namaWali;
        this.nikWali = nikWali;
        this.nomorHP = nomorHP;
        this.alamat = alamat;
    }

    public String getNamaWali() {
        return namaWali;
    }

    public String getNikWali() {
        return nikWali;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNamaWali(String namaWali) {
        this.namaWali = namaWali;
    }

    public void setNikWali(String nikWali) {
        this.nikWali = nikWali;
    }

    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void cetak1(){
        System.out.println("Nama Wali : " + namaWali);
        System.out.println("NIK Wali : " + nikWali);
        System.out.println("Nomor HP Wali : " + nomorHP);
        System.out.println("Alamat Wali : " + alamat);
    }
}
