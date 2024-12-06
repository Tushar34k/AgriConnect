package com.AgriConnect.agriconnect.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgriConnect.agriconnect.Service.InventoryService;
import com.AgriConnect.agriconnect.customeexception.ResourceNotFoundException;
import com.AgriConnect.agriconnect.model.Inventory;
import com.AgriConnect.agriconnect.repositories.InventoryRepository;

@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Override
    public Inventory createRepository(Inventory inventory) {
        return inventoryRepository.save(inventory);
             
    }

    @Override
    public Inventory getInventory(Long id) {
        
         return inventoryRepository.findById(id)
         .orElseThrow(()-> new ResourceNotFoundException("inventory not found!!!!"));

    }

}
