package BookProject;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        OnlineKitapMagazasi o = new OnlineKitapMagazasi();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("****** BOOK STORE MENU ******");
            System.out.println("Kitap eklemek için 1:");
            System.out.println("Kitap silmek için 2:");
            System.out.println("Kitapları listelemek için 3:" + "\n");
            System.out.println("Çıkış yapmak için 0:");
            System.out.print("Seçiminizi yapınız :");

            int secim = scanner.nextInt();


            switch (secim) {
                case 1:
                    o.kitapEkle();
                    break;
                case 2:
                    o.kitapSil();
                    break;
                case 3:
                    o.kitapListele();
                    break;
                case 0:
                    exit = true;
                    System.out.println("Program sonlandırılıyor.");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.\n");
                    break;
            }

        } while (!exit);
    }
}

