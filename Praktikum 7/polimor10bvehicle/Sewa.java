/**
 * File         : Sewa.java		08/05/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 */

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50,1000);
        mobil.calRent(50,1000);
        bis.calRent(50, 1000);
    }
}
