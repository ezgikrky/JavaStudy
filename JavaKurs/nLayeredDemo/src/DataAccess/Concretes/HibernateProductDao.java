package DataAccess.Concretes;

import DataAccess.Abstracts.ProductDao;
import Entities.Concretes.Product;

import java.util.List;


//veriye erişim kodlarımızı buraya yazarız HibernateProductDao classına yani. ve bizim bunu soyutlamamız lazım  onu da implements ProductDao ile yaparız
public class HibernateProductDao implements ProductDao {

    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile eklendi: " + product.getName());
    }

    @Override
    public void update(Product product) {

    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }


}
