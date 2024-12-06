package com.AgriConnect.agriconnect.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AgriConnect.agriconnect.Service.ProductService;
import com.AgriConnect.agriconnect.model.Inventory;
import com.AgriConnect.agriconnect.model.Product;
import com.AgriConnect.agriconnect.response.ApiResponse;
import com.AgriConnect.agriconnect.response.ApiResponseUtil;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    @PostMapping("/save")
    public ResponseEntity<ApiResponse<Product>> createProduct(@RequestBody Product product)
    {
              Product product2=productService.createProduct(product);
                      ApiResponse<Product> apiResponse  = new ApiResponseUtil<>().success("product is creted successfully",product2);
            
                      return new ResponseEntity<>(apiResponse,HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ApiResponse<Product>> getProduct(@PathVariable Long id)
    {
                         Product product=productService.getProduct(id);
                      ApiResponse<Product> apiResponse   =new ApiResponseUtil<>().success("product get successfully",product);
                      return new ResponseEntity(apiResponse,HttpStatus.OK);
    }



}
