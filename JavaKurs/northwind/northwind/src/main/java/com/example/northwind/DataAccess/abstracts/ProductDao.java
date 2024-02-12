package com.example.northwind.DataAccess.abstracts;

import com.example.northwind.Entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//  JpaRepository verilen veri tipi için yani entity anatasyonu ile süslenmiş nesne(Product) için primary alanını ver ki sorguları ona göre hazırlayayım der

public interface ProductDao extends JpaRepository<Product,Integer> { //generic bir yapı var çünkü jpa her nesne için çalışabilecek yapıya sahip
}
