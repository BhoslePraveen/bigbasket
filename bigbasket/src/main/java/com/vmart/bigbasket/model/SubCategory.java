package com.vmart.bigbasket.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "sub_category")
@Data
public class SubCategory extends AuditStamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sub_category_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
