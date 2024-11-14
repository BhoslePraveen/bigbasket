package com.vmart.bigbasket.repository;

import com.vmart.bigbasket.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
