package com.example.northwind.API.controllers;

import com.example.northwind.Business.abstracts.ProductService;
import com.example.northwind.Entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Controller api katmanda dış dünya ile entegrasyon kuruyoruz. mobil ya da web uygulama ile iletişimi kuracak ortak iletiim yöntemi ile

@RestController // sen bir controllersın demek oluyor bu
@RequestMapping("/api/products")
//birden fazla controller olabilir . Eğer bana böyle bir istek gelirse /api/products bunu controller karşılayacak

public class ProductsController { //dış dünyadan sistemimizle iletişim kurduğumuz yer controllerın ta kendisi

    private ProductService productService;

    @Autowired
    // Autowired bana ProductService lazım diyip projeyi tarıyor. kim ProductService i impelemnts etmiş diyip onu buluyor ProductManager'i yani sonra
    // spring   arka planda ProductManager'i new'liyor ve onu gelip
    public ProductsController(ProductService productService)
    {  //buraya yerleştiriyor
        super();
        this.productService = productService;
    }


    @GetMapping("/getall") //veri istediğimizde bun getrequest deniyor onun için GetMapping
    public List<Product> getAll() { //böyle bir metod detsği controller vasıtasıyla veriyoruz demek

        return this.productService.getAll();

        // biz eğer kodlama.io/ap/products/getall isteğinde bulunursak burası çalışacak
    }
}

//Swagger .Net, java ... dünyasında bizim hızlıca test edeblmemizi sağlıyan bir arayüz ve versiyonlama ortamı