package com.vmart.bigbasket.service;

import com.vmart.bigbasket.model.Category;
import com.vmart.bigbasket.model.Product;
import com.vmart.bigbasket.model.SubCategory;

import java.util.List;

public interface ShopService {
    List<Category> getAllCategory();
    List<SubCategory> getSubCategoryByCategoryId(Long categoryId);
    List<Product> getProductBySubCategoryId(Long subCategoryId);
}
