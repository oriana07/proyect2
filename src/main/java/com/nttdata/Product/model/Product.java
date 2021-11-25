package com.nttdata.Product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String productType;
    private String numberProduct;
    private BigDecimal balance;
    private Double maintenanceFee;
    private Integer monthlyMovements;
    private Integer idClient;
    private String state;

}
