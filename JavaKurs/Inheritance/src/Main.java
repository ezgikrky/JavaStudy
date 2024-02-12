
public class Main {
    public static void main(String[] args) {

        //inheritance= miras demek

        IndividualCustomer ezgi= new IndividualCustomer();
        ezgi.customerNumber="12345";
        ezgi.firstName="ezgi";



        CorporateCustomer hepsiBurada= new CorporateCustomer();
        hepsiBurada.customerNumber="78910";

        SendikaCustomer abc= new SendikaCustomer();
       abc.customerNumber="99999";

        CustomerManager customerManager= new CustomerManager();

         customerManager.add(ezgi);   // çıktısı: 123456 kaydedildi
        // customerManager.add(hepsiBurada);
        // customerManager.add(abc);

        System.out.println();

        System.out.println("Poliformizim: ");
        Customer[] customers={ezgi, hepsiBurada, abc};
        customerManager.addMultiple(customers);   //her müşteri için farklı farklı logicleri çalıştırmış olduk

    }

    // SOLID
    //Bankada örneğin sendika da ayrı bir müşteri olarak tutulacak dediler hiçbit yazdığımız kodu değiştirmeden
    // SendikaCustomer classı oluşturup ardından da extends Customer dersek yine aynı şekilde id ve customerName e sahip olabilecek

}