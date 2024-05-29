//Nama : Meyta Rizki Khairunisa
//NIM : 24060122130085

interface IDiskon{
    public double hitungDiskon(int harga);
}


public class DiskonLambda {
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };
        //dengan lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        //dengan lambda dengan blok statement, pake kurung {} dan return
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Diskon Merdeka : " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran : " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa : " + diskonBiasa.hitungDiskon(45000));
    }
}