/**
 * File         : MBujurSangkar.java		20/03/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 * Deskripsi    : Kelas yang berisi main dari bujur sangkar
 */

import java.util.Scanner;

public class MBujurSangkar {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}
