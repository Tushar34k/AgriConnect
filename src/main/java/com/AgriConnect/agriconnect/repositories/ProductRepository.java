package com.AgriConnect.agriconnect.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgriConnect.agriconnect.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
