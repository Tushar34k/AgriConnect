package com.AgriConnect.agriconnect.Service;

import com.AgriConnect.agriconnect.model.Buyer;

public interface BuyerService {

    public Buyer createBuyer(Buyer buyer);

    public Buyer getBuyer(Long id);

}
