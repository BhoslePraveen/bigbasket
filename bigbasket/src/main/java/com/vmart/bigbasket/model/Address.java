package com.vmart.bigbasket.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "address")
@Data
public class Address extends AuditStamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String addressLine;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "pincode")
    private String pincode;
    @Column(name = "country")
    private String country;
    @Column(name = "mobile")
    private String mobileNumber;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
}
