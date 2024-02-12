public class CustomerManager {
    public void add(Logger logger){ //bu Logger ın yerine aslında FileLogger, EmailLogger,DatabaseLogger gönderilebilir.
                                     // Çünkü Logger o üçününde referasnını tutabiliyor

        //Müşteri ekleme kodları
        System.out.println("Müşteri eklendi");
        logger.log();


        //DatabaseLogger databaseLogger= new DatabaseLogger();
// DatabaseLogger fileLogger bunlar hep somut sınıf ve biz bunlları new leyemeyiz yukarıdaki gibi
    }
}
