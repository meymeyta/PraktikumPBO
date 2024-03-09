/**
 * File             : Main.java		09/03/2024
 * Nama penulis     : Meyta Rizki Khairunisa
 * NIM              : 24060122130085
 * Deskripsi        : Kelas yang berisi Main
 */

public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas anggota dan buku
        Anggota anggota1 = new Anggota("Farah");
        Buku buku1 = new Buku("Fisika Dasar");
        Buku buku2 = new Buku("Kimia Dasar");
        Buku buku3 = new Buku("Matematika Dasar");
        Buku buku4 = new Buku("Dasar Pemrograman");

        // TODO 4: Buat implementasi try-catch untuk handling exception pada saat melakukan peminjaman buku
        // Buat dua block catch: ketika anggota sudah meminjam buku lebih dari 3 dan ketika buku tidak tersedia/sudah dipinjam

        try {
            anggota1.pinjamBuku(buku1);
            anggota1.pinjamBuku(buku2);
            anggota1.pinjamBuku(buku3);
            anggota1.pinjamBuku(new Buku("Pendidikan Agama"));
        } catch (MaksimumBukuTerpinjamException exp) {
            System.out.println("Peminjaman buku gagal : " + exp.getMessage());
        } catch (BukuTidakTersediaException exp) {
            System.out.println("Peminjaman buku gagal : " + exp.getMessage());
        }
    }
}
