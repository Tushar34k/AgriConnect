package com.AgriConnect.agriconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AgriConnect.agriconnect.Service.InventoryService;
import com.AgriConnect.agriconnect.model.Farmer;
import com.AgriConnect.agriconnect.model.Inventory;
import com.AgriConnect.agriconnect.response.ApiResponse;
import com.AgriConnect.agriconnect.response.ApiResponseUtil;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/save")
    public ResponseEntity<ApiResponse<Inventory>> createInventory(@RequestBody Inventory inventory) {
        Inventory savedInventory = inventoryService.createRepository(inventory);
        ApiResponse<Inventory> apiResponse = new ApiResponseUtil<Inventory>().success(
            "Inventory saved successfully!", savedInventory
        );
        return new ResponseEntity<>(apiResponse, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ApiResponse<Inventory>> getFarmer(@PathVariable Long id)
    {
               Inventory inventory =inventoryService.getInventory(id);
               ApiResponse<Inventory> apiResponse = new ApiResponseUtil<Inventory>().success(
                "Inventory get successfully!", inventory
            );
               return new ResponseEntity(apiResponse,HttpStatus.OK);
    }


}
