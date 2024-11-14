package com.vmart.bigbasket.repository;

import com.vmart.bigbasket.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
