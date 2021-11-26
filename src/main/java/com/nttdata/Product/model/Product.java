package com.nttdata.Product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "productType")
    private String productType;

    @Column(name = "numberProduct")
    private String numberProduct;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "maintenanceFee")
    private Double maintenanceFee;

    @Column(name = "monthlyMovements")
    private Integer monthlyMovements;

    @Column(name = "idClient")
    private Integer idClient;

    @Column(name = "state")
    private String state;

}
