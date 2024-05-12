/**
 * File         : Senjata.java		12/05/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 */

package latihanVeryEasy;

public class Senjata {

    private String bunyi;
    private int peluru;
    public Senjata (String bunyi) {
        this.bunyi = bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void menembak(int jumlah){
        for(int i = 0; i < jumlah; i++){
            if(getPeluru() > 0){
                System.out.println(getBunyi() + " ");
                setPeluru(getPeluru()-1);
            }
        }
        System.out.println("Sisa Peluru: " + getPeluru());
    }
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        if(peluru < 0) {
            peluru = 0;
        }
        this.peluru = peluru;
    }


}
