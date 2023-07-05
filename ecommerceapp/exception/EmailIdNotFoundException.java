package com.xworkz.ecommerceapp.exception;

public class EmailIdNotFoundException extends RuntimeException{
    public EmailIdNotFoundException(String customerName){
        System.out.println("enter valid customer name " +customerName);
    }

}
