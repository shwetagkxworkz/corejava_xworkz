package com.xworkz.hosapp;

import com.xworkz.hospitalapp.patient.Patient;

public class ApolloImpl implements Hospital{

    Patient patient[];
    int index;

    public ApolloImpl(int size){
        patient=new Patient[size];
    }

    @Override
    public boolean addPatientDetails(Patient patient) {
        System.out.println("invoked addPatientName method");
        boolean isAdded=false;
        if(patient!=null) {
            System.out.println("patient check completed");
            if (patient.getName()!= null && !patient.getName().isEmpty() && patient.getBloodGroup()!=null && patient.getAge()>0) {
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

