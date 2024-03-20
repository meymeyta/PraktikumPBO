/**
 * File         : MLingkaran.java		20/03/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 * Deskripsi    : Kelas yang berisi main dari Lingkaran
 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan jejari : ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " adalah " + l.hitungLuas());
    }
}
