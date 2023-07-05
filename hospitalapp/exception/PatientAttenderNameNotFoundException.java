package com.xworkz.hospitalapp.exception;

public class PatientAttenderNameNotFoundException extends RuntimeException{
    public PatientAttenderNameNotFoundException(int id){
        System.out.println("enter valid patientId " +id);
    }
}
