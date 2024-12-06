package com.AgriConnect.agriconnect.Service;

import com.AgriConnect.agriconnect.model.Farmer;

public interface FarmerService {

    public abstract Farmer createFaremer(Farmer farmer);

    public Farmer getFarmer(Long id);

    public Farmer updateFarmer(Long id,Farmer farmer);

}


