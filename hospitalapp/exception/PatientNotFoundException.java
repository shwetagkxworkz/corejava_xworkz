package com.xworkz.hospitalapp.exception;

public class PatientNotFoundException extends RuntimeException{
    public PatientNotFoundException(int id){
        System.out.println("enter valid patient id " +id);
    }
}
