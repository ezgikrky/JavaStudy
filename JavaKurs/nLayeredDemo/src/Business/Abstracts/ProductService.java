package Business.Abstracts;

import Entities.Concretes.Product;

import java.util.List;

public interface ProductService { //neyi servis etmek istiyorsak o kodlarımızı yazarız

    void add(Product product);
    List<Product> getAll();


}
