package com.xworkz.hospitalapp.patient;

import com.xworkz.constant.Gender;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Patient {
    private int id;
    private  String name;
    private  int age;
    private String location;
    private String diseaseName;
    private String bloodGroup;
    Gender gender;
    private String attenderName;
}
