import Business.Abstracts.ProductService;
import Business.Concretes.ProductManager;
import DataAccess.Concretes.HibernateProductDao;
import Entities.Concretes.Product;
import jLogger.JLoggerManager;
import jLogger.JLoggerManagerAdapter;

public class Main {
    public static void main(String[] args) {

        //toDo: spring IoC ile çözülecek
        ProductService productService= new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter()); //normalde new lemek hata oluşturur sonradan


        Product product= new Product(1,2,"Elma",12,50);
        productService.add(product);
    }
}