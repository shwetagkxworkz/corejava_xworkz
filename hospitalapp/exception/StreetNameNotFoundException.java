package com.xworkz.hospitalapp.exception;

public class StreetNameNotFoundException extends RuntimeException{
    public StreetNameNotFoundException(int patientId){
        System.out.println("enter valid patient id " +patientId);
    }
}
