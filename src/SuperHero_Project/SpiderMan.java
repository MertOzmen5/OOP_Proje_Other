package SuperHero_Project;

public class SpiderMan extends SuperHeroes {

    private String webShootingAbility;


    public SpiderMan(String name, String gender, String aggression, String wisdom, String beauty, String webShootingAbility) {
        super(name,gender,aggression,wisdom,beauty);
        setWebShootingAbility("Örümcek ağı atmak");


    }

    public String getWebShootingAbility() {
        return webShootingAbility;
    }

    public void setWebShootingAbility(String webShootingAbility) {
        this.webShootingAbility = webShootingAbility;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(" Ayrıca" + getName() + " örümcek ağı püskürtme yeteneği ile saldırabilir ve düimanlarını etkisiz hale getirebilir. ");


    }

    @Override
    public void exposeSecretPower() {

        System.out.println(getName() + " , örümcek ağı püskürtme yeteneğine sahiptir.");


    }


    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Spiderman'in özelliği" + webShootingAbility);


    }

    @Override
    public String toString() {
        return "SpiderMan{" +
                "webShootingAbility='" + webShootingAbility + '\'' +
                '}';
    }
}
