/*
class Main
{
    public static void main(String[] args)
    {
        Titik t1, t2, t3;

        t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        t3 = new Titik(5,6);


        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");

        System.out.println("Jarak Pusat T1 : " + t1.getJarakPusat());


        t1.refleksiX(t1);
        System.out.println("\nRefleksi sumbu X T1 : ");
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        t1.refleksiY(t1);
        System.out.println("\nRefleksi sumbu Y T1 : ");
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

    }
}*/

public class Main {
    public static void main(String[] args) {
        Titik titikAwal = new Titik(2, 3);
        Titik titikAkhir = new Titik(4, 5);

        Garis G1 = new Garis(titikAwal, titikAkhir);

        double panjangGaris = G1.getPanjang();
        System.out.println("Panjang garis G1: " + panjangGaris);
    }
}

