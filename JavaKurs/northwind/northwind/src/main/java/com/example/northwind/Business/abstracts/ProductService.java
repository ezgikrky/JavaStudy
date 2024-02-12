package com.example.northwind.Business.abstracts;

import com.example.northwind.Entities.concretes.Product;

import java.util.List;
//servislerimizi, controllerimizi kullanacağımız operasyonları yazıyoruz
public interface ProductService {
    List<Product> getAll(); //bütün ürünlerimizi nesneleyen kod
}


