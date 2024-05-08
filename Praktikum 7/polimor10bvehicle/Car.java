/**
 * File         : Car.java		08/05/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 */

public class Car extends Vehicle {
    void calRent(int jarak, float harga) {
        float fare = jarak*harga;
        fare=fare-100.00f;
        System.out.println("harga sewa mobil = " + fare);
    }
}
