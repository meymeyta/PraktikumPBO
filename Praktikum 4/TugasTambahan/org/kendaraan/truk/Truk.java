/**
 * File         : Truk.java		16/03/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 * Deskripsi    : Kelas yang berisi kontruktor dan method dari truk
 */

package org.kendaraan.truk;

import org.kendaraan.Kendaraan;

public class Truk extends Kendaraan {
    protected int kapasitasMuatan;
    protected int beratMuatan;

    public Truk (String nama, int kapasitasMuatan, int beratMuatan) {
        super(nama);
        this.kapasitasMuatan = kapasitasMuatan;
        this.beratMuatan = beratMuatan;
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }

    public int getBeratMuatan() {
        return beratMuatan;
    }

    public void setKapasitasMuatan(int kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public void setBeratMuatan(int beratMuatan) {
        this.beratMuatan = beratMuatan;
    }

    public void cetakInfo() {
        System.out.println("\nJenis : Truk");
        System.out.println("Kapasitas Muatan : " + kapasitasMuatan);
        System.out.println("Berat Muatan : " + beratMuatan);
    }
    public void muatBarang(int berat) {
        if(beratMuatan + berat > kapasitasMuatan){
            System.out.println("Kapasitas sudah penuh");
        }
        else {
            beratMuatan += berat;
        }
    }
    public void klakson() {
        System.out.println(getNama() + " berbunyi, Honk Honk!");
    }
}
