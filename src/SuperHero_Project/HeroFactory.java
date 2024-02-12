package SuperHero_Project;

public class HeroFactory {

    public SuperHeroes produceSuperHero(String superHero) {

        if (superHero.equalsIgnoreCase("Superman")) {
            return new Superman("superman", "erkek", "1000", "800", "900", "Supersonic Flight");
        } else if (superHero.equalsIgnoreCase("wonder woman")) {
            return new WonderWoman("wonder Woman", "kadın", "800", "1000", "950", "Golden Lasso");
        } else if (superHero.equalsIgnoreCase("SpiderMan")) {
            return new SpiderMan("spiderMan", "erkek", "700", "750", "800", "Web Shooting");
        } else if (superHero.equalsIgnoreCase("Batman")) {
            return new Batman("batman", "erkek", "900", "950", "850", "Detective Skills");
        } else if (superHero.equalsIgnoreCase("Wolverine")) {
            return new Wolverine("wolverine", "erkek", "950", "700", "800", "Adamantium Claws");
        } else {
            return null;
        }
    }
}

