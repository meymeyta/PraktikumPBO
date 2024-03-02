/**
 * File      : Bujur Sangkar.java		02/03/2024
 * Nama penulis   : Meyta Rizki Khairunisa
 * NIM               : 24060122130085
 * Deskripsi : Kelas yang berisi konstruktor dan method dari Bujur Sangkar
 */

package org.bangundatar;
import org.poligon.Poligon;

public class BujurSangkar extends Poligon
{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi)
    {
        this.jumlahSisi = 4;
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas()
    {
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi()
    {
        return this.panjangSisi;
    }
}
