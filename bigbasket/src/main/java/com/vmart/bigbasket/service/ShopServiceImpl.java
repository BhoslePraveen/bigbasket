package com.vmart.bigbasket.service;

import com.vmart.bigbasket.model.Category;
import com.vmart.bigbasket.model.Product;
import com.vmart.bigbasket.model.SubCategory;
import com.vmart.bigbasket.repository.CategoryRepository;
import com.vmart.bigbasket.repository.ProductRepository;
import com.vmart.bigbasket.repository.SubCategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ShopServiceImpl implements ShopService{

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private SubCategoryRepository subCategoryRepository;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public List<SubCategory> getSubCategoryByCategoryId(Long categoryId) {
        return subCategoryRepository.findAllByCategoryId(categoryId);
    }

    @Override
    public List<Product> getProductBySubCategoryId(Long subCategoryId) {
        return productRepository.finalAllBySubCategoryId(subCategoryId);
    }
}
