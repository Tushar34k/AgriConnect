package com.AgriConnect.agriconnect.Service.ServiceImpl;

import java.util.DuplicateFormatFlagsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AgriConnect.agriconnect.Service.BuyerService;
import com.AgriConnect.agriconnect.customeexception.DuplicateResourceException;
import com.AgriConnect.agriconnect.customeexception.ResourceNotFoundException;
import com.AgriConnect.agriconnect.model.Buyer;
import com.AgriConnect.agriconnect.repositories.BuyerRepository;

@Service
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private BuyerRepository buyerRepository;

    @Override
    public Buyer createBuyer(Buyer buyer) {
        Buyer buyer1 = buyerRepository.findByEmail(buyer.getEmail());
                           if(buyer1!=null)
                           {
                            System.out.println("DuplicateResourceException triggered");
                              throw new DuplicateResourceException("email is aulredy register!!!");   
                           }
                                     Buyer buyer2=buyerRepository.save(buyer);
                    return buyer2;      
    }

    @Override
    public Buyer getBuyer(Long id) {
     return buyerRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("buyer not found!!!"));
    }

    

}
