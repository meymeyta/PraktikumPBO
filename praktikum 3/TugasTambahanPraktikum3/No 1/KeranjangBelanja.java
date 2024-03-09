/**
 * File             : KeranjangBelanja.java		09/03/2024
 * Nama penulis     : Meyta Rizki Khairunisa
 * NIM              : 24060122130085
 * Deskripsi        : Kelas yang berisi konstruktor dan method KeranjangBelanja
 */

public class KeranjangBelanja {
    private String[] keranjang;
    private int count;

    public KeranjangBelanja() {
        keranjang = new String[5];
        count = 0;
    }

    public void addItem(String item) {
        if (count < keranjang.length) {
            keranjang[count] = item;
            count++;
        } else {
            assert false :"Keranjang sudah penuh";
        }
    }

    public void printItems() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }
}

