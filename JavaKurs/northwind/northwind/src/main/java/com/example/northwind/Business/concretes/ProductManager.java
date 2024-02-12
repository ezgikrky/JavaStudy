package com.example.northwind.Business.concretes;

import com.example.northwind.Business.abstracts.ProductService;
import com.example.northwind.DataAccess.abstracts.ProductDao;
import com.example.northwind.Entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//burada ProductService i implemente ettik

@Service // bu class projede servis görevi görecek diye springe bilgi veriyor
public class ProductManager implements ProductService {

    private ProductDao productDao; //geçici bir alan oluşturduk

    @Autowired  //spring gidip arka planda productDao'ya karşılık gelebilecek projeleri ProductDao nun instance olabilecek bir sınıfı üretip onu veriyor.
               // Genellikle bağımlılık oluşyturur ve o projede tek bir instance ı jllanabiliyoruz.

    public ProductManager(ProductDao productDao) // (ProductDao productDao) a constructoe injection deriz yani bir bağımlılığı constructor üzerinden enjekte etmek demek
    {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() { //ProductDao'ya burası erişemez buna scoper(kapsam) denir. Çünkü değişkeni yukarıda tanımladık
        return this.productDao.findAll(); //bütün dataları getirecek
    }
}
