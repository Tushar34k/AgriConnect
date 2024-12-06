package com.AgriConnect.agriconnect.Service;

import com.AgriConnect.agriconnect.model.Inventory;

public interface InventoryService {

    public Inventory createRepository(Inventory inventory);

    public Inventory getInventory(Long id);

}
