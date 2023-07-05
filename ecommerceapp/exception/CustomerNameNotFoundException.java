package com.xworkz.ecommerceapp.exception;

import com.xworkz.ecommerceapp.customer.Customer;

public class CustomerNameNotFoundException extends RuntimeException{
    public CustomerNameNotFoundException(int id){
        System.out.println("enter correct id " +id);

    }
}
