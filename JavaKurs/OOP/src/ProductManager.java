public class ProductManager { // yazma amacı istediğimiz kadar istediğimiz yerde kullanmak

    // ProductService de denir bunlar İş Yapan Class'lar metot tutucu da denebilir.. SOLID prensibinden dolayı

    public void addToCart(Product product) { // Burada Product product diyerek türünü belirtmiş olduk yani Product'tan o stringler falan gelecek
                                            // product sepete eklemek için tıkladığımız ürün.
        System.out.println("Sepete eklendi " + product.getName() );
    }



}
