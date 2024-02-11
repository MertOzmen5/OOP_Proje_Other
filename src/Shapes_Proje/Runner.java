package Shapes_Proje;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Karenin kenarını giriniz :");
        int kenarKare = input.nextInt();
        Kare ka = new Kare();
        ka.setKenar(kenarKare);
        System.out.println("Kare alan = " + ka.alanHesapla());
        System.out.println("Kare çevre = " + ka.cevreHesapla());

        System.out.print("Dikdörtgenin uzun kenarını giriniz :");
        int uzunK = input.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını giriniz :");
        int kisaK = input.nextInt();
        Dikdortgen d = new Dikdortgen();
        d.setUzunKenar(uzunK);
        d.setKisaKenar(kisaK);
        System.out.println("Dikdörtgen çevre = " + d.cevreHesapla());
        System.out.println("Dikdörtgen alan = " + d.alanHesapla());

        Ucgen u = new Ucgen();
        System.out.print("Üçgenin 1.kenarını giriniz :");
        int ucgenK1 = input.nextInt();
        System.out.print("Üçgenin 2.kenarını giriniz :");
        int ucgenK2 = input.nextInt();
        System.out.print("Üçgenin 3.kenarını giriniz :");
        int ucgenK3 = input.nextInt();
        u.setKenar1(ucgenK1);
        u.setKenar2(ucgenK2);
        u.setKenar3(ucgenK3);
        System.out.println("Üçgen çevre = " + u.cevreHesapla());
        System.out.println("Üçgen alan = " + u.alanHesapla());

        Daire da = new Daire();
        System.out.print("Daire yarıçapını giriniz : ");
        double yaricap = input.nextDouble();
        da.setYaricap(yaricap);
        System.out.println("Daire çevre = " + da.cevreHesapla());
        System.out.println("Daire alan = " + da.alanHesapla());

    }
}
