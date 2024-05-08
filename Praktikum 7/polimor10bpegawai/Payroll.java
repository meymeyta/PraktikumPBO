/**
 * File         : Payroll.java		08/05/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 */

public class Payroll {
    private Pegawai p;

    public void cetakGaji(Pegawai p) {
        this.p = p;
        p.tampilData();
    }
}
