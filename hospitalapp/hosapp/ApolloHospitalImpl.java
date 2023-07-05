package com.xworkz.hospitalapp.hosapp;

import com.xworkz.hospitalapp.exception.PatientAttenderNameNotFoundException;
import com.xworkz.hospitalapp.exception.PatientNameNotFoundException;
import com.xworkz.hospitalapp.exception.PatientNotFoundException;
import com.xworkz.hospitalapp.exception.StreetNameNotFoundException;
import com.xworkz.hospitalapp.patient.Patient;


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
        String patientName=null;
        System.out.println("invoked getPatientNameByWardNo method");
        if(wardNo!=null && !wardNo.isEmpty()){
            for(int i=0;i<this.patient.length;i++){
                if(this.patient[i].getWardNo().equals(wardNo)){
                    System.out.println("patient name" + this.patient[i].getPatientName());
                }
                else{
                    PatientNameNotFoundException exception=new PatientNameNotFoundException(wardNo);
                    throw exception;
                }
            }
        }
        return patientName;
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

        int count=0;
        for (Patient pat:patient
             ) {
            if(pat.getDiseaseName().equals(diseaseName)){
                count++;
            }
        }

        String patientNames[]=new String[count];
        int index=0;
        for (Patient pat : patient
        ) {
            if (pat.getDiseaseName().equals(diseaseName)) {
                patientNames[index++]=pat.getPatientName();
              System.out.println(patientNames[index++]);
            }
        }
        return patientNames;
    }

    @Override
    public boolean updatePatientAgeByPatientId( int existingPatientId, int patientAge) {
        System.out.println("updatePatientAgeByPatientId method");
        boolean isUpdated = false;
        for (Patient pat : patient
        ) {
            if (pat.getId() == existingPatientId) {
                pat.setAge(patientAge);
                System.out.println(pat.getAge());
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
            else{
                PatientAttenderNameNotFoundException exception=new PatientAttenderNameNotFoundException(patientId);
                throw exception;
            }
        }
        return null;
    }

    @Override
    public Patient getPatientById(int patientId) {
        System.out.println("invoking getPatientById method");
        Patient patient1=null;
      int index=0 ;
        for (Patient pat:patient
             ) {
            if (pat.getId()==patientId){
               patient=this.patient;
               index++;
                System.out.println(patient[index]);
            }
            else{
                PatientNotFoundException exception=new PatientNotFoundException(patientId);
                throw exception;
            }
        }
        return patient1;
    }

    @Override
    public String getStreetNameByPatientId(int existingPatientId) {
        System.out.println("invoking getStreetNameById method");
        for (Patient pat:patient
             ) {
            if(pat.getId()==existingPatientId){
                System.out.println("street name is " + pat.getAddress().getCountry().getState().getCity().getArea().getStreet());
            }
            else {
                StreetNameNotFoundException exception=new StreetNameNotFoundException(existingPatientId);
                throw exception;
            }
        }

        return null;
    }


}
