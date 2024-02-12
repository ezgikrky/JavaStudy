public class BaseKrediManager {


    public void hesapla() {
        System.out.println("Kredi hesaplandı");
    }

    public double hesapla2(double tutar){  // eğer public final double hesapla2(double tutar) yazsaydım o zaman override edemezdim
                                           // OgrenciKrediManager'de hata alırdım
        return tutar*1.8;
    }


}
