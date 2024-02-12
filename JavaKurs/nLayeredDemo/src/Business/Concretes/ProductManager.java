package Business.Concretes;

import Business.Abstracts.ProductService;
import Core.LoggerService;
import DataAccess.Abstracts.ProductDao;
import DataAccess.Concretes.HibernateProductDao;
import Entities.Concretes.Product;
import jLogger.JLoggerManager;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao; // gevşek bağımlılık yaptık
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao,LoggerService loggerService) {
        super();
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        // iş kodları yazılır
        if(product.getCategoryId()==1){ // eğer 1 değilde 2 olursa kabul edildi diyip burada çalışmaz
            System.out.println("Bu kategoride ürün kabul edilmiyor");
            return; //buraya girerse başka kodları döndürme sadece buraya bak demek.
        }

        this.productDao.add(product);  //artık hiçbir şekilde Hibernate'e bağımlılığımız yok
        this.loggerService.logToSystem(product.getName()); //bunu yazmayınca ekrana vermedi

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
