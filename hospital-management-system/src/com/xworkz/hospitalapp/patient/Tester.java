package com.xworkz.hospitalapp.patient;

//import com.xworkz.address;
import com.xworkz.hospitalapp.address.*;
import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hosapp.ApolloHospitalImpl;
import com.xworkz.hospitalapp.hosapp.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        System.out.println("main invoked");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the patient");
        int size= sc.nextInt();
        Hospital hospital=new ApolloHospitalImpl(size);

        for(int patientIndex=0;patientIndex<size;patientIndex++){
            Patient pat=new Patient();
            System.out.println("enter the patient id");
            pat.setId(sc.nextInt());

            System.out.println("enter the patient name");
            pat.setPatientName(sc.next());

            System.out.println("enter the patient age");
            pat.setAge(sc.nextInt());

            System.out.println("enter the patient blood group");
            pat.setBloodGroup(sc.next());

            System.out.println("enter the patient gender");
            pat.setGender(Gender.valueOf(sc.next()));

            System.out.println("enter the patient disease name");
            pat.setDiseaseName(sc.next());

            System.out.println("enter the patient attender name");
            pat.setAttenderName(sc.next());

            System.out.println("enter the patient ward no");
            pat.setWardNo(sc.next());

           // System.out.println("enter the patient address");
          //  pat.setPatientAddress(sc.next());

            hospital.addPatient(pat);

           Address address=new Address();
           Country country=new Country();
           State state=new State();
           City city=new City();
           Area area=new Area();
           Street street=new Street();

            System.out.println("enter the street name");
            street.setStreet(sc.next());
            System.out.println("enter the area");
            area.setArea(sc.next());
            System.out.println("enter city name");
            city.setCity(sc.next());
            System.out.println("enter state name");
            state.setState(sc.next());
            System.out.println("enter the country name");
            country.setCountry(sc.next());
            System.out.println("enter the address");
            address.setAddress(sc.next());

            pat.setAddress(address);
            address.setCountry(country);
            country.setState(state);
            state.setCity(city);
            city.setArea(area);
            area.setStreet(street);


        }
        String text=null;
        do{
            System.out.println("1: get all patient details");
            System.out.println("2: get patient name by address");
            System.out.println("3: get patient name by ward no");
            System.out.println("4: get patient name by disease name");
            System.out.println("5: update patient ward no by patient id");
            System.out.println("6: update patient disease by patient name");
            System.out.println("7: update patient age by patient id");
            System.out.println("8: get patient attender name by patient id");
            System.out.println("9: get street name by patient id");

            System.out.println("enter the option");
           int option=sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("patient details are");
                    hospital.getAllPatient();
                    break;

                case 2:System.out.println("enter address to find patient name");
                    hospital.getPatientByAddress(sc.next());
                    break;

                case 3:System.out.println("enter ward no to find patient name");
                    hospital.getPatientNameByWardNo(sc.next());
                    break;

                case 4:System.out.println("enter the disease name to get patient name");
                    hospital.getPatientNameByDiseaseName(sc.next());
                    break;

                case 5:System.out.println("enter patient id to update and new ward no  a34,a45");
                    hospital.updatePatientWardNoByPatientId(sc.nextInt(),sc.next());
                    break;

                case 6:System.out.println("enter patient name to update disease name");
                    hospital.updatePatientDiseaseByPatientName(sc.next(),sc.next());
                    break;

                case 7: System.out.println("enter the existing id,updated patient age  ");
                    hospital.updatePatientAgeByPatientId(sc.nextInt(),sc.nextInt());
                    hospital.getAllPatient();
                    break;

                case 8:System.out.println("enter patient id to get attender name");
                    hospital.getPatientAttenderNameByPatientId(sc.nextInt());
                    break;

                case 9: System.out.println("enter the patient id");
                    hospital.getStreetNameByPatientId(sc.nextInt());
                    break;


            }
            System.out.println("do you want to continue :y/n");
            text=sc.next();
        }

        while (text.equals("y"));







      //
   //

 //

     // System.out.println("enter patient id");
    // hospital.getPatientById(sc.nextInt());

      // System.out.println("enter patient id to get attender name");
     //hospital.getPatientAttenderNameByPatientId(sc.nextInt());

      //

    }
}
