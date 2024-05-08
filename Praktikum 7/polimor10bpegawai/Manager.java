/**
 * File         : Manager.java		08/05/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 */

public class Manager extends Pegawai{
    private int tunjangan = 700000;

    public Manager(String nama) {
        super(nama);
    }

    public void tampilData() {
        System.out.println("Nama : " + super.getNama() + " , " + "Gaji Pokok : " + super.getGajiPokok());
        System.out.println("tunjangan : " + tunjangan);
    }

}
