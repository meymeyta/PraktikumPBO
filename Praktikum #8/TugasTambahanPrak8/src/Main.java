/**
 * File         : Main.java		12/05/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 */

public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();

        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();

        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}