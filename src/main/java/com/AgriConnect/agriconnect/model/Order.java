package com.AgriConnect.agriconnect.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "`order`") 
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;
    private String status;
    private LocalDate orderDate;

    @OneToMany(mappedBy = "order") // Relationship managed by the "order" field in Product
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Buyer buyer;
}

