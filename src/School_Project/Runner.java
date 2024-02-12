package School_Project;

public class Runner {

    public static void main(String[] args) throws InterruptedException {

        //PROGRAM ÇALIŞINCA 5 KİŞİLİK Bİ ÖĞRETMEN LİSTESİ OLUŞUYOR
        Veritabani.baslangicOgretmenVeritabaniOlustur();

        //PROGRAM ÇALIŞINCA 5 KİŞİLİK Bİ ÖĞRENCİ LİSTESİ OLUŞUYOR
        Veritabani.baslangicOgrenciVeritabaniOlustur();

        //ANA MENÜ BAŞLATILIYOR3

        Helper.anaMenu();

    }
}