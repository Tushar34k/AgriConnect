package com.AgriConnect.agriconnect.customeexception;

public class DuplicateResourceException extends RuntimeException  {

    public  DuplicateResourceException(String message)
    {
           super(message);
    }

}
