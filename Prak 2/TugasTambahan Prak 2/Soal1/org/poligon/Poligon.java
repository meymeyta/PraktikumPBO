/**
 * File      : Poligon.java		02/03/2024
 * Nama penulis   : Meyta Rizki Khairunisa
 * NIM               : 24060122130085
 * Deskripsi : Kelas yang berisi konstruktor dan method dari poligon
 */

package org.poligon;

public class Poligon
{
    protected int jumlahSisi;

    public Poligon()
    {
        this.jumlahSisi = 1;
    }

    public void setJumlahSisi(int jumlahSisi)
    {
        this.jumlahSisi = jumlahSisi;
    }

    public int getJumlahSisi()
    {
        return this.jumlahSisi;
    }
}
