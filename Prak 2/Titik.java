public class Titik
{
    private double absis;
    private double ordinat;


    public Titik(double absis, double ordinat)
    {
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public Titik()
    {
        this(0,0);
    }
    public double getOrdinat(){
        return this.ordinat;
    }

    public double getAbsis(){
        return this.absis;
    }
    public void setAbsis(double absis){
        this.absis = absis;
    }

    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

    public double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }
    public void refleksiX (Titik titik){
        double ordinat = titik.getOrdinat();
        ordinat = ordinat * -1;
        titik.setOrdinat(ordinat);
    }

    public void getRefleksiX (Titik t){
        refleksiX(t);
    }

    public void refleksiY (Titik titik){
        double absis = titik.getAbsis();
        absis = absis * -1;
        titik.setAbsis(absis);
    }

    private void getRefleksiY (Titik t){
        refleksiY(t);
    }
}


