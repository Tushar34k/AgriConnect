package com.AgriConnect.agriconnect.Service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgriConnect.agriconnect.Service.FarmerService;
import com.AgriConnect.agriconnect.customeexception.ResourceNotFoundException;
import com.AgriConnect.agriconnect.model.Farmer;
import com.AgriConnect.agriconnect.repositories.FarmerRepository;

@Service
public class FarmerServiceImpl implements FarmerService {

    @Autowired
    private FarmerRepository farmerRepository;

    @Override
    public Farmer createFaremer(Farmer farmer) {
                         Farmer farmer2 =farmerRepository.save(farmer); 
                         return farmer2;                       
    }

    @Override
    public Farmer getFarmer(Long id) {
                Farmer farmer=farmerRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("faremer with id=>>"+id+"not found"));
                        
                return farmer;
    }

    @Override
    public Farmer updateFarmer(Long id, Farmer farmer) {
                 
               Farmer farmer2 =farmerRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("farmer is not present!!") );
                       farmer2.setName(farmer.getName());
                       farmer2.setEmail(farmer.getEmail());
                       farmer2.setPhoneNumber(farmer.getPhoneNumber());
                       
                       return farmer2;


    } 

    

}
