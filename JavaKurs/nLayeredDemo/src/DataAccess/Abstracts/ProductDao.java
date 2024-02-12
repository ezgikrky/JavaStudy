package DataAccess.Abstracts;

import Entities.Concretes.Product;

import java.util.List;

public interface ProductDao {

    void add(Product product);
    void update(Product product);
    void delete(Product product);

    Product get(int id);  // bana bir tane id ver örneğin 3 bu gidip veritababnından bir ürün bulup onu getirece
    // örneğin hepsiburada da bir tablet var ona tıkladığımızda tablet ile ilgili bilgileri bize getirir bunun için bu satırı yazarız. Product döndürme sebebi bu

    List<Product> getAll(); // bir de ürün listesi döndürür. Örneğin arama çubuğuna telefon yazdığımızda bir sürü telefon getirir. Buradaki List interface
}
