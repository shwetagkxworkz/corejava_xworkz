package com.xworkz.hospitalapp.patient;

import com.xworkz.constant.Document;
import com.xworkz.constant.Gender;
import lombok.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Patient {


    private String patientName;
    private int age;
    private String bloodGroup;
    Gender gender;
    Document document;





}
