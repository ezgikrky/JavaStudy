package com.example.northwind.Entities.concretes;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity //sen bir veri tabanı nesnesisin demek
@Table(name="products") //veritabanında hangi tabloya karşı geldiğini söyleriz

public class Product {

    @Id //tablodaki id alanının ne old. söyleriz. çünkü işlemlerini id ye göre yapıyor sorgular bu id ye göre yapılır
    //id alanları bazen manuel bazen de otomatik verilebilir gibi gibi buradaki id nin nasıl üretildiğini söyşeriz
    @GeneratedValue //burada id nin 1 1 arttırıldığını söyledik


    @Column(name="product_id") //veritabanında hangi kolona karşılık geldiğine bakıyoruz
    private int id;

    @Column(name="category_id")
    private int categoryId;

    @Column(name="product_name")
    private String productName;

    @Column(name="unit_price")
    private double unitPrice;

    @Column(name="units_in_stock")
    private short unitsInStock;

    @Column(name="quantity_per_unit")
    private String quantityPerUnit;

    public Product(){}

    public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock, String quantityPerUnit) {
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.quantityPerUnit = quantityPerUnit;
    }
}
