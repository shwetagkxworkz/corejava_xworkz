package com.xwork.hosapp;

public class Patient {
    int patientId;
    String patientName;
    String address;
    int age;
    long phoneNumber;
    boolean isInsuranceAvailable;
    String attenderName;
    String bloodGroup;
    String diseaseName;

    public Patient(int patientId,String patientName, String address,int age, long phoneNumber, boolean isInsuranceAvailable, String attenderName,String bloodGroup,String diseaseName ){
        this.patientId=patientId;
        this.patientName=patientName;
        this.address=address;
        this.age=age;
        this.phoneNumber=phoneNumber;
        this.isInsuranceAvailable=isInsuranceAvailable;
        this.attenderName=attenderName;
        this.bloodGroup=bloodGroup;
        this.diseaseName=diseaseName;
    }
}
