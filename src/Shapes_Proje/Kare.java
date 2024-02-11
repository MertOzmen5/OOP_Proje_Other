package Shapes_Proje;

public class Kare implements IIslem {
    private int kenar;

    public Kare() {
    }

    public Kare(int kenar) {
        setKenar(kenar);
    }

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanHesapla() {
        return kenar*kenar;
    }

    @Override
    public double cevreHesapla() {
        return kenar*4;
    }

    @Override
    public String toString() {
        return "Kare{" +
                "kenar=" + kenar +
                '}';
    }
}
