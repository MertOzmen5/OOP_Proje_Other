package Shapes_Proje;

public class Daire implements IIslem{
    private double yaricap;

    public Daire() {
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public Daire(double yaricap) {
        setYaricap(yaricap);
    }

    @Override
    public double alanHesapla() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    public double cevreHesapla() {
        return 2*Math.PI*yaricap;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "yaricap=" + yaricap +
                '}';
    }
}
