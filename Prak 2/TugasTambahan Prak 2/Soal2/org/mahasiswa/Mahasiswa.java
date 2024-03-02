/**
 * File      : Mahasiswa.java		02/03/2024
 * Nama penulis   : Meyta Rizki Khairunisa
 * NIM               : 24060122130085
 * Deskripsi : Kelas yang berisi konstruktor dan method dari Mahasiswa
 */

package org.mahasiswa;

import org.waliMahasiswa.WaliMahasiswa;

public class Mahasiswa {

    private String namaMhs;

    private String nikMhs;
    private String nim;

    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa (String namaMhs, String nikMhs, String nim, String jurusan, WaliMahasiswa wali){
        this.namaMhs = namaMhs;
        this.nikMhs = nikMhs;
        this.jurusan = jurusan;
        this.nim = nim;
        this.wali = wali;
    }

    public String getNamaMhs() {
        return namaMhs;
    }

    public String getNikMhs() {
        return nikMhs;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getNim() {
        return nim;
    }

    public WaliMahasiswa getWali() {
        return wali;
    }

    public void setNamaMhs(String namaMhs) {
        this.namaMhs = namaMhs;
    }

    public void setNik(String nikMhs) {
        this.nikMhs = nikMhs;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }

    WaliMahasiswa waliMhs = new WaliMahasiswa("Zayn Malik", "987654321", "08796745221", "Jalan Durian Runtuh");
    public void cetak(){
        System.out.println("Nama Mahasiswa : " + namaMhs);
        System.out.println("NIK Mahasiswa : " + nikMhs);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("\nData Wali Mahasiswa ");
        waliMhs.cetak1();

    }
}
