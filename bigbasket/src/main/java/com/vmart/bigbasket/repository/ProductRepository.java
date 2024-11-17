package com.vmart.bigbasket.repository;

import com.vmart.bigbasket.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Long> {

    @Query(nativeQuery = true,value = "select * from products p where sub_category_id = :id")
    List<Product> finalAllBySubCategoryId(@Param("id") Long subCategoryId);
}
