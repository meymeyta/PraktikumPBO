//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/**
 * File         : Main.java		08/05/2024
 * Nama penulis : Meyta Rizki Khairunisa
 * NIM          : 24060122130085
 * Deskripsi    : No 1 - 5
 */

public class Main {
    public static void main(String[] args) {
        //No 1
        //int output = 'a';
        //System.out.println("Nomor 1 : " + output);
        //Pada nomor 1 berhasil di eksekusi, hasil dari eksekusi merupakan nomor ascii dari huruf a yaitu 97
        // sehingga terjadi konversi secara implisit


        //No 2
        //double x = 15.5;
        //int output = x;
        //System.out.println("No 2 : " + output);
        //Pada nomor 2 tidak bisa di eksekusi, karena tidak bisa mengonversi dari double ke integer, diperlukan persyaratan
        // lebih lanjut apabila dikonversi sehingga diperlukan konversi secara eksplisit

        //No 3
        //int y = 25;
        //double output = y;
        //System.out.println("No 3 : " + output);
        //Pada nomor 3 berhasil di eksekusi, hasil yang dikeluarkan merupakan konversi integer 25 menjadi double yaitu 25.0
        //dan terjadi konversi secara implisit

        //No 4
        //int z = 78;
        //char output = (char) z;
        //System.out.println("No 4 : " + output);
        //Pada nomor 4 berhasil di eksekusi, hasil yang dikeluarkan merupakan konversi integer 78 menjadi char huruf 'N'
        //yang dimana 78 merupakan angka ascii dari huruf 'N' sehingga terjadi konversi secara implisit

        //No 5
        char a = 'a';
        double output = a;
        System.out.println(output);
        //Pada nomor 5 berhasil di eksekusi, hasil yang dikeluarkan merupakan konversi char 'a' menjadi double 97.0
        // yang dimana 97.0 apabila dibulatkan menjadi 97 yang merupakan bilangan ascii dari huruf 'a' sehingga terjadi
        //konversi secara implisit
        }
    }