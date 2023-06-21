package com.xworkz.hosapp;

import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitalImpl implements Hospital{

    Patient patient[]=new Patient[15];
    int index;


    @Override
    public boolean addPatient(Patient patient) {

        System.out.println("invoked addPatientName method");
        boolean isAdded=false;
        if(patient!=null) {
            System.out.println("patient check completed");
            if (patient.getPatientName()!= null && !patient.getPatientName().isEmpty() && patient.getBloodGroup()!=null && patient.getAge()>0) {
                this.patient[index] = patient;
                index++;
                isAdded = true;
                System.out.println("patient data added successfully");
            } else {
                System.out.println("patient name is null");
            }
        }else {
            System.out.println("patient check incomplete");
        }

        return isAdded;



    }


    @Override
    public void getAllPatient() {
        System.out.println("invoked getAllPatient");
        System.out.println("list of patients are");
        for (Patient pat:this.patient
             ) {
            System.out.println(pat);

        }

    }
}
