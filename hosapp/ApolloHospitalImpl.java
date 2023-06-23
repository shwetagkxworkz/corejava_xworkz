package com.xworkz.hosapp;

import com.xworkz.address.Address;
import com.xworkz.hospitalapp.patient.Patient;
import lombok.Data;


public class ApolloHospitalImpl implements Hospital{

    Patient patient[];
    int index;

    public ApolloHospitalImpl(int size){
        patient=new Patient[size];
    }


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

    @Override
    public Patient getPatientByAddress(String address) {
        System.out.println("invoked getPatientByAddress");
        if(address!=null && !address.isEmpty()){
            for (int i=0;i<this.patient.length;i++){
                if(this.patient[i].getPatientAddress().equals(address)){
                    System.out.println("patient details" + this.patient[i]);
                }
            }
        }else {
            System.out.println("invalid address");
        }
        return null;
    }

    @Override
    public String getPatientNameByWardNo(String wardNo) {
        System.out.println("invoked getPatientNameByWardNo method");
        if(wardNo!=null && !wardNo.isEmpty()){
            for(int i=0;i<this.patient.length;i++){
                if(this.patient[i].getWardNo().equals(wardNo)){
                    System.out.println("patient name" + this.patient[i].getPatientName());
                }
            }
        } else{
            System.out.println("invalid ward no");
        }
        return null;
    }

    @Override
    public boolean updatePatientWardNoByPatientId(int existingId, String updatedWardNo) {
        System.out.println("invoked method");
        boolean isUpdated=false;
        if(existingId!=0 && updatedWardNo!=null && !updatedWardNo.isEmpty()){
            for(int i=0;i<this.patient.length;i++){
                if(this.patient[i].getId()==existingId){
                    this.patient[i].setWardNo(updatedWardNo);
                isUpdated=true;
                System.out.println("patient ward no updated successfully");
                System.out.println(this.patient[i]);

            }
        }
    }else{
        System.out.println("invalid ");
    }
        return isUpdated;
    }

    @Override
    public boolean updatePatientDiseaseByPatientName(String existingName, String updatedDiseaseName) {
        boolean isUpdated=false;
        for(int i=0;i<patient.length;i++){
            if (this.patient[i].getPatientName().equals(existingName)){
                this.patient[i].setDiseaseName(updatedDiseaseName);
                isUpdated=true;
                System.out.println("disease name updated" );
                System.out.println(this.patient[i]);
            }
        }
        return isUpdated;
    }

    @Override
    public String[] getPatientNameByDiseaseName(String diseaseName) {
        System.out.println("invoking getPatientNameByDiseaseName");

        for (Patient pat : patient
        ) {
            if (pat.getDiseaseName().equals(diseaseName)) {
                System.out.println("patient name is" + pat.getPatientName());
            }
        }
        return null;
    }

    @Override
    public boolean updatePatientAgeByPatientId( int existingPatientId) {
        System.out.println("updatePatientAgeByPatientId method");
        boolean isUpdated = false;
        for (Patient pat : patient
        ) {
            if (pat.getId() == existingPatientId) {
                isUpdated = true;
                System.out.println("patient age is updated");
            }
        }
        return isUpdated;
    }

    @Override
    public String getPatientAttenderNameByPatientId(int patientId) {

        for (Patient pat:
            patient ) {
            if (pat.getId()==patientId){
                System.out.println("patient attender name is" + pat.getAttenderName());
            }
        }
        return null;
    }

    @Override
    public Patient getPatientById(int patientId) {
      int index=0 ;
        for (Patient pat:patient
             ) {
            if (pat.getId()==patientId){
               patient=this.patient;
               index++;
                System.out.println(patient[index]);
            }
        }
        return null;
    }

    @Override
    public String getStreetNameByPatientId(int existingPatientId) {
        System.out.println("invoking getStreetNameById method");
        for (Patient pat:patient
             ) {
            if(pat.getId()==existingPatientId){
                System.out.println("street name is " + pat.getAddress().getCountry().getState().getCity().getArea().getStreet());
            }
        }

        return null;
    }


}
