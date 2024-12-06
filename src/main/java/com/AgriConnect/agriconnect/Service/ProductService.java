package com.AgriConnect.agriconnect.Service;

import com.AgriConnect.agriconnect.model.Product;

public interface ProductService {

  public  Product createProduct(Product product);

  public Product getProduct(Long id);


}
