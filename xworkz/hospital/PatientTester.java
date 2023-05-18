package com.xworkz.hospital;

public class PatientTester {
    public static void main(String[] args) {
        Patient pat=new Patient("shweta", 1, "bangalore");
        System.out.println(pat.name + " " +pat.id + " " + pat.adress);
    }
}
