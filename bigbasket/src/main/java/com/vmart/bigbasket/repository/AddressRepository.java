package com.vmart.bigbasket.repository;

import com.vmart.bigbasket.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

//Two Question for JPA : Name of your Entity and Data type of your Id (primary key)
public interface AddressRepository extends JpaRepository<Address,Long> {
}
