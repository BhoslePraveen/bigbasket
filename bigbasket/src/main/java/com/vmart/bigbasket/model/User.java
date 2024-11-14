package com.vmart.bigbasket.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
public class User extends AuditStamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "mobile_number")
    private String mobileNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Address> address;
    @OneToMany(mappedBy="user")
    private Set<Order> orders;
    @OneToOne(mappedBy = "user")
    private Basket basket;
}
