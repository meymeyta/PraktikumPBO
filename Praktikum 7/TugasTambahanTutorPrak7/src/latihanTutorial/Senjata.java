/**
 * File         : Senjata.java		12/05/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 */

package latihanTutorial;

public class Senjata {
    private String bunyi;
    private boolean menusuk;

    public Senjata (String bunyi) {
        this.bunyi = bunyi;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public boolean isMenusuk() {
        return menusuk;
    }

    public void menembak(int jumlah) {
        for (int i = 0; i < jumlah; i++) {
            System.out.println(getBunyi());
        }
    }

    public void menusuk() {
        if (isMenusuk()) {
            System.out.println("Jleb!");
        } else {
            System.out.println("Gagal, belum pasang bayonet");
        }
    }
    public void pasangBayonet() {
        setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }

}
