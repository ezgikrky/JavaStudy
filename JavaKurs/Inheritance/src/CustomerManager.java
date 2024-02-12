
//Müşteriyi yöneten, müşteri ile ilgili operasyonları içerecek sınıfımız.
// Güncelle, listele, şu müşteriyi getir gibi veritabanı kullandığımız kısım
//tekrar tekrar kullanılabilirliki. Bir kere yazıyourz. sonra tekrar tekrar kullanabiliyoruz.

public class CustomerManager {

    public void add(Customer customer) { // bu iş yapacak yani add'i ne zaman çağırırsak bu bloktaki kodları çağracak. Tekrar tekrr kullanılabilirlik için
        System.out.println(customer.customerNumber + " kaydedildi");
    }

    //  public void add(Customer customer) deki Customer onu extends eden sınıfların referanslarını tutabilir.
    public void add(IndividualCustomer individualCustomer) {
        System.out.println(individualCustomer.firstName + " Kaydedildi ");
    }


    //Birden fazla müşteri eklemek istersek Arraylerle bu durumu yönetiriz.
    // bulk insert
    public void addMultiple(Customer[] customers){ // sana bir müşteri array i yollayacağım sen onları ekle demek oluyor.ed
        for (Customer customer: customers) { // Customer türündeki customers'larda her bir customer için
            add(customer); //yukarıdaki add'i çalıştır
        }

    }
}

