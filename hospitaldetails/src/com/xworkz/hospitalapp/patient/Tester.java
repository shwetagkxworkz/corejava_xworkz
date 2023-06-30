package com.xworkz.hospitalapp.patient;

import com.xworkz.hosapp.ApolloImpl;
import com.xworkz.hosapp.Hospital;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("main invoked");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the patient");
        int size = sc.nextInt();
        Hospital hospital = new ApolloImpl(size);

        for (int patientIndex = 0; patientIndex < size; patientIndex++) {
            Patient pat = new Patient();
            System.out.println("enter the patient id");
            pat.setId(sc.nextInt());
            System.out.println("enter the patient name");
            pat.setName(sc.next());
            System.out.println("enter the age");
            pat.setAge(sc.nextInt());
            System.out.println("enter patient location");
            pat.setLocation(sc.next());
            System.out.println("enter patient blood group");
            pat.setBloodGroup(sc.next());
            System.out.println("enter patient disease name");
            pat.setDiseaseName(sc.next());
            System.out.println("enter attender name");
            pat.setAttenderName(sc.next());

            hospital.addPatientDetails(pat);
        }
        hospital.getAllPatient();
    }
}