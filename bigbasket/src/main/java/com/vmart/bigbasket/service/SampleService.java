package com.vmart.bigbasket.service;

import com.vmart.bigbasket.model.Category;
import com.vmart.bigbasket.model.Product;
import com.vmart.bigbasket.model.SubCategory;
import com.vmart.bigbasket.repository.CategoryRepository;
import com.vmart.bigbasket.repository.ProductRepository;
import com.vmart.bigbasket.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service // This  class object will be  created by spring and This contains business logic
public class SampleService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private SubCategoryRepository subCategoryRepository;
    @Autowired
    private ProductRepository productRepository;

    public void addProductDetails(){
        //category
        Category category = new Category();
        category.setName("Beverages");
        Category savedCategory = categoryRepository.save(category);

        //Sub-category-1
        SubCategory subCategory1 = new SubCategory();
        subCategory1.setName("energy-soft-drinks");
        subCategory1.setCategory(savedCategory);
        //Sub-category-1
        SubCategory subCategory2 = new SubCategory();
        subCategory2.setName("fruit-juices-drinks");
        subCategory2.setCategory(savedCategory);

        //Save Subcategory
        SubCategory sc1 = subCategoryRepository.save(subCategory1);
        SubCategory sc2 = subCategoryRepository.save(subCategory2);

        //Sub category-1 Products
        Product product1 = new Product();
        product1.setName("thums-up");
        product1.setDescription("Thums Up is one of the most popular soft drink brands from the house of Coca Cola. This fizzy drink creates a refreshing effect on a warm summer day.");
        product1.setUnit("L");
        product1.setStock(10);
        product1.setPrice(BigDecimal.valueOf(190));
        product1.setDiscount(0.1);
        product1.setCategory(savedCategory);
        product1.setSubCategory(sc1);
        productRepository.save(product1);

        Product product2 = new Product();
        product2.setName("bisleri-club-soda");
        product2.setDescription("Bisleri Soda 750 ml is a perfect accompaniment to your drinks and is incredibly fizzy.");
        product2.setUnit("L");
        product2.setStock(10);
        product2.setPrice(BigDecimal.valueOf(20));
        product2.setDiscount(0.0);
        product2.setCategory(savedCategory);
        product2.setSubCategory(sc1);
        productRepository.save(product2);

        //Sub category-2 Products
        Product product3 = new Product();
        product3.setName("maaza-fruit-juice");
        product3.setDescription("Maaza is the indulging, ready-to-serve mango drink.");
        product3.setUnit("L");
        product3.setStock(10);
        product3.setPrice(BigDecimal.valueOf(142.5));
        product3.setDiscount(0.1);
        product3.setCategory(savedCategory);
        product3.setSubCategory(sc2);
        productRepository.save(product3);

        Product product4 = new Product();
        product4.setName("Roohafza Sharbat");
        product4.setDescription("A refreshing concoction, RoohAfza is a thirst quencher.");
        product4.setUnit("L");
        product4.setStock(10);
        product4.setPrice(BigDecimal.valueOf(70));
        product4.setDiscount(0.0);
        product4.setCategory(savedCategory);
        product4.setSubCategory(sc2);
        productRepository.save(product4);
    }

    public void showAllProduct(){
        List<Product> all = productRepository.findAll();
        System.out.println(all);
    }
}
