package com.AgriConnect.agriconnect.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgriConnect.agriconnect.model.Farmer;

public interface FarmerRepository extends JpaRepository<Farmer,Long> {

    // TODO: here we are able to  write custome quesries also
} 
