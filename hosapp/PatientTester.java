package com.xwork.hosapp;
import java.util.Scanner;
public class PatientTester {
    public static void main(String[] args) {
        System.out.println("enter patient id");
        Scanner sc = new Scanner(System.in);
        int patientId = sc.nextInt();
        System.out.println("enter patient name");
        String patientName = sc.next();
        System.out.println("enter patient address");
        String address = sc.next();
        System.out.println("enter patient age");
        int age = sc.nextInt();
        System.out.println("enter patient phone number");
        long phoneNumber = sc.nextLong();
        System.out.println("enter patient insurance details");
        boolean isInsuranceAvailable = sc.nextBoolean();
        System.out.println("enter patient attender name");
        String attenderName = sc.next();
        System.out.println("enter patient blood group");
        String bloodGroup = sc.next();
        System.out.println("enter patient disease name");
        String diseaseName = sc.next();

        Patient pat = new Patient(patientId, patientName, address, age, phoneNumber, isInsuranceAvailable, attenderName, bloodGroup, diseaseName);
        System.out.println(pat.patientId + " " + pat.patientName + " " + pat.address + " " + pat.age + " " + pat.phoneNumber + " " + pat.isInsuranceAvailable + " " + pat.attenderName + " " + pat.bloodGroup + " " + pat.diseaseName);
    }
}