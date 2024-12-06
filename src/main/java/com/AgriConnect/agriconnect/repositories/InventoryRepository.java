package com.AgriConnect.agriconnect.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AgriConnect.agriconnect.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory,Long> {
    


}
