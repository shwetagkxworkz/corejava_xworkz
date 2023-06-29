package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.address.Address;
import com.xworkz.hospitalapp.constant.Gender;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    private int id;
    private String patientName;
    private int age;
    private String bloodGroup;
    Gender gender;
   // Document document;
    private String attenderName;
    private String diseaseName;
    private String wardNo;
    private String patientAddress;
    Address address;





}
