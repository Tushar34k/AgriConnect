package com.AgriConnect.agriconnect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AgriConnect.agriconnect.Service.BuyerService;
import com.AgriConnect.agriconnect.model.Buyer;
import com.AgriConnect.agriconnect.response.ApiResponse;
import com.AgriConnect.agriconnect.response.ApiResponseUtil;

@RestController
@RequestMapping("/buyer")
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @PostMapping("/save")
    public ResponseEntity<ApiResponse<Buyer>> createBuyer(@RequestBody Buyer buyer)
    {
                              Buyer buyer2 =buyerService.createBuyer(buyer);
                              ApiResponse<Void> apiResponse=new ApiResponseUtil().success("buyer created scuccessfully");
                              return new ResponseEntity(buyer2,HttpStatus.CREATED);
    }

}
