package SuperHero_Project;

public class Superman extends SuperHeroes {
    private String flyingAbility;

    public Superman(String name, String gender, String aggression, String wisdom, String beauty, String flyingAbility) {
        super(name,gender,aggression,wisdom,beauty);
        setFlyingAbility("Uçma yeteneği.");
    }

    public String getFlyingAbility() {
        return flyingAbility;
    }

    public void setFlyingAbility(String flyingAbility) {
        this.flyingAbility = flyingAbility;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Superman'in özelliği " + flyingAbility);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(" Ayrıca "+ getName()+" uçarken Supersonic Flight-güçlü saldırılar gerçekleştirebilir.");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println("Superman Supersonic Flight hızında uçma yeteneğine sahiptir.");
    }

    @Override
    public String toString() {
        return "Superman{" +
                "flyingAbility='" + flyingAbility + '\'' +
                '}';
    }
}
