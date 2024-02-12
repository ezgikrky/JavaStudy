package interfaces;

public class CustomerManager {

    private Logger[] loggers; //birden fazlasını seçmek isterse diye yazdık

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer){
        System.out.println("Müşteri eklendi : " + customer.getFirstName());

        //this.logger.log(customer.getFirstName()); // gevşek bağlanma oldu

        //for(Logger logger: loggers){  //birden fazla Logger çağırmamızı sağladı ama  biz sürekli aşağıda da burada da foreach yazmamak için Utils sınıfını oluşturduk.
         //  logger.log(customer.getFirstName());
        //}



        // Utils utils= new Utils();  Burada new'lememek için   public static void runLoggers diye static yaptık
        // utils.runLoggers(loggers, customer.getFirstName());
        //yukarıdaki gibi kullanmak yerine direkt sınıfın ismini yani Utils.runLoggers yazarak çağırdık
        Utils.runLoggers(loggers, customer.getFirstName());
    }

    public void delete(Customer customer){
        System.out.println("Müşteri silindi : "+ customer.getFirstName());

        // this.logger.log(customer.getFirstName()); // gevşek bağlanma oldu

        //for(Logger logger: loggers){
        //    logger.log(customer.getFirstName());
       // }

        Utils.runLoggers(loggers, customer.getLastName());


    }
}
