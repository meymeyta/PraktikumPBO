/**
 * File             : Buku.java		09/03/2024
 * Nama penulis     : Meyta Rizki Khairunisa
 * NIM              : 24060122130085
 * Deskripsi        : Kelas yang berisi konstruktor dan method Buku
 */

public class Buku {
    private String judul;
    private boolean tersedia;

    public Buku(String judul) {
        this.judul = judul;
        tersedia = true;
    }

    public String getJudul() {
        return judul;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

}

