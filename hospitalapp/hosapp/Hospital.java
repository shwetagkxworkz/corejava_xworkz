package com.xworkz.hospitalapp.hosapp;

import com.xworkz.hospitalapp.patient.Patient;

public interface Hospital {
    boolean addPatient(Patient patient);

    void getAllPatient();

    Patient getPatientByAddress(String address);

    String getPatientNameByWardNo(String wardNo);

    boolean updatePatientWardNoByPatientId(int existingId , String updatedWardNo);


    boolean updatePatientDiseaseByPatientName(String existingName,String updatedDiseaseName);

    String[] getPatientNameByDiseaseName(String diseaseName);

    boolean updatePatientAgeByPatientId( int existingPatientId, int patientAge);

    String getPatientAttenderNameByPatientId(int patientId);

    Patient getPatientById(int patientId);

    String getStreetNameByPatientId(int existingPatientId);
}
