package SuperHero_Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        List<String> activeHeroes = new ArrayList<>();
        List<String> allHeroes = new ArrayList<>();


        allHeroes.add("batman");
        allHeroes.add("superman");
        allHeroes.add("spiderman");
        allHeroes.add("wolverine");
        allHeroes.add("wonder woman");

        System.out.println("Süper kahramanlar gösterisine hoş geldiniz...");
        System.out.println("Mevcut süper kahramanlar : " + allHeroes);
        System.out.println("Çıkış yapmak için \"q\"'ya basınız.");
        String secim;


        while (true) {


            Scanner input = new Scanner(System.in);
            System.out.print("Hangi süper kahramanı eklemek istiyorsunuz : ?");
            secim = input.nextLine().toLowerCase();

            if (secim.equalsIgnoreCase("q")) {
                System.out.println("Çıkış yapılıyor...");
                break;

            }if (allHeroes.contains(secim) && !activeHeroes.contains(secim)) {
                activeHeroes.add(secim);
                System.out.println(secim + " oyuna başarıyla eklendi.");
            } else if (activeHeroes.contains(secim)) {
                System.out.println(secim + " zaten oyunda aktif.");
                break;
            }
            if (!allHeroes.contains(secim)) {
                System.out.println("Lütfen geçerli bir süper kahraman giriniz...");
            }

            HeroFactory factory = new HeroFactory();
            SuperHeroes superHeroe = factory.produceSuperHero(secim);

            if (superHeroe != null) {
                superHeroe.attack();
                superHeroe.printInfo();
                superHeroe.exposeSecretPower();
                activeHeroes.add(secim);

                boolean found = false;

                for (int i = 0; i < allHeroes.size(); i++) {
                    if (allHeroes.get(i).equalsIgnoreCase(secim)) {
                        found = true;
                        allHeroes.remove(i);
                        break;
                    }
                }
                System.out.println("Aktif kahramanlar :" + activeHeroes);
                allHeroes.remove(secim);
                System.out.println("Aktif olmayan kahramanlar :" + getRemainingHeroes(allHeroes, activeHeroes));
            }


        }

    }

    private static List<String> getRemainingHeroes(List<String> allHeroes, List<String> activeHeroes) {
        List<String> remainingHeroes = new ArrayList<>(allHeroes);
        remainingHeroes.removeAll(activeHeroes);
        return remainingHeroes;
    }
}
