/**
 * File      : SegitigaSamaSisi.java		02/03/2024
 * Nama penulis   : Meyta Rizki Khairunisa
 * NIM               : 24060122130085
 * Deskripsi : Kelas yang berisi konstruktor dan method dari SegitigaSamaSisi
 */

package org.bangundatar;
import org.poligon.Poligon;

public class SegitigaSamaSisi extends Poligon
{
    private double panjangSisi;


    public SegitigaSamaSisi(double panjangSisi)
    {
        this.jumlahSisi = 3;
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas()
    {

        return  (Math.sqrt(3) / 4) * panjangSisi * panjangSisi;
    }

    public double getPanjangSisi()
    {

        return this.panjangSisi;
    }
}

