package com.xworkz.hospitalapp.patient;

import com.xworkz.constant.Document;
import com.xworkz.constant.Gender;
import com.xworkz.hosapp.ApolloHospitalImpl;
import com.xworkz.hosapp.Hospital;

public class Tester {
    public static void main(String[] args) {
        Hospital hos=new ApolloHospitalImpl();
        Patient pat=new Patient();
        pat.setPatientName("shweta");
        pat.setAge(30);
        pat.setBloodGroup("ab");
        pat.setGender(Gender.female);
        pat.setDocument(Document.aadharaCard);

        hos.addPatient(pat);
        hos.getAllPatient();

        Patient pat2=new Patient();
        pat2.setPatientName("rekha");
        pat2.setAge(40);
        pat2.setBloodGroup("o");
        pat2.setGender(Gender.female);
        pat2.setDocument(Document.aadharaCard);

        hos.addPatient(pat2);
        hos.getAllPatient();

        Patient pat3=new Patient();
        pat3.setPatientName("manjunath");
        pat3.setAge(50);
        pat3.setBloodGroup("a");
        pat3.setGender(Gender.male);
        pat3.setDocument(Document.pancard);

        hos.addPatient(pat3);
        hos.getAllPatient();

        Patient pat4=new Patient();
        pat4.setPatientName("sushma");
        pat4.setAge(45);
        pat4.setBloodGroup("o");
        pat4.setGender(Gender.female);
        pat4.setDocument(Document.aadharaCard);

        hos.addPatient(pat4);
        hos.getAllPatient();

        Patient pat5=new Patient();
        pat5.setPatientName("ruthavika");
        pat5.setAge(46);
        pat5.setBloodGroup("b");
        pat5.setGender(Gender.male);
        pat5.setDocument(Document.pancard);

        hos.addPatient(pat5);
        hos.getAllPatient();

        Patient pat6=new Patient();
        pat6.setPatientName("rahul");
        pat6.setAge(60);
        pat6.setBloodGroup("o");
        pat6.setGender(Gender.male);
        pat6.setDocument(Document.aadharaCard);

        hos.addPatient(pat6);
        hos.getAllPatient();

        Patient pat7=new Patient();
        pat7.setPatientName("sushmita");
        pat7.setAge(80);
        pat7.setBloodGroup("o");
        pat7.setGender(Gender.female);
        pat7.setDocument(Document.aadharaCard);

        hos.addPatient(pat7);
        hos.getAllPatient();


        Patient pat8=new Patient();
        pat8.setPatientName("niharika");
        pat8.setAge(85);
        pat8.setBloodGroup("o");
        pat8.setGender(Gender.female);
        pat8.setDocument(Document.aadharaCard);

        hos.addPatient(pat8);
        hos.getAllPatient();


        Patient pat9=new Patient();
        pat9.setPatientName("saurabha");
        pat9.setAge(30);
        pat9.setBloodGroup("a");
        pat9.setGender(Gender.male);
        pat9.setDocument(Document.pancard);

        hos.addPatient(pat9);
        hos.getAllPatient();

        Patient pat10=new Patient();
        pat10.setPatientName("surya");
        pat10.setAge(48);
        pat10.setBloodGroup("o");
        pat10.setGender(Gender.male);
        pat10.setDocument(Document.aadharaCard);

        hos.addPatient(pat10);
        hos.getAllPatient();

        Patient pat11=new Patient();
        pat11.setPatientName("sachina");
        pat11.setAge(25);
        pat11.setBloodGroup("a");
        pat11.setGender(Gender.male);
        pat11.setDocument(Document.pancard);

        hos.addPatient(pat11);
        hos.getAllPatient();

        Patient pat12=new Patient();
        pat12.setPatientName("savita");
        pat12.setAge(35);
        pat12.setBloodGroup("b");
        pat12.setGender(Gender.female);
        pat12.setDocument(Document.aadharaCard);

        hos.addPatient(pat12);
        hos.getAllPatient();

        Patient pat13=new Patient();
        pat13.setPatientName("akruti");
        pat13.setAge(15);
        pat13.setBloodGroup("ab");
        pat13.setGender(Gender.female);
        pat13.setDocument(Document.pancard);

        hos.addPatient(pat13);
        hos.getAllPatient();

        Patient pat14=new Patient();
        pat14.setPatientName("surya");
        pat14.setAge(18);
        pat14.setBloodGroup("a");
        pat14.setGender(Gender.male);
        pat14.setDocument(Document.aadharaCard);

        hos.addPatient(pat14);
        hos.getAllPatient();

        Patient pat15=new Patient();
        pat15.setPatientName("abhi");
        pat15.setAge(20);
        pat15.setBloodGroup("b");
        pat15.setGender(Gender.male);
        pat15.setDocument(Document.aadharaCard);

        hos.addPatient(pat15);
        hos.getAllPatient();
    }
}
