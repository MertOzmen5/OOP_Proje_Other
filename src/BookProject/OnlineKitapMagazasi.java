package BookProject;

import java.util.ArrayList;
import java.util.Scanner;

class OnlineKitapMagazasi {
    private final ArrayList<Kitap> kitapListesi = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);
    private final Scanner input = new Scanner(System.in);
    private final Scanner scannerDouble = new Scanner(System.in);

    public void kitapEkle() {
        System.out.print("Kitap adı giriniz :");
        String kitap = scanner.nextLine();

        System.out.print("Yazar adı giriniz :");
        String yazarAd = scanner.nextLine();

        System.out.print("Yayın yılı giriniz :");
        int yayinYili = input.nextInt();

        System.out.print("Fiyatını giriniz :");
        double fiyat = scannerDouble.nextDouble();

        Kitap k = new Kitap(kitap, yazarAd, yayinYili, fiyat);
        kitapListesi.add(k);

        System.out.println("Kitap başarıyla eklendi ! " + kitapListesi + "\n");


    }

    public void kitapSil() {

        System.out.print("Silmek istediğiniz kitabın numarasını girin: ");
        int sil = input.nextInt();
        boolean kitapBulunduMu = false;


        for (Kitap o : kitapListesi) {

            if (sil == o.getKitapNo()) {
                kitapListesi.remove(o);
                System.out.println("Girilen kitap numaraya sahip kitap silindi.");
                System.out.println(kitapListesi + "\n");
                kitapBulunduMu = true;
                break;
            }
        }
        if (!kitapBulunduMu) {
            System.out.println("Belirtilen numarada kitap bulunamadı.");
        }
    }


    public void kitapListele() {
        if (kitapListesi.isEmpty()) {
            System.out.println("Henüz kitap eklenmemiş.");
        } else {
            System.out.println(kitapListesi);
        }

    }
}
