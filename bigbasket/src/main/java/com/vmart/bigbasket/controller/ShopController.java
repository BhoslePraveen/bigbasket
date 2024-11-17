package com.vmart.bigbasket.controller;

import com.vmart.bigbasket.model.Category;
import com.vmart.bigbasket.model.Product;
import com.vmart.bigbasket.model.SubCategory;
import com.vmart.bigbasket.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("/categories")
    public ResponseEntity<List<Category>> getCategoryData() {
        return new ResponseEntity<>(shopService.getAllCategory(), HttpStatus.OK);
    }

    @GetMapping("/category/{category-id}/sub-categories")
    public ResponseEntity<List<SubCategory>> getSubCategoryDataById(@PathVariable(name = "category-id") Long categoryId) {
        return new ResponseEntity<>(shopService.getSubCategoryByCategoryId(categoryId), HttpStatus.OK);
    }

    @GetMapping("/sub-category/{sub-category-id}/products")
    public ResponseEntity<List<Product>> getProductDataBySubCategoryId(@PathVariable(name = "sub-category-id") Long subCategoryId) {
        return new ResponseEntity<>(shopService.getProductBySubCategoryId(subCategoryId), HttpStatus.OK);
    }
}
