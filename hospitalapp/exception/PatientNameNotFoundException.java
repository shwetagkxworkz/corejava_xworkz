package com.xworkz.hospitalapp.exception;

public class PatientNameNotFoundException extends RuntimeException{
    public PatientNameNotFoundException(String wardNo){
        System.out.println("enter valid ward no " +wardNo);
    }
}
