class Lingkaran {
    private double jariJari;
    public Lingkaran (double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0): "jari jari tidak boleh nol";
        Lingkaran lingkaran = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);

    }
}
//PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
//Jawaban : Secara konsep sudah benar, namun terdapat kesalahan pada penggunaan assert. Pada program digunakan untuk memastikan jari-jari > 0
// namun secara umum assert akan di nonaktifkan pada saat runtime. Oleh karena itu, kondisi jariJari > 0 tidak akan dicek saat program dijalankan.
