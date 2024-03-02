/**
 * File      : MLimasSegiEmpat.java		02/03/2024
 * Nama penulis   : Meyta Rizki Khairunisa
 * NIM               : 24060122130085
 * Deskripsi : Kelas yang berisi main dari LimasSegiEmpat
 */

package org.main;

import org.bangundatar.BujurSangkar;
import org.bangunruang.Kubus;
import org.bangunruang.LimasSegiEmpat;

public class MLimasSegiEmpat {
    public static void main(String[] args)
    {
        LimasSegiEmpat limasSegiEmpat = new LimasSegiEmpat(4,7);

        double luasPermukaanLimas = limasSegiEmpat.hitungLuasPermukaan();
        double volumeLimas = limasSegiEmpat.hitungVolume();

        System.out.println("Luas permukaan limas segi empat: " + luasPermukaanLimas);
        System.out.println("Volume limas segi empat: " + volumeLimas);
    }
}
