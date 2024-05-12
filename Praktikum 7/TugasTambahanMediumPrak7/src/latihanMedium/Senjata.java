/**
 * File         : Senjata.java		12/05/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 */

package latihanMedium;

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        if(peluru < 0){
            peluru = 0;
        }
        this.peluru = peluru;
    }

    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

    public boolean isMenusuk(){
        return menusuk;
    }

    public String getBunyi(){
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }
}
