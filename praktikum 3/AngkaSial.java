public class AngkaSial {
    public void cobaAngka(int angka ) throws AngkaSialException {
        if(angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati - hati memasukkan angka");
        }
    }
}
//PERTANYAAN:
//a. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
//b. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

//JAWABAN :
//a. Pada input pertama, baris ke 12 akan dieksekusi karena tidak termasuk dalam kondisi if,
//namun input kedua baris ke 12 tidak dieksekusi karena termasuk ke dalam kondisi if (angka==13), sehingga akan dilempar ke program AngkaSial
//b. Setelah input kedua dengan angka 13, baris ke 21 akan dieksekusi karena angka tersebut termasuk ke dalam kondisi if(angka==13), sehingga akan dilempar ke dalam kondisi catch pada baris ke 21
// dan mengeluarkan kondisi ase.getMessage yang berisi "hati- hati memasukkan angka". Input selanjutnya tidak akan dieksekusi karena pada input kedua telah terjadi eksepsi pada input kedua
