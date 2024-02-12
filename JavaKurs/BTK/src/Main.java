// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        KrediUi krediUi= new KrediUi();
        krediUi.krediHesaplandı(new OgretmenKrediManager()); //poliformizm

        BaseKrediManager[] krediManagers = new BaseKrediManager[] { //dzi halinde hepsini yazabildik
                new OgretmenKrediManager(), new TarımKrediManager(), new OgrenciKrediManager()
        };

        for(BaseKrediManager krediManager: krediManagers){
            System.out.println(krediManager.hesapla2(1000));
        }

    }
}