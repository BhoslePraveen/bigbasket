package com.vmart.bigbasket.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "products")
@Data
public class Product extends AuditStamp{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "unit")
    private String unit;
    @Column(name = "stock")
    private Integer stock;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "discount")
    private Double discount;
    @Column(name = "quantity")
    private Integer quantity;
    @ManyToMany(mappedBy = "products")
    private Set<Basket> baskets;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "sub_category_id")
    private SubCategory subCategory;
}
