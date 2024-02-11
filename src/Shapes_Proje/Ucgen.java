package Shapes_Proje;

public class Ucgen implements IIslem {
    private int kenar1;
    private int kenar2;
    private int kenar3;

    public Ucgen() {
    }

    public Ucgen(int kenar1, int kenar2, int kenar3) {
        setKenar1(kenar1);
        setKenar2(kenar2);
        setKenar3(kenar3);
    }

    public int getKenar1() {
        return kenar1;
    }

    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }

    public int getKenar2() {
        return kenar2;
    }

    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }

    public int getKenar3() {
        return kenar3;
    }

    public void setKenar3(int kenar3) {
        this.kenar3 = kenar3;
    }

    @Override
    public double alanHesapla() {
        double u = (double) (kenar1 + kenar2 + kenar3) / 2;
        return Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
    }

    @Override
    public double cevreHesapla() {
        return kenar1 + kenar2 + kenar3;
    }

    @Override
    public String toString() {
        return "Ucgen{" +
                "kenar1=" + kenar1 +
                ", kenar2=" + kenar2 +
                ", kenar3=" + kenar3 +
                '}';
    }
}
