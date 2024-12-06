package com.AgriConnect.agriconnect.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgriConnect.agriconnect.model.Buyer;

public interface BuyerRepository extends JpaRepository<Buyer,Long> {
// here youre able to write jpql

Buyer findByEmail(String email);

}
