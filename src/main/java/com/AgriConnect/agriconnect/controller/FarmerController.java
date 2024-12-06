package com.AgriConnect.agriconnect.controller;

import org.hibernate.grammars.hql.HqlParser.FrameEndContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AgriConnect.agriconnect.Service.FarmerService;
import com.AgriConnect.agriconnect.model.Farmer;
import com.AgriConnect.agriconnect.response.ApiResponse;
import com.AgriConnect.agriconnect.response.ApiResponseUtil;

@RestController
@RequestMapping("/farmer")
public class FarmerController {

    @Autowired
    private FarmerService farmerService;

    @PostMapping("/save")
    public ResponseEntity<ApiResponse<Farmer>> createFarmer(@RequestBody Farmer farmer) 
    {
                              Farmer farmer2=farmerService.createFaremer(farmer);
                              ApiResponse<Void> apiResponse=ApiResponseUtil.success("farmer is created Successfully!!!");
                              return new ResponseEntity (apiResponse,HttpStatus.CREATED);
    }


    @GetMapping("/get/{id}")
    public ResponseEntity<ApiResponse<Farmer>> getFarmer(@PathVariable Long id)
    {
                          Farmer farmer=farmerService.getFarmer(id);

                              return new ResponseEntity(farmer,HttpStatus.OK);
    }


                 @PostMapping("/update/{id}")    
                public ResponseEntity<ApiResponse<Farmer>> updateFarmer(Long id,Farmer farmer)
                {
                             Farmer farmer2 =farmerService.createFaremer(farmer);
                                       ApiResponse<Void> farmer3  = ApiResponseUtil.success("farmer is updated successfull!!!!");

                                          return new ResponseEntity(farmer3,HttpStatus.OK);
                }

}
