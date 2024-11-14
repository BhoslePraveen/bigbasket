package com.vmart.bigbasket.repository;

import com.vmart.bigbasket.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
