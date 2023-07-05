package com.xworkz.ecommerceapp.exception;

public class ContactNoNotFoundException extends RuntimeException{

    public ContactNoNotFoundException(String existingName){
        System.out.println("enter valid patient name " +existingName);
    }
}
