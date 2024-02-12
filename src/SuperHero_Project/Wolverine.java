package SuperHero_Project;

public class Wolverine extends SuperHeroes{
    private String adamantiumClaws;
    public Wolverine(String name, String gender, String aggression, String wisdom, String beauty,String adamantiumClaws) {
        super(name,gender,aggression,wisdom,beauty);
        setAdamantiumClaws("Adamantium pençeleri var.");
    }

    public String getAdamantiumClaws() {
        return adamantiumClaws;
    }

    public void setAdamantiumClaws(String adamantiumClaws) {
        this.adamantiumClaws = adamantiumClaws;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Wolwerine'in özelliği: " +adamantiumClaws);


    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(" Ayrıca" + getName()+" adamantium pençeleri ile saldırabilir ve düşmanlarını etkisiz hale getirebilir.");
    }

    @Override
    public void exposeSecretPower() {

        System.out.println(getName()+"adamantium pençelerine sahiptir ve bu pençeleriyle her türlü maddeyi kesip parçalayabilir.");
    }

    @Override
    public String toString() {
        return "Wolverine{" +
                "adamantiumClaws='" + adamantiumClaws + '\'' +
                '}';
    }
}

