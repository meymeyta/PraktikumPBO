/**
 * File         : BangunDatarGeneric.java		08/05/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 */

public class BangunDatarGeneric<T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }
    public T get() {
        return bangunDatar;
    }
    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }
}