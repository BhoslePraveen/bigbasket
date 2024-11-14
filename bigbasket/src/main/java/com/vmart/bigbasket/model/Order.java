package com.vmart.bigbasket.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "orders")
@Data
public class Order extends AuditStamp{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    @JoinTable(name = "order_product_mapping",
    joinColumns = @JoinColumn(name = "order_id"),
    inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Set<Product> products;
    @Column(name = "payment_id")
    private String paymentId;
    @Column(name = "payment_status")
    private String paymentStatus;
    @Column(name = "delivery_status")
    private String deliveryStatus;
    @Column(name = "total_amount")
    private BigDecimal totalAmount;
    @Column(name = "invoice_no")
    private String invoiceNo;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    @JoinColumn(name = "order_address_id")
    private Address address;
}
