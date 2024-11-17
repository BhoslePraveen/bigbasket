package com.vmart.bigbasket.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "basket")
@Getter
@Setter
public class Basket extends AuditStamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(name = "basket_product_mapping",
            joinColumns = @JoinColumn(name = "basket_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> products;

    @Column(name = "amount")
    private BigDecimal totalAmount;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
