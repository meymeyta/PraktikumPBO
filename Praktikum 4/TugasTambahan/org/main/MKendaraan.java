/**
 * File         : MKendaraan.java		16/03/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 * Deskripsi    : Kelas yang berisi main dari Kendaraan
 */

package org.main;
import org.kendaraan.*;
import org.kendaraan.mobil.Mobil;
import org.kendaraan.truk.Truk;
import org.kendaraan.motor.Motor;


public class MKendaraan {
    public static void main(String[] args)
    {
        Kendaraan kendaraan1 = new Kendaraan("Skuter Matic");
        Mobil mobil1 = new Mobil("Alphard",4);
        Motor motor1 = new Motor("Vario", 5000);
        Truk truk1 = new Truk("Truk Tronton", 10000, 1250);

        //Kelas Kendaraan
        kendaraan1.setKecepatan(100);
        kendaraan1.cetakInfo();
        kendaraan1.gas(50, 6);
        System.out.println("Setelah set kecepatan 50 dengan durasi 6");
        kendaraan1.cetakInfo();
        kendaraan1.berhenti();
        System.out.println("Setelah set berhenti");
        kendaraan1.cetakInfo();
        kendaraan1.klakson();

        //Kelas Mobil
        mobil1.cetakInfo();
        mobil1.bukaPintu(2);
        mobil1.klakson();

        //Kelas Motor
        motor1.cetakInfo();
        double horsepower15 = motor1.hitungHorsepower(15);
        double horsepower16 = motor1.hitungHorsepower(16);
        double horsepower17 = motor1.hitungHorsepower(17);
        System.out.println("Motor 1 diperkirakan memiliki tenaga antara " + horsepower17 + " sampai " + horsepower15 + " HP");
        System.out.println("Motor 1 diperkirakan memiliki tenaga " + horsepower16 + " HP dengan " + horsepower17 + " sebagai batas bawah dan " + horsepower15 + " sebagai batas atas interval");
        motor1.klakson();

        //Kelas Truk
        truk1.cetakInfo();
        truk1.muatBarang(5000);
        System.out.println("Setelah ditambah muat barang sebesar 5000");
        truk1.cetakInfo();
        truk1.klakson();
    }
}
