package com.vmart.bigbasket.repository;

import com.vmart.bigbasket.model.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubCategoryRepository extends JpaRepository<SubCategory,Long> {

    @Query(value = "select * from sub_category sc where category_id=:id",nativeQuery = true)
    List<SubCategory> findAllByCategoryId(@Param("id") Long categoryId);
}
