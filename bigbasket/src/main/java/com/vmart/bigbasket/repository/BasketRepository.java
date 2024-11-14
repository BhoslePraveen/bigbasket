package com.vmart.bigbasket.repository;

import com.vmart.bigbasket.model.Basket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket,Long> {
}
