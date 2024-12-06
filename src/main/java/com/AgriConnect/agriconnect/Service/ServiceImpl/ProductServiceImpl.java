package com.AgriConnect.agriconnect.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgriConnect.agriconnect.Service.ProductService;
import com.AgriConnect.agriconnect.customeexception.ResourceNotFoundException;
import com.AgriConnect.agriconnect.model.Product;
import com.AgriConnect.agriconnect.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        
             return productRepository.save(product);
    }
    @Override
    public Product getProduct(Long id) {
                 Product product =productRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("product not found"));
                 return product;
    }



}
