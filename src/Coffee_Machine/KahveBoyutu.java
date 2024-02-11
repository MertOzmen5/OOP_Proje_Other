package Coffee_Machine;

public enum KahveBoyutu {
    SMALL("Küçük"), MEDIUM("Orta"), LARGE("Büyük"), XLARGE("Çok Büyük");
    private String name;

    KahveBoyutu(String name) {
        this.name = name;
    }
}
