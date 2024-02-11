package SuperHero_Project;

public class WonderWoman extends SuperHeroes {
    private String lassoOfTruthAbility;

    public WonderWoman(String name, String gender, String aggression, String wisdom, String beauty, String lassoOfTruthAbility) {
        super(name,gender,aggression,wisdom,beauty);
        setLassoOfTruthAbility("Doğruluk kementi");
    }

    public String getLassoOfTruthAbility() {
        return lassoOfTruthAbility;
    }

    public void setLassoOfTruthAbility(String lassoOfTruthAbility) {
        this.lassoOfTruthAbility = lassoOfTruthAbility;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(" Wonder Woman'ın Özelliği " + lassoOfTruthAbility);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(getName() + "Wonder Woman'ın kılıcı vardır ve kılıcı ile saldırır.");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println("Bilekliklerini birbirine vurunca sismik dalga yaratır.");
    }

    @Override
    public String toString() {
        return "WonderWoman{" +
                "lassoOfTruthAbility='" + lassoOfTruthAbility + '\'' +
                '}';
    }
}
