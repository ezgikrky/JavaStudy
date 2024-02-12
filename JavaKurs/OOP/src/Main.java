public class Main {
    public static void main(String[] args) {

        Product product1= new Product(1,"Lenovo 14", 15000, "16gb ram",10); // class oluşturma, referans oluşturma , instance oluşturma
        //yukarıdakini böyle yazdığımız için ben çalıştım yazısı bunda çıkmazdı çıksınb diye this(); yazarak göstermiş olduk


        System.out.println(product1.getUnitPriceAfterDiscount());


        System.out.println("------------------------");


        Product product2= new Product(); // class oluşturma, referans oluşturma , instance oluşturma
        product2.setId(2); ///bilgileri set ile veriyoruz
        product2.setName("Lenovo V15");
        product2.setDetail("16gb ram");
        product2.setDiscount(10);
        product2.setUnitPrice(16000);

        System.out.println(product2.getUnitPriceAfterDiscount());



        Category category1= new Category(5,"Bilgisayar");

        Category category2 = new Category(6, "Telefon");


        System.out.println(category1.getName());
        System.out.println(category2.getName());

        System.out.println("------------------------");

        ProductManager productManager= new ProductManager();
        productManager.addToCart(product1); //Product'ın bellek adresini yollamış olduk


    }
}