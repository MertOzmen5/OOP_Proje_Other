package Shapes_Proje;

public class  Dikdortgen implements IIslem {

   private int uzunKenar;
   private int kisaKenar;

    public Dikdortgen() {
    }

    public Dikdortgen(int uzunKenar, int kisaKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunKenar=" + uzunKenar +
                ", kisaKenar=" + kisaKenar +
                '}';
    }

    @Override
    public double alanHesapla() {
        return uzunKenar*kisaKenar;
    }

    @Override
    public double cevreHesapla() {
        return (uzunKenar+kisaKenar)*2;
    }
}
